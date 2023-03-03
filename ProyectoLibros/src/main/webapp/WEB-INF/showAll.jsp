<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Lista de libros</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	</head>
	
	<body>
		<h1 class="display-2">Todos los libros</h1>
		<div class="container">
			<div class="row">
				<div class="col">
					<table class="table table-bordered border-dark">
				<thead>
					<tr class="table-info">
						<th scope="col">Id</th>
						<th scope="col">Titulo</th>
						<th scope="col">Idioma</th>
						<th scope="col"># de Paginas</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${ListaLibros}" var="libro">
						<tr class="table-success">
							<th scope="col"><c:out value="${libro.id}"></c:out></th>
							<td class="table-success"><a href="/libros/${libro.id}"><c:out value="${libro.titulo}"></c:out></a></td>
							<td class="table-success"><c:out value="${libro.idioma}"></c:out></td>
							<td class="table-success"><c:out value="${libro.numeroDePaginas}"></c:out></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
				</div>
			</div>
		</div>
	
	</body>
</html>