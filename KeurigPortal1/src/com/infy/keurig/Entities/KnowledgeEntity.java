package com.infy.keurig.Entities;


import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="K_KNOWLEDGE_REP")
public class KnowledgeEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String knowledge;
    private String kwDetails;
    
    public String getknowledge() {
		return knowledge;
	}
	public void setknowledge(String knowledge) {
		this.knowledge = knowledge;
	}
	public String getkwDetails() {
		return kwDetails;
	}
	public void setkwDetails(String kwDetails) {
		this.kwDetails = kwDetails;
	}
    
	
}
