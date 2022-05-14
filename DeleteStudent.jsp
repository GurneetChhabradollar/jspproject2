<%@ include file="a1.jsp" %>
<%@ page import="pojo.Student" %>
<%@ page import="program.StudentDataController" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="DeleteStudent1.jsp">
<p>Enter Student Id:<input type="text" name="T1"/></p>
<p>Enter Student Name:<input type="text" name="T2"/></p>
<p><input type="submit" value="delete" /></p>
</form>
<%@ include file="a2.jsp" %>