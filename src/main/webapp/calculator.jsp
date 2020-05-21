<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
	session="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge" charset="utf-8">
<title>Windows</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="text/javascript" src="js/calculate.js"></script>
<link rel="stylesheet" href="css/style.css">
</head>
<header>
	<jsp:include page="header.jsp" />
</header>
<body>
	<div class="all-content">
		<div class="coll">
			<div class="centred">
				<form action="save" name="calculation" method="GET" id="createOrder">
					<p>Height (mm):</p>
					<input type="number" name="height" min="1" value="${height}" required placeholder="Heigth" onchange="calcul()">
					<p>Width (mm):</p>
					<input type="number" name="width" min="1" value="${width}" required placeholder="Width" onchange="calcul()">
					<p>Depth (mm):</p>
					<input type="number" name="depth" min="1" value="${depth}" required placeholder="Depth" onchange="calcul()">
					<p>Type:</p>
					<select name="type" onchange="calcul()">
						<option value="Window" <c:if test="${type.equals(\"Window\")}">selected</c:if>>Window</option>
						<option value="Door" <c:if test="${type.equals(\"Door\")}">selected</c:if>>Door</option>
					</select>
					<input type="hidden" id="hidenPrice" name="price" value="">
					<p>Name:</p> 
					<input type="text" name="name" placeholder="Name" required> 
					<p>Article:</p>
					<input type="text" name="articule" placeholder="Articule" required>
					<p>Color:</p> 
					<input type="text" name="color" placeholder="Color" required>
					<p>Supplier:</p> 
					<input type="text" name="supplier" placeholder="Supplier" required> 
					<input type="submit"value="Save">
					<h1 id="price">0</h1>
				</form>
			</div>
		</div>
	</div>
</body>
</html>