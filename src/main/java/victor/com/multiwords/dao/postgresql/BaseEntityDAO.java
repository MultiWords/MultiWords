package victor.com.multiwords.dao.postgresql;

import java.util.List;

import victor.com.multiwords.entity.BaseEntity;

/**
 * @author <b>WRosinski</b><br/>
 *<br/>
 */
public interface BaseEntityDAO<T extends BaseEntity> {

	public boolean checkConnection();
	public void persist(T entity);
	public void delete(T entity);
	public T findById(Long id);
	public T findUniqueByProperty(String property, Object value);
	public List<T> findAllByProperty(String property, Object value);

	
}
