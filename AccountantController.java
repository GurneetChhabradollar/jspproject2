package program;

import pojo.Accountant;
import pojo.LoginData;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AccountantController {
	
	public int saveData(Accountant acc,LoginData lgn)
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(acc);
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
	public Accountant fetchOne(String e1)
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session =factory.openSession();
		Accountant acc=(Accountant) session.get((Accountant.class),e1);
		session.close();
		factory.close();
		return acc;
	}
	public int UpdateData(String e1,Accountant acc)
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Accountant account=(Accountant) session.get(Accountant.class,e1);
		Transaction tx=session.beginTransaction();
		account.setName(acc.getName());
		account.setAddress(acc.getAddress());
		account.setContact(acc.getContact());
		session.update(account);
		tx.commit();
		session.close();
		factory.close();
		return 1;
	}
	public List<Accountant> fetchAll()
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		List<Accountant> lst=session.createCriteria(Accountant.class).list();
		return lst;
	}
	public int UpdateAccountant(Accountant acc)
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Accountant account=(Accountant) session.get(Accountant.class,acc.getEmpno());
		Transaction tx=session.beginTransaction();
		account.setName(acc.getName());
		account.setAddress(acc.getAddress());
		account.setContact(acc.getContact());
		
		session.update(account);
		tx.commit();
		session.close();
		factory.close();
		return 1;
	}
	public int deleteData(Accountant acc,LoginData lgn)
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Accountant account=(Accountant) session.get(Accountant.class,acc.getEmpno());
		Transaction tx=session.beginTransaction();
		
		
		session.delete(account);
		tx.commit();
		
		LoginData login=(LoginData) session.get(LoginData.class,lgn.getUserid());
		Transaction tx1=session.beginTransaction();
		session.delete(login);
		tx.commit();
		session.close();
		factory.close();
		return 1;
	}
}
