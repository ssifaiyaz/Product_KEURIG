package com.infy.keurig.DaoImpl;


import java.util.ArrayList;
import java.util.List;

import TestDatabase.HibernateUtility;

import com.infy.keurig.Entities.StarEntity;

import org.hibernate.Query;
import org.hibernate.Session;
import com.infy.keurig.Dao.StarDAO;

public class StarDAOImpl implements StarDAO  {

	@Override
	public List<String> getStar() {
		// TODO Auto-generated method stub
		List<String> star=new ArrayList<>();
		try{
		System.out.println("Maven + Hibernate + Oracle+ retrieve");
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		String hql = "from StarEntity order by strId Asc";
		Query query = session.createQuery(hql);
		System.out.println("Creation of query is successful");
		
		
		List<StarEntity> results = query.list();
		
		System.out.println("We got the list");
		for(StarEntity starEntity:results){
			star.add(starEntity.getstrId());
		}
		System.out.println("star size"+star.size());
		}
		catch(Exception e)
		{
			System.out.println("Data not be extracted");
		}
		return star;
		
	}

	
	

}

