package program;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.StudentBCA;
import pojo.FeesBCA;

public class DepositFee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		StudentBCA st=new StudentBCA();
		st.setStid(1001);
		st.setName("Gurneet");
		
		
		FeesBCA f1=new FeesBCA();
		f1.setTid(1);
		f1.setSt(st);
		f1.setDep_date(System.currentTimeMillis());
		f1.setAmount(10000);
		
		st.setInstallment(f1);
		
		session.save(st);
		session.save(f1);
		
		tx.commit();
		session.close();
		factory.close();
		
		
	}

}
