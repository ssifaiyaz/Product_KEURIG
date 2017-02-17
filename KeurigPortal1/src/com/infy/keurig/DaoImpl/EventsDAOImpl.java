package com.infy.keurig.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.infy.keurig.Entities.EventsEntity;
import com.infy.keurig.Dao.EventsDAO;
import TestDatabase.HibernateUtility;

public class EventsDAOImpl implements EventsDAO{

	@Override
	public List<String> getEvents() {
		List<String> eventids=new ArrayList<>();
		try{
		System.out.println("Maven + Hibernate + Oracle+ retrieve");
		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction();
		String hql="from EventsEntity order by eventid ASC";
		Query query = session.createQuery(hql);
		System.out.println("Creation of query is successful");
		
		List<EventsEntity> result=query.list();
		System.out.println("We got the list");
		for(EventsEntity eventsEntity:result){
			eventids.add(eventsEntity.getEventid());
		}
		
		System.out.println("Total events are"+eventids.size());
		}
		catch(Exception e){
			System.out.println("Data not be extracted");
		}
		return eventids;
	}
	

}
