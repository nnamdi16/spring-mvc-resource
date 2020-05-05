<%--
  Created by IntelliJ IDEA.
  User: nnamdinwabuokei
  Date: 05/05/2020
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=ISO-8859-1" language="java" pageEncoding="ISO-8859-1" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Spring MVC 5 - form handling | Spring Training</title>
    <link href="<c:url value="/resources/css/main.css"/>" rel="stylesheet">    <link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">
<%--    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">--%>
</head>
<body>
    <div class="container">
        <div class="col-md-offset-2 col-md-7">
            <h2 class="text-center">Spring MVC 5 form Handling Examples - Sign up Form </h2>
            <div class="card">
                <div class="card-header">
                    <div class="card-title">Sign up Form</div>
                </div>
                <div class="card-body">
                  <form:form action="saveSignUpForm" cssClass="form-horizontal" modelAttribute="showSignUpForm" method="post">
                      <div class="form-group">
                          <label for="firstName" class="col-md-3 custom-control-label">
                              First Name
                          </label>
                          <div class="col-md-9">
                              <form:input path="firstName" cssClass="form-control"/>
                          </div>
                      </div>
                      <div class="form-group">
                          <label for="lastName" class="col-md-3 custom-control-label">Last Name</label>
                          <div class="col-md-9">
                              <form:input path="lastName" cssClass="form-control"/>
                          </div>
                      </div>

                      <div class="form-group">
                          <label for="lastName" class="col-md-3 custom-control-label">Username</label>
                          <div class="col-md-9">
                              <form:input path="username" cssClass="form-control"/>
                          </div>
                      </div>

                      <div class="form-group">
                          <label for="lastName" class="col-md-3 custom-control-label">Password</label>
                          <div class="col-md-9">
                              <form:input path="password" cssClass="form-control"/>
                          </div>
                      </div>

                      <div class="form-group">
                          <label for="lastName" class="col-md-3 custom-control-label">Email</label>
                          <div class="col-md-9">
                              <form:input path="email" cssClass="form-control"/>
                          </div>
                      </div>
                      <div class="form-group">
                          <div class="col-md-offset-3 col-md-9">
                              <form:button cssClass="btn btn-primary">Submit</form:button>
                          </div>
                      </div>
                  </form:form>
                </div>
            </div>
        </div>
    </div>
<%--    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>--%>
<%--    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>--%>
<%--    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>--%>
<script src="<c:url value="/resources/js/jquery-3.5.1.min.js"/> "></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</body>
</html>
