package victor.com.multiwords.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import victor.com.multiwords.dao.postgresql.WordsPacketDAO;
import victor.com.multiwords.dao.sqlite.LocalWordsPacketDAO;

/**
 * @author <b>WRosinski</b><br/>
 *<br/>
 */
@Transactional
@Service
public class WordsPacketService {

	@Autowired
	private WordsPacketDAO wordsPacketDAO;
	@Autowired
	private LocalWordsPacketDAO localWordsPacketDAO;
	
	public boolean checkConnection(){
		return wordsPacketDAO.checkConnection();
	}
}
