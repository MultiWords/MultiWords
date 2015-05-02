package victor.com.multiwords.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import victor.com.multiwords.entity.User;

@Repository("userDAO_postreSQL")
public class UserDAOImpl implements UserDAO{

	@Autowired
	@Qualifier("sessionFactoryPostgreSQL")
	SessionFactory sessionFactory;
	
	public UserDAOImpl(){
		System.out.println("create UserDAOImpl");
	}

	@Override
	public void persist(User user) {
		Session session=sessionFactory.openSession();
		System.out.println(session);
		session.beginTransaction();
		System.out.println(session.getTransaction());
		session.persist(user);
		session.getTransaction().commit();
	}
}
