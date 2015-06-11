package victor.com.multiwords.localEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import victor.com.multiwords.entity.Keyboard;

/**
 * @author WRosinski<br/>
 *<br/>
 */
@Entity
@Table(name="Keyboard")
public class LocalKeyboard extends LocalBaseEntity{
	
	@Id
	@GeneratedValue
	private Long id;
	
	//********************************************
	//*************  CONTRUCTORS  ****************
	//********************************************
	
	public LocalKeyboard() {}
	
	public LocalKeyboard(Keyboard keyboard) {
		super(keyboard);
	}
	public LocalKeyboard(LocalKeyboard keyboard) {
		super(keyboard);
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
	
}
