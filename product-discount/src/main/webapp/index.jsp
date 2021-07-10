<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
  <title>Product Discount</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Discount Calculator</h2>
<form action="/calculate" method="post">
  <label>Description: </label><br/>
  <input type="text" name="Description" placeholder="Enter your description"/><br/>
  <label>Price: </label><br/>
  <input type="text" name="Price" placeholder="Must be greater than 2000VND"/><br/>
  <label>Percent Discount: </label><br/>
  <input type="text" name="Discount" placeholder="Discount percentage" value="0.15"/><br/>

  <input type ="submit" id ="submit" value ="Calculate discount"/>
</form>
</body>
</html>