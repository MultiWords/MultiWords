package victor.com.multiwords.localEntity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import victor.com.multiwords.entity.User;

@Entity
@Table(name="MultiWordsUser")
public class LocalUser extends LocalBaseEntity{

	@Id
	@GeneratedValue
	private Long id;
	
	/** imie uzytkownika */
	private String name;
	/** nazwisko uzytkownika */
	private String surname;
	/** login */
	private String login;
	/** haslo */
	private String password;
	/** email */
	private String email;
	/** nr telefonu */
	private String tel;
	/** pytanie pomocnicze - przy logowania */
	private String helpQuestion;
	/** odpowiedz na pytanie pomocnicze */
	private String helpAnswer;
	
	//************  RELATIONS  *******************
	/** lista aktywnych  */
	@OneToMany(mappedBy="user")
	private List<LocalUserAccount> accountList;
	/** jezyk ojczysty */
	@ManyToOne
	private LocalLanguage ownLanguage;
	/** lista uczonych jezykow */
	@OneToMany(mappedBy="user")
	private List<LocalUserLanguage> languageList;
	/** lista platnosci */
	@OneToMany(mappedBy="user")
	private List<LocalPayment> paymentList;
	
	
	public void clone(User user){
		this.sourceId=user.getId();
		this.created=user.getCreated();
		this.updated=user.getUpdated();
		this.name=user.getName();
		this.surname=user.getSurname();
		this.login=user.getLogin();
		this.password=user.getPassword();
		this.email=user.getEmail();
		this.helpQuestion=user.getHelpQuestion();
		this.helpAnswer=user.getHelpAnswer();
	}
	
	//********************************************
	//*************  CONTRUCTORS  ****************
	//********************************************
	
	public LocalUser(){}
	
	public LocalUser(User user){
		super(user);
		this.name=user.getName();
		this.surname=user.getSurname();
		this.login=user.getLogin();
		this.password=user.getPassword();
		this.email=user.getEmail();
		this.tel=user.getTel();
		this.helpQuestion=user.getHelpQuestion();
		this.helpAnswer=user.getHelpAnswer();
	}

	public LocalUser(LocalUser user){
		super(user);
		this.name=user.getName();
		this.surname=user.getSurname();
		this.login=user.getLogin();
		this.password=user.getPassword();
		this.email=user.getEmail();
		this.tel=user.getTel();
		this.helpQuestion=user.getHelpQuestion();
		this.helpAnswer=user.getHelpAnswer();
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
	
	/** {@link LocalUser#name} */
	public String getName() {
		return name;
	}
	/** {@link LocalUser#name} */
	public void setName(String name) {
		this.name = name;
	}
	/** {@link LocalUser#surname} */
	public String getSurname() {
		return surname;
	}
	/** {@link LocalUser#surname} */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	/** {@link LocalUser#login} */
	public String getLogin() {
		return login;
	}
	/** {@link LocalUser#login} */
	public void setLogin(String login) {
		this.login = login;
	}
	/** {@link LocalUser#password} */
	public String getPassword() {
		return password;
	}
	/** {@link LocalUser#password} */
	public void setPassword(String password) {
		this.password = password;
	}
	/** {@link LocalUser#email} */
	public String getEmail() {
		return email;
	}
	/** {@link LocalUser#email} */
	public void setEmail(String email) {
		this.email = email;
	}
	/** {@link LocalUser#tel} */
	public String getTel() {
		return tel;
	}
	/** {@link LocalUser#tel} */
	public void setTel(String tel) {
		this.tel = tel;
	}
	/** {@link LocalUser#helpQuestion} */
	public String getHelpQuestion() {
		return helpQuestion;
	}
	/** {@link LocalUser#helpQuestion} */
	public void setHelpQuestion(String helpQuestion) {
		this.helpQuestion = helpQuestion;
	}
	/** {@link LocalUser#helpAnswer} */
	public String getHelpAnswer() {
		return helpAnswer;
	}
	/** {@link LocalUser#helpAnswer} */
	public void setHelpAnswer(String helpAnswer) {
		this.helpAnswer = helpAnswer;
	}
	/** {@link LocalUser#accountList} */
	@OneToMany(mappedBy="user")
	public List<LocalUserAccount> getAccountList() {
		return accountList;
	}
	/** {@link LocalUser#accountList} */
	public void setAccountList(List<LocalUserAccount> accountList) {
		this.accountList = accountList;
	}
	/** {@link LocalUser#ownLanguage} */
	@ManyToOne
	public LocalLanguage getOwnLanguage() {
		return ownLanguage;
	}
	/** {@link LocalUser#ownLanguage} */
	public void setOwnLanguage(LocalLanguage ownLanguage) {
		this.ownLanguage = ownLanguage;
	}
	/** {@link LocalUser#languageList} */
	@OneToMany(mappedBy="user")
	public List<LocalUserLanguage> getLanguageList() {
		return languageList;
	}
	/** {@link LocalUser#languageList} */
	public void setLanguageList(List<LocalUserLanguage> languageList) {
		this.languageList = languageList;
	}
	/** {@link LocalUser#paymentList} */
	@OneToMany(mappedBy="user")
	public List<LocalPayment> getPaymentList() {
		return paymentList;
	}
	/** {@link LocalUser#paymentList} */
	public void setPaymentList(List<LocalPayment> paymentList) {
		this.paymentList = paymentList;
	}





	
}
