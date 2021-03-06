package victor.com.multiwords.localEntity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import victor.com.multiwords.entity.Language;

/**
 * @author WRosinski<br/>
 *<br/>
 */
@Entity
@Table(name="Language")
public class LocalLanguage extends LocalBaseEntity{

	@Id
	@GeneratedValue
	private Long id;
	
	/** nazwa jezyka */
	private String name;
	
	//************  RELATIONS  *******************
	/** lista zestawow nalezaca do tego jezyka */
	@OneToMany(mappedBy="language")
	private List<LocalWordsPacket> wordsPacketList;
	/** klawiatura przypisana do jezyka */
	@ManyToOne
	private LocalKeyboard keyboard;
	
	//********************************************
	//*************  CONTRUCTORS  ****************
	//********************************************
	
	public LocalLanguage() {}
	
	public LocalLanguage(Language language) {
		super(language);
		this.name=language.getName();
	}

	public LocalLanguage(LocalLanguage language) {
		super(language);
		this.name=language.getName();
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
	
	/** {@link LocalLanguage#name} */
	public String getName() {
		return name;
	}

	/** {@link LocalLanguage#name} */
	public void setName(String name) {
		this.name = name;
	}

	/** {@link LocalLanguage#wordsPacketList} */
	@OneToMany(mappedBy="language")
	public List<LocalWordsPacket> getWordsPacketList() {
		return wordsPacketList;
	}

	/** {@link LocalLanguage#wordsPacketList} */
	public void setWordsPacketList(List<LocalWordsPacket> wordsPacketList) {
		this.wordsPacketList = wordsPacketList;
	}

	/** {@link LocalLanguage#keyboard} */
	@ManyToOne
	public LocalKeyboard getKeyboard() {
		return keyboard;
	}

	/** {@link LocalLanguage#keyboard} */
	public void setKeyboard(LocalKeyboard keyboard) {
		this.keyboard = keyboard;
	}
	
	
}
