package victor.com.multiwords.dao.sqlite;


import java.util.Date;

import net.sf.ehcache.hibernate.HibernateUtil;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.StatelessSession;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import victor.com.multiwords.dao.implementation.UserDAOAbract;
import victor.com.multiwords.dao.interfaces.UserDAO;
import victor.com.multiwords.entity.User;

@Repository("userDAO_SQLite")
public class UserDAOImpl implements UserDAO{

	@Autowired
	@Qualifier("sessionFactorySQLite")
	SessionFactory sessionFactory;
	
//
//	@Override
//	public void persist(User user) {
//		Session session=sessionFactory.openSession();
//		System.out.println(session);
//		session.beginTransaction();
//		System.out.println(session.getTransaction());
//		session.merge(user);
//		session.saveOrUpdate(user);
//		session.getTransaction().commit();
//		session.close();
//	}
	
//	@Override
//	public void persist(User user) {
//		StatelessSession  session=sessionFactory.openStatelessSession();
//		System.out.println(session);
//		Transaction tr=session.beginTransaction();
//		System.out.println(session.getTransaction());
//		session.update(user);
//		tr.commit();
//		session.close();
//	}
	
	private Long findNextId(){
		Session session=sessionFactory.openSession();
		Query query=session.getNamedQuery("user_maxId");
		Long maxId=(Long) query.uniqueResult();
		if(maxId!=null)
			return maxId+1;
		else
			return 1L;
	}
	
	/* (non-Javadoc) @see victor.com.multiwords.dao.interfaces.UserDAO#save(victor.com.multiwords.entity.User) */
	@Override
	public void save(User user) {
		User temp=user.clone();
//		user.setCreated(new Date());
		Session session=sessionFactory.openSession();
		System.out.println(session);
		session.beginTransaction();
		System.out.println(session.getTransaction());
		session.merge(user);
		session.persist(temp);
		session.getTransaction().commit();
		session.close();
	}


	/* (non-Javadoc) @see victor.com.multiwords.dao.interfaces.UserDAO#update(victor.com.multiwords.entity.User) */
	@Override
	public void update(User user) {
		user.setUpdateDate(new Date());
		Session session=sessionFactory.openSession();
		System.out.println(session);
		session.beginTransaction();
		System.out.println(session.getTransaction());
		session.merge(user);
		session.update(user);
		session.getTransaction().commit();
		session.close();
	}
}
