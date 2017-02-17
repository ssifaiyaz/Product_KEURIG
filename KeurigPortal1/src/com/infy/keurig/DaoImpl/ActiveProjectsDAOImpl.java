package com.infy.keurig.DaoImpl;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import TestDatabase.HibernateUtility;

import com.infy.keurig.Entities.ActiveProjectsEntity;
import com.infy.keurig.Dao.ActiveProjectsDAO;

public class ActiveProjectsDAOImpl implements ActiveProjectsDAO{

	@Override
	public List<String> getActiveProjects() {
		List<String> activeProjects=new ArrayList<>();
		
		try{
			
		System.out.println("Maven + Hibernate + Oracle+ retrieve");
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		String hql = "from ActiveProjectsEntity order by project Asc";
		
		Query query = session.createQuery(hql);
		System.out.println("Creation of query is successful");
		
	
		List<ActiveProjectsEntity> results = query.list();
		
		System.out.println("We got the list");
		for(ActiveProjectsEntity activeProjectsEntity:results){
			activeProjects.add(activeProjectsEntity.getProject());
		}
		System.out.println("Active projects size"+activeProjects.size());
		}
		catch(Exception e){
			System.out.println("Data not be extracted");
		}
		return activeProjects;
	}
	

}
