package eu.city4age.dashboard.api.persist.generic;

import java.io.Serializable;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.core.RepositoryInformation;
import org.springframework.data.repository.core.RepositoryMetadata;

import eu.city4age.dashboard.api.persist.generic.impl.GenericRepositoryImpl;

public class GenericRepositoryFactory extends JpaRepositoryFactory {

	public GenericRepositoryFactory(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
<<<<<<< HEAD
	@SuppressWarnings("unchecked")
=======
>>>>>>> c4a-atc/master
	protected <T, ID extends Serializable> SimpleJpaRepository<T, ID> getTargetRepository(
			RepositoryInformation metadata, EntityManager entityManager) {
		Class<?> repositoryInterface = metadata.getRepositoryInterface();
		return new GenericRepositoryImpl<T, ID>(getEntityInformation((Class<T>) metadata.getDomainType()),
				entityManager, repositoryInterface);
	}

	@Override
	protected Class<?> getRepositoryBaseClass(RepositoryMetadata metadata) {
		return GenericRepositoryImpl.class;
	}
}