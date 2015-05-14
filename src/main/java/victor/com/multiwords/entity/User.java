package victor.com.multiwords.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@NamedQuery(name="user_maxId", query="SELECT MAX(id) FROM User")
@Entity
@Table(name="MultiWordsUser")
public class User extends UserEntity{

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
	private List<UserAccount> accountList;
	/** jezyk ojczysty */
	private Language ownLanguage;
	/** lista uczonych jezykow */
	private List<UserLanguage> languageList;
	/** lista platnosci */
	private List<Payment> paymentList;
	
	
	public User(){}
	
	
	public User clone() {
		try {
			return (User) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
//		User cloned=new User();
//		cloned.id=this.id;
//		cloned.name=this.name;
//		cloned.surname=this.surname;
//		cloned.login=this.login;
//		cloned.password=this.password;
//		cloned.email=this.email;
//		cloned.tel=this.tel;
//		cloned.helpQuestion=this.helpQuestion;
//		cloned.helpAnswer=this.helpAnswer;
//		return  cloned;
	}
	
	//********************************************
	//**********  GETTERS & SETTERS  *************
	//********************************************
	/** {@link BaseEntity#id} */
	@Id
//	@GeneratedValue
	public Long getId() {
		return id;
	}
	/** {@link User#name} */
	public String getName() {
		return name;
	}
	/** {@link User#name} */
	public void setName(String name) {
		this.name = name;
	}
	/** {@link User#surname} */
	public String getSurname() {
		return surname;
	}
	/** {@link User#surname} */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	/** {@link User#login} */
	public String getLogin() {
		return login;
	}
	/** {@link User#login} */
	public void setLogin(String login) {
		this.login = login;
	}
	/** {@link User#password} */
	public String getPassword() {
		return password;
	}
	/** {@link User#password} */
	public void setPassword(String password) {
		this.password = password;
	}
	/** {@link User#email} */
	public String getEmail() {
		return email;
	}
	/** {@link User#email} */
	public void setEmail(String email) {
		this.email = email;
	}
	/** {@link User#tel} */
	public String getTel() {
		return tel;
	}
	/** {@link User#tel} */
	public void setTel(String tel) {
		this.tel = tel;
	}
	/** {@link User#helpQuestion} */
	public String getHelpQuestion() {
		return helpQuestion;
	}
	/** {@link User#helpQuestion} */
	public void setHelpQuestion(String helpQuestion) {
		this.helpQuestion = helpQuestion;
	}
	/** {@link User#helpAnswer} */
	public String getHelpAnswer() {
		return helpAnswer;
	}
	/** {@link User#helpAnswer} */
	public void setHelpAnswer(String helpAnswer) {
		this.helpAnswer = helpAnswer;
	}
	/** {@link User#accountList} */
	@OneToMany(mappedBy="user")
	public List<UserAccount> getAccountList() {
		return accountList;
	}
	/** {@link User#accountList} */
	public void setAccountList(List<UserAccount> accountList) {
		this.accountList = accountList;
	}
	/** {@link User#ownLanguage} */
	@ManyToOne
	public Language getOwnLanguage() {
		return ownLanguage;
	}
	/** {@link User#ownLanguage} */
	public void setOwnLanguage(Language ownLanguage) {
		this.ownLanguage = ownLanguage;
	}
	/** {@link User#languageList} */
	@OneToMany(mappedBy="user")
	public List<UserLanguage> getLanguageList() {
		return languageList;
	}
	/** {@link User#languageList} */
	public void setLanguageList(List<UserLanguage> languageList) {
		this.languageList = languageList;
	}
	/** {@link User#paymentList} */
	@OneToMany(mappedBy="user")
	public List<Payment> getPaymentList() {
		return paymentList;
	}
	/** {@link User#paymentList} */
	public void setPaymentList(List<Payment> paymentList) {
		this.paymentList = paymentList;
	}





	
}
