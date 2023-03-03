<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Libros FrontEnd</title>
</head>
<body>
	<h1><c:out value="${Libro.titulo}"></c:out></h1>
	<h2>Descripción: <c:out value="${Libro.descripcion}"></c:out></h2>
	<h2>Idioma: <c:out value="${Libro.idioma}"></c:out></h2>
	<h2>Numero de paginas: <c:out value="${Libro.numeroDePaginas}"></c:out></h2>
</body>
</html>