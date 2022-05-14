<%@ include file="a1.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="pojo.Student" %>
<%@ page import="program.StudentDataController" %>
<%@ page import="pojo.Fee" %>
<%
String p,q;
p=request.getParameter("H1");
q=request.getParameter("H2");
int a=Integer.parseInt(p);
int b=Integer.parseInt(q);
StudentDataController controller=new StudentDataController();
Student st=new Student();
st=controller.fetchData(a);
Fee f1=new Fee();
f1=controller.fetchFee(b);

%>
<h3>Details of <%= st.getName() %></h3>
<p>Student Id:<%= st.getStid() %></p>
<p>Branch:<%= st.getBranch() %></p>
<p>Book Issued:<%= st.getBook_name() %></p>
<p>Book Id:<%= st.getBookid() %></p>
<p>Author:<%= st.getAuthor() %></p>
<p>Status:<%= st.getStatus() %></p>
<p>Issue Date:<%= st.getIssue_date() %></p>
<p>Transaction ID:<%= f1.getTid() %></p>
<p>Fees:<%= f1.getFees() %></p>
<%@ include file="a2.jsp" %>