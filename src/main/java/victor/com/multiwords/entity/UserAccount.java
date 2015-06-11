package victor.com.multiwords.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import victor.com.multiwords.localEntity.LocalUserAccount;

/**
 * @author WRosinski<br/>
 *<br/>
 */
@Entity
@SequenceGenerator(name = "sequence_gen", initialValue=1, allocationSize=1, sequenceName="user_account_sequence")
public class UserAccount extends BaseEntity{
	
	/** data aktywowania konta */
	private Date openAccountDate;
	/** data waznosci konta */
	private Date closeAccountDate;
	/** czy konto jest potwierdzone */
	private boolean confirm;
	
	//************  RELATIONS  *******************
	/** wlasciciel konta */
	@ManyToOne
	private User user;
	/** konto - rodzaj konta przypisany do uzytkownika */
	@ManyToOne
	private Account account;
	/** platnosc, poprzez ktora konto zostalo zakupione */
	@ManyToOne
	private Payment payment;
	
	public void clone(LocalUserAccount userAccount){
		super.clone(userAccount);
		this.openAccountDate=userAccount.getOpenAccountDate();
		this.closeAccountDate=userAccount.getCloseAccountDate();
		this.confirm=userAccount.isConfirm();
	}
	
	//********************************************
	//*************  CONTRUCTORS  ****************
	//********************************************
	
	public UserAccount(){}
	
	public UserAccount(UserAccount userAccount){
		super(userAccount);
		this.openAccountDate=userAccount.getOpenAccountDate();
		this.closeAccountDate=userAccount.getCloseAccountDate();
		this.confirm=userAccount.isConfirm();
	}
	
	public UserAccount(LocalUserAccount userAccount){
		super(userAccount);
		this.openAccountDate=userAccount.getOpenAccountDate();
		this.closeAccountDate=userAccount.getCloseAccountDate();
		this.confirm=userAccount.isConfirm();
	}
	
	//********************************************
	//**********  GETTERS & SETTERS  *************
	//********************************************
	
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
