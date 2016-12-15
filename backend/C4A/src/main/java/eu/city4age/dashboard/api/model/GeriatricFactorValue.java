package eu.city4age.dashboard.api.model;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

// default package
// Generated 24-Nov-2016 15:43:47 by Hibernate Tools 5.2.0.Beta1

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * GeriatricFactorValue generated by hbm2java
 */
public class GeriatricFactorValue extends AbstractBaseEntity {

	private BigDecimal gefValue;
	
	@JsonBackReference
	private TimeInterval timeInterval;
	
	private CdDetectionVariable cdDetectionVariable;
	private Integer userInRoleId;
	private String dataSourceType;
	
	private BigDecimal derivationWeight;

	private Set sourceEvidences = new HashSet(0);
	
	private Set<NumericIndicatorValue> numericIndicatorValues = new HashSet<NumericIndicatorValue>();

	@JsonIgnore 
	private Set<AssessedGefValueSet> assessedGefValueSets = new HashSet<AssessedGefValueSet>();
	
	private Set<Assessment> assessment = new HashSet<Assessment>();

	public GeriatricFactorValue() {
	}

	public GeriatricFactorValue(BigDecimal gefValue, TimeInterval timeInterval, CdDetectionVariable cdDetectionVariable, Integer userInRoleId,
			String dataSourceType, Set<AssessedGefValueSet> assessedGefValueSets, Set nuiGefs, Set sourceEvidences) {
		this.gefValue = gefValue;
		this.timeInterval = timeInterval;
		this.cdDetectionVariable = cdDetectionVariable;
		this.userInRoleId = userInRoleId;
		this.dataSourceType = dataSourceType;
		this.assessedGefValueSets = assessedGefValueSets;
		this.sourceEvidences = sourceEvidences;
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
	}

	public CdDetectionVariable getCdDetectionVariable() {
		return cdDetectionVariable;
	}

	public void setCdDetectionVariable(CdDetectionVariable cdDetectionVariable) {
		this.cdDetectionVariable = cdDetectionVariable;
	}

	public Integer getUserInRoleId() {
		return this.userInRoleId;
	}

	public void setUserInRoleId(Integer userInRoleId) {
		this.userInRoleId = userInRoleId;
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

	public Set getSourceEvidences() {
		return this.sourceEvidences;
	}

	public void setSourceEvidences(Set sourceEvidences) {
		this.sourceEvidences = sourceEvidences;
	}

	public Set<NumericIndicatorValue> getNumericIndicatorValues() {
		return numericIndicatorValues;
	}

	public void setNumericIndicatorValues(Set<NumericIndicatorValue> numericIndicatorValues) {
		this.numericIndicatorValues = numericIndicatorValues;
	}

	public Set<AssessedGefValueSet> getAssessedGefValueSets() {
		return assessedGefValueSets;
	}

	public void setAssessedGefValueSets(Set<AssessedGefValueSet> assessedGefValueSets) {
		this.assessedGefValueSets = assessedGefValueSets;
	}

	public Set<Assessment> getAssessment() {
		return assessment;
	}

	public void setAssessment(Set<Assessment> assessment) {
		this.assessment = assessment;
	}
	
	public void addAssessment(Assessment assessment) {
		this.assessment.add(assessment);
	}

}
