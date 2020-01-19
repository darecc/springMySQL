<%@ page import="dc.springh2.PrivateAccount" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List" %>
<%@page language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Konta</title>
</head>
<body>
<h2>Lista kont</h2>
<c:set var="konta" value="${accounts}"/>
<c:forEach items="${konta}" var="item">
<p>${item}</p>
</c:forEach>
<ul>
<c:forEach items="${konta}" var="item">
    <li>Name: ${item.getName()} , balance: ${item.getBalance()} zł</li>
</c:forEach>
</ul>
</body>
</html>