<%@ page import="service.UserService" %>
<%--
  Created by IntelliJ IDEA.
  User: Xavier
  Date: 8/20/2017
  Time: 10:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.2/angular.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="../resources/js/app.js"></script>
    <title>HOME</title>
</head>
<body>
    <h2>HOWDY YALL!!!!!!!!!!!!!</h2>
    <h3>BEFORE THE EXAMPLE</h3>
    <div ng-app="myApp" ng-controller="HelloController" >
        <h2>Welcome {{name}} to the world of Tutorialspoint!</h2>
    </div>
    <h3>AFTER THE EXAMPLE</h3>
</body>
</html>
