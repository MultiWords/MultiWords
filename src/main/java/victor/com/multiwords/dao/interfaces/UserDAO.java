package victor.com.multiwords.dao.interfaces;

import javax.persistence.NamedQuery;

import victor.com.multiwords.entity.User;


public interface UserDAO extends BaseEntityDAO{

	public void save(User user);
	public void update(User user);
}
