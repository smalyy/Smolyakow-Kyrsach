<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" session = "false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge" charset="utf-8">
        <title>Register</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <div class="all-content">
            <div class="centred">
                <form action="signUp" method="POST" style="padding-bottom: 30px;" accept-charset="utf-8">
                    <p>Login:</p>
                    <input required type="text" name="login" id="login" placeholder="Login">
                    <p>Password:</p>
                    <input required type="password" name="password" id="password" placeholder="Password">
                    <p>Repeat password:</p>
                    <input required type="password" name="repeatPassword" id="repeatPassword" placeholder="Repeat password">
                    <p>eMail:</p>
                    <input required type="email" name="eMail" id="eMail" placeholder="eMail">
                    <p>Phone number (+380XXXXXXXXX):</p>
                    <input required type="tel" name="phoneNumber" id="phoneNumber" placeholder="Phone number" onkeyup="this.value = this.value.replace (/[^0-9+]/g, '')" maxlength="13">
                    <p>Name:</p>
                    <input required type="text" name="firstName" id="firstName" placeholder="Name">
                    <p>Surname:</p>
                    <input required type="text" name="secondName" id="secondName" placeholder="Surname">
                    <input type="submit" value="Register">
                </form>
                <p>Already have account?</p>
                <a href="login.jsp"><button type="button">Login</button></a>
            </div>
            <c:if test="${passwordMismatch == true}"><p style="color: red;">Passwords mismatch!</p></c:if>
            <c:if test="${eMailExist == true}"><p style="color: red;">eMail is already in use!</p></c:if>
            <c:if test="${phoneNumberExist == true}"><p style="color: red;">Phone number is already in use!</p></c:if>
            <c:if test="${userExist == true}"><p style="color: red;">A user with this login already exists!</p></c:if>
            <c:if test="${successfulRegistration == true}"><p style="color: Lime;">You have successfully registered!</p></c:if>
            <c:if test="${passwordLength == true}"><p style="color: red;">Password must be at least 6 characters!</p></c:if>
            <c:if test="${loginLength == true}"><p style="color: red;">Login must be at least 4 characters!</p></c:if>
            <c:if test="${eMailNotValid == true}"><p style="color: red;">eMail not valid!</p></c:if>
            <c:if test="${phoneNumberNotValid == true}"><p style="color: red;">Phone number not valid!</p></c:if>
        </div>
    </body>
</html>