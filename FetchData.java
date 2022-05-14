package program;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import pojo.StudentBCA;

public class FetchData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		StudentBCA st=(StudentBCA) session.get(StudentBCA.class,1001);
		
		System.out.println("Name: "+st.getName());
		System.out.println("Student Id: "+st.getStid());
		
		System.out.println("Installment:"+st.getInstallment());
		
		session.close();
		factory.close();
	}

}
