package victor.com.multiwords.entity;

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
public class UserAccount extends UserEntity{
	/** data aktywowania konta */
	private Date openAccountDate;
	/** data waznosci konta */
	private Date closeAccountDate;
	/** czy konto jest potwierdzone */
	private boolean confirm;
	
	//************  RELATIONS  *******************
	/** wlasciciel konta */
	private User user;
	/** konto - rodzaj konta przypisany do uzytkownika */
	private Account account;
	/** platnosc, poprzez ktora konto zostalo zakupione */
	private Payment payment;
	
	
	
	
	//********************************************
	//**********  GETTERS & SETTERS  *************
	//********************************************
	/** {@link BaseEntity#id} */
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	/** {@link UserAccount#openAccountDate} */
	public Date getOpenAccountDate() {
		return openAccountDate;
	}
	/** {@link UserAccount#openAccountDate} */
	public void setOpenAccountDate(Date openAccountDate) {
		this.openAccountDate = openAccountDate;
	}
	/** {@link UserAccount#closeAccountDate} */
	public Date getCloseAccountDate() {
		return closeAccountDate;
	}
	/** {@link UserAccount#closeAccountDate} */
	public void setCloseAccountDate(Date closeAccountDate) {
		this.closeAccountDate = closeAccountDate;
	}
	/** {@link UserAccount#confirm} */
	public boolean isConfirm() {
		return confirm;
	}
	/** {@link UserAccount#confirm} */
	public void setConfirm(boolean confirm) {
		this.confirm = confirm;
	}
	/** {@link UserAccount#user} */
	@ManyToOne
	public User getUser() {
		return user;
	}
	/** {@link UserAccount#user} */
	public void setUser(User user) {
		this.user = user;
	}
	/** {@link UserAccount#account} */
	@ManyToOne
	public Account getAccount() {
		return account;
	}
	/** {@link UserAccount#account} */
	public void setAccount(Account account) {
		this.account = account;
	}
	/** {@link UserAccount#payment} */
	@ManyToOne
	public Payment getPayment() {
		return payment;
	}
	/** {@link UserAccount#payment} */
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	
}
