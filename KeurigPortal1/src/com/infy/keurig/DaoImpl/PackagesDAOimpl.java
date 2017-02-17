package com.infy.keurig.DaoImpl;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;


import com.infy.keurig.Dao.PackagesDAO;

import com.infy.keurig.Entities.PackagesEntity;
import TestDatabase.HibernateUtility;


public class PackagesDAOimpl implements PackagesDAO {

	@Override
	public List<String> getPackages() {
		
		List<String> packages=new ArrayList<>();
		System.out.println("Maven + Hibernate + Oracle+ retrieve");
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		String hql = "from PackagesEntity order by package Asc";
		Query query = session.createQuery(hql);
		List<PackagesEntity> results = query.list();
		System.out.println("success1");
		for(PackagesEntity packagesEntity:results){
			packages.add(packagesEntity.getPackages());
		}
		return packages;
		
	}

	
	

}
