package victor.com.multiwords.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author WRosinski<br/>
 *Zestaw wyrazow<br/>
 */
@Entity
public class WordsPacket extends BaseEntity{

	/** nazwa pakietu */
	private String name;
	
	//************  RELATIONS  *******************
	/** orginalny zestaw */
	private UserWordsPacket wordsPacketAsSource;
	/** jezyk do ktorego jest przypisany zestaw */
	private Language language;
	
	
	//********************************************
	//**********  GETTERS & SETTERS  *************
	//********************************************
	/** {@link BaseEntity#id} */
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
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
