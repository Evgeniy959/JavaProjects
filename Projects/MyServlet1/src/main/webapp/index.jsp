<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.util.List" %>
<%@ page import="com.mycompany.myservlet1.User" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>First JSP</title>
</head>
<body>
<h1>Hello JSP</h1>
<%
    response.getWriter().write("First message");
    response.getWriter().print("right here, after header");
%>
<br/>
<%=request.getRequestURI()%>
<br>
<%=LocalDateTime.now()%>
<hr/>

</body>
</html>
