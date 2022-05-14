<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="pojo.LoginData" %>
<%@ page import="program.Login" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
try
	{
	  String u,p;
	  u=request.getParameter("T1");
	  p=request.getParameter("T2");
	  Login l=new Login();
	  LoginData lgn=l.FetchOne(u);
	  String ut=lgn.getUsertype();
	  session=request.getSession();
	  session.setAttribute("userid",u);
	  session.setAttribute("usertype",ut);
	  if(ut.equalsIgnoreCase("admin"))
	  {
	  		response.sendRedirect("Adminhome1.jsp");
	  }
	  else if(ut.equalsIgnoreCase("accountant"))
	  {
	  		response.sendRedirect("Accounthome1.jsp");
	  }
	}
catch(NullPointerException e)
	{
		out.println("Invalid user id or password");	
	}
%>
</body>
</html>