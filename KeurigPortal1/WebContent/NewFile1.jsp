<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Keurig Portal</title>
</head>
<body>

	<center>
		<p>
		<h3>KEURIG PORTAL</h3>
		</p>
	</center>
	<form align="left" method="link" action="login.jsp">
		<input type="submit" value="Logout" />
	</form>
	<center>
		<img src="KeurigPortalImage.jpg" width="20%" height="100"
			alt="Test tool">
	</center>
	<br>
	</br>
<body style="font-family: sans-serif">


	<div style="width: 33%; border: 1px solid black; float: left">
		<h4>
			<center>Knowledge Repository</center>
		</h4>
		
		<table>
            <c:forEach items="${uinterface.knowledge}" var="item">
                <tr>
                   <td> <c:out value="${item}" /></td>
			   </tr>
            </c:forEach>
		</table>
	</div>

	<div style="width: 33%; border: 1px solid black; float: left">
       <h4>
          <center> Appreciation of the Month</center>
		</h4>
		<table>
		<c:forEach var="item" items="${uinterface.appreciation}">
   				 <tr>
					<td><c:out value="${item}"/></td>
				 </tr>
 		 </c:forEach>
		</table>
	</div>

	
	<div style="width: 33%; border: 1px solid black; float: left">
	<h4>
		<center> Star of the Month</center>
	</h4>
		
	<table>
		<c:forEach var="item" items="${uinterface.star}">
          <tr> 
				<td><c:out value="${item}"/></td>
		 </tr>
        </c:forEach>
	</table>
	</div>


	<div style="width: 33%; border: 1px solid black; float: left">
		<h4>
			<center> Learning of the Month</center>
		</h4>
		<table>
		     <c:forEach var="item" items="${uinterface.learning}">
             <tr>
                <td><c:out value="${item}"/></td>
			  </tr>
            </c:forEach>
		</table>
	</div>


	<div style="width: 33%; border: 1px solid black; float: left">
		<h4>
			<center>Events</center>
		</h4>

		<table>
             <c:forEach var="item" items="${uinterface.events}">
               <tr>
		          <td><c:out value="${item}"/></td>
			
			   </tr>
			</c:forEach>
		</table>
	</div>
			
			
	<div style="width: 33%; border: 1px solid black; float: left">
		<h4>
			<center>Active Projects</center>
		</h4>

		<table>
             <c:forEach var="item" items="${uinterface.activeProjects}">
               <tr>
		          <td><c:out value="${item}"/></td>
			
			   </tr>
			</c:forEach>
		</table>
	</div>
			
			<div style="width: 33%; border: 1px solid black; float: left">
		<h4>
			<center> Testing Tools</center>
		</h4>

		<table>
             <c:forEach var="item" items="${uinterface.testingTools}">
               <tr>
		          <td><c:out value="${item}"/></td>
			
			   </tr>
			</c:forEach>
		</table>
	</div>
			
</body>
</html>
			