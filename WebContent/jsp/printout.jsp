<%@ page language="java" contentType="text/html; charset=ISO-8859-9"
    pageEncoding="ISO-8859-9"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-9">
<title>Insert title here</title>
</head>
<body>

<!-- session de�erlerini jsp dosyas�nda yazd�rd�k. -->

<%= session.getAttribute("name") %><br>
<%= session.getAttribute("address") %><br>
<%= session.getAttribute("phone") %><br>
<%= session.getAttribute("id") %><br>
<%= session.getAttribute("course") %>
</body>
</html>