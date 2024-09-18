package com.mandeer.websc.model;


public class Candidate {
    private String positionType; // "Full-Time" or "Contract"
    
    private String firstName;

    private String lastName;

    private boolean openForRelocation;
    
    private String currentLocation;
    
    public String getPositionType() {
		return positionType;
	}

	public void setPositionType(String positionType) {
		this.positionType = positionType;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isOpenForRelocation() {
		return openForRelocation;
	}

	public void setOpenForRelocation(boolean openForRelocation) {
		this.openForRelocation = openForRelocation;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public String getVisaStatus() {
		return visaStatus;
	}

	public void setVisaStatus(String visaStatus) {
		this.visaStatus = visaStatus;
	}

	private String visaStatus;

    // Getters and Setters
}
