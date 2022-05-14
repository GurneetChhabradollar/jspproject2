package pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoginData {
	@Id
	String userid;
	String password,usertype;
	public LoginData()
	{
		
	}

	public LoginData(String userid, String password, String usertype) {
		super();
		this.userid = userid;
		this.password = password;
		this.usertype = usertype;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	@Override
	public String toString() {
		return "LoginData [userid=" + userid + ", password=" + password + ", usertype=" + usertype + "]";
	}
	

}
