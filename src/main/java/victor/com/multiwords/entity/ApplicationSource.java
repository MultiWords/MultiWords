package victor.com.multiwords.entity;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;

import victor.com.multiwords.localEntity.LocalApplicationSource;

/**
 * @author WRosinski<br/>
 *<br/>
 */
@Entity
@SequenceGenerator(name = "sequence_gen", initialValue=1, allocationSize=1, sequenceName="app_source_sequence")
public class ApplicationSource extends BaseEntity{
	
	/** nazwa aplikacji z ktorej pochodzi platnosc */
	private String name;


	//************  RELATIONS  *******************
	
	
	public void clone(LocalApplicationSource appSource){
		super.clone(appSource);
		this.name=appSource.getName();
	}
	
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
	/** {@link ApplicationSource#name} */
	public String getName() {
		return name;
	}

	/** {@link ApplicationSource#name} */
	public void setName(String name) {
		this.name = name;
	}

	
}
