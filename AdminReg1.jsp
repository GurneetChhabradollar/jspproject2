<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="pojo.Librarian" %>
<%@ page import="pojo.Logindata" %>
<%@ page import="program.AdminDataController" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
String p,q,r,s,t;
p=request.getParameter("T1");
q=request.getParameter("T2");
r=request.getParameter("T3");
s=request.getParameter("T4");
t=request.getParameter("T5");
Librarian lb=new Librarian();
Logindata lgn=new Logindata();
lb.setName(p);
lb.setContact(Integer.parseInt(q));
lb.setAddress(r);
lb.setEmail(s);
lgn.setUserid(s);
lgn.setPassword(t);
lgn.setUsertype("admin");
AdminDataController controller=new AdminDataController();
int aa=controller.saveData(lb,lgn);
String msg="Data not saved";
if(aa==1)
{
	msg="data saved successfully";
}
%>
<%= msg %>
</body>
</html>