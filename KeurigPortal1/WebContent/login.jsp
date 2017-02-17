<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="res/js/jquery-3.1.1.min.js"></script>
<script src="res/bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="res/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="res/css/clp1.css"/>

<title>Login</title>

<style type="text/css">
	.mybckg{
	background: url("4.jpg")  no-repeat center center fixed;
	width: 100%;
	height:650px;
	background-repeat: no-repeat;
	-webkit-background-size: cover;
	-moz-background-size: cover;
 	-o-background-size: cover;
 	background-size: cover; 
 	background-size: 100% 100%;              
	}
	.header{
 width:100%;
 height:150px;
 margin:0 auto;
 	background: #FDFDFD;	
	background: -webkit-linear-gradient(#ffffff, #C1CDC1);	
	background: -o-linear-gradient(#ffffff, #C1CDC1);	
	background: -moz-linear-gradient(#ffffff, #C1CDC1);	
	background: linear-gradient(#ffffff, #C1CDC1);
}
	.jumbotron{
		background-color: #7ac7c7;
	}
</style>

</head>
<body>
	<center>
		<div class="mybckg">
			<div class="header">
			<div class="jumbotron" style="text-align:center; color: white">
				<h1>Keurig Account</h1>
				
				
			</div>
			<br>
			<br>
			<form action="LoginServlet1" method="get">
					<div class="loginPanel">
						<div class="line">
							<span class="glyphicon glyphicon-envelope" style="padding-top: 10px; padding-right: 20px;">Email</span>
							<input placeholder="Please enter emailid" class="input" name="un" type="text" required = true/>
							<div class="clear"></div>	
							<span style="color:red;" class="content_error"><s:property value="un"/></span>
						</div>
						<div class="line">
							<span class="glyphicon glyphicon-lock" style="padding-top: 10px; padding-right: 10px">Password</span>
							<input placeholder="please enter Password" class="input" name="pw" type="password"  required = true/>
							<div class="clear"></div>	
							<span style="color:red;" class="content_error"><s:property value="passwordMessage"/></span>
						</div>
						&nbsp;
							&nbsp;
							&nbsp;
							&nbsp;
						<div class="line">	
							<button id="mybutton" type="submit" class="btn btn-default btn-lg btn-info" style="color: white;"><span class="glyphicon glyphicon-ok"></span> Account Login</button>	
							<!-- <input type="submit" class="btn btn-default btn-lg btn-info glyphicon glyphicon-ok" value="Login" name="Login"/> -->			
							<!-- <input id="mybutton"  style="background: #bafffb;margin-left: 40%;margin-top: 14%;" class="submit" name="login" type="submit" value="login"/> -->	
						</div>
						
					</div>
				</form>
			</div>
		</div>
	</center>

<script>
    $(document).ready(function() {
      $('#mybutton').hide().delay(2000).fadeIn(2200);
});
    </script>
    <script>
    $(document).ready(function() {
      $('#mybutton2').hide().delay(3000).fadeIn(2200);
});
    </script>
    
    <script>
    $(document).ready(function() {
      $('#mybutton3').hide().delay(3000).fadeIn(2200);
});
    </script>
</body>
</html>