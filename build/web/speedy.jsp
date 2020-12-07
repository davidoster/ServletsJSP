<%-- 
    Document   : speedy
    Created on : Dec 7, 2020, 4:08:57 PM
    Author     : George.Pasparakis
--%>

<%@page import="models.MyClass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Speedy</title>
    </head>
    <body>
        <h1>Speedy World!</h1>
       
        <% MyClass kkk = (MyClass)request.getAttribute("classData"); %>
        <%= kkk %>
    </body>
</html>
