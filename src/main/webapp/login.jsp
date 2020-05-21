<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" session = "false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge" charset="utf-8">
        <title>Login</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <div class="all-content">
            <div class="centred">
                <form action="signIn" method="POST" style="padding-bottom: 30px;">
                    <p>Login:</p>
                    <input type="text" name="login" id="login" placeholder="Login">
                    <p>Password:</p>
                    <input type="password" name="password" id="password" placeholder="Password">
                    <input type="submit" value="Login">
                </form>       
            <c:if test="${wrongLoginOrPassword == true}"><p style="color: red;">Wrong login or <br> password!</p></c:if>            
            <c:if test="${successfulRegistration == true}"><p style="color: Lime;">You have successfully registred! Now log in!</p></c:if>
                <p style="margin-top: 25px;">Dont have account?</p>
                <a href="register.jsp"><button type="button">Register</button></a>
            </div>
        </div>
    </body>
</html>