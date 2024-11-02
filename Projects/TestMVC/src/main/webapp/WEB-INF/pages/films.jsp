<%@ page import="com.mycompany.testmvs.model.Film" %><%--
  Created by IntelliJ IDEA.
  User: Пользователь
  Date: 07.06.2024
  Time: 21:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Film</title>
</head>
<body>
<%
    Film film = (Film) request.getAttribute("film");
%>
<h3><%=film%></h3>
<h2><a href="/edit" target="_blank">edit page</a></h2>
<br>
<h3>Films</h3>
<h2><a href="/films" target="_blank">List films</a></h2>
<br>
<h3>Books</h3>
<h2><a href="/books" target="_blank">List books</a></h2>
</body>
</html>
