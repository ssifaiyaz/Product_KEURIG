package com.infy.keurig.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import TestDatabase.HibernateUtility;

import com.infy.keurig.Dao.LearningDAO;
import com.infy.keurig.Entities.LearningEntity;

import org.hibernate.Query;
import org.hibernate.Session;


public class LearningDAOImpl implements LearningDAO {

	@Override
	public List<String> getLearning() {
		// TODO Auto-generated method stub
		List<String> learn=new ArrayList<>();
		try{
		System.out.println("Maven + Hibernate + Oracle+ retrieve");
		
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		String hql = "from LearningEntity order by learnMon Asc";
		Query query = session.createQuery(hql);
		System.out.println("Creation of query is successful");
		
	    List<LearningEntity> results = query.list();
		
		System.out.println("We got the list");
		for(LearningEntity learningEntity:results){
			learn.add(learningEntity.getlearnMon());
		}
		System.out.println("learning size"+learn.size());
		}
		
		catch(Exception e){
			System.out.println("Data not be extracted");
		}
		
		return learn;
	}

	
}

