package victor.com.multiwords.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import victor.com.multiwords.localEntity.LocalKeyboard;

/**
 * @author WRosinski<br/>
 *<br/>
 */
@Entity
public class Keyboard extends BaseEntity{
	
	
	//********************************************
	//*************  CONTRUCTORS  ****************
	//********************************************
	
	public Keyboard() {}
	
	public Keyboard(Keyboard keyboard) {
		super(keyboard);
	}
	public Keyboard(LocalKeyboard keyboard) {
		super(keyboard);
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
}
