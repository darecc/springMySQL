<%@page language ="java" isELIgnored="false" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Updated account</title>
</head>
<body>
<h2>Updated account:</h2>
<p>Name: ${name}</p>
<fmt:formatNumber type="currency" var="kwota" value="${amount}"/>
<p>Transaction value: ${amount} z"</p>
<p>Total money: ${updatedValue}  zł</p>
</body>
</html>