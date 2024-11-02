<%@ page import="com.mycompany.bookmanager.model.Book" %>
<html>
<body>
<h2>Hello World!</h2>
<br>
<h2>Bbook</h2>
<%
    Book book = (Book) request.getAttribute("book");
%>
<h2>Books</h2>
<br>
<h3><%=book%></h3>
<%--<c:url value="/books" var="books"/>--%>
<%--<a href="${books}">Add new film</a>--%>
<br>
<a href="/books" target="_blank">List Book</a>
<br>
<a href="/book" target="_blank">Book</a>
</body>
</html>
