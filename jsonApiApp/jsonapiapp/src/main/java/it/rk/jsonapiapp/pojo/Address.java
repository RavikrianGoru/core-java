package it.rk.jsonapiapp.pojo;

import java.util.Set;

public class Address {
	String drNo;
	String streat;
	Set<String> contacts;

	public Address(String drNo, String streat, Set<String> contacts) {
		super();
		this.drNo = drNo;
		this.streat = streat;
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "Address [drNo=" + drNo + ", streat=" + streat + ", contacts=" + contacts + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contacts == null) ? 0 : contacts.hashCode());
		result = prime * result + ((drNo == null) ? 0 : drNo.hashCode());
		result = prime * result + ((streat == null) ? 0 : streat.hashCode());
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
		Address other = (Address) obj;
		if (contacts == null) {
			if (other.contacts != null)
				return false;
		} else if (!contacts.equals(other.contacts))
			return false;
		if (drNo == null) {
			if (other.drNo != null)
				return false;
		} else if (!drNo.equals(other.drNo))
			return false;
		if (streat == null) {
			if (other.streat != null)
				return false;
		} else if (!streat.equals(other.streat))
			return false;
		return true;
	}

	public String getDrNo() {
		return drNo;
	}

	public void setDrNo(String drNo) {
		this.drNo = drNo;
	}

	public String getStreat() {
		return streat;
	}

	public void setStreat(String streat) {
		this.streat = streat;
	}

	public Set<String> getContacts() {
		return contacts;
	}

	public void setContacts(Set<String> contacts) {
		this.contacts = contacts;
	}

}
