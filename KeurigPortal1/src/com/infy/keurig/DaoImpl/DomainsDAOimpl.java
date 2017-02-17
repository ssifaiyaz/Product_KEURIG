package com.infy.keurig.DaoImpl;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.infy.keurig.Dao.DomainsDAO;

import com.infy.keurig.Entities.DomainEntity;
import TestDatabase.HibernateUtility;

public class DomainsDAOimpl implements DomainsDAO {

	@Override
	public List<String> getDomain() {
		// TODO Auto-generated method stub
		List<String> domains=new ArrayList<>();
		System.out.println("Maven + Hibernate + Oracle+ retrieve");
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		String hql = "from DomainEntity order by Domain_Area Asc";
		Query query = session.createQuery(hql);
		System.out.println("Creation of query is successful");
		
		/*Query spSQLQuery = session.createSQLQuery("select domain_area from K_DOMAIN_AREAS");
		List<DomainEntity> results = spSQLQuery.list();*/
		
		List<DomainEntity> results = query.list();
		
		System.out.println("We got the list");
		for(DomainEntity domainEntity:results){
			domains.add(domainEntity.getDomain());
		}
		System.out.println("domain size"+domains.size());
		return domains;
		
	}

	
	

}
