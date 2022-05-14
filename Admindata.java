package pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admindata {
	@Id
	private String email;
	private String address,contact,name;
	public Admindata()
	{
		
	}
	public Admindata(String name, String address, String contact, String email) {
		super();
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.email = email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
