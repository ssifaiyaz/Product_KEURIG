package com.infy.keurig.Business;

import java.util.List;

import com.infy.keurig.Business.Business;
import com.infy.keurig.Dao.*;
import com.infy.keurig.DaoImpl.*;


public class BusinessImpl implements Business{

	AppreciationDAO appreciationdao=new AppreciationDAOImpl();
	KnowledgeDAO knowdao=new KnowledgeDAOImpl();
	StarDAO stardao=new StarDAOImpl();
	LearningDAO learndao=new LearningDAOImpl();
	
	ActiveProjectsDAO activeProjectsDAO=new ActiveProjectsDAOImpl();
	EventsDAO eventsDAO=new EventsDAOImpl();
    TestingToolsDAO testingToolsDAO=new TestingToolsDAOImpl();


	DomainsDAO domainsdao=new DomainsDAOimpl();
	TestingDAO testingdao=new TestingDAOimpl();
	PackagesDAO packagesdao=new PackagesDAOimpl();
	
	
	@Override
	public List<String> getAppreciation() {
		// TODO Auto-generated method stub
		return appreciationdao.getAppreciation();
	}

	@Override
	public List<String> getLearning() {
		// TODO Auto-generated method stub
		return learndao.getLearning();
	}

	@Override
	public List<String> getKnowledge() {
		// TODO Auto-generated method stub
		return knowdao.getKnowledge();
	}

	@Override
	public List<String> getStar() {
		// TODO Auto-generated method stub
		return stardao.getStar();
	}

	@Override
	public List<String> getActiveProjects() {
		// TODO Auto-generated method stub
		return activeProjectsDAO.getActiveProjects();
	}

	@Override
	public List<String> getEvents() {
		// TODO Auto-generated method stub
		return eventsDAO.getEvents();
	}

	@Override
	public List<String> getTestingTools() {
		// TODO Auto-generated method stub
		return testingToolsDAO.getTestingTools();
	}
	
	
	
	@Override
	public List<String> getDomains() {
		// TODO Auto-generated method stub
		return domainsdao.getDomain();
	}

	@Override
	public List<String> getTesting() {
		// TODO Auto-generated method stub
		return testingdao.getTesting();
	}

	@Override
	public List<String> getPackages() {
		// TODO Auto-generated method stub
		return packagesdao.getPackages();
	}
}
