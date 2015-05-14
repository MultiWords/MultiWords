package victor.com.multiwords.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author WRosinski<br/>
 *Zestaw wyrazow uzytkownika<br/>
 */
@Entity
public class UserWordsPacket extends UserEntity{
	
	/** nazwa zestawu uzytkownika */
	private String name;
	/** czy wszystkie wyrazy w zestawie zostaly poznane */
	private Boolean allKnowns;
	/** czy ktorykolwiek wyraz w zestawie zostal poznany */
	private Boolean anyKnown;
	
	//************  RELATIONS  *******************
	/** jezyk do ktorego zostal zestaw przypisany */
	private UserLanguage userLanguage;
	/** publiczny zestaw do ktorego nalezy ten zestaw */
	private WordsPacket wordsPacket;
	/** lista wyrazow przypisana do zestawu */
	private List<WordsPacketItem> packetItemList;
	/** wyraz ojczysty */
	private Word nativeWord;
	/** wyraz obcy */
	private Word foreignWord;
	
	
	
	
	//********************************************
	//**********  GETTERS & SETTERS  *************
	//********************************************
	/** {@link BaseEntity#id} */
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public UserWordsPacket(){
		name="";
		allKnowns=false;
		anyKnown=false;
	}

	/** {@link UserWordsPacket#name} */
	public String getName() {
		return name;
	}

	/** {@link UserWordsPacket#name} */
	public void setName(String name) {
		this.name = name;
	}

	/** {@link UserWordsPacket#allKnowns} */
	public Boolean getAllKnowns() {
		return allKnowns;
	}

	/** {@link UserWordsPacket#allKnowns} */
	public void setAllKnowns(Boolean allKnowns) {
		this.allKnowns = allKnowns;
	}

	/** {@link UserWordsPacket#anyKnown} */
	public Boolean getAnyKnown() {
		return anyKnown;
	}

	/** {@link UserWordsPacket#anyKnown} */
	public void setAnyKnown(Boolean anyKnown) {
		this.anyKnown = anyKnown;
	}

	/** {@link UserWordsPacket#userLanguage} */
	@ManyToOne
	public UserLanguage getUserLanguage() {
		return userLanguage;
	}

	/** {@link UserWordsPacket#userLanguage} */
	public void setUserLanguage(UserLanguage userLanguage) {
		this.userLanguage = userLanguage;
	}

	/** {@link UserWordsPacket#wordsPacket} */
	@ManyToOne
	public WordsPacket getWordsPacket() {
		return wordsPacket;
	}

	/** {@link UserWordsPacket#wordsPacket} */
	public void setWordsPacket(WordsPacket wordsPacket) {
		this.wordsPacket = wordsPacket;
	}

	/** {@link UserWordsPacket#packetItemList} */
	@OneToMany(mappedBy="userWordsPacket")
	public List<WordsPacketItem> getPacketItemList() {
		return packetItemList;
	}

	/** {@link UserWordsPacket#packetItemList} */
	public void setPacketItemList(List<WordsPacketItem> packetItemList) {
		this.packetItemList = packetItemList;
	}

	/** {@link UserWordsPacket#nativeWord} */
	@ManyToOne
	public Word getNativeWord() {
		return nativeWord;
	}

	/** {@link UserWordsPacket#nativeWord} */
	public void setNativeWord(Word nativeWord) {
		this.nativeWord = nativeWord;
	}

	/** {@link UserWordsPacket#foreignWord} */
	@ManyToOne
	public Word getForeignWord() {
		return foreignWord;
	}

	/** {@link UserWordsPacket#foreignWord} */
	public void setForeignWord(Word foreignWord) {
		this.foreignWord = foreignWord;
	}
	
	
}
