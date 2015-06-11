package victor.com.multiwords.service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import victor.com.multiwords.dao.postgresql.AccountDAO;
import victor.com.multiwords.dao.sqlite.LocalAccountDAO;
import victor.com.multiwords.entity.Account;
import victor.com.multiwords.localEntity.LocalAccount;

/**
 * @author <b>WRosinski</b><br/>
 *<br/>
 */
@Transactional
@Service
public class AccountService {
	
	@Autowired
	private AccountDAO accountDAO;
	@Autowired
	private LocalAccountDAO localAccountDAO;
	
	
	public void persist(Account account){
		if(account.getId()==null){
			accountDAO.persist(account);
			LocalAccount localAccount=new LocalAccount(account);
			localAccountDAO.persist(localAccount);
		}else{
//			userDAO.persist(account);
//			LocalUser localUser=localUserDAO.findById(account.getId());
		}
	}
	
	public boolean checkConnection(){
		return accountDAO.checkConnection();
	}
	
//	@PostConstruct
//	public void init(){
//		Account a=new Account();
//		a.setName("testowe");
//		persist(a);
//	}
	
	

}
