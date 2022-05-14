package program;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.Librarian;
import pojo.Logindata;


public class AdminDataController {
	
	public int saveData(Librarian lb,Logindata lgn)
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(lb);
		tx.commit();
		session.close();
		
		
		session=factory.openSession();
		tx=session.beginTransaction();
		
		session.save(lgn);
		tx.commit();
		session.close();
		
		
		factory.close();
		return 1;
	}
	public Logindata fetchOne(String id)
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		Logindata lgn=(Logindata) session.get(Logindata.class,id);
		
		session.close();
		factory.close();
		return lgn;
	}
	public Librarian fetchLibrarian()
	{
		Librarian lb=new Librarian();
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session =factory.openSession();
		
		lb=(Librarian) session.get(Librarian.class,"aa@gmail.com");
		
		return lb;
	}
}
