package victor.com.multiwords.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import victor.com.multiwords.localEntity.LocalWord;

/**
 * @author <b>WRosinski</b><br/>
 *<br/>
 */
@Entity
public class Word extends BaseEntity{
	
	/** wyraz */
	private String word;
	/** id znaczenia */
	private Long meaning;
	/** wymowa - literalny zapis sposobu wymowy wyrazu */
	private String pronunciation;
	/** przyklad uzycia wyrazu */
	private String example;
	/** obrazek dolaczony do wyrazu */
	private Byte[] image;
	/** zapis audio (mp3) dolaczony do wyrazu */
	private Byte[] audio;
	
	//************  RELATIONS  *******************
	/** jezyk, do ktorego nalezy wyraz */
	private Language language;
	
	
	//********************************************
	//*************  CONTRUCTORS  ****************
	//********************************************
	
	public Word(){}
	
	public Word(Word word){
		super(word);
		this.word=word.getWord();
		this.meaning=word.getMeaning();
		this.pronunciation=word.getPronunciation();
		this.example=word.getExample();
		this.image=word.getImage();
		this.audio=word.getAudio();
	}
	
	public Word(LocalWord word){
		super(word);
		this.word=word.getWord();
		this.meaning=word.getMeaning();
		this.pronunciation=word.getPronunciation();
		this.example=word.getExample();
		this.image=word.getImage();
		this.audio=word.getAudio();
	}
	
	//********************************************
	//**********  GETTERS & SETTERS  *************
	//********************************************
	/** {@link BaseEntity#id} */
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
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
	public Byte[] getImage() {
		return image;
	}
	/** {@link Word#image} */
	public void setImage(Byte[] image) {
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
	/** {@link Word#language} */
	@ManyToOne
	public Language getLanguage() {
		return language;
	}
	/** {@link Word#language} */
	public void setLanguage(Language language) {
		this.language = language;
	}
	
	
		
}
