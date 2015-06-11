package victor.com.multiwords.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import victor.com.multiwords.localEntity.LocalWordsPacket;

/**
 * @author WRosinski<br/>
 *Zestaw wyrazow<br/>
 */
@Entity
@SequenceGenerator(name = "sequence_gen", initialValue=1, allocationSize=1, sequenceName="words_packet_sequence")
public class WordsPacket extends BaseEntity{

	
	/** nazwa pakietu */
	private String name;
	
	//************  RELATIONS  *******************
	/** orginalny zestaw */
	@ManyToOne
	private UserWordsPacket wordsPacketAsSource;
	/** jezyk do ktorego jest przypisany zestaw */
	@ManyToOne
	private Language language;
	
	
	//********************************************
	//*************  CONTRUCTORS  ****************
	//********************************************
	
	public WordsPacket(){}
	
	public WordsPacket(WordsPacket wordsPacket){
		super(wordsPacket);
		this.name=wordsPacket.getName();
	}
	
	public WordsPacket(LocalWordsPacket wordsPacket){
		super(wordsPacket);
		this.name=wordsPacket.getName();
	}
	
	//********************************************
	//**********  GETTERS & SETTERS  *************
	//********************************************

	
	/** {@link WordsPacket#name} */
	public String getName() {
		return name;
	}

	/** {@link WordsPacket#name} */
	public void setName(String name) {
		this.name = name;
	}

	/** {@link WordsPacket#wordsPacketAsSource} */
	@ManyToOne
	public UserWordsPacket getWordsPacketAsSource() {
		return wordsPacketAsSource;
	}

	/** {@link WordsPacket#wordsPacketAsSource} */
	public void setWordsPacketAsSource(UserWordsPacket wordsPacketAsSource) {
		this.wordsPacketAsSource = wordsPacketAsSource;
	}

	/** {@link WordsPacket#language} */
	@ManyToOne
	public Language getLanguage() {
		return language;
	}

	/** {@link WordsPacket#language} */
	public void setLanguage(Language language) {
		this.language = language;
	}
	
	
}
