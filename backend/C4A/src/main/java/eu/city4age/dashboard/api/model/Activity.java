package eu.city4age.dashboard.api.model;

// default package
// Generated 24-Nov-2016 15:43:47 by Hibernate Tools 5.2.0.Beta1

import java.util.HashSet;
import java.util.Set;

/**
 * Activity generated by hbm2java
 */
public class Activity extends AbstractBaseEntity {

	private CdDataSourceType cdDataSourceType;
	private TimeInterval timeInterval;
	private UserInRole userInRole;
	private String activityName;
	private Set executedActions = new HashSet(0);
	private Set interActivityBehaviourVariationsForRealActivityId = new HashSet(0);
	private Set variationMeasureValues = new HashSet(0);
	private Set eams = new HashSet(0);
	private Set interActivityBehaviourVariationsForExpectedActivityId = new HashSet(0);

	public Activity() {
	}

	public Activity(CdDataSourceType cdDataSourceType, TimeInterval timeInterval, UserInRole userInRole) {
		this.cdDataSourceType = cdDataSourceType;
		this.timeInterval = timeInterval;
		this.userInRole = userInRole;
	}

	public Activity(CdDataSourceType cdDataSourceType, TimeInterval timeInterval, UserInRole userInRole,
			String activityName, Set executedActions, Set interActivityBehaviourVariationsForRealActivityId,
			Set variationMeasureValues, Set eams, Set interActivityBehaviourVariationsForExpectedActivityId) {
		this.cdDataSourceType = cdDataSourceType;
		this.timeInterval = timeInterval;
		this.userInRole = userInRole;
		this.activityName = activityName;
		this.executedActions = executedActions;
		this.interActivityBehaviourVariationsForRealActivityId = interActivityBehaviourVariationsForRealActivityId;
		this.variationMeasureValues = variationMeasureValues;
		this.eams = eams;
		this.interActivityBehaviourVariationsForExpectedActivityId = interActivityBehaviourVariationsForExpectedActivityId;
	}

	public CdDataSourceType getCdDataSourceType() {
		return this.cdDataSourceType;
	}

	public void setCdDataSourceType(CdDataSourceType cdDataSourceType) {
		this.cdDataSourceType = cdDataSourceType;
	}

	public TimeInterval getTimeInterval() {
		return this.timeInterval;
	}

	public void setTimeInterval(TimeInterval timeInterval) {
		this.timeInterval = timeInterval;
	}

	public UserInRole getUserInRole() {
		return this.userInRole;
	}

	public void setUserInRole(UserInRole userInRole) {
		this.userInRole = userInRole;
	}

	public String getActivityName() {
		return this.activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public Set getExecutedActions() {
		return this.executedActions;
	}

	public void setExecutedActions(Set executedActions) {
		this.executedActions = executedActions;
	}

	public Set getInterActivityBehaviourVariationsForRealActivityId() {
		return this.interActivityBehaviourVariationsForRealActivityId;
	}

	public void setInterActivityBehaviourVariationsForRealActivityId(
			Set interActivityBehaviourVariationsForRealActivityId) {
		this.interActivityBehaviourVariationsForRealActivityId = interActivityBehaviourVariationsForRealActivityId;
	}

	public Set getVariationMeasureValues() {
		return this.variationMeasureValues;
	}

	public void setVariationMeasureValues(Set variationMeasureValues) {
		this.variationMeasureValues = variationMeasureValues;
	}

	public Set getEams() {
		return this.eams;
	}

	public void setEams(Set eams) {
		this.eams = eams;
	}

	public Set getInterActivityBehaviourVariationsForExpectedActivityId() {
		return this.interActivityBehaviourVariationsForExpectedActivityId;
	}

	public void setInterActivityBehaviourVariationsForExpectedActivityId(
			Set interActivityBehaviourVariationsForExpectedActivityId) {
		this.interActivityBehaviourVariationsForExpectedActivityId = interActivityBehaviourVariationsForExpectedActivityId;
	}

}
