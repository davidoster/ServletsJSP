<%-- 
    java comment
    Document   : xyz
    Created on : Dec 7, 2020, 11:25:39 AM
    Author     : George.Pasparakis
--%>

<!-- html comment -->
<%@page import="models.MyClass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>Class variable i has the value of: <%= this.i %> (it must be 20)</p>
        <h1>Hello World!</h1>
        <div class="myclass" id="myclass">
        <% 
            MyClass myClass = new MyClass(); 
            myClass.getName();
            int k = 30;
            int i = 100;
        %>
        <h1><% out.print(myClass.getName()); %></h1>
        <h1><%= myClass.getName() %></h1>
        <p><%= myClass %></p>
        <%! int i = 20; %>
        The value of i = <%= i %>
        <% int j = i + 20; %><br />
        The value of j = <%= j %>
        
        <% 
            myClass.setCount(10);
            myClass.setName("A Class Name");
            myClass.setPrice(10.0f);
        %>
        <p><%= myClass %></p>
        <h1><%= myClass.getName() %></h1>
        </div>
    </body>
</html>
