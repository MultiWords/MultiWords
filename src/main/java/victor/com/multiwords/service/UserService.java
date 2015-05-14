package victor.com.multiwords.service;

import javax.annotation.PostConstruct;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import victor.com.multiwords.dao.interfaces.UserDAO;
import victor.com.multiwords.entity.User;

@Service
@Transactional
public class UserService {

	@Autowired
	@Qualifier("userDAO_postreSQL")
	private UserDAO userDAO_postgreSQL;
	@Autowired
	@Qualifier("userDAO_SQLite")
	private UserDAO userDAO_SQLite;
	
	
	
	/**
	 * @param user
	 * @see victor.com.multiwords.dao.interfaces.UserDAO#persist(victor.com.multiwords.entity.User)
	 */
	public void persist(User user) {
		if(user.getId()==null){
			userDAO_postgreSQL.save(user);
			userDAO_SQLite.save(user);
		}else{
			userDAO_postgreSQL.update(user);
			userDAO_SQLite.update(user);
		}
		
	}

	@PostConstruct
	public void init(){
		User user=new User();
		user.setName("TEST");
		persist(user);
	}
	
	public UserService(){
		System.out.println("create UserService");
	}
}
