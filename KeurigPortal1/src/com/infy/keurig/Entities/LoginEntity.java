package com.infy.keurig.Entities;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="K_LOGIN")
public class LoginEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="email_id")
  	private String emailId;
	@Column(name="password")
    private String password;
    
    
	
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailid(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
	
	
}
