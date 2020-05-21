<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=utf-8" session = "false"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge" charset="utf-8">
        <title></title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script type="text/javascript" src="js/update.js"></script>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <header>
        <jsp:include page="header.jsp"/>
    </header>
    <body>
        <div class="all-content">
            <div class="collumn">
                <div class="description">
                    <c:forEach var="product" items="${product}">
            			<form action="update" method="post">
            			<c:if test="${userPerm == 1}"><button type="button" onclick="update(${product.articule})">Edit</button></c:if>
            			<input type="hidden" name="productId" value="${product.productId}">
                        <div class="articule"><c:if test="${!isEdit}"><p>Articule: ${product.articule}</p></c:if><c:if test="${isEdit}"><input value="${product.articule}" type="text" name="articule" required placeholder="Articule"></c:if></div>
                        <div class="supplier"><c:if test="${!isEdit}"><p>Supplier: ${product.supplier}</p></c:if><c:if test="${isEdit}"><input value="${product.supplier}" type="text" name="supplier" required placeholder="Supplier"></c:if></div>
                        <div class="name"><c:if test="${!isEdit}"><p>${product.name}</p></c:if><c:if test="${isEdit}"><input value="${product.name}" type="text" name="name" required placeholder="Name"></c:if></div>
                        <div class="color"><c:if test="${!isEdit}"><p>Color: ${product.color}</p></c:if><c:if test="${isEdit}"><input value="${product.color}" type="text" name="color" required placeholder="Color"></c:if></div>
                        <div class="type"><c:if test="${!isEdit}"><p>Type: ${product.type}</p></c:if><c:if test="${isEdit}"><select name="type" required>
                      																					<option value="Window" <c:if test="${product.type.equals(\"Window\")}">selected</c:if>>Window</option>
                      																					<option value="Door" <c:if test="${product.type.equals(\"Door\")}">selected</c:if>>Door</option>
                      																				</select>  </c:if></div>
                        <div class="size"><c:if test="${!isEdit}"><p>Size: ${product.height} X ${product.width} X ${product.depth}</p></c:if><c:if test="${isEdit}"><input value="${product.height}" type="number" name="height" required placeholder="Heigth">X<input value="${product.width}" type="number" name="width" required placeholder="Width">X<input value="${product.depth}" type="number" name="depth" required placeholder="Depth"></c:if></div>
                        <div class="price"><c:if test="${!isEdit}"><p>Price: ${product.price} Грн.</p></c:if><c:if test="${isEdit}"><input value="${product.price}" type="number" step="any" name="price" required placeholder="Price"></c:if></div>
                    	<c:if test="${isEdit}"><input type="submit" value="Update"></c:if>
                    	</form>
                    </c:forEach>
                </div>
            </div>
        </div>
    </body>
</html>