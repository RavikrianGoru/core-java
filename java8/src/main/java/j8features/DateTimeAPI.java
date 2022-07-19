package j8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class DateTimeAPI {

	public static void main(String[] args) {

		System.out.println("========Date & Time (JODA API)========");
		LocalDate date = LocalDate.now();
		System.out.println("LocalDate :"+date);

		int dd=date.getDayOfMonth();
		int mm =date.getMonthValue();
		int yyyy=date.getYear();
		System.out.println(dd);		
		System.out.println(mm);		
		System.out.println(yyyy);
		System.out.println(dd+"-"+mm+"-"+yyyy);
		System.out.printf("\n%d-%d-%d",dd,mm,yyyy);
		
		
		
		LocalTime time = LocalTime.now();
		System.out.println("\nLocal Time: "+time);
		int hour=time.getHour();
		int minute=time.getMinute();
		int seconds=time.getSecond();
		int nonos=time.getNano();
		System.out.printf("%d:%d:%d:%d", hour,minute,seconds,nonos);
		

		LocalDateTime dateTime= LocalDateTime.now();
		System.out.println("\nLocalDateTime :"+dateTime);

		LocalDateTime dt = LocalDateTime.of(1987, 02, 02, 12, 37);
		System.out.println(dt);
		dt=dt.plusYears(+35);
		System.out.println(dt);	
		
		
		LocalDate bday=LocalDate.of(1987, 02, 01);
		LocalDate now=LocalDate.now();
	
		Period p = Period.between(bday,  now);
		System.out.println(p);

		Year y = Year.of(1987);
		System.out.println("Is leap year:"+y.isLeap());

		
		ZoneId zid=ZoneId.systemDefault();
		System.out.println(zid);
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zdate =ZonedDateTime.now(la);
		System.out.println(zdate);
	}

}
