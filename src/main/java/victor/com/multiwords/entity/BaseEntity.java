package victor.com.multiwords.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import victor.com.multiwords.localEntity.LocalBaseEntity;

/**
 * @author <b>WRosinski</b><br/>
 *<br/>
 */
@MappedSuperclass
public abstract class BaseEntity {
	
	@Id
	@GeneratedValue(generator="sequence_gen")
	protected Long id;

	/** data utworzenia obiektu */
	protected Date created;
	/** data aktualizacji */
	protected Date updated;
	
	
	public <T extends LocalBaseEntity> void clone(T localEntity){
		this.id=localEntity.getSourceId();
		this.created=localEntity.getCreated();
		this.updated=localEntity.getUpdated();
	}
	
	//********************************************
	//*************  CONTRUCTORS  ****************
	//********************************************
	
	public BaseEntity(){}
	
	public BaseEntity (BaseEntity entity){
		this.setId(entity.getId());
		this.created=entity.getCreated();
		this.updated=entity.getUpdated();
	}
	
	public BaseEntity (LocalBaseEntity entity){
		this.setId(entity.getSourceId());
		this.created=entity.getCreated();
		this.updated=entity.getUpdated();
	}
	
	//********************************************
	//**********  GETTERS & SETTERS  *************
	//********************************************


	
	/** {@link BaseEntity#created} */
	public Date getCreated() {
		return created;
	}
	/** {@link BaseEntity#id} */
	public Long getId() {
		return id;
	}

	/** {@link BaseEntity#id} */
	public void setId(Long id) {
		this.id = id;
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
	
}
