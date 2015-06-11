package victor.com.multiwords.localEntity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import victor.com.multiwords.entity.Account;

/**
 * @author WRosinski<br/>
 *<br/>
 */
@Entity
@Table(name="Account")
public class LocalAccount extends LocalBaseEntity{

	@Id
	@GeneratedValue
	private Long id;
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

	//********************************************
	//*************  CONTRUCTORS  ****************
	//********************************************
	
	public LocalAccount() {	}
	
	public LocalAccount(LocalAccount account){
		super(account);
		this.name=account.getName();
		this.price=account.getPrice();
		this.dayLimit=account.getDayLimit();
		this.monthLimit=account.getMonthLimit();
		this.yearLimit=account.getYearLimit();
	}
	
	public LocalAccount(Account account){
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

	/** {@link LocalAccount#name} */
	public String getName() {
		return name;
	}
	/** {@link LocalAccount#name} */
	public void setName(String name) {
		this.name = name;
	}
	
	/** {@link LocalAccount#price} */
	public BigDecimal getPrice() {
		return price;
	}

	/** {@link LocalAccount#price} */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/** {@link LocalAccount#dayLimit} */
	public Integer getDayLimit() {
		return dayLimit;
	}
	/** {@link LocalAccount#dayLimit} */
	public void setDayLimit(Integer dayLimit) {
		this.dayLimit = dayLimit;
	}
	/** {@link LocalAccount#monthLimit} */
	public Integer getMonthLimit() {
		return monthLimit;
	}
	/** {@link LocalAccount#monthLimit} */
	public void setMonthLimit(Integer monthLimit) {
		this.monthLimit = monthLimit;
	}
	/** {@link LocalAccount#yearLimit} */
	public Integer getYearLimit() {
		return yearLimit;
	}
	/** {@link LocalAccount#yearLimit} */
	public void setYearLimit(Integer yearLimit) {
		this.yearLimit = yearLimit;
	}


	
}
