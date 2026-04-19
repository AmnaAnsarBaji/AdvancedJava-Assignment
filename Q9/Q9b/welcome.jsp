<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<title>Welcome</title>
</head>
<body>

<%
String name = request.getParameter("uname");
int min = Integer.parseInt(request.getParameter("time"));

session.setAttribute("user", name);

// convert minutes to seconds
session.setMaxInactiveInterval(min * 60);

out.print("<h2>Hello " + name + " !</h2>");
out.print("<br>Session started successfully.");
out.print("<br>Session Expiry Time = " + min + " minute(s)");
out.print("<br><br>Press below link within session time.");
%>

<br><br>

<a href="second.jsp">Check Session</a>

</body>
</html>