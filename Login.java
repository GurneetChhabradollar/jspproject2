package program;

import pojo.LoginData;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Login {
	public LoginData FetchOne(String id)
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		LoginData lgn=(LoginData) session.get(LoginData.class,id);
		
		session.close();
		factory.close();
		return lgn;
		
	}
	public int UpdatePassword(String userid,String oldpass,String newpass)
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		int f=0;
		
		LoginData lgn=(LoginData) session.get(LoginData.class,userid);
		if(lgn.getPassword().equals(oldpass))
		{
			Transaction tx=session.beginTransaction();
			lgn.setPassword(newpass);
			session.update(lgn);
			tx.commit();
			session.close();
			factory.close();
			f=1;
		}
		return f;
		
	}
}
