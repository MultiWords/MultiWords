package victor.com.multiwords.localEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import victor.com.multiwords.entity.ApplicationSource;

/**
 * @author WRosinski<br/>
 *<br/>
 */
@Entity
@Table(name="ApplicationSource")
public class LocalApplicationSource extends LocalBaseEntity{
	@Id
	@GeneratedValue
	private Long id;
	
	/** nazwa aplikacji z ktorej pochodzi platnosc */
	private String name;


	//************  RELATIONS  *******************

	//********************************************
	//*************  CONTRUCTORS  ****************
	//********************************************
	
	public LocalApplicationSource(){}
	
	public LocalApplicationSource(ApplicationSource applicationSource){
		super(applicationSource);
		this.name=applicationSource.getName();
	}
	
	public LocalApplicationSource(LocalApplicationSource applicationSource){
		super(applicationSource);
		this.name=applicationSource.getName();
	}
	
	//********************************************
	//**********  GETTERS & SETTERS  *************
	//********************************************

	/* (non-Javadoc) @see victor.com.multiwords.localEntity.LocalBaseEntity#setId(java.lang.Long) */
	@Override
	public void setId(Long id) {
		this.id=id;
	}

	/* (non-Javadoc) @see victor.com.multiwords.localEntity.LocalBaseEntity#getId() */
	@Override
	public Long getId() {
		return id;
	}
	
	/** {@link LocalApplicationSource#name} */
	public String getName() {
		return name;
	}

	/** {@link LocalApplicationSource#name} */
	public void setName(String name) {
		this.name = name;
	}
	
}
