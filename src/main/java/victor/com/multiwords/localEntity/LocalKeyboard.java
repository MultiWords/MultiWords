package victor.com.multiwords.localEntity;

import javax.persistence.Entity;
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
	/** {@link LocalBaseEntity#id} */
	@Id
	public Long getId() {
		return id;
	}
}
