<%-- 
    Document   : employeepage.jsp
    Created on : Aug 24, 2017, 6:31:57 AM
    Author     : kasper
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee home page</title>
    </head>
    <body>
        

        <h1>Hello ${sessionScope.email} </h1>



        You are now logged in as a EMPLOYEE of our wonderful site.

        Vis Kundeliste
        <form name="userList" action="FrontController" method="POST">
            <input type="hidden" name="taget" value="oversigt">
            <input type="submit" value="Brugerlist">
        </form>
        Opret Employee
        <form name="registers" action="FrontController" method="POST">
            <input type="hidden" name="taget" value="registerEmp">
            Email:<br>
            <input type="text" name="email" value="">
            <br>
            Password:<br>
            <input type="password" name="password1" value="">
            <br>
            Retype Password:<br>
            <input type="password" name="password2" value="">
            <br>
            <input type="submit" value="Submit">
        </form>

        Slet Bruger
        <form name="registers" action="FrontController" method="POST">
            <input type="hidden" name="taget" value="sletBruger">
            Email:<br>
            <input type="text" name="email" value="">
            <br>
            <input type="submit" value="Submit">
        </form>

        Change password
        <form name="registers" action="FrontController" method="POST">
            <input type="hidden" name="taget" value="ChangePassword">
            Email:<br>
            <input type="text" name="email" value="">
            <br>
            Password:<br>
            <input type="text" name="password" value="">
            <br>
            <input type="submit" value="Submit">
        </form>




    </body>
</html>
