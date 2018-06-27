<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>LoginPage</title>
        <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>" type="text/css">
        <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.css"/>" type="text/css"/>
        <link rel="stylesheet" href="<c:url value="/resources/css/logincss.css"/>" type="text/css"/>

        <!-- jQuery library -->
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <!-- Latest compiled JavaScript -->
        <script type="text/javascript" src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>

    <body>
        <h2>Administrator Login</h2>

        <form action="login" method="post"  id="validateForm" name="validateForm">
            <div class="container">
                <div>
                    <label for="aname"><b>Username</b></label>
                    <input type="text" placeholder="Enter Name" name="username" maxlength="40" autofocus>
                </div>
                <div>
                    <label for="psw"><b>Password</b></label>
                    <input type="password" placeholder="Enter Password" name="password">
                </div>
                <div id="submitLogin">
                    <button type="submit">Login</button>
                </div>
            </div>
        </form>
    </body>
</html>