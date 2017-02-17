<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html xmlns:="http://www.w3.org/1999/xhtml"		
      xmlns:f="http://java.sun.com/jsf/core"
      xmlns:h="http://java.sun.com/jsf/html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Keurig Portal</title>
</head>
<body>
<center><p> <h3> KEURIG PORTAL </h3></p></center>
     <form align = "left" method="link" action="login.jsp">
    <input type="submit" value="Logout"/>
</form>
<center> 
<img src="KeurigPortalImage.jpg" width="20%" height="100" alt="Test tool">
</center>
<br>
</br>
<body style="font-family:sans-serif">


<div style="width:33%;border:1px solid black;float:left">
<h4>
<center> Knowledge Repository</center>
</h4>

<c:forEach var="item" items="${uinterface.knowledge}">
<div style="border:1px solid #d7712b;background-color:#efebfc;margin:20px;">
	<img src="img.jpg" alt="img" style="padding:10px;border:3px solid #d7712b;background-color:#f8d7cd;">
	${item}
</div>
</c:forEach>
</div>

<div style="width:33%;border:1px solid black;float:left">

<h4>

<center> Appreciation of the Month </center>
</h4>
 <c:forEach var="item" items="${uinterface.appreciation}">
<div style="border:1px solid #d7712b;background-color:#efebfc;margin:20px;">
	<img src="img.jpg" alt="img" style="padding:10px;border:3px solid #d7712b;background-color:#f8d7cd;">
   ${item}
</div>
</c:forEach>
</div>

<div style="width:33%;border:1px solid black;float:left">
<h4>
<center>Star of the Month</center>
</h4>
 <c:forEach var="item" items="${uinterface.star}">
<div style="border:1px ssolid #d7712b;background-color:#efebfc;margin:20px;">
	<img src="img.jpg" alt="img" style="padding:10px;border:3px solid #d7712b;background-color:#f8d7cd;">
   ${item}
</div>
</c:forEach>
</div>  


<div style="width:33%;border:1px solid black;float:left">
<h4>
<center> Learning of the Month </center>
</h4>
 <c:forEach var="item" items="${uinterface.learning}">
<div style="border:1px solid #d7712b;background-color:#efebfc;margin:20px;">
	<img src="img.jpg" alt="img" style="padding:10px;border:3px solid #d7712b;background-color:#f8d7cd;">
   ${item}
</div>
</c:forEach>
</div>


<div style="width:33%;border:1px solid black;float:left">
<h4>
<center> Events</center>
</h4>

<c:forEach var="item" items="${uinterface.events}">
<div style="border:1px solid #d7712b;background-color:#efebfc;margin:20px;" >
	<img src="img.jpg" alt="img" style="padding:10px;border:3px solid #d7712b;background-color:#f8d7cd;">
	${item}
</div>
</c:forEach>
</div>


<div style="width:33%;border:1px solid black;float:left">
<h4>
<center> Active Projects</center>
</h4>

<c:forEach var="item" items="${uinterface.activeProjects}">
<div style="border:1px solid #d7712b;background-color:#efebfc;margin:20px;" >
	<img src="img.jpg" alt="img" style="padding:10px;border:3px solid #d7712b;background-color:#f8d7cd;">
	${item}
</div>
</c:forEach>
</div>


<div style="width:33%;border:1px solid black;float:left">
<h4>
<center>Testing Tools</center>
</h4>

<c:forEach var="item" items="${uinterface.testingTools}">
<div style="border:1px solid #d7712b;background-color:#efebfc;margin:20px;" >
	<img src="img.jpg" alt="img" style="padding:10px;border:3px solid #d7712b;background-color:#f8d7cd;">
	${item}
</div>
</c:forEach>
</div>







<div style="width:33%;border:1px solid black;float:left">
<h4>
<center>Domain Areas</center>
</h4>

<c:forEach var="item" items="${uinterface.domains}">
<div style="border:1px solid #d7712b;background-color:#efebfc;margin:20px;" >
	<img src="img.jpg" alt="img" style="padding:10px;border:3px solid #d7712b;background-color:#f8d7cd;">
	${item}
</div>
</c:forEach>


</div>
<div style="width:33%;border:1px solid black;float:left">
<h4>
<center> Types of testing </center>
</h4>
 <c:forEach var="item" items="${uinterface.testing}">
<div style="border:1px solid #d7712b;background-color:#efebfc;margin:20px;">
	<img src="img.jpg" alt="img" style="padding:10px;border:3px solid #d7712b;background-color:#f8d7cd;">
${item}
</div>
</c:forEach>
</div>


<div style="width:33%;border:1px solid black;float:left">
<h4>
<center>Packages</center>
</h4>
 <c:forEach var="item" items="${uinterface.packages}">
<div style="border:1px solid #d7712b;background-color:#efebfc;margin:20px;">
	<img src="img.jpg" alt="img" style="padding:10px;border:3px solid #d7712b;background-color:#f8d7cd;">
${item}
</div>
</c:forEach>
</div>    







</body>
</html>