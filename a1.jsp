<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>

<script type="text/javascript" src="js/bootstrap.js"></script>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css"/>
<script type="text/javascript" src="js/jquery.js"></script>


<style>
.header
{
	border:1px solid #000;}
.bgimg
{
	background:#069;
	min-height:400px;
	background-size:100% 100%;}

.text1,.text2
{
	border:1px solid #000;}
</style>
<script>
	$(document).ready(function(e)
	{		
		$("#b1").click(function(e)
				{
					$("#sub1").slideToggle(1000);		
				});
		$("#b").click(function(e)
				{
					$("#collnav").slideToggle(1000);		
				});
	});
	

</script>
<script>
	$(document).ready(function(e)
	{
		$("#b2").click(function(e)
				{
					$("#sub2").slideToggle(1000);
				});
		$("#b").click(function(e)
				{
					$("collnav").slideToggle(1000);
				});
	});
</script>
<script>
	$(document).ready(function(e) {
        $("#c1").click(function(e) {
            $("#dd1").slideToggle(1000);
        });

	$("#b").click(function(e) {
            $("#collnav").slideToggle(1000);
        });
    });
	
</script>
<%
	//check the session of user
	try
	{
		session=request.getSession(false);
		String ut=session.getAttribute("usertype").toString();
		if(ut.equalsIgnoreCase("admin")==false)
		{
			response.sendRedirect("AuthError.jsp");
		}
	}
	catch(NullPointerException e)
	{
		response.sendRedirect("AuthError.jsp");
	}
%>

</head>

<body>
<div class="container-fluid header bg-info">
<h1 class="text-center text-dark font-weight-bold jumbotron bg-info">Administration Block</h1>
</div>
<button class="navbar-toggler" id="b">
    	<span class="navbar-toggler-icon"></span>
    </button>
<nav class="navbar navbar-expand-md bg-dark navbar-primary" style="margin-top:-32px;" >
	<a href="#" class="navbar-brand text-primary font-weight-bold">MY Kota.com</a>
	<div class="collapse navbar-collapse" id="collnav">
    <ul class="navbar-nav text-center">
        <li class="nav-item"><a href="AdminHome.jsp" class="nav-link">Home</a></li>
        <li class="nav-item"><a href="Profile.jsp" class="nav-link">Profile</a></li>
        <li class="nav-item dropdown"><a href="#" class="nav-link dropdown-toggle" id="b1">Books</a>
        <ul class="dropdown-menu text-center" id="sub1">
            	<li><a href="IssueBook.jsp" class="dropdown-item active" >Issue Books</a></li>
            	<li><a href="SubmitBook.jsp" class="dropdown-item">Submit Book</a></li>
            	<li><a href="CheckStatus.jsp" class="dropdown-item">Check Status</a></li>
            </ul>
         </li>
        <li class="nav-item dropdown" ><a  href="#" class="nav-link dropdown-toggle" id="b2">Student</a>
            <ul class="dropdown-menu text-center" id="sub2">
            	<li><a href="ShowStudent.jsp" class="dropdown-item active">Show Student</a></li>
            	<li><a href="DeleteStudent.jsp" class="dropdown-item" >Delete Student</a></li>
            </ul>
        </li>
         
        <li class="nav-item"><a href="Logout.jsp" class="nav-link">Logout</a></li>
    </ul>
</div>
</nav>
<div class="container-fluid">