package com.infy.keurig.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import TestDatabase.HibernateUtility;

import com.infy.keurig.Dao.AppreciationDAO;
import com.infy.keurig.Entities.AppreciationEntity;

import org.hibernate.Query;
import org.hibernate.Session;



public class AppreciationDAOImpl implements AppreciationDAO{


	@Override
	public List<String> getAppreciation() {
		// TODO Auto-generated method stub
		List<String> appreciation=new ArrayList<>();
		try{
		
		System.out.println("Maven + Hibernate + Oracle+ retrieve");
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		String hql = "from AppreciationEntity order by appMonId Asc";
		
		Query query = session.createQuery(hql);
		System.out.println("Creation of query is successful");
		
	
		List<AppreciationEntity> results = query.list();
		
		System.out.println("We got the list");
		for(AppreciationEntity appreciationEntity:results){
			appreciation.add(appreciationEntity.getappMonId());
		}
		System.out.println("appreciation size"+appreciation.size());
		
		}
		catch(Exception e)
		{
			System.out.println("Data not be extracted");
		}
		return appreciation;
	}

	
}
