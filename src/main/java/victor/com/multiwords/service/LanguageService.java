package victor.com.multiwords.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import victor.com.multiwords.dao.postgresql.LanguageDAO;
import victor.com.multiwords.dao.sqlite.LocalLanguageDAO;

/**
 * @author <b>WRosinski</b><br/>
 *<br/>
 */
@Transactional
@Service
public class LanguageService {

	@Autowired
	private LanguageDAO languageDAO;
	@Autowired
	private LocalLanguageDAO localLanguageDAO;
	
	public boolean checkConnection(){
		return languageDAO.checkConnection();
	}
}
