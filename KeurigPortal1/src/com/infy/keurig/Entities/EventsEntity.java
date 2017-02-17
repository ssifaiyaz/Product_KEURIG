package com.infy.keurig.Entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="K_EVENTS")
public class EventsEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String eventid;
	private String edetails;
	public String getEventid() {
		return eventid;
	}
	public void setEventid(String eventid) {
		this.eventid = eventid;
	}
	public String getEdetails() {
		return edetails;
	}
	public void setEdetails(String edetails) {
		this.edetails = edetails;
	}
	

}
