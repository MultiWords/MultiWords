package victor.com.multiwords.entity;

import javax.persistence.Entity;

/**
 * @author WRosinski<br/>
 *<br/>
 */
@Entity
public class UserLanguage {

	/** nazwa jezyka uzytkownika - uzytkownik moze nazwac jezyk po swojemu */
	private String name;
	/** liczba wyrazow do nauki dziennie */
	private Integer wordsPerDay;
	/** liczba powtorek */
	private Integer repeatNumber;
	/** krork - ile wyrazow jest w pojedynczej paczce do nauki. Po zrealizowaniu paczki, program przejdzie plynnie do nastepnej */
	private Integer stepNumber;	
	/** zaleglosci - liczba wyrazow w zaleglosciach */
	private Integer arrears;
	/** liczba poznanych wyrazow */
	private Integer knownWordsNumber;
	/** liczba wyrazow nauczonych */
	private Integer lernedWordsNumber;
	
	public UserLanguage(){
		name="";
		wordsPerDay=10;
		repeatNumber=5;
		stepNumber=10;
		arrears=0;
		knownWordsNumber=0;
		lernedWordsNumber=0;
	}

	/** {@link UserLanguage#name} */
	public String getName() {
		return name;
	}

	/** {@link UserLanguage#name} */
	public void setName(String name) {
		this.name = name;
	}

	/** {@link UserLanguage#wordsPerDay} */
	public Integer getWordsPerDay() {
		return wordsPerDay;
	}

	/** {@link UserLanguage#wordsPerDay} */
	public void setWordsPerDay(Integer wordsPerDay) {
		this.wordsPerDay = wordsPerDay;
	}

	/** {@link UserLanguage#repeatNumber} */
	public Integer getRepeatNumber() {
		return repeatNumber;
	}

	/** {@link UserLanguage#repeatNumber} */
	public void setRepeatNumber(Integer repeatNumber) {
		this.repeatNumber = repeatNumber;
	}

	/** {@link UserLanguage#stepNumber} */
	public Integer getStepNumber() {
		return stepNumber;
	}

	/** {@link UserLanguage#stepNumber} */
	public void setStepNumber(Integer stepNumber) {
		this.stepNumber = stepNumber;
	}

	/** {@link UserLanguage#arrears} */
	public Integer getArrears() {
		return arrears;
	}

	/** {@link UserLanguage#arrears} */
	public void setArrears(Integer arrears) {
		this.arrears = arrears;
	}

	/** {@link UserLanguage#knownWordsNumber} */
	public Integer getKnownWordsNumber() {
		return knownWordsNumber;
	}

	/** {@link UserLanguage#knownWordsNumber} */
	public void setKnownWordsNumber(Integer knownWordsNumber) {
		this.knownWordsNumber = knownWordsNumber;
	}

	/** {@link UserLanguage#lernedWordsNumber} */
	public Integer getLernedWordsNumber() {
		return lernedWordsNumber;
	}

	/** {@link UserLanguage#lernedWordsNumber} */
	public void setLernedWordsNumber(Integer lernedWordsNumber) {
		this.lernedWordsNumber = lernedWordsNumber;
	}
	
	
	
	
	
	
}
