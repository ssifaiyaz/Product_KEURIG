package com.infy.keurig.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name="K_APP_MON")
public class AppreciationEntity implements Serializable {
	
	
	private static final long serialVersionUID = 1L; 
	
	@Id
  	private String appMonId;
    private String apDetails;
    
	public String getappMonId() {
		return appMonId;
	}
	public void setappMonId(String appMonId) {
		this.appMonId = appMonId;
	}
	public String getapDetails() {
		return apDetails;
	}
	public void setapDetails(String apDetails) {
		this.apDetails = apDetails;
	}
    
}
