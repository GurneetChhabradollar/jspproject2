<%@ include file="a1.jsp" %>
<%@ page import="pojo.Student" %>
<%@ page import="program.StudentDataController" %>

<% 
String p;
p=request.getParameter("T1");
int id=Integer.parseInt(p);
StudentDataController controller=new StudentDataController();
int aa=controller.deleteData(id);
String msg="Data Not Deleted";
if(aa==1)
{
	msg="Data Deleted Successfully";
}
%>
<%= msg %>
<%@ include file="a2.jsp" %>