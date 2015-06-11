package victor.com.multiwords.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import victor.com.multiwords.dao.postgresql.ApplicationSourceDAO;
import victor.com.multiwords.dao.sqlite.LocalApplicationSourceDAO;

/**
 * @author <b>WRosinski</b><br/>
 *<br/>
 */
@Transactional
@Service
public class ApplicationSourceService {

	@Autowired
	private ApplicationSourceDAO applicationSourceDAO;
	@Autowired
	private LocalApplicationSourceDAO localApplicationSourceDAO;
	
	public boolean checkConnection(){
		return applicationSourceDAO.checkConnection();
	}
}
