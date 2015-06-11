package victor.com.multiwords.localEntity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import victor.com.multiwords.entity.WordsPacketItem;

/**
 * @author <b>WRosinski</b><br/>
 *<br/>
 */
@Entity
@Table(name="WordsPacketItem")
public class LocalWordsPacketItem extends LocalBaseEntity{

	@Id
	@GeneratedValue
	private Long id;
	
	/** dodatkowy opis na elemencie zestwu wyrazow */
	private String description;
	/** przyklad dodany do elementu zestawu wyrazow */
	private String example;
	/** czy wyraz poznany */
	private Boolean known;
	/** poziom nauki wyrazu */
	private Integer lerningLevel;
	/** data kolejnego powtorzenia wyrazu */
	private Date repeatingDate;
	/** obraz dodany do elementu zestawu */
	private Byte[] image;
	/** zapis audio (mp3) dodany do elementu zestawu */
	private Byte[] audio;
	
	//************  RELATIONS  *******************
	/** zestaw do ktorego zostal wyraz przypisany */
	@ManyToOne
	private LocalUserWordsPacket userWordsPacket;
	
	//********************************************
	//*************  CONTRUCTORS  ****************
	//********************************************
	
	public LocalWordsPacketItem(){
		description=null;
		example=null;
		known=false;
		lerningLevel=0;
		repeatingDate=null;
		image=null;
		audio=null;
	}
	
	public LocalWordsPacketItem(WordsPacketItem wordsPacketItem){
		super(wordsPacketItem);
		this.description=wordsPacketItem.getDescription();
		this.example=wordsPacketItem.getExample();
		this.known=wordsPacketItem.getKnown();
		this.lerningLevel=wordsPacketItem.getLerningLevel();
		this.repeatingDate=wordsPacketItem.getRepeatingDate();
		this.image=wordsPacketItem.getImage();
		this.audio=wordsPacketItem.getAudio();
	}
	
	public LocalWordsPacketItem(LocalWordsPacketItem wordsPacketItem){
		super(wordsPacketItem);
		this.description=wordsPacketItem.getDescription();
		this.example=wordsPacketItem.getExample();
		this.known=wordsPacketItem.getKnown();
		this.lerningLevel=wordsPacketItem.getLerningLevel();
		this.repeatingDate=wordsPacketItem.getRepeatingDate();
		this.image=wordsPacketItem.getImage();
		this.audio=wordsPacketItem.getAudio();
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
	
	/** {@link LocalWordsPacketItem#description} */
	public String getDescription() {
		return description;
	}

	/** {@link LocalWordsPacketItem#description} */
	public void setDescription(String description) {
		this.description = description;
	}

	/** {@link LocalWordsPacketItem#example} */
	public String getExample() {
		return example;
	}

	/** {@link LocalWordsPacketItem#example} */
	public void setExample(String example) {
		this.example = example;
	}

	/** {@link LocalWordsPacketItem#known} */
	public Boolean getKnown() {
		return known;
	}

	/** {@link LocalWordsPacketItem#known} */
	public void setKnown(Boolean known) {
		this.known = known;
	}

	/** {@link LocalWordsPacketItem#lerningLevel} */
	public Integer getLerningLevel() {
		return lerningLevel;
	}

	/** {@link LocalWordsPacketItem#lerningLevel} */
	public void setLerningLevel(Integer lerningLevel) {
		this.lerningLevel = lerningLevel;
	}

	/** {@link LocalWordsPacketItem#repeatingDate} */
	public Date getRepeatingDate() {
		return repeatingDate;
	}

	/** {@link LocalWordsPacketItem#repeatingDate} */
	public void setRepeatingDate(Date repeatingDate) {
		this.repeatingDate = repeatingDate;
	}


	/** {@link LocalWordsPacketItem#image} */
	public Byte[] getImage() {
		return image;
	}

	/** {@link LocalWordsPacketItem#image} */
	public void setImage(Byte[] image) {
		this.image = image;
	}
	
	/** {@link LocalWordsPacketItem#audio} */
	public Byte[] getAudio() {
		return audio;
	}

	/** {@link LocalWordsPacketItem#audio} */
	public void setAudio(Byte[] audio) {
		this.audio = audio;
	}
	

	/** {@link LocalWordsPacketItem#userWordsPacket} */
	@ManyToOne
	public LocalUserWordsPacket getUserWordsPacket() {
		return userWordsPacket;
	}

	/** {@link LocalWordsPacketItem#userWordsPacket} */
	public void setUserWordsPacket(LocalUserWordsPacket userWordsPacket) {
		this.userWordsPacket = userWordsPacket;
	}


	
	
	
}
