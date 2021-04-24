<%-- 
    Document   : index.jsp
    Created on : 21 abr. 2021, 9:02:34
    Author     : danie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Ejercicio 6</title>
    <meta name="color-scheme" content="dark">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
  </head>
  <body>
    
    <div class="container">
      <form class="form" action="#">
        <h1>Escriba los Euros que quiere convertir a Pesetas</h1>
        <!--label class="labelName">Escriba su nombre</label-->
        <input type="number" class="inputNota" name="pesetas" value="" placeholder="Pesetas" autocomplete="off" step="0.001">
        <output id="output" placeholder>Euros</output>
        <input type="submit">
      </form>

<%
  String[] params = {
    request.getParameter("pesetas")
  };
  
  final double PesetasPorEuro = 166.386;
  
  boolean PARAMS_NOT_NULL = true;
  
  // Comprobar si alguno de los parámetros es nulo
  for(String param : params) {
    if(param == null) {
      PARAMS_NOT_NULL = false;
      break;
    }
  }

  if(PARAMS_NOT_NULL) {
    double pesetas = Double.parseDouble( params[0] );
    
    double eurosResult = pesetas / PesetasPorEuro;

%>    
 
<script>
  //const container = document.querySelector('.container');
  //container.innerHTML = "";
  let output = document.querySelector('#output');
  output.removeAttribute('placeholder');
  output.innerHTML = <%= eurosResult %> + " Euros";

  document.querySelector('[name="pesetas"]').value = <%= pesetas %>;

</script>

<%
  }
%>
      
    </div>
  </body>
</html>
