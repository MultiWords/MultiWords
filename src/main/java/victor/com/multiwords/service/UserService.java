package victor.com.multiwords.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import victor.com.multiwords.dao.postgresql.UserDAO;
import victor.com.multiwords.dao.sqlite.LocalUserDAO;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserDAO userDAO;
	@Autowired
	private LocalUserDAO localUserDAO;
	
	

//	@PostConstruct
//	public void init(){
//		User user=new User();
//		user.setName("TEST");
//		persist(user);
//	}
	
	public UserService(){
		System.out.println("create UserService");
	}
}
