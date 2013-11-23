<%--
  Created by IntelliJ IDEA.
  User: vacax
  Date: 11/23/13
  Time: 10:24 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title>Hola Mundo desde Grails</title>
</head>
<body>
Hola Mundo desde Grails
<g:each in="${listaEstudiante}" var="est">
      <p>${est.nombre}</p>
</g:each>
</body>
</html>