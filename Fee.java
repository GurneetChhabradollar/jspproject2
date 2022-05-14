package pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fee {
	
	@Id
	private int tid;
	private int stid;
	private int fees;
	
	public Fee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fee(int tid, int stid, int fees) {
		super();
		this.tid = tid;
		this.stid = stid;
		this.fees = fees;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public int getStid() {
		return stid;
	}

	public void setStid(int stid) {
		this.stid = stid;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}
	
}
