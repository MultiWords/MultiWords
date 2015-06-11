package victor.com.multiwords.localEntity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import victor.com.multiwords.entity.UserAccount;

/**
 * @author WRosinski<br/>
 *<br/>
 */
@Entity
@Table(name="UserAccount")
public class LocalUserAccount extends LocalBaseEntity{
	
	@Id
	@GeneratedValue
	private Long id;
	
	/** data aktywowania konta */
	private Date openAccountDate;
	/** data waznosci konta */
	private Date closeAccountDate;
	/** czy konto jest potwierdzone */
	private boolean confirm;
	
	//************  RELATIONS  *******************
	/** wlasciciel konta */
	@ManyToOne
	private LocalUser user;
	/** konto - rodzaj konta przypisany do uzytkownika */
	@ManyToOne
	private LocalAccount account;
	/** platnosc, poprzez ktora konto zostalo zakupione */
	@ManyToOne
	private LocalPayment payment;
	
	
	//********************************************
	//*************  CONTRUCTORS  ****************
	//********************************************
	
	public LocalUserAccount(){}
	
	public LocalUserAccount(UserAccount userAccount){
		super(userAccount);
		this.openAccountDate=userAccount.getOpenAccountDate();
		this.closeAccountDate=userAccount.getCloseAccountDate();
		this.confirm=userAccount.isConfirm();
	}
	
	public LocalUserAccount(LocalUserAccount userAccount){
		super(userAccount);
		this.openAccountDate=userAccount.getOpenAccountDate();
		this.closeAccountDate=userAccount.getCloseAccountDate();
		this.confirm=userAccount.isConfirm();
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
	
	/** {@link LocalUserAccount#openAccountDate} */
	public Date getOpenAccountDate() {
		return openAccountDate;
	}
	/** {@link LocalUserAccount#openAccountDate} */
	public void setOpenAccountDate(Date openAccountDate) {
		this.openAccountDate = openAccountDate;
	}
	/** {@link LocalUserAccount#closeAccountDate} */
	public Date getCloseAccountDate() {
		return closeAccountDate;
	}
	/** {@link LocalUserAccount#closeAccountDate} */
	public void setCloseAccountDate(Date closeAccountDate) {
		this.closeAccountDate = closeAccountDate;
	}
	/** {@link LocalUserAccount#confirm} */
	public boolean isConfirm() {
		return confirm;
	}
	/** {@link LocalUserAccount#confirm} */
	public void setConfirm(boolean confirm) {
		this.confirm = confirm;
	}
	/** {@link LocalUserAccount#user} */
	@ManyToOne
	public LocalUser getUser() {
		return user;
	}
	/** {@link LocalUserAccount#user} */
	public void setUser(LocalUser user) {
		this.user = user;
	}
	/** {@link LocalUserAccount#account} */
	@ManyToOne
	public LocalAccount getAccount() {
		return account;
	}
	/** {@link LocalUserAccount#account} */
	public void setAccount(LocalAccount account) {
		this.account = account;
	}
	/** {@link LocalUserAccount#payment} */
	@ManyToOne
	public LocalPayment getPayment() {
		return payment;
	}
	/** {@link LocalUserAccount#payment} */
	public void setPayment(LocalPayment payment) {
		this.payment = payment;
	}
	
	
}
