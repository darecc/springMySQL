<%@page language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Display account</title>
</head>
<body>
<h2>Deleted account:</h2>
<p>Name: ${name}</p>
<fmt:formatNumber type="currency" var="kwotaSformatowana" value="${balance}"/>
<p>Saved money: ${kwotaSformatowana}</p>
</body>
</html>