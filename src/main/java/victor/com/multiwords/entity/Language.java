package victor.com.multiwords.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import victor.com.multiwords.localEntity.LocalLanguage;

/**
 * @author WRosinski<br/>
 *<br/>
 */
@Entity
@SequenceGenerator(name = "sequence_gen", initialValue=1, allocationSize=1, sequenceName="language_sequence")
public class Language extends BaseEntity{

	/** nazwa jezyka */
	private String name;
	
	
	public void clone(LocalLanguage language){
		super.clone(language);
		this.name=language.getName();
	}
	
	//************  RELATIONS  *******************
	/** lista zestawow nalezaca do tego jezyka */
	@OneToMany(mappedBy="language")
	private List<WordsPacket> wordsPacketList;
	/** klawiatura przypisana do jezyka */
	@ManyToOne
	private Keyboard keyboard;
	
	//********************************************
	//*************  CONTRUCTORS  ****************
	//********************************************
	
	public Language() {}
	
	public Language(Language language) {
		super(language);
		this.name=language.getName();
	}

	public Language(LocalLanguage language) {
		super(language);
		this.name=language.getName();
	}

	//********************************************
	//**********  GETTERS & SETTERS  *************
	//********************************************

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
