package victor.com.multiwords.localEntity;

import java.util.Date;

import javax.persistence.MappedSuperclass;

import victor.com.multiwords.entity.BaseEntity;

/**
 * @author <b>WRosinski</b><br/>
 *<br/>
 */
@MappedSuperclass
public abstract class LocalBaseEntity {
	

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
	
	public <T extends BaseEntity> LocalBaseEntity (T entity){
		this.setSourceId(entity.getId());
		this.created=entity.getCreated();
		this.updated=entity.getUpdated();
	}
	
	public <T extends LocalBaseEntity>LocalBaseEntity (T entity){
		this.setId(entity.getId());
		this.setSourceId(entity.getSourceId());
		this.created=entity.getCreated();
		this.updated=entity.getUpdated();
	}
	
	//********************************************
	//**********  GETTERS & SETTERS  *************
	//********************************************

	public abstract void setId(Long id);
	public abstract Long getId();
	
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

	/** {@link LocalBaseEntity#sourceId} */
	public Long getSourceId() {
		return sourceId;
	}

	/** {@link LocalBaseEntity#sourceId} */
	public void setSourceId(Long sourceId) {
		this.sourceId = sourceId;
	}
	
}
