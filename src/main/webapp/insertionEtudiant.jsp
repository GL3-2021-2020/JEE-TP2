<%--
  Created by IntelliJ IDEA.
  User: Ahmed
  Date: 10/26/2020
  Time: 1:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert etudiant</title>
</head>

<body>
<form action="etudiantapi" method="post">
    <div>
        <label for="Name">Nom</label>
        <input id="Name" type="text" name="name">
    </div>
    <div>
        <label for="LastName">Prenom</label>
        <input id="LastName" type="text" name="lastName">
    </div>
    <button type="submit" >ajouter etudiant</button>
</form>
</body>
</html>