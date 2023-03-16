<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="project.css">
<title>Login page</title>
</head>
<body>
<h1 id=a style="text-align: center;">Login</h1>

<form action="login">
<div class="log">
<label id=c >E-Mail :</label><br>
<input id=b  type="email" name = "semail"><br> 
<label id=c >Password :</label><br>
<input id=b  type="password" name = "spassword"><br> 
<br><br><br>
<input id=b type= "submit">
</div>

<input type="hidden" id="val" value="<%=request.getAttribute("logged")%>">
</form>
   
<script type="text/javascript">
let loggedVal = document.getElementById('val').value;

if(loggedVal!=null){
	if(loggedVal=='no')
	  alert("Invalid data")
}
</script>

</body>
</html>