package it.rk.jsonapiapp;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private int eid;
	private String ename;
	private double sal;
	private List<String> qualifications;
	private Map<String, Address> addrs;

	public Employee(int eid, String ename, double sal, List<String> qualifications, Map<String, Address> addrs) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
		this.qualifications = qualifications;
		this.addrs = addrs;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public List<String> getQualifications() {
		return qualifications;
	}

	public void setQualifications(List<String> qualifications) {
		this.qualifications = qualifications;
	}

	public Map<String, Address> getAddrs() {
		return addrs;
	}

	public void setAddrs(Map<String, Address> addrs) {
		this.addrs = addrs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addrs == null) ? 0 : addrs.hashCode());
		result = prime * result + eid;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		result = prime * result + ((qualifications == null) ? 0 : qualifications.hashCode());
		long temp;
		temp = Double.doubleToLongBits(sal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (addrs == null) {
			if (other.addrs != null)
				return false;
		} else if (!addrs.equals(other.addrs))
			return false;
		if (eid != other.eid)
			return false;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		if (qualifications == null) {
			if (other.qualifications != null)
				return false;
		} else if (!qualifications.equals(other.qualifications))
			return false;
		if (Double.doubleToLongBits(sal) != Double.doubleToLongBits(other.sal))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + ", qualifications=" + qualifications
				+ ", addrs=" + addrs + "]";
	}

}

