package eu.city4age.dashboard.api.pojo.domain;

<<<<<<< HEAD
import java.io.Serializable;
import java.time.YearMonth;
import java.time.ZoneId;
import java.util.Date;
=======
import java.util.HashSet;
>>>>>>> c4a-atc/master
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "pilot")
=======
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import javax.persistence.Id;

@Entity
@Table(name="pilot")
>>>>>>> c4a-atc/master
public class Pilot implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1267893598090303628L;

<<<<<<< HEAD
	private String name;

	@Id
	@Column(name = "pilot_code")
	private String pilotCode;

	@Column(name = "population_size")
	private Double populationSize;

	/*@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@OneToMany(mappedBy = "pilot", fetch = FetchType.LAZY)
	private Set<Location> locations = new HashSet<Location>(0);*/

	@Column(name = "latest_data_submission_completed")
	private Date latestSubmissionCompleted;

	@Column(name = "latest_derived_detection_variables_computed")
	private Date latestVariablesComputed;
	
	@Column(name = "latest_configuration_update")
	private Date latestConfigurationUpdate;

	@Transient
	private YearMonth lastSubmitted;

	@Transient
	private YearMonth lastComputed;
	
	@Transient
	private YearMonth lastConfigured;

	public Pilot() {
		lastSubmitted = YearMonth.of(2017, 2);
	}

	public Pilot(String name, String pilotCode, Double populationSize, Set<Location> locations) {
		this.name = name;
		this.pilotCode = pilotCode;
		this.populationSize = populationSize;
		//this.locations = locations;
=======
        @Column(name="pilot_name")
	private String name;
	
        @Id
	@Column(name="code")
	private String pilotCode;
	
	@Column(name="population_size")
	private Double populationSize;
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@OneToMany(mappedBy="pilot",fetch=FetchType.LAZY)
	private Set<Location> locations = new HashSet<Location>(0);
	
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@OneToMany(mappedBy="pilot",fetch=FetchType.LAZY)
	private Set<PilotDetectionVariable> cdPilotDetectionVariables = new HashSet<PilotDetectionVariable>(0);

	public Pilot() {
	}

	public Pilot(String name, String pilotCode, Double populationSize, Set<Location> locations, Set<PilotDetectionVariable> cdPilotDetectionVariables) {
		this.name = name;
		this.pilotCode = pilotCode;
		this.populationSize = populationSize;
		this.locations = locations;
		this.cdPilotDetectionVariables = cdPilotDetectionVariables;
>>>>>>> c4a-atc/master
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPilotCode() {
		return pilotCode;
	}

	public void setPilotCode(String pilotCode) {
		this.pilotCode = pilotCode;
	}

	public Double getPopulationSize() {
		return this.populationSize;
	}

	public void setPopulationSize(Double populationSize) {
		this.populationSize = populationSize;
	}

<<<<<<< HEAD
	/*public Set<Location> getLocations() {
=======
	public Set<Location> getLocations() {
>>>>>>> c4a-atc/master
		return this.locations;
	}

	public void setLocations(Set<Location> locations) {
		this.locations = locations;
<<<<<<< HEAD
	}*/

	public YearMonth getLastSubmitted() {
		return lastSubmitted;
	}

	public void setLastSubmitted(YearMonth lastSubmitted) {
		this.lastSubmitted = lastSubmitted;
	}

	public YearMonth getLastComputed() {
		if (this.latestSubmissionCompleted != null) {
			return YearMonth
					.from(this.latestSubmissionCompleted.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
		} else if (this.latestVariablesComputed != null) {
			return YearMonth
					.from(this.latestVariablesComputed.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
		/*} else if (this.latestConfigurationUpdate != null) {
			return YearMonth
					.from(this.latestConfigurationUpdate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());*/
		} else {
			return YearMonth.of(2017, 1);
		}
	}

	public void setLastComputed(YearMonth lastComputed) {
		this.lastComputed = lastComputed;
	}

	public YearMonth getLastConfigured() {
		return lastConfigured;
	}

	public void setLastConfigured(YearMonth lastConfigured) {
		this.lastConfigured = lastConfigured;
	}

	public Date getLatestSubmissionCompleted() {
		return latestSubmissionCompleted;
	}

	public void setLatestSubmissionCompleted(Date latestSubmissionCompleted) {
		this.latestSubmissionCompleted = latestSubmissionCompleted;
	}

	public Date getLatestVariablesComputed() {
		return latestVariablesComputed;
	}

	public void setLatestVariablesComputed(Date latestVariablesComputed) {
		this.latestVariablesComputed = latestVariablesComputed;
	}

	public Date getLatestConfigurationUpdate() {
		return latestConfigurationUpdate;
	}

	public void setLatestConfigurationUpdate(Date latestConfigurationUpdate) {
		this.latestConfigurationUpdate = latestConfigurationUpdate;
=======
	}

	public Set<PilotDetectionVariable> getCdPilotDetectionVariables() {
		return this.cdPilotDetectionVariables;
	}

	public void setCdPilotDetectionVariables(Set<PilotDetectionVariable> cdPilotDetectionVariables) {
		this.cdPilotDetectionVariables = cdPilotDetectionVariables;
>>>>>>> c4a-atc/master
	}

}
