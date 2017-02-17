package com.infy.keurig.DaoImpl;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.infy.keurig.Dao.KnowledgeDAO;

import com.infy.keurig.Entities.KnowledgeEntity;

import TestDatabase.HibernateUtility;


public class KnowledgeDAOImpl implements KnowledgeDAO {

	@Override
	public List<String> getKnowledge() {
		List<String> know=new ArrayList<>();
	try{
		// TODO Auto-generated method stub
		
	//	System.out.println("Maven + Hibernate + Oracle+ retrieve");
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		String hql = "from KnowledgeEntity order by knowledge Asc";
		Query query = session.createQuery(hql);
		System.out.println("Creation of query is successful");
			
		List<KnowledgeEntity> results = query.list();
		
		System.out.println("We got the list");
		for(KnowledgeEntity knowledgeEntity:results){
			know.add(knowledgeEntity.getknowledge());
		}
		System.out.println("knowledge size"+know.size());
		return know;
		
	}
	catch(Exception e)
	{
		System.out.println("Data not be extracted");
	}
	return know;

	}
}

