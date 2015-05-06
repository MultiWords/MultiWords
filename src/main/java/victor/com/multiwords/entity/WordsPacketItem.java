package victor.com.multiwords.entity;

import java.awt.Image;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.persistence.Entity;

/**
 * @author <b>WRosinski</b><br/>
 *<br/>
 */
@Entity
public class WordsPacketItem {

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
	private Image image;
	/** zapis audio (mp3) dodany do elementu zestawu */
	private Byte[] audio;
	
	public WordsPacketItem(){
		description=null;
		example=null;
		known=false;
		lerningLevel=0;
		repeatingDate=null;
		image=null;
		audio=null;
	}

	/** {@link WordsPacketItem#description} */
	public String getDescription() {
		return description;
	}

	/** {@link WordsPacketItem#description} */
	public void setDescription(String description) {
		this.description = description;
	}

	/** {@link WordsPacketItem#example} */
	public String getExample() {
		return example;
	}

	/** {@link WordsPacketItem#example} */
	public void setExample(String example) {
		this.example = example;
	}

	/** {@link WordsPacketItem#known} */
	public Boolean getKnown() {
		return known;
	}

	/** {@link WordsPacketItem#known} */
	public void setKnown(Boolean known) {
		this.known = known;
	}

	/** {@link WordsPacketItem#lerningLevel} */
	public Integer getLerningLevel() {
		return lerningLevel;
	}

	/** {@link WordsPacketItem#lerningLevel} */
	public void setLerningLevel(Integer lerningLevel) {
		this.lerningLevel = lerningLevel;
	}

	/** {@link WordsPacketItem#repeatingDate} */
	public Date getRepeatingDate() {
		return repeatingDate;
	}

	/** {@link WordsPacketItem#repeatingDate} */
	public void setRepeatingDate(Date repeatingDate) {
		this.repeatingDate = repeatingDate;
	}

	/** {@link WordsPacketItem#image} */
	public Image getImage() {
		return image;
	}

	/** {@link WordsPacketItem#image} */
	public void setImage(Image image) {
		this.image = image;
	}

	/** {@link WordsPacketItem#audio} */
	public Byte[] getAudio() {
		return audio;
	}

	/** {@link WordsPacketItem#audio} */
	public void setAudio(Byte[] audio) {
		this.audio = audio;
	}
	
	
	
	
}
