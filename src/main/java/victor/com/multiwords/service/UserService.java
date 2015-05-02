package victor.com.multiwords.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import victor.com.multiwords.dao.UserDAO;
import victor.com.multiwords.entity.User;

@Service
public class UserService {

	@Autowired
	@Qualifier("userDAO_postreSQL")
	private victor.com.multiwords.dao.UserDAO userDAO_postgreSQL;
	@Autowired
	@Qualifier("userDAO_SQLite")
	private victor.com.multiwords.dao.sqlite.UserDAO userDAO_SQLite;
	
	@PostConstruct
	public void init(){
		User user=new User();
		user.setName("Sprawdzenie");
		userDAO_SQLite.persist(user);
	}
	
	public UserService(){
		System.out.println("create UserService");
	}
}
