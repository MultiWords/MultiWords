package victor.com.multiwords.entity;

import java.util.Date;

import javax.persistence.Entity;

/**
 * @author WRosinski<br/>
 *<br/>
 */
@Entity
public class Entry {

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
	
	public Entry(){
		entryDate=new Date();
		exitDate=new Date();
		wordsPerDay=0;
		knownWordsNumber=0;
		lernedWordsNumber=0;
		testedWordsNumber=0;
		correctedTestedWordsNumber=0;
		wholeKnownWordsNumber=0;
		wholeLernedWordsNumber=0;
	}

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
	
}
