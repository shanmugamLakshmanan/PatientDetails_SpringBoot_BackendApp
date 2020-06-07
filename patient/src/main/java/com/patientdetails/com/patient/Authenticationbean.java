package com.patientdetails.com.patient;

public class Authenticationbean {

	
	private String message;

	public Authenticationbean(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "Authenticationbean [message=" + message + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
