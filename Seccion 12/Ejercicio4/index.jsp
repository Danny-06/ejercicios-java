<%-- 
    Document   : index.jsp
    Created on : 21 abr. 2021, 9:02:34
    Author     : danie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Ejercicio 4</title>
    <meta name="color-scheme" content="dark">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
  </head>
  <body>
    

    
    <div class="container">
      <form class="form" action="#">
        <h1>Escriba 3 notas para calcular la media</h1>
        <!--label class="labelName">Escriba su nombre</label-->
        <input type="number" class="inputNota" name="nota1" value="" placeholder="Nota 1" autocomplete="off">
        <input type="number" class="inputNota" name="nota2" value="" placeholder="Nota 2" autocomplete="off">
        <input type="number" class="inputNota" name="nota3" value="" placeholder="Nota 3" autocomplete="off">
        <output id="output" placeholder>Resultado</output>
        <input type="submit">
      </form>

<%
  String[] params = {
    request.getParameter("nota1"),
    request.getParameter("nota2"),
    request.getParameter("nota3")
  };
  
  boolean NOT_NULL = true;
  
  // Comprobar si alguno de los parámetros es nulo
  for(String param : params) {
    if(param == null) {
      NOT_NULL = false;
      break;
    }
  }

  if(NOT_NULL) {
    double nota1 = Double.parseDouble( params[0] );
    double nota2 = Double.parseDouble( params[1] );
    double nota3 = Double.parseDouble( params[2] );

%>    
 
<script>
  //const container = document.querySelector('.container');
  //container.innerHTML = "";
  let output = document.querySelector('#output');
  output.removeAttribute('placeholder') ;
  output.innerHTML = <%= (nota1 + nota2 + nota3) / 3 %>;
  
  document.querySelector('[name="nota1"]').value = <%= nota1 %>;
  document.querySelector('[name="nota2"]').value = <%= nota2 %>;
  document.querySelector('[name="nota3"]').value = <%= nota3 %>;
   
</script>

<%
  }
%>
      
    </div>
  </body>
</html>
