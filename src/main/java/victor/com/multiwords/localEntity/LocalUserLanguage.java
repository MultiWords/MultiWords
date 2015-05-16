package victor.com.multiwords.localEntity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import victor.com.multiwords.entity.UserLanguage;

/**
 * @author WRosinski<br/>
 *<br/>
 */
@Entity
@Table(name="UserLanguage")
public class LocalUserLanguage extends LocalBaseEntity{

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
	private LocalUser user;
	/** jezyk do ktorego nalezy jezyk uzytkownika */
	private LocalLanguage language;
	/** lista logowan - wejsc */
	private List<LocalEntry> entryList;
	/** lista zestawow wyrazow przypisana do jezyka */
	private List<LocalUserWordsPacket> wordsPacketList;
	
	
	//********************************************
	//*************  CONTRUCTORS  ****************
	//********************************************
	
	public LocalUserLanguage(){
		name="";
		wordsPerDay=10;
		repeatNumber=5;
		stepNumber=10;
		arrears=0;
		knownWordsNumber=0;
		lernedWordsNumber=0;
	}
	
	public LocalUserLanguage(UserLanguage userLanguage){
		super(userLanguage);
		this.name=userLanguage.getName();
		this.wordsPerDay=userLanguage.getWordsPerDay();
		this.repeatNumber=userLanguage.getRepeatNumber();
		this.stepNumber=userLanguage.getStepNumber();
		this.arrears=userLanguage.getArrears();
		this.knownWordsNumber=userLanguage.getKnownWordsNumber();
		this.lernedWordsNumber=userLanguage.getLernedWordsNumber();
	}
	
	public LocalUserLanguage(LocalUserLanguage userLanguage){
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
	/** {@link LocalBaseEntity#id} */
	@Id
	public Long getId() {
		return id;
	}


	/** {@link LocalUserLanguage#name} */
	public String getName() {
		return name;
	}

	/** {@link LocalUserLanguage#name} */
	public void setName(String name) {
		this.name = name;
	}

	/** {@link LocalUserLanguage#wordsPerDay} */
	public Integer getWordsPerDay() {
		return wordsPerDay;
	}

	/** {@link LocalUserLanguage#wordsPerDay} */
	public void setWordsPerDay(Integer wordsPerDay) {
		this.wordsPerDay = wordsPerDay;
	}

	/** {@link LocalUserLanguage#repeatNumber} */
	public Integer getRepeatNumber() {
		return repeatNumber;
	}

	/** {@link LocalUserLanguage#repeatNumber} */
	public void setRepeatNumber(Integer repeatNumber) {
		this.repeatNumber = repeatNumber;
	}

	/** {@link LocalUserLanguage#stepNumber} */
	public Integer getStepNumber() {
		return stepNumber;
	}

	/** {@link LocalUserLanguage#stepNumber} */
	public void setStepNumber(Integer stepNumber) {
		this.stepNumber = stepNumber;
	}

	/** {@link LocalUserLanguage#arrears} */
	public Integer getArrears() {
		return arrears;
	}

	/** {@link LocalUserLanguage#arrears} */
	public void setArrears(Integer arrears) {
		this.arrears = arrears;
	}

	/** {@link LocalUserLanguage#knownWordsNumber} */
	public Integer getKnownWordsNumber() {
		return knownWordsNumber;
	}

	/** {@link LocalUserLanguage#knownWordsNumber} */
	public void setKnownWordsNumber(Integer knownWordsNumber) {
		this.knownWordsNumber = knownWordsNumber;
	}

	/** {@link LocalUserLanguage#lernedWordsNumber} */
	public Integer getLernedWordsNumber() {
		return lernedWordsNumber;
	}

	/** {@link LocalUserLanguage#lernedWordsNumber} */
	public void setLernedWordsNumber(Integer lernedWordsNumber) {
		this.lernedWordsNumber = lernedWordsNumber;
	}

	/** {@link LocalUserLanguage#user} */
	@ManyToOne
	public LocalUser getUser() {
		return user;
	}

	/** {@link LocalUserLanguage#user} */
	public void setUser(LocalUser user) {
		this.user = user;
	}

	/** {@link LocalUserLanguage#language} */
	@ManyToOne
	public LocalLanguage getLanguage() {
		return language;
	}

	/** {@link LocalUserLanguage#language} */
	public void setLanguage(LocalLanguage language) {
		this.language = language;
	}

	/** {@link LocalUserLanguage#entryList} */
	@OneToMany(mappedBy="userLanguage")
	public List<LocalEntry> getEntryList() {
		return entryList;
	}

	/** {@link LocalUserLanguage#entryList} */
	public void setEntryList(List<LocalEntry> entryList) {
		this.entryList = entryList;
	}

	/** {@link LocalUserLanguage#wordsPacketList} */
	@OneToMany(mappedBy="userLanguage")
	public List<LocalUserWordsPacket> getWordsPacketList() {
		return wordsPacketList;
	}

	/** {@link LocalUserLanguage#wordsPacketList} */
	public void setWordsPacketList(List<LocalUserWordsPacket> wordsPacketList) {
		this.wordsPacketList = wordsPacketList;
	}
	
	
	
	
	
	
}
