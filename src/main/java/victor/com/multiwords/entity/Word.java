package victor.com.multiwords.entity;

import java.awt.Image;

import javax.persistence.Entity;

/**
 * @author <b>WRosinski</b><br/>
 *<br/>
 */
@Entity
public class Word {
	
	/** wyraz */
	private String word;
	/** id znaczenia */
	private Long meaning;
	/** wymowa - literalny zapis sposobu wymowy wyrazu */
	private String pronunciation;
	/** przyklad uzycia wyrazu */
	private String example;
	/** obrazek dolaczony do wyrazu */
	private Image image;
	/** zapis audio (mp3) dolaczony do wyrazu */
	private Byte[] audio;
	/** {@link Word#word} */
	public String getWord() {
		return word;
	}
	/** {@link Word#word} */
	public void setWord(String word) {
		this.word = word;
	}
	/** {@link Word#meaning} */
	public Long getMeaning() {
		return meaning;
	}
	/** {@link Word#meaning} */
	public void setMeaning(Long meaning) {
		this.meaning = meaning;
	}
	/** {@link Word#pronunciation} */
	public String getPronunciation() {
		return pronunciation;
	}
	/** {@link Word#pronunciation} */
	public void setPronunciation(String pronunciation) {
		this.pronunciation = pronunciation;
	}
	/** {@link Word#example} */
	public String getExample() {
		return example;
	}
	/** {@link Word#example} */
	public void setExample(String example) {
		this.example = example;
	}
	/** {@link Word#image} */
	public Image getImage() {
		return image;
	}
	/** {@link Word#image} */
	public void setImage(Image image) {
		this.image = image;
	}
	/** {@link Word#audio} */
	public Byte[] getAudio() {
		return audio;
	}
	/** {@link Word#audio} */
	public void setAudio(Byte[] audio) {
		this.audio = audio;
	}
	
	
	
	
}
