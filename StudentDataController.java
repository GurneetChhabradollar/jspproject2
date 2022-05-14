package program;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.Accountant;
import pojo.LoginData;
import pojo.Student;
import pojo.StudentCourse;

import java.util.List;

public class StudentDataController {


	public List<Student> fetchAll()
	{
		Configuration cfg=new Configuration();	
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        List<Student> lst=session.createCriteria(Student.class).list();
        
        session.close();
        factory.close();
        return lst;
	}
	public Student fetchOne(int roll)
	{
		Student st=null;
		Configuration cfg=new Configuration();	
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        st=(Student) session.get(Student.class,roll);
        session.close();
        factory.close();
		return st;
	}
	public int updateData(Student s1)
	{
		Student st=null;
		Configuration cfg=new Configuration();	
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        st=session.load(Student.class,s1.getRoll());
        
        st.setCourse(s1.getCourse());
        
        
        Transaction tx=session.beginTransaction();
        session.update(st);
        tx.commit();
        session.close();
        factory.close();
        return 1;
	}
	public int delData(Student s1)
	{
		Student st=null;
		Configuration cfg=new Configuration();	
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        st=session.load(Student.class,s1.getRoll());
        Transaction tx=session.beginTransaction();
        session.delete(s1);
        tx.commit();
        session.close();
        factory.close();
        return 1;
	}
	public int saveData(Student st)
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(st);
		tx.commit();
		session.close();
		factory.close();
		return 1;
		
	}


	
	public StudentCourse fetchCourse(int cid)
	{
		StudentCourse st=null;
		Configuration cfg=new Configuration();	
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        st=(StudentCourse) session.get(StudentCourse.class,cid);
        session.close();
        factory.close();
		return st;
	}
	
}