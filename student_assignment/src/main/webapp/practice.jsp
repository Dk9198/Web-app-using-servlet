<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New jsp</title>
</head>
<body>
<%-- we are declaring the variable --%>
<%! 
int a=15;
%>

<%--we using expression tag  for the variable --%>
<h1>Value of a is <%=a %> </h1>


<%--we are using inner script in html --%>
<script>

var ad="hello";
 document.write(ad);

</script>

<%--we are using scriplet tag --%>
<%
for(int i=0 ; i<9 ;i++)
{
%>

 <h1> <%= i %> </h1>
	
<%
}
%>



</body>
</html>