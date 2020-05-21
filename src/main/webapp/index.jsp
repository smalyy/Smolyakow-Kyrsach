<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" session = "false"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge" charset="utf-8">
        <title>Main page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script type="text/javascript" src="js/deleting.js"></script>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <header>
        <jsp:include page="header.jsp"/>
    </header>
    <body>
        <div class="all-content">
                <form action="createOrder" method="POST" class="collumn" id="createOrder">
                <c:forEach var="products" items="${products}">
                    <div class="item">
                        <div class="name">
                            <a href="/windoor/show?articule=${products.articule}">${products.name}</a>
                        </div>
                        <div class="size">
                            <p>${products.height} X ${products.width} X ${products.depth}</p>
                        </div>
                        <div class="price">
                            <p>${products.price}</p>
                        </div>
                        	<c:if test="${(userId == products.userId) or (userPerm == 1)}"><button type="button" onclick="deleting(${products.productId})" style="margin-top: 25px;">Delete</button></c:if>
                    </div>
                </c:forEach>
            </form>
        </div>
    </body>
</html>