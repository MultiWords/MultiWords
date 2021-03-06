package victor.com.multiwords.dao.postgresql;

import java.lang.reflect.ParameterizedType;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import victor.com.multiwords.entity.BaseEntity;
import victor.com.multiwords.utils.ConnectionUtils;

/**
 * @author <b>WRosinski</b><br/>
 *<br/>
 */
public class BaseEntityDAOImpl<T extends BaseEntity> implements BaseEntityDAO<T>{

	@Autowired
	@Qualifier("sessionFactoryPostgreSQL")
	protected SessionFactory sessionFactory;
	
	protected Session session;
	
	protected Class<T> persistentClass;
	
	@SuppressWarnings("unchecked")
	public BaseEntityDAOImpl(){
		ParameterizedType paramType=(ParameterizedType) this.getClass().getGenericSuperclass();
		persistentClass= (Class<T>) paramType.getActualTypeArguments()[0];		
	}
	
	@PostConstruct
	private void init(){
		session=sessionFactory.openSession();
		if(! ConnectionUtils.isOpenConnection())
			checkConnection();
	}
	
	public boolean checkConnection(){
		try{
		Query query=session.createSQLQuery("SELECT usesysid, usename FROM pg_stat_activity;");
		@SuppressWarnings("unchecked")
		List<Object> results=query.list();
		if(results!=null)
			return true;
		else
			return false;
		}catch(Exception e){
			return false;
		}
		
	}
	
	/* (non-Javadoc) @see victor.com.multiwords.dao.postgresql.BaseEntityDAO#persist(victor.com.multiwords.entity.BaseEntity) */
	@Override
	public void persist(T entity) {

		session.beginTransaction();
		if(entity.getId()==null){
			entity.setCreated(new Date());
		}
		entity.setUpdated(new Date());
		session.persist(entity);
		session.getTransaction().commit();

	}

	/* (non-Javadoc) @see victor.com.multiwords.dao.postgresql.BaseEntityDAO#delete(victor.com.multiwords.entity.BaseEntity) */
	@Override
	public void delete(T entity) {
		session.beginTransaction();
		session.delete(entity);
		session.getTransaction().commit();
	}

	/* (non-Javadoc) @see victor.com.multiwords.dao.postgresql.BaseEntityDAO#findById(java.lang.Long) */
	@Override
	public T findById(Long id) {
		@SuppressWarnings("unchecked")
		T result= (T) session.get(persistentClass, id);
		return result;
	}

	/* (non-Javadoc) @see victor.com.multiwords.dao.postgresql.BaseEntityDAO#findUniqueByProperty(java.lang.String) */
	@Override
	public T findUniqueByProperty(String property, Object value) {
		Criteria criteria=session.createCriteria(persistentClass);
		criteria.add(Restrictions.eq(property, value));
		@SuppressWarnings("unchecked")
		T result=(T) criteria.uniqueResult();
		return result;
	}

	/* (non-Javadoc) @see victor.com.multiwords.dao.postgresql.BaseEntityDAO#findAllByProperty(java.lang.String) */
	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAllByProperty(String property, Object value) {
		Criteria criteria=session.createCriteria(persistentClass);
		criteria.add(Restrictions.eq(property, value));
		return criteria.list();
	}


}
