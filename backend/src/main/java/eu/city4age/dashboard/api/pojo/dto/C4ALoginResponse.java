<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.city4age.dashboard.api.pojo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

=======
package eu.city4age.dashboard.api.pojo.dto;

>>>>>>> c4a-atc/master
/**
 *
 * @author EMantziou
 */
public class C4ALoginResponse {
<<<<<<< HEAD
	
	private Long id;
	
	private String message;

	private int responseCode;

	private String displayName;
	
	private short roleId;
	
	private String pilotName;
	
	private String pilotCode;
	
	public Long getId() {
		return id;
	}

	@JsonProperty("ID")
	public void setId(Long id) {
		this.id = id;
	}

	public String getPilotCode() {
		return pilotCode;
	}

	public void setPilotCode(String pilotCode) {
		this.pilotCode = pilotCode;
	}

	public String getpilotName() {
		return pilotName;
	}

	public void setpilotName(String pilotName) {
		this.pilotName = pilotName;
	}

	public short getRoleId() {
		return roleId;
	}

	public void setRoleId(short roleId) {
		this.roleId = roleId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

=======

    private int responseCode;

    private String jwToken;

    String displayName;

    String pilotName;

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getJwToken() {
        return jwToken;
    }

    public void setJwToken(String jwToken) {
        this.jwToken = jwToken;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getPilotName() {
        return pilotName;
    }

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }
>>>>>>> c4a-atc/master
}
