package victor.com.multiwords.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;

import victor.com.multiwords.localEntity.LocalAccount;

/**
 * @author WRosinski<br/>
 *<br/>
 */
@Entity
@SequenceGenerator(name = "sequence_gen", initialValue=1, allocationSize=1, sequenceName="account_sequence")
public class Account extends BaseEntity{


	/** nazwa konta */
	private String name;
	/** cena konta */
	private BigDecimal price;
	/** liczba dni waznosci konta */
	private Integer dayLimit;
	/** liczba miesiecy waznosci konta */
	private Integer monthLimit;
	/** liczba lat waznosci konta */
	private Integer yearLimit;
	
	//************  RELATIONS  *******************

	
	
	public void clone(LocalAccount account){
		super.clone(account);
		this.name=account.getName();
		this.price=account.getPrice();
		this.dayLimit=account.getDayLimit();
		this.monthLimit=account.getMonthLimit();
		this.yearLimit=account.getYearLimit();
	}
	
	//********************************************
	//*************  CONTRUCTORS  ****************
	//********************************************
	
	public Account() {	}
	
	public Account(LocalAccount account){
		super(account);
		this.name=account.getName();
		this.price=account.getPrice();
		this.dayLimit=account.getDayLimit();
		this.monthLimit=account.getMonthLimit();
		this.yearLimit=account.getYearLimit();
	}
	
	public Account(Account account){
		super(account);
		this.name=account.getName();
		this.price=account.getPrice();
		this.dayLimit=account.getDayLimit();
		this.monthLimit=account.getMonthLimit();
		this.yearLimit=account.getYearLimit();
	}
	
	//********************************************
	//**********  GETTERS & SETTERS  *************
	//********************************************
	/* (non-Javadoc) @see victor.com.multiwords.entity.BaseEntity#setId(java.lang.Long) */
	@Override
	public void setId(Long id) {
		this.id=id;
	}

	/* (non-Javadoc) @see victor.com.multiwords.entity.BaseEntity#getId() */
	@Override
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
	
	/** {@link Account#price} */
	public BigDecimal getPrice() {
		return price;
	}

	/** {@link Account#price} */
	public void setPrice(BigDecimal price) {
		this.price = price;
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
