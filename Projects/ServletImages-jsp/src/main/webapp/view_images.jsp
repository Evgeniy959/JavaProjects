<%@ page import="java.io.File" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Пользователь
  Date: 07.05.2024
  Time: 21:28
  To change this template use File | Settings | File Templates.
--%>
<!doctype html>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Image</title>
</head>
<body>
<h2>Select image to view</h2>
<form method='POST' action='Servlet2' >
    <select name='lImages'>
<%
    String[] dirList = (String[]) request.getAttribute("dirList");
    String savePath = (String)request.getAttribute("savePath");
    StringBuilder sbImage = (StringBuilder) request.getAttribute("sbImage");
    File f=null;
%>
<%
    for(String fname:dirList)
    {
        f=new File(savePath+File.separator+fname);
        if(!f.isFile())
            continue;
        out.println("<option>"+fname+"</option>");
    }
%>
    </select>
    <input type='submit' value='Show image'/>
</form>
<%--<img src='<%=sbImage.toString()%>'/>--%>
<%--<hr>--%>
<%--<a href="servlet2">Hello Servlet2</a>--%>
<%
    if (sbImage!=null)
    out.println("<img src='"+sbImage.toString()+"'/>");
%>
<hr>
<a href="servlet2">Hello Servlet2</a>
<h4>The image is presented by Servlet2 at <%=request.getContextPath()%></h4>
<%--out.println("<h4>The image is presented by Servlet2 at " + request.getContextPath() +--%>
<%--    "</h4>");--%>
</body>
</html>
