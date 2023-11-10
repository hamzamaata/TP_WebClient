<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Liste des Etudiants</title>
</head>
<body>

    <h1>Liste des Etudiants</h1>

    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Prénom</th>
                <th>Nom</th>
                <th>Numéro de téléphone</th>
            </tr>
        </thead>
        <tbody>
           
                <tr>
                    <td>${student.id}</td>
                    <td>${student.firstName}</td>
                    <td>${student.lastName}</td>
                    <td>${student.phoneNumber}</td>
                </tr>
        </tbody>
    </table>
    <form action="StudentServlet"></form>

</body>
</html>