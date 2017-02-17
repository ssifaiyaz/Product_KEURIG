package com.infy.keurig.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import TestDatabase.HibernateUtility;

import com.infy.keurig.Entities.TestingToolsEntity;
import com.infy.keurig.Dao.TestingToolsDAO;
public class TestingToolsDAOImpl implements TestingToolsDAO{

	@Override
	public List<String> getTestingTools() {
		
		List<String> testingTools=new ArrayList<>();
		try{
		System.out.println("Maven + Hibernate + Oracle+ retrieve");
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		String hql = "from TestingToolsEntity order by tool Asc";
		
		Query query = session.createQuery(hql);
		System.out.println("Creation of query is successful");
		
	
		List<TestingToolsEntity> results = query.list();
		
		System.out.println("We got the list");
		for(TestingToolsEntity testingToolsEntity:results){
			testingTools.add(testingToolsEntity.getTool());
		}
		System.out.println("testingTools size"+testingTools.size());
		}
		catch(Exception e)
		{
			System.out.println("Data not be extracted");
		}
		return testingTools;
		
	}
}

