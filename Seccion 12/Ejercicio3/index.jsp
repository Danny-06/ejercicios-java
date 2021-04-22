<%-- 
    Document   : index.jsp
    Created on : 21 abr. 2021, 9:02:34
    Author     : danie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Ejercicio 3</title>
    <meta name="color-scheme" content="dark">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
  </head>
  <body>

    <div class="container">
      <form class="form" action="">
        <h1>Escriba su nombre</h1>
        <!--label class="labelName">Escriba su nombre</label-->
        <input type="text" class="inputName" name="name" placeholder="Ej: Daniel" autocomplete="off" required>
        <input type="submit">
      </form>

      <%
  String name = request.getParameter("name");
  if(name != null) {
%>    

<script>
  const container = document.querySelector('.container');
  container.innerHTML = "";

  let result = document.createElement('h1');
  result.className = "result";
  result.innerHTML =
  `Tu nombre es <%= name %>,
  aunque eso ya lo sabías
  `;
 
  container.append(result);
  
</script>

<%
  }
%>
      
    </div>
  </body>
</html>
