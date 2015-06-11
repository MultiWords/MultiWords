package victor.com.multiwords.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import victor.com.multiwords.dao.postgresql.UserAccountDAO;
import victor.com.multiwords.dao.sqlite.LocalUserDAO;

/**
 * @author <b>WRosinski</b><br/>
 *<br/>
 */
@Transactional
@Service
public class UserAccountService {

	@Autowired
	private UserAccountDAO userAccountDAO;
	@Autowired
	private LocalUserDAO localUserDAO;
	
	public boolean checkConnection(){
		return userAccountDAO.checkConnection();
	}
}
