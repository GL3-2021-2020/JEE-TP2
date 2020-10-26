<%@ page contentType="text/html;charset=UTF-8" %>
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
    <button type="submit">ajouter etudiant</button>
</form>
</body>
</html>