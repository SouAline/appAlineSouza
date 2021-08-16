<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<c:import url="/WEB-INF/jsp/menu.jsp"/>

  <div class=container>
  	<c:if test="${not empty mensagem}">
  		<div class="alert alert-info alert-dismissible fade in">
    		<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
    		<strong>O evento foi criado com sucesso!!!</strong>${mensagem}
 		 </div>
  	</c:if>
  	
  <h3><a href="/evento">Incluir um evento</a></h3>
 
  <c:if test="${not empty eventos}">
  	<h2>Agenda de Eventos: ${eventos.size()}</h2>

  <table class="table table-striped">
    <thead>
      <tr> 
      	<th>Id</th>
        <th>Nome do evento</th><!-- cabeçalho -->
      	<th>Valor do evento</th>
      </tr>
    </thead>
    
    <tbody>
    	<c:forEach var="evento" items="${eventos}">
      		<tr>
      			<td>${evento.id}</td>
        		<td>${evento.nome}</td><!-- linha -->
        		<td>${evento.valorIngresso}</td>
        		<td><a href= "/evento/${time.id}/excluir">Excluir</a><td>
        		<td><a href= "/evento/detalhar">Detalhar</a></td>
     		 </tr>
      	</c:forEach>
     </tbody>
  </table>
  </c:if>
  
  <c:if test="${empty eventos}">
  <h2>Agenda sem eventos até o momento</h2>
  </c:if>
 </div>
</body>
</html>
