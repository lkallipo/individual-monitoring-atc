package eu.city4age.dashboard.api.persist;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import eu.city4age.dashboard.api.persist.generic.GenericRepository;
import eu.city4age.dashboard.api.pojo.domain.GeriatricFactorValue;

@Repository(value = "geriatricFactorRepository")
@Transactional(readOnly = true)
public interface GeriatricFactorRepository extends GenericRepository<GeriatricFactorValue, Long> {

<<<<<<< HEAD
	@Query("SELECT g FROM GeriatricFactorValue g INNER JOIN g.detectionVariable dv INNER JOIN dv.pilotDetectionVariable pdv INNER JOIN g.userInRole uir WHERE pdv.derivedDetectionVariable.id = :varId AND g.userInRole.id = :userId AND pdv.pilotCode = (SELECT uir.pilotCode FROM uir WHERE id = :userId) ORDER BY g.timeInterval.intervalStart ASC")
=======
	@Query("SELECT g FROM GeriatricFactorValue g INNER JOIN g.cdDetectionVariable dv WHERE dv.derivedDetectionVariable.id = :varId AND g.userInRole.id = :userId ORDER BY g.timeInterval.id ASC")
>>>>>>> c4a-atc/master
	List<GeriatricFactorValue> findByDetectionVariableId(@Param("varId") final Long dvId,
			@Param("userId") final Long uId);

}