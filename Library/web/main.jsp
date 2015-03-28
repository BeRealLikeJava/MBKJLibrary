<%-- 
    Document   : main
    Created on : 2015-03-28, 16:58:38
    Author     : mateusz
--%>

<%@page import="models.Visitor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Visitor visitor = (Visitor)request.getAttribute("loggedUser");
            %>
            <h1>Hello <%=visitor.getName() %></h1>
    </body>
</html>
