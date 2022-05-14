package pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class StudentBCA {
	
	@Id
	private int stid;
	private String name;
	
	@OneToOne(mappedBy="st")
	private FeesBCA installment;

	public StudentBCA() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentBCA(int stid, String name, FeesBCA installment) {
		super();
		this.stid = stid;
		this.name = name;
		this.installment = installment;
	}

	public int getStid() {
		return stid;
	}

	public void setStid(int stid) {
		this.stid = stid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FeesBCA getInstallment() {
		return installment;
	}

	public void setInstallment(FeesBCA installment) {
		this.installment = installment;
	}

	@Override
	public String toString() {
		return "StudentBCA [stid=" + stid + ", name=" + name + ", installment=" + installment + "]";
	}
	
	
}
