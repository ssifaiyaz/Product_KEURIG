package com.infy.keurig.DaoImpl;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.infy.keurig.Dao.LoginDAO;
import com.infy.keurig.Bean.Login;
import com.infy.keurig.Entities.LoginEntity;
import TestDatabase.HibernateUtility;



public class LoginDAOImpl implements LoginDAO {
	SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public boolean getLoginInfo(Login login) throws Exception {

		Session session = HibernateUtility.getSessionFactory().openSession();
		
		System.out.println("reached here");
		System.out.println(login.getUsername());
		try {
            System.out.println(login.getUsername());
			Query q2 = session.createQuery("select e from LoginEntity e where e.emailId=? and e.password=?");
			q2.setParameter(0, login.getUsername());
			q2.setParameter(1, login.getPassword());
			@SuppressWarnings("unchecked")
			List<LoginEntity> leList1 = q2.list();
			if(leList1.isEmpty())
			{
				System.out.println(leList1);
				return false;
			}
			else
			{
				return true;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			if("DAO.INVALID_USERNAME".equals(e.getMessage())){
				throw e;
			}else{
				e.printStackTrace();
				throw new Exception("DAO.TECHNICAL_ERROR");
			}
		}
		
		
	}
	
	
}
