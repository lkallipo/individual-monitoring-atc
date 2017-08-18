package eu.city4age.dashboard.api.persist;

import java.sql.Timestamp;
import java.time.YearMonth;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import eu.city4age.dashboard.api.ApplicationTest;
import eu.city4age.dashboard.api.pojo.domain.DetectionVariable;
import eu.city4age.dashboard.api.pojo.domain.NumericIndicatorValue;
import eu.city4age.dashboard.api.pojo.domain.PilotDetectionVariable;
import eu.city4age.dashboard.api.pojo.domain.TimeInterval;
import eu.city4age.dashboard.api.pojo.domain.UserInRole;
import eu.city4age.dashboard.api.pojo.enu.TypicalPeriod;
import eu.city4age.dashboard.api.rest.MeasuresService;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ApplicationTest.class)
@WebAppConfiguration
@ActiveProfiles("test")
public class NUIRepositoryTest {

	@Autowired
	NUIRepository nuiRepository;

	@Autowired
	UserInRoleRepository userInRoleRepository;

	@Autowired
	DetectionVariableRepository detectionVariableRepository;
	
	@Autowired
	PilotDetectionVariableRepository pilotDetectionVariableRepository;

	@Autowired
	private MeasuresService measuresService;

	@Test
	@Transactional
	@Rollback(true)
	public void testGetNuisFor1Month() throws Exception {

		Timestamp intervalStart = Timestamp.valueOf(YearMonth.of(2017, 1).atDay(1).atStartOfDay());

		TimeInterval ti1 = measuresService.getOrCreateTimeInterval(intervalStart, TypicalPeriod.MONTH);

		UserInRole uir1 = new UserInRole();
		uir1.setId(1L);
		uir1.setPilotCode("LLC");
		userInRoleRepository.save(uir1);

		DetectionVariable dv1 = new DetectionVariable();
		dv1.setId(1L);
		detectionVariableRepository.save(dv1);
		
		PilotDetectionVariable pdv1 = new PilotDetectionVariable();
		pdv1.setId(1L);
		pdv1.setDetectionVariable(dv1);
		pilotDetectionVariableRepository.save(pdv1);

		NumericIndicatorValue nui1 = new NumericIndicatorValue();
		nui1.setId(1L);
		nui1.setUserInRole(uir1);
		nui1.setTimeInterval(ti1);
		nui1.setDetectionVariable(dv1);
		nuiRepository.save(nui1);

		NumericIndicatorValue nui2 = new NumericIndicatorValue();
		nui2.setId(2L);
		nui2.setUserInRole(uir1);
		nui2.setTimeInterval(ti1);
		nui2.setDetectionVariable(dv1);
		nuiRepository.save(nui2);

		List<NumericIndicatorValue> result = nuiRepository.getNuisFor1Month("LLC", intervalStart, dv1);

		Assert.assertNotNull(result);
		Assert.assertEquals(2, result.size());
	}

	@Test
	@Transactional
	@Rollback(true)
	public void testFindMonthZero() throws Exception {

		UserInRole uir1 = new UserInRole();
		uir1.setId(1L);
		uir1.setPilotCode("LLC");
		userInRoleRepository.save(uir1);

		DetectionVariable dv1 = new DetectionVariable();
		dv1.setId(1L);
		dv1.setDetectionVariableName("dv1");
		detectionVariableRepository.save(dv1);

		NumericIndicatorValue nui1 = new NumericIndicatorValue();
		nui1.setUserInRole(uir1);
		nui1.setDetectionVariable(dv1);
		nuiRepository.save(nui1);

		NumericIndicatorValue nui2 = new NumericIndicatorValue();
		nui2.setUserInRole(uir1);
		nui2.setDetectionVariable(dv1);
		nuiRepository.save(nui2);

		NumericIndicatorValue nui3 = new NumericIndicatorValue();		
		nui3.setUserInRole(uir1);
		nui3.setDetectionVariable(dv1);
		nuiRepository.save(nui3);

		Long result = nuiRepository.findMonthZero(dv1.getId(), uir1.getId());

		Assert.assertNotNull(result);
		assertThat(result, greaterThan(0L));
		assertThat(result.getClass(), typeCompatibleWith(Long.class));
		Assert.assertEquals(nui1.getId(), result);
		Assert.assertThat(result, lessThan(nui2.getId()));
		Assert.assertThat(result, lessThan(nui3.getId()));

	}

}
