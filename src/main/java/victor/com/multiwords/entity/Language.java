package victor.com.multiwords.entity;

import javax.persistence.Entity;

/**
 * @author WRosinski<br/>
 *<br/>
 */
@Entity
public class Language {

	/** nazwa jezyka */
	private String name;

	/** {@link Language#name} */
	public String getName() {
		return name;
	}

	/** {@link Language#name} */
	public void setName(String name) {
		this.name = name;
	}
	
	
}
