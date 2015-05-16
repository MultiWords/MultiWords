package victor.com.multiwords.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import victor.com.multiwords.localEntity.LocalApplicationSource;

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
	//*************  CONTRUCTORS  ****************
	//********************************************
	
	public ApplicationSource(){}
	
	public ApplicationSource(ApplicationSource applicationSource){
		super(applicationSource);
		this.name=applicationSource.getName();
	}
	
	public ApplicationSource(LocalApplicationSource applicationSource){
		super(applicationSource);
		this.name=applicationSource.getName();
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
	/** {@link ApplicationSource#name} */
	public String getName() {
		return name;
	}

	/** {@link ApplicationSource#name} */
	public void setName(String name) {
		this.name = name;
	}
	
}
