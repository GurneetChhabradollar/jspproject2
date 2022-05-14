package pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class FeesBCA {
	@Id
	private int tid;
	private int amount;
	private long dep_date;
	
	@OneToOne
	private StudentBCA st;

	public FeesBCA() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FeesBCA(int tid, int amount, long dep_date, StudentBCA st) {
		super();
		this.tid = tid;
		this.amount = amount;
		this.dep_date = dep_date;
		this.st = st;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public long getDep_date() {
		return dep_date;
	}

	public void setDep_date(long dep_date) {
		this.dep_date = dep_date;
	}

	public StudentBCA getSt() {
		return st;
	}

	public void setSt(StudentBCA st) {
		this.st = st;
	}

	@Override
	public String toString() {
		return "FeesBCA [tid=" + tid + ", amount=" + amount + ", dep_date=" + dep_date + ", st=" + st + "]";
	}
	
	
}
