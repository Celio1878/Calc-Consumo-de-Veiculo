<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<title>Recebe</title>
	</head>
	<body>
		<table border="1">
			<thead>
				<tr>
					<th>Marca</th>
					<th>Modelo</th>
					<th>Capacidade do Tanque</th>
					<th>Distancia Percorrida</th>
					<th>Consumo Médio</th>
					<th>Combustivel Consumido</th>
					<th>Combustivel Restante</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><%=request.getAttribute("Marca") %></td>
					<td><%=request.getAttribute("Modelo") %></td>
					<td><%=request.getAttribute("Capacidade-do-Tanque") %></td>
					<td><%=request.getAttribute("Distancia-Percorrida") %></td>
					<td><%=request.getAttribute("Consumo") %></td>
					<td><%=request.getAttribute("Consumido") %></td>
					<td><%=request.getAttribute("Restante") %></td>
				</tr>
			</tbody>
		</table>
	</body>
</html>
