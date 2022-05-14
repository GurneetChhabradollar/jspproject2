<%@ include file="a1.jsp" %>
<%@ page import="pojo.Student" %>
<%@ page import="program.StudentDataController" %>
<%@ page import="pojo.Fee" %>
<%  
String p,q,r,s,t,u,v,w,x,y;
p=request.getParameter("T1");
q=request.getParameter("T2");
r=request.getParameter("T3");
s=request.getParameter("T4");
t=request.getParameter("T5");
u=request.getParameter("T6");
v=request.getParameter("T7");
w=request.getParameter("T8");
x=request.getParameter("T9");
y=request.getParameter("T10");
int a=Integer.parseInt(p);
int b=Integer.parseInt(u);
int c=Integer.parseInt(s);
int d=Integer.parseInt(x);
int e=Integer.parseInt(y);

Student st=new Student();
Fee f1=new Fee();

st.setBookid(a);
st.setBook_name(q);
st.setAuthor(r);
st.setIssue_date(System.currentTimeMillis());
st.setStatus(t);

st.setStid(b);
st.setName(v);
st.setBranch(w);
f1.setTid(d);
f1.setFees(e);
f1.setStid(b);
StudentDataController controller=new StudentDataController();
int aa=controller.issueBook(st,f1);
String msg="data not saved";
if(aa==1)
{
	msg="data saved successfully";
}
%>
<%= msg %>
<%@ include file="a2.jsp" %>