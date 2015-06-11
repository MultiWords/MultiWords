package victor.com.multiwords.localEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import victor.com.multiwords.entity.Word;

/**
 * @author <b>WRosinski</b><br/>
 *<br/>
 */
@Entity
@Table(name="Word")
public class LocalWord extends LocalBaseEntity{
	
	@Id
	@GeneratedValue
	private Long id;
	
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
	@ManyToOne
	private LocalLanguage language;
	
	//********************************************
	//*************  CONTRUCTORS  ****************
	//********************************************
	
	public LocalWord(){}
	
	public LocalWord(Word word){
		super(word);
		this.word=word.getWord();
		this.meaning=word.getMeaning();
		this.pronunciation=word.getPronunciation();
		this.example=word.getExample();
		this.image=word.getImage();
		this.audio=word.getAudio();
	}
	
	public LocalWord(LocalWord word){
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
	
	/** {@link LocalWord#word} */
	public String getWord() {
		return word;
	}
	/** {@link LocalWord#word} */
	public void setWord(String word) {
		this.word = word;
	}
	/** {@link LocalWord#meaning} */
	public Long getMeaning() {
		return meaning;
	}
	/** {@link LocalWord#meaning} */
	public void setMeaning(Long meaning) {
		this.meaning = meaning;
	}
	/** {@link LocalWord#pronunciation} */
	public String getPronunciation() {
		return pronunciation;
	}
	/** {@link LocalWord#pronunciation} */
	public void setPronunciation(String pronunciation) {
		this.pronunciation = pronunciation;
	}
	/** {@link LocalWord#example} */
	public String getExample() {
		return example;
	}
	/** {@link LocalWord#example} */
	public void setExample(String example) {
		this.example = example;
	}

	/** {@link LocalWord#image} */
	public Byte[] getImage() {
		return image;
	}
	/** {@link LocalWord#image} */
	public void setImage(Byte[] image) {
		this.image = image;
	}
	/** {@link LocalWord#audio} */
	public Byte[] getAudio() {
		return audio;
	}
	/** {@link LocalWord#audio} */
	public void setAudio(Byte[] audio) {
		this.audio = audio;
	}
	/** {@link LocalWord#language} */
	@ManyToOne
	public LocalLanguage getLanguage() {
		return language;
	}
	/** {@link LocalWord#language} */
	public void setLanguage(LocalLanguage language) {
		this.language = language;
	}
	
	
		
}
