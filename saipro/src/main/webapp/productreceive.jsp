<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	product added
	<%
	product p=(product)request.getAttribute("Prod");
	out.print(p.getPid());
	out.print(p.getPname());
	out.print(p.getPdetail());
	out.print(p.getPprice());
	%>

</body>
</html>