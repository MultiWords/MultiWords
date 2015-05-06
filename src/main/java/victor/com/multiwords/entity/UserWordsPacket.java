package victor.com.multiwords.entity;

import javax.persistence.Entity;

/**
 * @author WRosinski<br/>
 *Zestaw wyrazow uzytkownika<br/>
 */
@Entity
public class UserWordsPacket {
	
	/** nazwa zestawu uzytkownika */
	private String name;
	/** czy wszystkie wyrazy w zestawie zostaly poznane */
	private Boolean allKnowns;
	/** czy ktorykolwiek wyraz w zestawie zostal poznany */
	private Boolean anyKnown;
	
	public UserWordsPacket(){
		name="";
		allKnowns=false;
		anyKnown=false;
	}

	/** {@link UserWordsPacket#name} */
	public String getName() {
		return name;
	}

	/** {@link UserWordsPacket#name} */
	public void setName(String name) {
		this.name = name;
	}

	/** {@link UserWordsPacket#allKnowns} */
	public Boolean getAllKnowns() {
		return allKnowns;
	}

	/** {@link UserWordsPacket#allKnowns} */
	public void setAllKnowns(Boolean allKnowns) {
		this.allKnowns = allKnowns;
	}

	/** {@link UserWordsPacket#anyKnown} */
	public Boolean getAnyKnown() {
		return anyKnown;
	}

	/** {@link UserWordsPacket#anyKnown} */
	public void setAnyKnown(Boolean anyKnown) {
		this.anyKnown = anyKnown;
	}
	
	
}
