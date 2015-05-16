package victor.com.multiwords.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import victor.com.multiwords.dao.postgresql.PaymentTypeDAO;
import victor.com.multiwords.dao.sqlite.LocalPaymentTypeDAO;

/**
 * @author <b>WRosinski</b><br/>
 *<br/>
 */
@Transactional
@Service
public class PaymentTypeService {

	@Autowired
	private PaymentTypeDAO paymentTypeDAO;
	@Autowired
	private LocalPaymentTypeDAO localPaymentTypeDAO;
}
