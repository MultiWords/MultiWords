package victor.com.multiwords.localEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import victor.com.multiwords.entity.WordsPacket;

/**
 * @author WRosinski<br/>
 *Zestaw wyrazow<br/>
 */
@Entity
@Table(name="WordsPacket")
public class LocalWordsPacket extends LocalBaseEntity{

	/** nazwa pakietu */
	private String name;
	
	//************  RELATIONS  *******************
	/** orginalny zestaw */
	private LocalUserWordsPacket wordsPacketAsSource;
	/** jezyk do ktorego jest przypisany zestaw */
	private LocalLanguage language;
	
	
	//********************************************
	//*************  CONTRUCTORS  ****************
	//********************************************
	
	public LocalWordsPacket(){}
	
	public LocalWordsPacket(WordsPacket wordsPacket){
		super(wordsPacket);
		this.name=wordsPacket.getName();
	}
	
	public LocalWordsPacket(LocalWordsPacket wordsPacket){
		super(wordsPacket);
		this.name=wordsPacket.getName();
	}
	
	
	//********************************************
	//**********  GETTERS & SETTERS  *************
	//********************************************
	/** {@link LocalBaseEntity#id} */
	@Id
	public Long getId() {
		return id;
	}
	/** {@link LocalWordsPacket#name} */
	public String getName() {
		return name;
	}

	/** {@link LocalWordsPacket#name} */
	public void setName(String name) {
		this.name = name;
	}

	/** {@link LocalWordsPacket#wordsPacketAsSource} */
	@ManyToOne
	public LocalUserWordsPacket getWordsPacketAsSource() {
		return wordsPacketAsSource;
	}

	/** {@link LocalWordsPacket#wordsPacketAsSource} */
	public void setWordsPacketAsSource(LocalUserWordsPacket wordsPacketAsSource) {
		this.wordsPacketAsSource = wordsPacketAsSource;
	}

	/** {@link LocalWordsPacket#language} */
	@ManyToOne
	public LocalLanguage getLanguage() {
		return language;
	}

	/** {@link LocalWordsPacket#language} */
	public void setLanguage(LocalLanguage language) {
		this.language = language;
	}
	
	
}
