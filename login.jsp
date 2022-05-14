<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
	#f1
	{
	 	width:400px;
	 	border:2px solid black;
	 	padding:10px;
	 	margin-top:10px;
	
	}
</style>

</head>
<body>
<form  id="f1" method="post" action="checklogin.jsp">
	<table border="0" cellspacing="10" width="100%">
	<tr>
	<td>Userid</td><td><input type="text" name="T1" /></td>
	</tr>
	<tr>
	<td>Password</td><td> <input type="text" name="T2"/></td>
	</tr>
	<tr>
	<th colspan="1"><input type="submit" name="B1" value="Login"/></th>
	</tr>
	</table>
</form>
</body>
</html>