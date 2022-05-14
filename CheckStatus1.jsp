<%@ include file="a1.jsp" %>
<%@ page import="pojo.Student" %>
<%@ page import="program.StudentDataController"%>
<%  
String p;
p=request.getParameter("T1");
int id=Integer.parseInt(p);
StudentDataController controller=new StudentDataController();
Student st=controller.fetchBook(id);
%>
<p>Status:<input type="text" value="<%= st.getStatus() %>"/></p>
<%@ include file="a2.jsp" %>