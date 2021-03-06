package victor.com.multiwords.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import victor.com.multiwords.dao.postgresql.KeyboardDAO;
import victor.com.multiwords.dao.sqlite.LocalKeyboardDAO;

/**
 * @author <b>WRosinski</b><br/>
 *<br/>
 */
@Transactional
@Service
public class KeyboardService {

	@Autowired
	private KeyboardDAO keyboardDAO;
	@Autowired
	private LocalKeyboardDAO localKeyboardDAO;
	
	public boolean checkConnection(){
		return keyboardDAO.checkConnection();
	}
}
