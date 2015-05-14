package victor.com.multiwords.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * @author WRosinski<br/>
 *<br/>
 */
@Entity
public class Language extends BaseEntity{

	/** nazwa jezyka */
	private String name;
	
	//************  RELATIONS  *******************
	/** lista zestawow nalezaca do tego jezyka */
	private List<WordsPacket> wordsPacketList;
	/** klawiatura przypisana do jezyka */
	private Keyboard keyboard;
	
	
	

	//********************************************
	//**********  GETTERS & SETTERS  *************
	//********************************************
	/** {@link BaseEntity#id} */
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	/** {@link Language#name} */
	public String getName() {
		return name;
	}

	/** {@link Language#name} */
	public void setName(String name) {
		this.name = name;
	}

	/** {@link Language#wordsPacketList} */
	@OneToMany(mappedBy="language")
	public List<WordsPacket> getWordsPacketList() {
		return wordsPacketList;
	}

	/** {@link Language#wordsPacketList} */
	public void setWordsPacketList(List<WordsPacket> wordsPacketList) {
		this.wordsPacketList = wordsPacketList;
	}

	/** {@link Language#keyboard} */
	@ManyToOne
	public Keyboard getKeyboard() {
		return keyboard;
	}

	/** {@link Language#keyboard} */
	public void setKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
	}
	
	
}
