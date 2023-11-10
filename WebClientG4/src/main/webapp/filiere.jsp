<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Liste des Filieres</title>
</head>
<body>


    <h1>Liste des Filieres</h1>

    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Code</th>
                <th>Nom</th>
            </tr>
        </thead>
        <tbody>
            
                <tr>
                    <td>${filiere.id}</td>
                    <td>${filiere.code}</td>
                    <td>${filiere.name}</td>
                </tr>
           
        </tbody>
    </table>
    <form action="FiliereServlet"></form>
   

</body>
</html>