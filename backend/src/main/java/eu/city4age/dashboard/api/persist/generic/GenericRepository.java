package eu.city4age.dashboard.api.persist.generic;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

<<<<<<< HEAD
import javax.persistence.EntityManager;

=======
>>>>>>> c4a-atc/master
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

<<<<<<< HEAD
import eu.city4age.dashboard.api.pojo.persist.Filter;

=======
>>>>>>> c4a-atc/master
/**
 * Generic jpa repository.
 * 
 * @author milos.holclajtner
 */

@NoRepositoryBean
public interface GenericRepository<T, ID extends Serializable>
		extends JpaRepository<T, ID>, JpaSpecificationExecutor<T> {

	<S extends T> S save(S entity);

	T saveWithoutFlush(T entity);

	List<? extends T> saveWithoutFlush(Iterable<? extends T> entities);

<<<<<<< HEAD
	List<T> doQueryWithFilter(List<Filter> flts, String filterQueryName, Map<String, Object> inQueryParams);

	void disableFilter(String name);
	
	EntityManager getEntityManager();
	
	<S extends T> S merge(S entity);
=======
	List<T> doQueryWithFilter(List<eu.city4age.dashboard.api.pojo.persist.Filter> flts, String filterQueryName, Map<String, Object> inQueryParams);

	void disableFilter(String name);
>>>>>>> c4a-atc/master

}