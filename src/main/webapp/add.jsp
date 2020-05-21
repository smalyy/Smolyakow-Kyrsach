<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=utf-8" session = "false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge" charset="utf-8">
        <title>Add</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/chosen/1.5.1/chosen.min.css">
    </head>
    <body>
        <div class="title">
            <a href="/windoor/">Main page</a>
        </div>
        <div class="all-content">
            <div class="coll">
                <div class="centred">
                    <h1>Product</h1>
                    <form action="addProduct" method="POST" style="padding-bottom: 30px;" name="product" accept-charset="windows-1251">
                        <p>Articule</p>
                        <input type="text" name="articule" required placeholder="Articule">
                        <p>Color</p>
                        <input type="text" name="color" required placeholder="Color">
                        <p>Price</p>
                        <input type="number" step="any" name="price" required placeholder="Price">
                        <p>Name:</p>
                        <input type="text" name="name" required placeholder="Name">
                        <p>Type:</p>
                      	<select name="type" required>
                      		<option value="Window">Window</option>
                      		<option value="Door">Door</option>
                      	</select>  
                        <p>Supplier:</p>
                        <input type="text" name="supplier" required placeholder="Supplier">
                        <p>Height (mm):</p>
                        <input type="number" name="height" required placeholder="Heigth">
                        <p>Width (mm):</p>
                        <input type="number" name="width" required placeholder="Width">
                        <p>Depth (mm):</p>
                        <input type="number" name="depth" required placeholder="Depth">
                        <input type="submit" value="Add product">
                    </form>
                </div>
            </div>
        </div>
        <script type="text/javascript" src="js/sizeSearch.js"></script>
        <script type="text/javascript" src="js/supplierSearch.js"></script>
    </body>
</html>