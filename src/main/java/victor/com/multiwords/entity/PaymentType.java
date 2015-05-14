package victor.com.multiwords.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
