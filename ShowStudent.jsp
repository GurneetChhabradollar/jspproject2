<%@ include file="a1.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="program.StudentDataController" %>
<%@ page import="pojo.Student" %>
<%@ page import="pojo.Fee" %>
<%@ page import="java.util.List" %>

<%
StudentDataController controller=new StudentDataController();
List<Student> lst=controller.fetchAll();
for (Student st:lst )
{
	%>
	<h3><%=  st.getName()  %></h3>
	<p>Student Id:<%= st.getStid() %><br/>
	</p>
	<form method="post" action="ShowStudent1.jsp">
	<input type="hidden" name="H1" value="<%= st.getStid() %>"/>
	<% 
	List<Fee> lst1=controller.fetchFees();
	Fee f1=new Fee();
	for(int i=0;i<lst1.size();i++)
	{
		
		f1=lst1.get(i);
		if(f1.getStid()==st.getStid())
		{
			break;
		}
	}
	%>
	
	<input type="hidden" name="H2" value="<%= f1.getTid() %>"/>
	<input type="submit" value="Show"/>
	</form>
	<%
}


%>
<%@ include file="a2.jsp" %>