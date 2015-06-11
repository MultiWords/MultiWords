package victor.com.multiwords.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import victor.com.multiwords.dao.postgresql.EntryDAO;
import victor.com.multiwords.dao.sqlite.LocalEntryDAO;

/**
 * @author <b>WRosinski</b><br/>
 *<br/>
 */
@Transactional
@Service
public class EntryService {

	@Autowired
	private EntryDAO entryDAO;
	@Autowired
	private LocalEntryDAO localEntryDAO;
	
	public boolean checkConnection(){
		return entryDAO.checkConnection();
	}
}
