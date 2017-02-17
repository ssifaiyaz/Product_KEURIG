package com.infy.keurig.service;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.infy.keurig.Dao.LoginDAO;
import com.infy.keurig.DaoImpl.LoginDAOImpl;
import com.infy.keurig.Bean.Login;

/**
 * Servlet implementation class LoginServlet1
 */
@WebServlet("/LoginServlet1")
public class LoginServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{	    

		     Login user = new Login();
		     user.setUsername(request.getParameter("un"));
		     user.setPassword(request.getParameter("pw"));
		     
		     LoginDAO l = new LoginDAOImpl();
		  
		     
		     try{
		     System.out.println("Sparsh user: "+user.getUsername());
		     }catch(Exception e){
		    	 System.out.println("oops null pointer");
		     }
		     if (l.getLoginInfo(user))
		     {
			        
		              
		          request.getSession().setAttribute("currentSessionUser",user); 
		          response.sendRedirect("Home.jsp"); //logged-in page      		
		     }
			        
		     else {
		          response.sendRedirect("invalidLogin.jsp"); //error page
		          
		          
		     }
		     } 
				
				
		catch (Throwable theException) 	    
		{
		    theException.printStackTrace(); 
			System.out.println(theException); 
		}
		       }
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

