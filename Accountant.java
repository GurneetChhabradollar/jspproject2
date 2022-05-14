package pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Accountant {
	@Id
	private String empno;
	private String address,contact,name;
	public Accountant()
	{
		
	}

	public Accountant(String name, String address, String contact, String empno) {
		super();
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}
	

}
