package victor.com.multiwords.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import victor.com.multiwords.dao.postgresql.UserLanguageDAO;
import victor.com.multiwords.dao.sqlite.LocalUserLanguageDAO;

/**
 * @author <b>WRosinski</b><br/>
 *<br/>
 */
@Transactional
@Service
public class UserLanguageService {

	@Autowired
	private UserLanguageDAO userLanguageDAO;
	@Autowired
	private LocalUserLanguageDAO localUserLanguageDAO;
	
}
