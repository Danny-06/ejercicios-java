<%-- 
    Document   : index.jsp
    Created on : 21 abr. 2021, 9:02:34
    Author     : danie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Ejercicio 7</title>
    <meta name="color-scheme" content="dark">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
  </head>
  <body>

    <div class="container">
      <form class="form" action="#">
        <h1>Eliga el método de conversión que desea realizar</h1>
        <!--label class="labelName">Escriba su nombre</label-->
        <input type="number" class="input" name="input" value="" placeholder="Cantidad" autocomplete="off" step="0.001">

        <select name="metodoConversion">
          <option value="Euros a Pesetas">Euros a Pesetas</option>
          <option value="Pesetas a Euros">Pesetas a Euros</option>
        </select>

        <output id="output" placeholder>Resultado</output>
        <input type="submit">
      </form>

<%
  String[] params = {
    request.getParameter("input"),
    request.getParameter("metodoConversion")
  };

  final double PesetasPorEuro = 166.386;
  
  String tipoMoneda = "";

  boolean PARAMS_NOT_NULL = true;

  // Comprobar si alguno de los parámetros es nulo
  for(String param : params) {
    if(param == null) {
      PARAMS_NOT_NULL = false;
      break;
    }
  }

  if(PARAMS_NOT_NULL) {
    double input = Double.parseDouble( params[0] );
    String metodoConversion = params[1];

    double result = 0;
    if( metodoConversion.equals("Euros a Pesetas") ) {
      // Euros a Pesetas
      result = input * PesetasPorEuro;
      tipoMoneda = "Pesetas";
    } else if( metodoConversion.equals("Pesetas a Euros") ) {
      // Pesetas a Euros
      result = input / PesetasPorEuro;
      tipoMoneda = "Euros";
    }
%>

<script>
  //const container = document.querySelector('.container');
  //container.innerHTML = "";
  let output = document.querySelector('#output');
  output.removeAttribute('placeholder');
  
  let tipoMoneda; // Resultado de moneda
  //debugger;
  let select = document.querySelector('select');
<% 
  if( tipoMoneda.equals("Euros") ) {
%>
    tipoMoneda = "Euros";
    select.value = "Pesetas a Euros";
<%
  }
%>
  
  output.innerHTML = <%= result %> + " <%= tipoMoneda %>";

  document.querySelector('[name="input"]').value = <%= input %>;

</script>

<%
  }
%>
      
    </div>
  </body>
</html>
