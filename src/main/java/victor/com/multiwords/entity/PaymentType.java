package victor.com.multiwords.entity;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;

import victor.com.multiwords.localEntity.LocalPaymentType;

/**
 * @author WRosinski<br/>
 *<br/>
 */
@Entity
@SequenceGenerator(name = "sequence_gen", initialValue=1, allocationSize=1, sequenceName="payment_type_sequence")
public class PaymentType extends BaseEntity{

	/** nazwa typu platnosci */
	private String name;
	
	public void clone(LocalPaymentType paymentType){
		super.clone(paymentType);
		this.name=paymentType.getName();
	}
	
	//************  RELATIONS  *******************

	//********************************************
	//*************  CONTRUCTORS  ****************
	//********************************************
	public PaymentType(){}
	
	public PaymentType(PaymentType paymentType){
		super(paymentType);
		this.name=paymentType.getName();
	}
	
	public PaymentType(LocalPaymentType paymentType){
		super(paymentType);
		this.name=paymentType.getName();
	}
	
	//********************************************
	//**********  GETTERS & SETTERS  *************
	//********************************************

	/** {@link PaymentType#name} */
	public String getName() {
		return name;
	}

	/** {@link PaymentType#name} */
	public void setName(String name) {
		this.name = name;
	}
	
	
}
