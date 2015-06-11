package victor.com.multiwords.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import victor.com.multiwords.localEntity.LocalPayment;

/**
 * @author WRosinski<br/>
 *<br/>
 */
@Entity
@SequenceGenerator(name = "sequence_gen", initialValue=1, allocationSize=1, sequenceName="payment_sequence")
public class Payment extends BaseEntity{

	
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
	@ManyToOne
	private User user;
	/** typ platnosci - czego dotyczy */
	@ManyToOne
	private PaymentType paymentType;
	/** informacja, ktorej aplikacji dotyczy platnosc */
	@ManyToOne
	private ApplicationSource appSource;
	
	
	public void clone(LocalPayment payment){
		super.clone(payment);
		this.paymentDate=payment.getPaymentDate();
		this.amount=payment.getAmount();
		this.title=payment.getTitle();
		this.bankAccountNumber=payment.getBankAccountNumber();
	}
	
	//********************************************
	//*************  CONTRUCTORS  ****************
	//********************************************
	
	public Payment(){}
	
	public Payment(Payment payment){
		super(payment);
		this.paymentDate=payment.getPaymentDate();
		this.amount=payment.getAmount();
		this.title=payment.getTitle();
		this.bankAccountNumber=this.getBankAccountNumber();
	}
	
	public Payment(LocalPayment payment){
		super(payment);
		this.paymentDate=payment.getPaymentDate();
		this.amount=payment.getAmount();
		this.title=payment.getTitle();
		this.bankAccountNumber=this.getBankAccountNumber();
	}
	
	//********************************************
	//**********  GETTERS & SETTERS  *************
	//********************************************
	
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
