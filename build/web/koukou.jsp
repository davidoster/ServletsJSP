<%-- 
    Document   : koukou
    Created on : Dec 7, 2020, 12:22:17 PM
    Author     : George.Pasparakis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>this.i  = <%=  this.i %> - (100)</p>
        <% int i = 5; %>
        <p>local i = <%= i %> (100 or 5?)</p>
        <h1>Hello World!</h1>
        <%! int i = 100; %>
        <button onclick="<% if(i == 100) out.print("myButtonClick()"); %>">Click Me</button>
        
        <script>
            function myButtonClick() { alert("KOUKOU");}
        </script>
    </body>
</html>
