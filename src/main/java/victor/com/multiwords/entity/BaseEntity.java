package victor.com.multiwords.entity;

import java.util.Date;

import javax.persistence.MappedSuperclass;

import victor.com.multiwords.localEntity.LocalBaseEntity;

/**
 * @author <b>WRosinski</b><br/>
 *<br/>
 */
@MappedSuperclass
public abstract class BaseEntity {
	
	/** id */
	protected Long id;
	/** data utworzenia obiektu */
	protected Date created;
	/** data aktualizacji */
	protected Date updated;
	
	
	//********************************************
	//*************  CONTRUCTORS  ****************
	//********************************************
	
	public BaseEntity(){}
	
	public BaseEntity (BaseEntity entity){
		this.id=entity.getId();
		this.created=entity.getCreated();
		this.updated=entity.getUpdated();
	}
	
	public BaseEntity (LocalBaseEntity entity){
		this.id=entity.getId();
		this.created=entity.getCreated();
		this.updated=entity.getUpdated();
	}
	
	//********************************************
	//**********  GETTERS & SETTERS  *************
	//********************************************

	/** {@link BaseEntity#id} */
	public void setId(Long id) {
		this.id = id;
	}
	/** {@link BaseEntity#created} */
	public Date getCreated() {
		return created;
	}
	/** {@link BaseEntity#created} */
	public void setCreated(Date created) {
		this.created = created;
	}
	/** {@link BaseEntity#updated} */
	public Date getUpdated() {
		return updated;
	}
	/** {@link BaseEntity#updated} */
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	/** {@link BaseEntity#id} */
	public Long getId() {
		return id;
	}
	
}
