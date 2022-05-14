<%@ include file="a1.jsp" %>
<%@ page import="pojo.Student"%>
<%@ page import="program.StudentDataController" %>

<%
String p;
p=request.getParameter("H1");
int id=Integer.parseInt(p);
StudentDataController controller=new StudentDataController();
int aa=controller.submitBook(id);
String msg="Data Not Saved";
if(aa==1)
{
	msg="Data Saved Successfully";
}
%>
<%= msg %>
<%@ include file="a2.jsp" %>