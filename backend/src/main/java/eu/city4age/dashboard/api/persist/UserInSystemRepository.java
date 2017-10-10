package eu.city4age.dashboard.api.persist;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import eu.city4age.dashboard.api.persist.generic.GenericRepository;
import eu.city4age.dashboard.api.pojo.domain.UserInSystem;

@Repository(value = "userInSystemRepository")
@Transactional(readOnly = true)
<<<<<<< HEAD
public interface UserInSystemRepository extends GenericRepository<UserInSystem, Long> {

	UserInSystem findOneByUsername(String name);}
=======
public interface UserInSystemRepository extends GenericRepository<UserInSystem, Long> {}
>>>>>>> c4a-atc/master
