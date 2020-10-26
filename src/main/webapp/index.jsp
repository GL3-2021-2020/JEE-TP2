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
    <title>Insert Title Here</title>
</head>

<body>
<form action="./vue.jsp" method="post">
    <div>
        <label for="nbLig">Number of lines:</label>
        <input id="nbLig" type="number" name="nbLig">
    </div>
    <div>
        <label for="nbCol">Number of Cols:</label>
        <input id="nbCol" type="number" name="nbCol">
    </div>
    <input type="submit" value="submit">

</form>
</body>
</html>