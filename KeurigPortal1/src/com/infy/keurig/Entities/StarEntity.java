package com.infy.keurig.Entities;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="K_STAR_MON")
public class StarEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
  	private String strId;
    private String details;
	public String getstrId() {
		return strId;
	}
	public void setstrId(String strId) {
		this.strId = strId;
	}
	public String getdetails() {
		return details;
	}
	public void setdetails(String details) {
		this.details = details;
	}
    
    
}
