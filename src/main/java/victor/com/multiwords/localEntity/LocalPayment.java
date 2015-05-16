package victor.com.multiwords.localEntity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import victor.com.multiwords.entity.Payment;

/**
 * @author WRosinski<br/>
 *<br/>
 */
@Entity
@Table(name="Payment")
public class LocalPayment extends LocalBaseEntity{

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
	private LocalUser user;
	/** typ platnosci - czego dotyczy */
	private LocalPaymentType paymentType;
	/** informacja, ktorej aplikacji dotyczy platnosc */
	private LocalApplicationSource appSource;
	
	//********************************************
	//*************  CONTRUCTORS  ****************
	//********************************************
	
	public LocalPayment(){}
	
	public LocalPayment(Payment payment){
		super(payment);
		this.paymentDate=payment.getPaymentDate();
		this.amount=payment.getAmount();
		this.title=payment.getTitle();
		this.bankAccountNumber=this.getBankAccountNumber();
	}
	
	public LocalPayment(LocalPayment payment){
		super(payment);
		this.paymentDate=payment.getPaymentDate();
		this.amount=payment.getAmount();
		this.title=payment.getTitle();
		this.bankAccountNumber=this.getBankAccountNumber();
	}
	
	
	//********************************************
	//**********  GETTERS & SETTERS  *************
	//********************************************
	/** {@link LocalBaseEntity#id} */
	@Id
	public Long getId() {
		return id;
	}
	/** {@link LocalPayment#paymentDate} */
	public Date getPaymentDate() {
		return paymentDate;
	}
	/** {@link LocalPayment#paymentDate} */
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	/** {@link LocalPayment#amount} */
	public BigDecimal getAmount() {
		return amount;
	}
	/** {@link LocalPayment#amount} */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	/** {@link LocalPayment#title} */
	public String getTitle() {
		return title;
	}
	/** {@link LocalPayment#title} */
	public void setTitle(String title) {
		this.title = title;
	}
	/** {@link LocalPayment#bankAccountNumber} */
	public String getBankAccountNumber() {
		return bankAccountNumber;
	}
	/** {@link LocalPayment#bankAccountNumber} */
	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
	/** {@link LocalPayment#user} */
	@ManyToOne
	public LocalUser getUser() {
		return user;
	}
	/** {@link LocalPayment#user} */
	public void setUser(LocalUser user) {
		this.user = user;
	}
	/** {@link LocalPayment#paymentType} */
	@ManyToOne
	public LocalPaymentType getPaymentType() {
		return paymentType;
	}
	/** {@link LocalPayment#paymentType} */
	public void setPaymentType(LocalPaymentType paymentType) {
		this.paymentType = paymentType;
	}
	/** {@link LocalPayment#appSource} */
	@ManyToOne
	public LocalApplicationSource getAppSource() {
		return appSource;
	}
	/** {@link LocalPayment#appSource} */
	public void setAppSource(LocalApplicationSource appSource) {
		this.appSource = appSource;
	}
	
	
}
