<%--
  Created by IntelliJ IDEA.
  User: nnamdinwabuokei
  Date: 05/05/2020
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=ISO-8859-1" language="java" pageEncoding="ISO-8859-1" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="ISO-8859-1">
    <title>Sign-up Success</title>

    <link href="<c:url value="/resources/css/bootstrap.min.css"/> " rel="stylesheet">
<%--    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">--%>
</head>
<body>
<div class="container">
    <div class="col-md-offset-2 col-md-7">
        <h1>${message}</h1>
    <hr/>
    <table class="table table-striped table-bordered">
        <tr>
            <td><b>First Name</b>: ${user.firstName}</td>
        </tr>
        <tr>
            <td><b>Last Name</b>: ${user.lastName}</td>
        </tr>
        <tr>
            <td><b>Username</b>: ${user.username}</td>
        </tr>
        <tr>
            <td><b>Email</b>: ${user.email}</td>
        </tr>
    </table>
    </div>
</div>
<%--<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>--%>
<%--<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>--%>
<%--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>--%>
<script src="<c:url value="/resources/js/jquery-3.5.1.min.js"/> "></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</body>
</html>
