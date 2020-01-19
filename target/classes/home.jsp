<%@ page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html/>
<html>
<head>
    <title>Dodawanie konta</title>
</head>
<body>
 <h2>Dodawanie konta bankowego:</h2>
<form action="addAccount">
    Name: <input type="text" name="name"><br/>
    Password:<input type="password" name = "password"><br/>
    Balance: <input type ="number" name = "balance" step="0.01"><br/>
    <input type="submit" value="Wyślij">
</form>
</body>
</html>