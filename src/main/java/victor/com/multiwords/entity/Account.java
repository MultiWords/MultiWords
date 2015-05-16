package victor.com.multiwords.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import victor.com.multiwords.localEntity.LocalAccount;

/**
 * @author WRosinski<br/>
 *<br/>
 */
@Entity
public class Account extends BaseEntity{

	/** nazwa konta */
	private String name;
	/** cena konta */
	private BigDecimal pirce;
	/** liczba dni waznosci konta */
	private Integer dayLimit;
	/** liczba miesiecy waznosci konta */
	private Integer monthLimit;
	/** liczba lat waznosci konta */
	private Integer yearLimit;
	
	//************  RELATIONS  *******************

	//********************************************
	//*************  CONTRUCTORS  ****************
	//********************************************
	
	public Account() {	}
	
	public Account(LocalAccount account){
		super(account);
		this.name=account.getName();
		this.pirce=account.getPirce();
		this.dayLimit=account.getDayLimit();
		this.monthLimit=account.getMonthLimit();
		this.yearLimit=account.getYearLimit();
	}
	
	public Account(Account account){
		super(account);
		this.name=account.getName();
		this.pirce=account.getPirce();
		this.dayLimit=account.getDayLimit();
		this.monthLimit=account.getMonthLimit();
		this.yearLimit=account.getYearLimit();
	}
	
	//********************************************
	//**********  GETTERS & SETTERS  *************
	//********************************************
	/** {@link BaseEntity#id} */
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	/** {@link Account#name} */
	public String getName() {
		return name;
	}
	/** {@link Account#name} */
	public void setName(String name) {
		this.name = name;
	}
	/** {@link Account#pirce} */
	public BigDecimal getPirce() {
		return pirce;
	}
	/** {@link Account#pirce} */
	public void setPirce(BigDecimal pirce) {
		this.pirce = pirce;
	}
	/** {@link Account#dayLimit} */
	public Integer getDayLimit() {
		return dayLimit;
	}
	/** {@link Account#dayLimit} */
	public void setDayLimit(Integer dayLimit) {
		this.dayLimit = dayLimit;
	}
	/** {@link Account#monthLimit} */
	public Integer getMonthLimit() {
		return monthLimit;
	}
	/** {@link Account#monthLimit} */
	public void setMonthLimit(Integer monthLimit) {
		this.monthLimit = monthLimit;
	}
	/** {@link Account#yearLimit} */
	public Integer getYearLimit() {
		return yearLimit;
	}
	/** {@link Account#yearLimit} */
	public void setYearLimit(Integer yearLimit) {
		this.yearLimit = yearLimit;
	}
	
}
