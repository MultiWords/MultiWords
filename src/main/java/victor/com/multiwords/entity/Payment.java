package victor.com.multiwords.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author WRosinski<br/>
 *<br/>
 */
@Entity
public class Payment extends UserEntity{

	/** data platnosci */
	private Date paymentDate;
	/** kwota platnosci */
	private BigDecimal amount;
	/** tytul platnosci */
	private String title;
	/** nr konta bankowego */
	private String bankAccountNumber;
	
	//************  RELATIONS  *******************
	/** wlasciciel platnosci */
	private User user;
	/** typ platnosci - czego dotyczy */
	private PaymentType paymentType;
	/** informacja, ktorej aplikacji dotyczy platnosc */
	private ApplicationSource appSource;
	
	
	
	
	//********************************************
	//**********  GETTERS & SETTERS  *************
	//********************************************
	/** {@link BaseEntity#id} */
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	/** {@link Payment#paymentDate} */
	public Date getPaymentDate() {
		return paymentDate;
	}
	/** {@link Payment#paymentDate} */
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	/** {@link Payment#amount} */
	public BigDecimal getAmount() {
		return amount;
	}
	/** {@link Payment#amount} */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	/** {@link Payment#title} */
	public String getTitle() {
		return title;
	}
	/** {@link Payment#title} */
	public void setTitle(String title) {
		this.title = title;
	}
	/** {@link Payment#bankAccountNumber} */
	public String getBankAccountNumber() {
		return bankAccountNumber;
	}
	/** {@link Payment#bankAccountNumber} */
	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
	/** {@link Payment#user} */
	@ManyToOne
	public User getUser() {
		return user;
	}
	/** {@link Payment#user} */
	public void setUser(User user) {
		this.user = user;
	}
	/** {@link Payment#paymentType} */
	@ManyToOne
	public PaymentType getPaymentType() {
		return paymentType;
	}
	/** {@link Payment#paymentType} */
	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}
	/** {@link Payment#appSource} */
	@ManyToOne
	public ApplicationSource getAppSource() {
		return appSource;
	}
	/** {@link Payment#appSource} */
	public void setAppSource(ApplicationSource appSource) {
		this.appSource = appSource;
	}
	
	
}
