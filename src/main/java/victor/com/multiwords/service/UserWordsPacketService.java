package victor.com.multiwords.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import victor.com.multiwords.dao.postgresql.UserWordsPacketDAO;
import victor.com.multiwords.dao.sqlite.LocalUserWordsPacketDAO;

/**
 * @author <b>WRosinski</b><br/>
 *<br/>
 */
@Transactional
@Service
public class UserWordsPacketService {

	@Autowired
	private UserWordsPacketDAO userWordsPacketDAO;
	@Autowired
	private LocalUserWordsPacketDAO localUserWordsPacketDAO;
}
