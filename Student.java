package pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int roll;
	private String name;
	private String course;
	private int ad_year;
	
	
	public Student()
	{
		
	}
	public Student(int roll, String name, String course, int ad_year) {
		super();
		this.roll = roll;
		this.name = name;
		this.course = course;
		this.ad_year = ad_year;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

	public int getAd_year() {
		return ad_year;
	}
	public void setAd_year(int ad_year) {
		this.ad_year = ad_year;
	}
	
	public String toString()
	{
		return "Roll="+roll+"\tName="+name+"\tCourse="+course+"\tYear of Admission="+ad_year;
	}
}


