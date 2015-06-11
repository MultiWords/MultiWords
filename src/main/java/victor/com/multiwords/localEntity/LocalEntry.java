package victor.com.multiwords.localEntity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import victor.com.multiwords.entity.Entry;

/**
 * @author WRosinski<br/>
 *<br/>
 */
@Entity
@Table(name="Entry")
public class LocalEntry extends LocalBaseEntity{
	@Id
	@GeneratedValue
	private Long id;
	
	/** data i godzina wejscia - zalogowania */
	private Date entryDate;
	/** data i godzina wyjscia - wylogowania */
	private Date exitDate;
	/** liczba wyrazow na dzien, aktualna na dzien zalogowania */
	private Integer wordsPerDay;
	/** liczba wyrazow poznanych w ciagu wejscia */
	private Integer knownWordsNumber;
	/** liczba wyrazow poznanych w ciagu wejscia */
	private Integer lernedWordsNumber;
	/** liczba wyrazow w tescie zadanych na dzien wejscia */
	private Integer testedWordsNumber;
	/** liczba prawidlowych odpowiedzi z testu */
	private Integer correctedTestedWordsNumber;
	
	/** liczba wszystkich poznanych wyrazow, wlacznie z tymi z obecnego zalogowania */
	private Integer wholeKnownWordsNumber;
	/** liczba wszystkich nauczonych wyrazow, wlacznie z tymi z obecnego zalogowania */
	private Integer wholeLernedWordsNumber;
	
	//************  RELATIONS  *******************
	/** jezyk na ktorego dotyczy wejscie */
	@ManyToOne
	private LocalUserLanguage userLanguage;
	
	//********************************************
	//*************  CONTRUCTORS  ****************
	//********************************************
	
	public LocalEntry(){
		wordsPerDay=0;
		knownWordsNumber=0;
		lernedWordsNumber=0;
		testedWordsNumber=0;
		correctedTestedWordsNumber=0;
		wholeKnownWordsNumber=0;
		wholeLernedWordsNumber=0;
	}
	
	public LocalEntry(Entry entry){
		super(entry);
		this.entryDate=entry.getEntryDate();
		this.exitDate=entry.getExitDate();
		this.wordsPerDay=entry.getWordsPerDay();
		this.knownWordsNumber=entry.getKnownWordsNumber();
		this.lernedWordsNumber=entry.getLernedWordsNumber();
		this.testedWordsNumber=entry.getTestedWordsNumber();
		this.correctedTestedWordsNumber=entry.getCorrectedTestedWordsNumber();
		this.wholeKnownWordsNumber=entry.getWholeKnownWordsNumber();
		this.wholeLernedWordsNumber=entry.getWholeLernedWordsNumber();
	}
	
	public LocalEntry(LocalEntry entry){
		super(entry);
		this.entryDate=entry.getEntryDate();
		this.exitDate=entry.getExitDate();
		this.wordsPerDay=entry.getWordsPerDay();
		this.knownWordsNumber=entry.getKnownWordsNumber();
		this.lernedWordsNumber=entry.getLernedWordsNumber();
		this.testedWordsNumber=entry.getTestedWordsNumber();
		this.correctedTestedWordsNumber=entry.getCorrectedTestedWordsNumber();
		this.wholeKnownWordsNumber=entry.getWholeKnownWordsNumber();
		this.wholeLernedWordsNumber=entry.getWholeLernedWordsNumber();
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
	

	/** {@link LocalEntry#entryDate} */
	public Date getEntryDate() {
		return entryDate;
	}

	/** {@link LocalEntry#entryDate} */
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	/** {@link LocalEntry#exitDate} */
	public Date getExitDate() {
		return exitDate;
	}

	/** {@link LocalEntry#exitDate} */
	public void setExitDate(Date exitDate) {
		this.exitDate = exitDate;
	}

	/** {@link LocalEntry#wordsPerDay} */
	public Integer getWordsPerDay() {
		return wordsPerDay;
	}

	/** {@link LocalEntry#wordsPerDay} */
	public void setWordsPerDay(Integer wordsPerDay) {
		this.wordsPerDay = wordsPerDay;
	}

	/** {@link LocalEntry#knownWordsNumber} */
	public Integer getKnownWordsNumber() {
		return knownWordsNumber;
	}

	/** {@link LocalEntry#knownWordsNumber} */
	public void setKnownWordsNumber(Integer knownWordsNumber) {
		this.knownWordsNumber = knownWordsNumber;
	}

	/** {@link LocalEntry#lernedWordsNumber} */
	public Integer getLernedWordsNumber() {
		return lernedWordsNumber;
	}

	/** {@link LocalEntry#lernedWordsNumber} */
	public void setLernedWordsNumber(Integer lernedWordsNumber) {
		this.lernedWordsNumber = lernedWordsNumber;
	}

	/** {@link LocalEntry#testedWordsNumber} */
	public Integer getTestedWordsNumber() {
		return testedWordsNumber;
	}

	/** {@link LocalEntry#testedWordsNumber} */
	public void setTestedWordsNumber(Integer testedWordsNumber) {
		this.testedWordsNumber = testedWordsNumber;
	}

	/** {@link LocalEntry#correctedTestedWordsNumber} */
	public Integer getCorrectedTestedWordsNumber() {
		return correctedTestedWordsNumber;
	}

	/** {@link LocalEntry#correctedTestedWordsNumber} */
	public void setCorrectedTestedWordsNumber(Integer correctedTestedWordsNumber) {
		this.correctedTestedWordsNumber = correctedTestedWordsNumber;
	}

	/** {@link LocalEntry#wholeKnownWordsNumber} */
	public Integer getWholeKnownWordsNumber() {
		return wholeKnownWordsNumber;
	}

	/** {@link LocalEntry#wholeKnownWordsNumber} */
	public void setWholeKnownWordsNumber(Integer wholeKnownWordsNumber) {
		this.wholeKnownWordsNumber = wholeKnownWordsNumber;
	}

	/** {@link LocalEntry#wholeLernedWordsNumber} */
	public Integer getWholeLernedWordsNumber() {
		return wholeLernedWordsNumber;
	}

	/** {@link LocalEntry#wholeLernedWordsNumber} */
	public void setWholeLernedWordsNumber(Integer wholeLernedWordsNumber) {
		this.wholeLernedWordsNumber = wholeLernedWordsNumber;
	}

	/** {@link LocalEntry#userLanguage} */
	@ManyToOne
	public LocalUserLanguage getUserLanguage() {
		return userLanguage;
	}

	/** {@link LocalEntry#userLanguage} */
	public void setUserLanguage(LocalUserLanguage userLanguage) {
		this.userLanguage = userLanguage;
	}
	
}
