package victor.com.multiwords.dao.sqlite;

import victor.com.multiwords.entity.User;

public interface UserDAO {
	public void persist(User user);
}
