package victor.com.multiwords.service;

import javax.transaction.Transactional;

import org.infinispan.commons.marshall.SerializeWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import victor.com.multiwords.dao.postgresql.AccountDAO;
import victor.com.multiwords.dao.sqlite.LocalAccountDAO;

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
	

}
