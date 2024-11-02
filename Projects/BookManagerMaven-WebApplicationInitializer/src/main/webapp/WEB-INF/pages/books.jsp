<%@ page import="com.mycompany.bookmanager.model.Book" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Пользователь
  Date: 04.06.2024
  Time: 1:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Books</h2>
<%
    List<Book> listBooks = (List<Book>) request.getAttribute("listBooks");
%>
<h2>Books</h2>
<br>
<h3><%=listBooks.get(1)%></h3>
<%--<table>--%>
<%--    <tr>--%>
<%--        <th>id</th>--%>
<%--        <th>title</th>--%>
<%--        <th>Author</th>--%>
<%--        <th>price</th>--%>
<%--        <th>action</th>--%>
<%--    </tr>--%>
<%--    <c:forEach var="book" items="${listBooks}">--%>
<%--        <tr>--%>
<%--            <td>${book.id}</td>--%>
<%--            <td>${book.bookTitle}</td>--%>
<%--            <td>${book.bookAuthor}</td>--%>
<%--            <td>${book.price}</td>--%>
<%--            <td>--%>
<%--                <a href="/edit/${book.id}">edit</a>--%>
<%--                <a href="/delete/${book.id}">delete</a>--%>
<%--            </td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
<%--</table>--%>

<%--<h2>Add</h2>--%>
<%--<c:url value="/add" var="add"/>--%>
<%--<a href="${add}">Add new film</a>--%>
</body>
</html>
