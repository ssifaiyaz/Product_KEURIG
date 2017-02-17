package com.infy.keurig.Entities;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="K_LEARNING_MON")
public class LearningEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
  	private String learnMon;
    private String lmDetails;
    
	public String getlearnMon() {
		return learnMon;
	}
	public void setlearnMon(String learnMon) {
		this.learnMon = learnMon;
	}
	public String getlmDetails() {
		return lmDetails;
	}
	public void setlmDetails(String lmDetails) {
		this.lmDetails = lmDetails;
	}

}
