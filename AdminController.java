package program;
import pojo.Admindata;
import pojo.LoginData;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AdminController {
	
	public int saveData(Admindata ad,LoginData lgn)
	{
		
		Configuration cfg=new 	Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(ad);
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
	public Admindata fetchOne(String id)
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		Admindata adm=(Admindata) session.get(Admindata.class,id);
		
		session.close();
		factory.close();
		return adm;
	}
	public int UpdateData(String e1,Admindata adm)
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		Admindata admin=(Admindata) session.load(Admindata.class,e1);
		Transaction tx=session.beginTransaction();
		admin.setName(adm.getName());
		admin.setAddress(adm.getAddress());
		admin.setContact(adm.getContact());
		
		session.update(admin);
		tx.commit();
		session.close();
		factory.close();
		return 1;
	}

}
