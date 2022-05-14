<%@page import="pojo.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="program.StudentDataController" %>
<jsp:useBean id="obj" class="pojo.Student"></jsp:useBean>
<jsp:setProperty property="*" name="obj"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
<% 
	StudentDataController fetch=new StudentDataController();
	List<Student> lst=fetch.fetchAll();
	for(Student st:lst)
	{
		%>
		<h3><%= st.getName() %></h3>
		<p>
			Roll : <%= st.getRoll() %> <br/>
			Year of admission : <%= st.getAd_year() %> <br/>
			Course : <%= st.getCourse() %> <br/>
		</p>
		
		<table>
			<tr>
				<td>
				<form method="post" action="edit_student.jsp">
					<input type="hidden" name="H1" value="<%= st.getRoll() %>" />
					<input type="submit" name="B1" value="Edit" />
				</form>
				</td>
				<td>
				<form method="post" action="delete_student.jsp">
					<input type="hidden" name="H1" value="<%= st.getRoll() %>" />
					<input type="submit" name="B1" value="Delete" />
				</form>
		
				</td>
			</tr>
		</table>
		
		
		
		<%
	}

%>

</body>
</html>