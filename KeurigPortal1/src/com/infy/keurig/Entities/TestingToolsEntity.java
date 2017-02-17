package com.infy.keurig.Entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="K_TESTING_TOOLS")
public class TestingToolsEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	
	private String tool;
	private String tdetails;
	public String getTool() {
		return tool;
	}
	public void setTool(String tool) {
		this.tool = tool;
	}
	public String getTdetails() {
		return tdetails;
	}
	public void setTdetails(String tdetails) {
		this.tdetails = tdetails;
	}

}
