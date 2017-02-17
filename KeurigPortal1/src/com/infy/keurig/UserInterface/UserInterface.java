package com.infy.keurig.UserInterface;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.infy.keurig.Business.*;


@ManagedBean(name = "uinterface", eager = true)
@SessionScoped
public class UserInterface {

	
	private List<String> Knowledge;
	private List<String> Appreciation;
	private List<String> Star; 
	private List<String> Learning;
	
	
	private List<String> ActiveProjects;
	private List<String> Events;
	private List<String> TestingTools;

	
	private List<String> domains;
	private List<String> packages;
	private List<String> testing;
	
	public List<String> getAppreciation() {
		System.out.println("hi1");
		return Appreciation;
	}


    public void setAppreciation(List<String> appreciation) {
		Appreciation = appreciation;
	}

    public List<String> getStar() {
    	System.out.println("hi2");
		return Star;
	}

    public void setStar(List<String> star) {
		Star = star;
	}

    public List<String> getKnowledge() {
    	System.out.println("hi3");
		return Knowledge;
	}


    public void setKnowledge(List<String> knowledge) {
		Knowledge = knowledge;
	}

    public List<String> getLearning() {
    	System.out.println("hi4");
		return Learning;
	}
	
    public void setLearning(List<String> learning) {
		Learning = learning;
	}
    

   
    public List<String> getActiveProjects() {
		return ActiveProjects;
	}


	public void setActiveProjects(List<String> activeProjects) {
		ActiveProjects = activeProjects;
	}


	public List<String> getEvents() {
		return Events;
	}


	public void setEvents(List<String> events) {
		Events = events;
	}


	public List<String> getTestingTools() {
		return TestingTools;
	}


	public void setTestingTools(List<String> testingTools) {
		TestingTools = testingTools;
	}

	public List<String> getDomains() {
		return domains;
	}


	public void setDomains(List<String> domains) {
		this.domains = domains;
	}


	public List<String> getPackages() {
		return packages;
	}


	public void setPackages(List<String> packages) {
		this.packages = packages;
	}


	public List<String> getTesting() {
		return testing;
	}


	public void setTesting(List<String> testing) {
		this.testing = testing;
	}


	public UserInterface() {
			System.out.println("hi");
			try{
				Business business=new BusinessImpl();
				
				Knowledge=business.getKnowledge();
				Appreciation=business.getAppreciation();
				Star=business.getStar();
				Learning=business.getLearning();
				
				ActiveProjects=business.getActiveProjects();
				Events=business.getEvents();
				TestingTools=business.getTestingTools();
				
				domains=business.getDomains();
				packages=business.getPackages();
				testing=business.getTesting();
				
				
				System.out.println("type of :"+Knowledge);
				System.out.println("type of :"+Appreciation);
				System.out.println("type of :"+Star);
				System.out.println("type of :"+Learning);
				
				System.out.println("type of :"+ActiveProjects);
				System.out.println("type of :"+Events);
				System.out.println("type of :"+TestingTools);
				
				
				System.out.println("type of :"+domains);
				System.out.println("type of :"+packages);
				System.out.println("type of :"+testing);
				
			}
			catch(Exception e){
				System.out.println("----------------------");
				e.printStackTrace();
				System.out.println("----------------------");
				System.out.println("Virender Arneja "+e.getMessage());
			}
			
		}
}

