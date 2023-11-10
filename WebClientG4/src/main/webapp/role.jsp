<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Liste des Rôles</title>
</head>
<body>

    <h1>Liste des Rôles</h1>

    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nom du Rôle</th>
            </tr>
        </thead>
        <tbody>
          
                <tr>
                    <td>${role.id}</td>
                    <td>${role.name}</td>
                </tr>
        
        </tbody>
    </table>
    <form action="RoleServlet"></form>

</body>
</html>