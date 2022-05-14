<%@ include file="a1.jsp" %>
<%@ page import="pojo.Librarian" %>
<%@ page import="pojo.Logindata" %>
<%@ page import="program.AdminDataController" %>
<%
AdminDataController controller=new AdminDataController();
Librarian lb=controller.fetchLibrarian();
%>
<h1>Details</h1>
<p>Name: <%= lb.getName() %></p>
<p>Contact: <%= lb.getContact() %></p>
<p>Email: <%= lb.getEmail() %></p>
<p>Address: <%= lb.getAddress() %></p>
<%@ include file="a2.jsp" %>