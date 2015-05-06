package victor.com.multiwords.entity;

import javax.persistence.Entity;

/**
 * @author WRosinski<br/>
 *Zestaw wyrazow<br/>
 */
@Entity
public class WordsPacket {

	/** nazwa pakietu */
	private String name;

	/** {@link WordsPacket#name} */
	public String getName() {
		return name;
	}

	/** {@link WordsPacket#name} */
	public void setName(String name) {
		this.name = name;
	}
	
	
}
