package victor.com.multiwords.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import victor.com.multiwords.dao.postgresql.PaymentDAO;
import victor.com.multiwords.dao.sqlite.LocalPaymentDAO;

/**
 * @author <b>WRosinski</b><br/>
 *<br/>
 */
@Transactional
@Service
public class PaymentService {

	@Autowired
	private PaymentDAO paymentDAO;
	@Autowired
	private LocalPaymentDAO localPaymentDAO;
	
	public boolean checkConnection(){
		return paymentDAO.checkConnection();
	}
}
