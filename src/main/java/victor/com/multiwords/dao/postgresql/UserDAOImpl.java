package victor.com.multiwords.dao.postgresql;

import java.util.Date;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import victor.com.multiwords.dao.interfaces.UserDAO;
import victor.com.multiwords.entity.User;

@Repository("userDAO_postreSQL")
public class UserDAOImpl implements UserDAO{

	@Autowired
	@Qualifier("sessionFactoryPostgreSQL")
	SessionFactory sessionFactory;
	
	public UserDAOImpl(){
		System.out.println("create UserDAOImpl");
	}
	
	private Long findNextId(){
		Session session=sessionFactory.openSession();
		Query query=session.getNamedQuery("user_maxId");
		Long maxId=(Long) query.uniqueResult();
		if(maxId!=null)
			return maxId+1;
		else
			return 1L;
	}

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


	/* (non-Javadoc) @see victor.com.multiwords.dao.interfaces.UserDAO#save(victor.com.multiwords.entity.User) */
	@Override
	public void save(User user) {
		Long nextId=findNextId();
		user.setId(nextId);
		user.setCreated(new Date());
		Session session=sessionFactory.openSession();
		System.out.println(session);
		session.beginTransaction();
		System.out.println(session.getTransaction());
		session.merge(user);
		session.saveOrUpdate(user);
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
}
