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
String print ()
{
	return "dont come here ";
	}
%>

<h1><%= print() %></h1>


<%!

String name[] ={"astroboy","interstellarguy","stardust"};

String getname(int i)
{
	return name[i];
	}

%>

<h1><%= getname(2) %> </h1>

</body>
</html>