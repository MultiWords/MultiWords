package victor.com.multiwords.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author WRosinski<br/>
 *<br/>
 */
@Entity
public class ApplicationSource extends BaseEntity{
	
	/** nazwa aplikacji z ktorej pochodzi platnosc */
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
	/** {@link ApplicationSource#name} */
	public String getName() {
		return name;
	}

	/** {@link ApplicationSource#name} */
	public void setName(String name) {
		this.name = name;
	}
	
}
