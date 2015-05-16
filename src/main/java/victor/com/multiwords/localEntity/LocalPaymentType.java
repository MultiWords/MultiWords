package victor.com.multiwords.localEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import victor.com.multiwords.entity.PaymentType;

/**
 * @author WRosinski<br/>
 *<br/>
 */
@Entity
@Table(name="PaymentType")
public class LocalPaymentType extends LocalBaseEntity{

	/** nazwa typu platnosci */
	private String name;
	
	//************  RELATIONS  *******************

	//********************************************
	//*************  CONTRUCTORS  ****************
	//********************************************
	public LocalPaymentType(){}
	
	public LocalPaymentType(PaymentType paymentType){
		super(paymentType);
		this.name=paymentType.getName();
	}
	
	public LocalPaymentType(LocalPaymentType paymentType){
		super(paymentType);
		this.name=paymentType.getName();
	}
	
	//********************************************
	//**********  GETTERS & SETTERS  *************
	//********************************************
	/** {@link LocalBaseEntity#id} */
	@Id
	public Long getId() {
		return id;
	}
	/** {@link LocalPaymentType#name} */
	public String getName() {
		return name;
	}

	/** {@link LocalPaymentType#name} */
	public void setName(String name) {
		this.name = name;
	}
	
	
}
