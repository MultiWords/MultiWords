package victor.com.multiwords.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import victor.com.multiwords.dao.postgresql.WordsPacketItemDAO;
import victor.com.multiwords.dao.sqlite.LocalWordsPacketItemDAO;

/**
 * @author <b>WRosinski</b><br/>
 *<br/>
 */
@Transactional
@Service
public class WordsPacketItemService {

	@Autowired
	private WordsPacketItemDAO wordsPacketItemDAO;
	@Autowired
	private LocalWordsPacketItemDAO localWordsPacketItemDAO;
	
	public boolean checkConnection(){
		return wordsPacketItemDAO.checkConnection();
	}
	
}
