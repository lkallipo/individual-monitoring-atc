package eu.city4age.dashboard.api.persist;

<<<<<<< HEAD
=======
import java.util.List;

>>>>>>> c4a-atc/master
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import eu.city4age.dashboard.api.persist.generic.GenericRepository;
import eu.city4age.dashboard.api.pojo.domain.RiskStatus;

@Repository(value = "riskStatusRepository")
@Transactional(readOnly = true)
<<<<<<< HEAD
public interface RiskStatusRepository extends GenericRepository<RiskStatus, Long> {}
=======
public interface RiskStatusRepository extends GenericRepository<RiskStatus, Long> {

	List<RiskStatus> findAll();

}
>>>>>>> c4a-atc/master
