<%
	//remove session if exists
	try
	{
		session=request.getSession(false); //use only existing session
		session.removeAttribute("userid");
		session.removeAttribute("usertype");
		session.invalidate();
		response.sendRedirect("Login.jsp");
	}
	catch(NullPointerException e)
	{
		response.sendRedirect("Login.jsp");
	}
%>