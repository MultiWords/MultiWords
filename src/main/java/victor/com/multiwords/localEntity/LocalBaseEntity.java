package victor.com.multiwords.localEntity;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import victor.com.multiwords.entity.BaseEntity;

/**
 * @author <b>WRosinski</b><br/>
 *<br/>
 */
@MappedSuperclass
public abstract class LocalBaseEntity {
	
	/** id */
	protected Long id;
	/** id odpowiednika na centralnej bazie danych */
	protected Long sourceId;
	/** data utworzenia obiektu */
	protected Date created;
	/** data aktualizacji */
	protected Date updated;
	
	//********************************************
	//*************  CONTRUCTORS  ****************
	//********************************************
	
	public LocalBaseEntity(){}
	
	public LocalBaseEntity (BaseEntity entity){
		this.id=entity.getId();
		this.created=entity.getCreated();
		this.updated=entity.getUpdated();
	}
	
	public LocalBaseEntity (LocalBaseEntity entity){
		this.id=entity.getId();
		this.created=entity.getCreated();
		this.updated=entity.getUpdated();
	}
	
	//********************************************
	//**********  GETTERS & SETTERS  *************
	//********************************************

	/** {@link LocalBaseEntity#id} */
	public void setId(Long id) {
		this.id = id;
	}
	/** {@link LocalBaseEntity#created} */
	public Date getCreated() {
		return created;
	}
	/** {@link LocalBaseEntity#created} */
	public void setCreated(Date created) {
		this.created = created;
	}
	/** {@link LocalBaseEntity#updated} */
	public Date getUpdated() {
		return updated;
	}
	/** {@link LocalBaseEntity#updated} */
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	/** {@link LocalBaseEntity#id} */
	public Long getId() {
		return id;
	}
	
}
