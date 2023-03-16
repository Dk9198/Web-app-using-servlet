<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%!
int add(int a , int b)
{
	return a+b;
	}

%>

<h1>Addition is <%= add(10,20) %> </h1>

</body>
</html>