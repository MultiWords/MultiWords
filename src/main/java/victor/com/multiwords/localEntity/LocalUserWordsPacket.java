package victor.com.multiwords.localEntity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import victor.com.multiwords.entity.UserWordsPacket;

/**
 * @author WRosinski<br/>
 *Zestaw wyrazow uzytkownika<br/>
 */
@Entity
@Table(name="UserWordsPacket")
public class LocalUserWordsPacket extends LocalBaseEntity{
	
	@Id
	@GeneratedValue
	private Long id;
	
	/** nazwa zestawu uzytkownika */
	private String name;
	/** czy wszystkie wyrazy w zestawie zostaly poznane */
	private Boolean allKnowns;
	/** czy ktorykolwiek wyraz w zestawie zostal poznany */
	private Boolean anyKnown;
	
	//************  RELATIONS  *******************
	/** jezyk do ktorego zostal zestaw przypisany */
	@ManyToOne
	private LocalUserLanguage userLanguage;
	/** publiczny zestaw do ktorego nalezy ten zestaw */
	@ManyToOne
	private LocalWordsPacket wordsPacket;
	/** lista wyrazow przypisana do zestawu */
	@OneToMany(mappedBy="userWordsPacket")
	private List<LocalWordsPacketItem> packetItemList;
	/** wyraz ojczysty */
	@ManyToOne
	private LocalWord nativeWord;
	/** wyraz obcy */
	@ManyToOne
	private LocalWord foreignWord;
	
	//********************************************
	//*************  CONTRUCTORS  ****************
	//********************************************
	
	public LocalUserWordsPacket(){
		name="";
		allKnowns=false;
		anyKnown=false;
	}
	
	public LocalUserWordsPacket(UserWordsPacket userWordsPacket){
		super(userWordsPacket);
		this.name=userWordsPacket.getName();
		this.allKnowns=userWordsPacket.getAllKnowns();
		this.anyKnown=userWordsPacket.getAnyKnown();
	}
	
	public LocalUserWordsPacket(LocalUserWordsPacket userWordsPacket){
		super(userWordsPacket);
		this.name=userWordsPacket.getName();
		this.allKnowns=userWordsPacket.getAllKnowns();
		this.anyKnown=userWordsPacket.getAnyKnown();
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

	/** {@link LocalUserWordsPacket#name} */
	public String getName() {
		return name;
	}

	/** {@link LocalUserWordsPacket#name} */
	public void setName(String name) {
		this.name = name;
	}

	/** {@link LocalUserWordsPacket#allKnowns} */
	public Boolean getAllKnowns() {
		return allKnowns;
	}

	/** {@link LocalUserWordsPacket#allKnowns} */
	public void setAllKnowns(Boolean allKnowns) {
		this.allKnowns = allKnowns;
	}

	/** {@link LocalUserWordsPacket#anyKnown} */
	public Boolean getAnyKnown() {
		return anyKnown;
	}

	/** {@link LocalUserWordsPacket#anyKnown} */
	public void setAnyKnown(Boolean anyKnown) {
		this.anyKnown = anyKnown;
	}

	/** {@link LocalUserWordsPacket#userLanguage} */
	@ManyToOne
	public LocalUserLanguage getUserLanguage() {
		return userLanguage;
	}

	/** {@link LocalUserWordsPacket#userLanguage} */
	public void setUserLanguage(LocalUserLanguage userLanguage) {
		this.userLanguage = userLanguage;
	}

	/** {@link LocalUserWordsPacket#wordsPacket} */
	@ManyToOne
	public LocalWordsPacket getWordsPacket() {
		return wordsPacket;
	}

	/** {@link LocalUserWordsPacket#wordsPacket} */
	public void setWordsPacket(LocalWordsPacket wordsPacket) {
		this.wordsPacket = wordsPacket;
	}

	/** {@link LocalUserWordsPacket#packetItemList} */
	@OneToMany(mappedBy="userWordsPacket")
	public List<LocalWordsPacketItem> getPacketItemList() {
		return packetItemList;
	}

	/** {@link LocalUserWordsPacket#packetItemList} */
	public void setPacketItemList(List<LocalWordsPacketItem> packetItemList) {
		this.packetItemList = packetItemList;
	}

	/** {@link LocalUserWordsPacket#nativeWord} */
	@ManyToOne
	public LocalWord getNativeWord() {
		return nativeWord;
	}

	/** {@link LocalUserWordsPacket#nativeWord} */
	public void setNativeWord(LocalWord nativeWord) {
		this.nativeWord = nativeWord;
	}

	/** {@link LocalUserWordsPacket#foreignWord} */
	@ManyToOne
	public LocalWord getForeignWord() {
		return foreignWord;
	}

	/** {@link LocalUserWordsPacket#foreignWord} */
	public void setForeignWord(LocalWord foreignWord) {
		this.foreignWord = foreignWord;
	}
	
	
}
