<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MyPage</title>
</head>
<body>
	Welcome All For Work With Java Page
	<form method="post" action="prodislet">
		<table>
			<tr>
				<td> Product Detail</td>
				<td><input type="text" name="productdetail"></td>
			</tr>
			<tr>
				<td>Product name</td>
				<td><input type="text" name="productname"></td>
			</tr>
			<tr>
				<td>Product Id</td>
				<td><input type="text" name="productid"></td>
			</tr>
			<tr>
				<td>Product Price</td>
				<td><input type="text" name="productprice"></td>
			</tr>
			<tr>
				<td><input type="submit" value="pagego"></td>
			</tr>
			
		</table>
</form>


	</body>
</html>