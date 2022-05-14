<%@ include file="a1.jsp" %>
<%@ page import="pojo.Student" %>
<%@ page import="program.StudentDataController" %>

<%
String p;
p=request.getParameter("T1");
int a=Integer.parseInt(p);
StudentDataController controller=new StudentDataController();
Student st=controller.fetchBook(a);
%>
<h3>Details of Book</h3>
<form method="post" action="SubmitBook2.jsp">
<p>Book Id:<input type="text" value="<%= st.getBookid() %>" name="T2"/></p>
<p>Name:<input type="text" value="<%=  st.getBook_name() %>"  name="T3"/></p>
<p>Author:<input type="text" value="<%= st.getAuthor() %>"name="T4"/></p>
<p>Issue Date:<input type="text" value="<%= st.getIssue_date() %>" name="T4"/></p>
<p>Status:<input type="text" value="<%=st.getStatus()%>" name="T5"/></p>
<p>Change Status:<input type="text" name="T6"/></p>
<input type="hidden" name="H1" value="<%= st.getStid() %>"/>
<p><input type="submit" value="submit"/></p>
</form>
<%@ include file="a2.jsp" %>