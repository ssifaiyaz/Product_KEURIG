package com.infy.keurig.DaoImpl;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;


import com.infy.keurig.Dao.TestingDAO;

import com.infy.keurig.Entities.TestingEntity;
import TestDatabase.HibernateUtility;

public class TestingDAOimpl implements TestingDAO{

	@Override
	public List<String> getTesting() {
		
		List<String> testing=new ArrayList<>();
		System.out.println("Maven + Hibernate + Oracle+ retrieve");
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		String hql = "from TestingEntity order by length(test_type) desc";
		Query query = session.createQuery(hql);
		
		List<TestingEntity> results = query.list();
		System.out.println("success2");
		for(TestingEntity testingEntity:results){
			testing.add(testingEntity.getTesting());
		}
		return testing;
		
	}

	
	

}
