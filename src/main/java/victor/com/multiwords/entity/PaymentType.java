package victor.com.multiwords.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import victor.com.multiwords.localEntity.LocalPaymentType;

/**
 * @author WRosinski<br/>
 *<br/>
 */
@Entity
public class PaymentType extends BaseEntity{

	/** nazwa typu platnosci */
	private String name;
	
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
	/** {@link BaseEntity#id} */
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	/** {@link PaymentType#name} */
	public String getName() {
		return name;
	}

	/** {@link PaymentType#name} */
	public void setName(String name) {
		this.name = name;
	}
	
	
}
