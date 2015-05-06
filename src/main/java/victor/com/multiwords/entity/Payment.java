package victor.com.multiwords.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;

/**
 * @author WRosinski<br/>
 *<br/>
 */
@Entity
public class Payment {

	/** data platnosci */
	private Date paymentDate;
	/** kwota platnosci */
	private BigDecimal amount;
	/** tytul platnosci */
	private String title;
	/** nr konta bankowego */
	private String bankAccountNumber;
	
	
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
	
	
}
