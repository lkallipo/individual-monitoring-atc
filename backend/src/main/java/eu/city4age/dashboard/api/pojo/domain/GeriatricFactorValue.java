package eu.city4age.dashboard.api.pojo.domain;

<<<<<<< HEAD
import java.io.Serializable;
=======
>>>>>>> c4a-atc/master
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

<<<<<<< HEAD
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
=======
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
>>>>>>> c4a-atc/master
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;

import eu.city4age.dashboard.api.pojo.json.view.View;

@Entity
@Table(name = "geriatric_factor_value")
<<<<<<< HEAD

public class GeriatricFactorValue implements Serializable {
=======
public class GeriatricFactorValue extends AbstractBaseEntity {
>>>>>>> c4a-atc/master

	/**
	 * 
	 */
	private static final long serialVersionUID = 3206256298218071133L;
<<<<<<< HEAD
	
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "gef_seq", sequenceName = "geriatric_factor_value_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "gef_seq", strategy = GenerationType.SEQUENCE)
	@Column(name = "id", insertable = true, updatable = true, unique = true, nullable = false)
	protected Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
=======
>>>>>>> c4a-atc/master

	@JsonView(View.TimeIntervalView.class)
	@Column(name = "gef_value")
	private BigDecimal gefValue;

	@JsonIgnore
<<<<<<< HEAD
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "time_interval_id", referencedColumnName = "id")
	private TimeInterval timeInterval;
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "gef_type_id")
	private DetectionVariable detectionVariable;
=======
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch=FetchType.LAZY)
	@JoinColumn(name = "time_interval_id")
	private TimeInterval timeInterval;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "gef_type_id")
	private DetectionVariable cdDetectionVariable;
>>>>>>> c4a-atc/master

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_in_role_id")
	private UserInRole userInRole;

	@Column(name = "data_source_type")
	private String dataSourceType;

	@Column(name = "derivation_weight")
	private BigDecimal derivationWeight;

	@JsonView(View.TimeIntervalView.class)
	@OneToMany(mappedBy = "geriatricFactorValue", fetch = FetchType.LAZY)
	private Set<Assessment> assessments = new HashSet<Assessment>();

	public GeriatricFactorValue() {
	}

<<<<<<< HEAD
	public GeriatricFactorValue(BigDecimal gefValue, TimeInterval timeInterval, DetectionVariable detectionVariable,
			UserInRole userInRole, String dataSourceType, Set<Assessment> assessments) {
		this.gefValue = gefValue;
		this.timeInterval = timeInterval;
		this.detectionVariable = detectionVariable;
=======
	public GeriatricFactorValue(BigDecimal gefValue, TimeInterval timeInterval, DetectionVariable cdDetectionVariable,
			UserInRole userInRole, String dataSourceType, Set<Assessment> assessments) {
		this.gefValue = gefValue;
		this.timeInterval = timeInterval;
		this.cdDetectionVariable = cdDetectionVariable;
>>>>>>> c4a-atc/master
		this.userInRole = userInRole;
		this.dataSourceType = dataSourceType;
		this.assessments = assessments;
	}

	public BigDecimal getGefValue() {
		return this.gefValue;
	}

	public void setGefValue(BigDecimal gefValue) {
		this.gefValue = gefValue;
	}

	public TimeInterval getTimeInterval() {
		return timeInterval;
	}

	public void setTimeInterval(TimeInterval timeInterval) {
		this.timeInterval = timeInterval;
<<<<<<< HEAD

	}

	public DetectionVariable getDetectionVariable() {
		return detectionVariable;
	}

	public void setDetectionVariable(DetectionVariable detectionVariable) {
		this.detectionVariable = detectionVariable;
=======
	}

	public DetectionVariable getCdDetectionVariable() {
		return cdDetectionVariable;
	}

	public void setCdDetectionVariable(DetectionVariable cdDetectionVariable) {
		this.cdDetectionVariable = cdDetectionVariable;
>>>>>>> c4a-atc/master
	}

	public UserInRole getUserInRole() {
		return userInRole;
	}

	public void setUserInRole(UserInRole userInRole) {
		this.userInRole = userInRole;
	}

	public String getDataSourceType() {
		return this.dataSourceType;
	}

	public void setDataSourceType(String dataSourceType) {
		this.dataSourceType = dataSourceType;
	}

	public BigDecimal getDerivationWeight() {
		return derivationWeight;
	}

	public void setDerivationWeight(BigDecimal derivationWeight) {
		this.derivationWeight = derivationWeight;
	}

	public Set<Assessment> getAssessments() {
		return assessments;
	}

	public void setAssessments(Set<Assessment> assessments) {
		this.assessments = assessments;
	}

	public void addAssessment(Assessment assessment) {
		this.assessments.add(assessment);
	}

	public DetectionVariable getGefTypeId() {
<<<<<<< HEAD
		return this.detectionVariable;
	}

}
=======
		return this.cdDetectionVariable;
	}

}
>>>>>>> c4a-atc/master
