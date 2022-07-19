#!/bin/bash

# Configure KEYSTORE_PSSWORD in ~/.bashrc
source ~./bashrc

JAVA_CMD=java
APP_JAR=XYZ-cc.jar
ADB_FILE=XYZ_service_0.adb
SERVER_FILE=XYZ_ser.server


BASE_PATH=/app/bzid
BACKUP_PATH=${BASE_PATH}/backup/cc
CONFIG_PATH=${BASE_PATH}/config/cc

PID_FILE=${BASE_PATH}/run_cc.pid

LOG_PATH=${BASE_PATH}/logs
LOG_FILE=${LOG_PATH}/app_cc.log
LOG_ERROR_FILE=${LOG_PATH}/app_cc_err.log

PID=$(cat ${PID_FILE})

ENV=$1--------------->get argument as input sit/ust/prd
FILE_ENV="sit"


#PID
echo ${PID}
echo "Environment is ---"
echo ${ENV}
echo "${ENV,,}"


if [[ "${ENV,,}" == "uat" ]] ;then
	FINAL_ENV="uat"
	JAVA_CMD="/app/bzid/java/bin/java"
elif [[ "${ENV,,}" == "prd" ]] ;then 
	FINAL_ENV="prd"
	JAVA_CMD="/urs/bin/java"
fi


#Kill the running pid
if cat $PID_FILE >/dev/null
then
	echo "Found running app instane, attemt to kill them [$PID]"
	pkill -F $PID_FILE
	sleep 5
	echo "App Killed"
else
	echo $PID
	echo "App is not running"
fi

# Take the backup of existing jar
if [[ -f "${BASE_PATH}/${APP_JAR}" ]]
then
	echo "File exist moving to backup folder"
	mkdir -p ${BACKUP_PATH}
	mv ${BASE_PATH}/${APP_JAR} #${BACKUP_PATH}/
fi


#Copy jar file in to base path
cp -R ./*.jar ${BASE_PATH}/${APP_JAR}
echo "JAR copied to ls -tr ${BASE_PATH}/"



#Copy shell script into base path
cp ./*.sh ${BASE_PATH}/
echo "shell scrit copied to ls -tr ${BASE_PATH}/"

mkdir -p ${LOG_PATH}
mkdir -p ${CONFIG_PATH}

if [[ -f "${CONFIG_PATH}/${SERVER_FILE}" ]]
then
	echo "Server file exist and moving into back folder"
	mkdir -p ${BACKUP_PATH}
	mv ${CONFIG_PATH}/${SERVER_FILE} ${BACKUP_PATH}/
fi

cp ${SERVER_FILE} ${CONFIG_PATH}/
echo "Copied ${SERVER_FILE} to ${CONFIG_PATH}/"
	
if [[ -f "${CONFIG_PATH}/${ADB_FILE}" ]]
then
	echo "ADB file exist and moving to backup folder"
	mkdir -p ${BACKUP_PATH}
	cp ${CONFIG_PATH}/${ADB_FILE} ${BACKUP_PATH}/
	chk1=`cksum ${ADB_FILE} | awk -F " " '{print $1}'`
	chk2=`cksum ${CONFIG_PATH}/${ADB_FILE} | awk -F " " '{print $1}'`

	if [[ ${chk1} -eq ${chk2} ]]
	then
		echo "ADBs are identical"
		ADB_DATE=`date +%s -r ${CONFIG_PATH}/${ADB_FILE}`
	else
		echo "ADBs are not identical"
		ADB_DATE=`date +%s`
		cp ${ADB_FILE} ${CONFIG_PATH}/
		echo "Copied ${ADB_FILE} to ${CONFIG_PATH}/"
fi



# Run the app
nohup ${JAVA_CMD} -jar 	-Dserver.ssl.key-store-password="${KEYSTORE_PSSWORD}" -Dinfo.adb.date="${ADB_DATE}" -Dspring.profiles.active="${FINAL_ENV}" ${BACKUP_PATH}/${APP_JAR} 1>${LOG_FILE} 2>${LOG_ERROR_FILE} & echo $! >${PID_FILE}


cat ${PID_FILE}
function fail{
	echo $1 >&2
	exit 1
}

n=1
max=10
delay=5
while true; do
	status `curl -k -s -o /dev/null -w "%{http_code}"  https://localhost:8446/XYZ-cc-service/acturtor/health`
	if [[ $status == 200 ]]; then
		echo "Deployment successful"
		break
	elif [[ $n -lt $max ]]; then
		((n++))
		echo "Health check failed. Attemp $n/$max:"
		sleep $delay;
	else
		fail "Deployment has failed after $n attemps."
	fi
done

						
		








	


