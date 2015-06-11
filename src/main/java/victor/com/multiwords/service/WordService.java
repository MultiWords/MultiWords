package victor.com.multiwords.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import victor.com.multiwords.dao.postgresql.WordDAO;
import victor.com.multiwords.dao.sqlite.LocalWordDAO;

/**
 * @author <b>WRosinski</b><br/>
 *<br/>
 */
@Transactional
@Service
public class WordService {

	@Autowired
	private WordDAO wordDAO;
	@Autowired
	private LocalWordDAO localWordDAO;
	
	public boolean checkConnection(){
		return wordDAO.checkConnection();
	}
	
}
