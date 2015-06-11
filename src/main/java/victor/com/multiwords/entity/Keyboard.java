package victor.com.multiwords.entity;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;

import victor.com.multiwords.localEntity.LocalKeyboard;

/**
 * @author WRosinski<br/>
 *<br/>
 */
@Entity
@SequenceGenerator(name = "sequence_gen", initialValue=1, allocationSize=1, sequenceName="keyboard_sequence")
public class Keyboard extends BaseEntity{
	
	
	public void clone(LocalKeyboard keyboard){
		super.clone(keyboard);
	}
	
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
	
}
