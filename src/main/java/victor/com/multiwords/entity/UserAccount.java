package victor.com.multiwords.entity;

import java.util.Date;

import javax.persistence.Entity;

/**
 * @author WRosinski<br/>
 *<br/>
 */
@Entity
public class UserAccount {
	/** data aktywowania konta */
	private Date openAccountDate;
	/** data waznosci konta */
	private Date closeAccountDate;
	/** czy konto jest potwierdzone */
	private boolean confirm;
	
	
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
	
	
}
