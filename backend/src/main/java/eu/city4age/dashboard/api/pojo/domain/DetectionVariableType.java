package eu.city4age.dashboard.api.pojo.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
=======
>>>>>>> c4a-atc/master
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
<<<<<<< HEAD
@Table(name = "cd_detection_variable_type")
=======
@Table(name="cd_detection_variable_type")
>>>>>>> c4a-atc/master
public class DetectionVariableType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2367967721511008325L;

<<<<<<< HEAD
	public static final DetectionVariableType MEA = new DetectionVariableType(DetectionVariableType.Type.MEA, "Variation measure");
	public static final DetectionVariableType NUI = new DetectionVariableType(DetectionVariableType.Type.NUI, "Numeric indicator");
	public static final DetectionVariableType GES = new DetectionVariableType(DetectionVariableType.Type.GES, "Geriatric sub-factor");
	public static final DetectionVariableType GEF = new DetectionVariableType(DetectionVariableType.Type.GEF, "Geriatric factor");
	public static final DetectionVariableType GFG = new DetectionVariableType(DetectionVariableType.Type.GFG, "Geriatric factor group");
	public static final DetectionVariableType OVL = new DetectionVariableType(DetectionVariableType.Type.OVL, "Overall frailty score");
	
	public enum Type {
		MEA("MEA"), NUI("NUI"), GES("GES"), GEF("GEF"), GFG("GFG"), OVL("OVL");
		
		private final String name;
		
		Type(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}
	};

	@Id
	@Column(name = "detection_variable_type")
	@Enumerated(EnumType.STRING)
	private DetectionVariableType.Type detectionVariableType;

	@Column(name = "detection_variable_type_description")
	private String detectionVariableTypeDescription;
	
	public DetectionVariableType() {
	}

	private DetectionVariableType(DetectionVariableType.Type detectionVariableType, String detectionVariableTypeDescription) {
		this.detectionVariableType = detectionVariableType;
=======
	@Id
	@Column(name="detection_variable_type")
	private String detectionVariableType;
	
	@Column(name="detection_variable_type_description")
	private String detectionVariableTypeDescription;

	public DetectionVariableType() {
	}

	public DetectionVariableType(String detectionVariableType) {
		this.detectionVariableType = detectionVariableType;
	}

	public DetectionVariableType(String detectionVariableType, String detectionVariableTypeDescription) {
		this.detectionVariableType = detectionVariableType;
		this.detectionVariableTypeDescription = detectionVariableTypeDescription;
	}

	public String getDetectionVariableType() {
		return this.detectionVariableType;
	}

	public void setDetectionVariableType(String detectionVariableType) {
		this.detectionVariableType = detectionVariableType;
	}

	public String getDetectionVariableTypeDescription() {
		return this.detectionVariableTypeDescription;
	}

	public void setDetectionVariableTypeDescription(String detectionVariableTypeDescription) {
>>>>>>> c4a-atc/master
		this.detectionVariableTypeDescription = detectionVariableTypeDescription;
	}

}
