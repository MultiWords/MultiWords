package victor.com.multiwords.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import victor.com.multiwords.dao.postgresql.UserDAO;
import victor.com.multiwords.dao.sqlite.LocalUserDAO;
import victor.com.multiwords.entity.User;
import victor.com.multiwords.localEntity.LocalUser;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserDAO userDAO;
	@Autowired
	private LocalUserDAO localUserDAO;
	
	public void persist(User user){
//		if(ConnectionUtils.isOpenConnection()){
//			
//		}
		if(user.getId()==null){
			userDAO.persist(user);
			LocalUser localUser=new LocalUser(user);
			localUserDAO.persist(localUser);
		}else{
			
			
		}
	}
	
	
	
	public boolean checkConnection(){
		return userDAO.checkConnection();
	}

//	@PostConstruct
//	public void init(){
//		User user=new User();
//		user.setName("TEST");
//		persist(user);
////		user.setId(11l);
////		persist(user);
//	}
	

}
