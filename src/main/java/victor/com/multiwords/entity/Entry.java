package victor.com.multiwords.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import victor.com.multiwords.localEntity.LocalEntry;

/**
 * @author WRosinski<br/>
 *<br/>
 */
@Entity
@SequenceGenerator(name = "sequence_gen", initialValue=1, allocationSize=1, sequenceName="entry_sequence")
public class Entry extends BaseEntity{

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
	private UserLanguage userLanguage;
	
	public void clone(LocalEntry entry){
		super.clone(entry);
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
	//*************  CONTRUCTORS  ****************
	//********************************************
	
	public Entry(){
		wordsPerDay=0;
		knownWordsNumber=0;
		lernedWordsNumber=0;
		testedWordsNumber=0;
		correctedTestedWordsNumber=0;
		wholeKnownWordsNumber=0;
		wholeLernedWordsNumber=0;
	}
	
	public Entry(Entry entry){
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
	
	public Entry(LocalEntry entry){
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

	/** {@link Entry#entryDate} */
	public Date getEntryDate() {
		return entryDate;
	}

	/** {@link Entry#entryDate} */
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	/** {@link Entry#exitDate} */
	public Date getExitDate() {
		return exitDate;
	}

	/** {@link Entry#exitDate} */
	public void setExitDate(Date exitDate) {
		this.exitDate = exitDate;
	}

	/** {@link Entry#wordsPerDay} */
	public Integer getWordsPerDay() {
		return wordsPerDay;
	}

	/** {@link Entry#wordsPerDay} */
	public void setWordsPerDay(Integer wordsPerDay) {
		this.wordsPerDay = wordsPerDay;
	}

	/** {@link Entry#knownWordsNumber} */
	public Integer getKnownWordsNumber() {
		return knownWordsNumber;
	}

	/** {@link Entry#knownWordsNumber} */
	public void setKnownWordsNumber(Integer knownWordsNumber) {
		this.knownWordsNumber = knownWordsNumber;
	}

	/** {@link Entry#lernedWordsNumber} */
	public Integer getLernedWordsNumber() {
		return lernedWordsNumber;
	}

	/** {@link Entry#lernedWordsNumber} */
	public void setLernedWordsNumber(Integer lernedWordsNumber) {
		this.lernedWordsNumber = lernedWordsNumber;
	}

	/** {@link Entry#testedWordsNumber} */
	public Integer getTestedWordsNumber() {
		return testedWordsNumber;
	}

	/** {@link Entry#testedWordsNumber} */
	public void setTestedWordsNumber(Integer testedWordsNumber) {
		this.testedWordsNumber = testedWordsNumber;
	}

	/** {@link Entry#correctedTestedWordsNumber} */
	public Integer getCorrectedTestedWordsNumber() {
		return correctedTestedWordsNumber;
	}

	/** {@link Entry#correctedTestedWordsNumber} */
	public void setCorrectedTestedWordsNumber(Integer correctedTestedWordsNumber) {
		this.correctedTestedWordsNumber = correctedTestedWordsNumber;
	}

	/** {@link Entry#wholeKnownWordsNumber} */
	public Integer getWholeKnownWordsNumber() {
		return wholeKnownWordsNumber;
	}

	/** {@link Entry#wholeKnownWordsNumber} */
	public void setWholeKnownWordsNumber(Integer wholeKnownWordsNumber) {
		this.wholeKnownWordsNumber = wholeKnownWordsNumber;
	}

	/** {@link Entry#wholeLernedWordsNumber} */
	public Integer getWholeLernedWordsNumber() {
		return wholeLernedWordsNumber;
	}

	/** {@link Entry#wholeLernedWordsNumber} */
	public void setWholeLernedWordsNumber(Integer wholeLernedWordsNumber) {
		this.wholeLernedWordsNumber = wholeLernedWordsNumber;
	}

	/** {@link Entry#userLanguage} */
	@ManyToOne
	public UserLanguage getUserLanguage() {
		return userLanguage;
	}

	/** {@link Entry#userLanguage} */
	public void setUserLanguage(UserLanguage userLanguage) {
		this.userLanguage = userLanguage;
	}
	
}
