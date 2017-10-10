package eu.city4age.dashboard.api.persist;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import eu.city4age.dashboard.api.persist.generic.GenericRepository;
import eu.city4age.dashboard.api.pojo.domain.Pilot;

@Repository(value = "pilotRepository")
@Transactional(readOnly = true)
<<<<<<< HEAD
public interface PilotRepository extends GenericRepository<Pilot, String> {


	Pilot findByPilotCode(String pilotCode);

}
=======
public interface PilotRepository extends GenericRepository<Pilot, String> {}
>>>>>>> c4a-atc/master
