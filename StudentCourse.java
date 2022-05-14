package pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentCourse {
    
	@Id
	private int cid;
	private int roll;
	private String course;
	private int fee;
	private int join_date;
	
	
	
	public StudentCourse(int cid, int roll, String course, int fee, int join_date) {
		super();
		this.cid = cid;
		this.roll = roll;
		this.course = course;
		this.fee = fee;
		this.join_date = join_date;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getJoin_date() {
		return join_date;
	}
	public void setJoin_date(int join_date) {
		this.join_date = join_date;
	}
	
	
	public String toString() {
		return "StudentCourse [cid=" + cid + ", roll=" + roll + ", course=" + course + ", fee=" + fee + ", join_date="
				+ join_date + "]";
	}
	
	
	
	
}
