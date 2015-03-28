<%-- 
    Document   : index
    Created on : 2015-03-28, 15:55:44
    Author     : mateusz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book Library</title>
    </head>
    <body>
            <%
                if(request.getAttribute("error") != null)
                {
            %>
            <div class="error">
                <p>
                    <%=request.getAttribute("error") %>
                </p>
            </div>
            <%
                }
            %>
        <div id="login_container">
            <form method="POST" action="LoginController">
                <input type="text" name="login"/>
                <input type="password" name="password" />
                <input type="submit" name="login_submit" value="Zaloguj"/>
            </form>
        </div>
    </body>
</html>
