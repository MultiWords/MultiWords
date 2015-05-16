package victor.com.multiwords.dao.sqlite;

import java.util.List;

import victor.com.multiwords.localEntity.LocalBaseEntity;

/**
 * @author <b>WRosinski</b><br/>
 *<br/>
 */
public interface LocalBaseEntityDAO<T extends LocalBaseEntity> {

	public void persist(T entity);
	public void delete(T entity);
	public T findById(Long id);
	public T findUniqueByProperty(String property, Object value);
	public List<T> findAllByProperty(String property, Object value);
}
