package victor.com.multiwords.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import victor.com.multiwords.localEntity.LocalUserLanguage;

/**
 * @author WRosinski<br/>
 *<br/>
 */
@Entity
public class UserLanguage extends BaseEntity{

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
	
	//************  RELATIONS  *******************
	/** wlasciciel jezyka - osoba uczaca sie tego jezyka */
	private User user;
	/** jezyk do ktorego nalezy jezyk uzytkownika */
	private Language language;
	/** lista logowan - wejsc */
	private List<Entry> entryList;
	/** lista zestawow wyrazow przypisana do jezyka */
	private List<UserWordsPacket> wordsPacketList;
	
	//********************************************
	//*************  CONTRUCTORS  ****************
	//********************************************
	
	public UserLanguage(){
		name="";
		wordsPerDay=10;
		repeatNumber=5;
		stepNumber=10;
		arrears=0;
		knownWordsNumber=0;
		lernedWordsNumber=0;
	}
	
	public UserLanguage(UserLanguage userLanguage){
		super(userLanguage);
		this.name=userLanguage.getName();
		this.wordsPerDay=userLanguage.getWordsPerDay();
		this.repeatNumber=userLanguage.getRepeatNumber();
		this.stepNumber=userLanguage.getStepNumber();
		this.arrears=userLanguage.getArrears();
		this.knownWordsNumber=userLanguage.getKnownWordsNumber();
		this.lernedWordsNumber=userLanguage.getLernedWordsNumber();
	}
	
	public UserLanguage(LocalUserLanguage userLanguage){
		super(userLanguage);
		this.name=userLanguage.getName();
		this.wordsPerDay=userLanguage.getWordsPerDay();
		this.repeatNumber=userLanguage.getRepeatNumber();
		this.stepNumber=userLanguage.getStepNumber();
		this.arrears=userLanguage.getArrears();
		this.knownWordsNumber=userLanguage.getKnownWordsNumber();
		this.lernedWordsNumber=userLanguage.getLernedWordsNumber();
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

	/** {@link UserLanguage#user} */
	@ManyToOne
	public User getUser() {
		return user;
	}

	/** {@link UserLanguage#user} */
	public void setUser(User user) {
		this.user = user;
	}

	/** {@link UserLanguage#language} */
	@ManyToOne
	public Language getLanguage() {
		return language;
	}

	/** {@link UserLanguage#language} */
	public void setLanguage(Language language) {
		this.language = language;
	}

	/** {@link UserLanguage#entryList} */
	@OneToMany(mappedBy="userLanguage")
	public List<Entry> getEntryList() {
		return entryList;
	}

	/** {@link UserLanguage#entryList} */
	public void setEntryList(List<Entry> entryList) {
		this.entryList = entryList;
	}

	/** {@link UserLanguage#wordsPacketList} */
	@OneToMany(mappedBy="userLanguage")
	public List<UserWordsPacket> getWordsPacketList() {
		return wordsPacketList;
	}

	/** {@link UserLanguage#wordsPacketList} */
	public void setWordsPacketList(List<UserWordsPacket> wordsPacketList) {
		this.wordsPacketList = wordsPacketList;
	}
	
	
	
	
	
	
}
