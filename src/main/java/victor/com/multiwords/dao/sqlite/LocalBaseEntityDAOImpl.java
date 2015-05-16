package victor.com.multiwords.dao.sqlite;

import java.lang.reflect.ParameterizedType;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import victor.com.multiwords.localEntity.LocalBaseEntity;

/**
 * @author <b>WRosinski</b><br/>
 *<br/>
 */
public class LocalBaseEntityDAOImpl<T extends LocalBaseEntity> implements LocalBaseEntityDAO<T> {


	@Autowired
	@Qualifier("sessionFactorySQLite")
	protected SessionFactory sessionFactory;
	
	protected Session session;
	
	protected Class<T> persistentClass;
	
	@SuppressWarnings("unchecked")
	public LocalBaseEntityDAOImpl(){
		ParameterizedType paramType= (ParameterizedType) this.getClass().getGenericSuperclass();
		persistentClass= (Class<T>) paramType.getActualTypeArguments()[0];
		session=sessionFactory.openSession();
		
	}

	/* (non-Javadoc) @see victor.com.multiwords.dao.sqlite.LocalBaseEntityDAO#persist(victor.com.multiwords.localEntity.LocalBaseEntity) */
	@Override
	public void persist(T entity) {
		session.beginTransaction();
		if(entity.getId()==null){
			entity.setCreated(new Date());
			entity.setUpdated(new Date());
		}else{
			entity.setUpdated(new Date());
		}
		session.persist(entity);
		session.getTransaction().commit();

	}

	/* (non-Javadoc) @see victor.com.multiwords.dao.sqlite.LocalBaseEntityDAO#delete(victor.com.multiwords.localEntity.LocalBaseEntity) */
	@Override
	public void delete(T entity) {
		session.beginTransaction();
		session.delete(entity);
		session.getTransaction().commit();
	}

	/* (non-Javadoc) @see victor.com.multiwords.dao.sqlite.LocalBaseEntityDAO#findById(java.lang.Long) */
	@Override
	public T findById(Long id) {
		@SuppressWarnings("unchecked")
		T result= (T) session.get(persistentClass, id);
		return result;	}

	/* (non-Javadoc) @see victor.com.multiwords.dao.sqlite.LocalBaseEntityDAO#findUniqueByProperty(java.lang.String, java.lang.Object) */
	@Override
	public T findUniqueByProperty(String property, Object value) {
		Criteria criteria=session.createCriteria(persistentClass);
		criteria.add(Restrictions.eq(property, value));
		@SuppressWarnings("unchecked")
		T result=(T) criteria.uniqueResult();
		return result;
		}

	/* (non-Javadoc) @see victor.com.multiwords.dao.sqlite.LocalBaseEntityDAO#findAllByProperty(java.lang.String, java.lang.Object) */
	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAllByProperty(String property, Object value) {
		Criteria criteria=session.createCriteria(persistentClass);
		criteria.add(Restrictions.eq(property, value));
		return criteria.list();
	}
	
	
}
