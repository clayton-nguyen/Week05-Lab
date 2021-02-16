<%-- 
    Document   : login
    Created on : Feb 9, 2021, 8:13:09 AM
    Author     : 809882
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        
        <h1>Login</h1>
        
        <form method="post" action="login">
        <p>Username:  <input type="text" name="usernameField" value="${username}"> </p>
        
        <p>Password:  <input type="password" name="passwordField" value="${password}"> </p>
        
        <input type="submit" value="Log in">
            
        </form>
    </body>
</html>
