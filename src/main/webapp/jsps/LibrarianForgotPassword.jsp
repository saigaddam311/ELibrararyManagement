<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function forgotLoginButton() {
	document.forms[0].action="librarianForgotLoginButton";
	document.forms[0].submit();
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align = "center">
<form action="librarianForgotPassword">
<font color = "blue"><h1>Library Management</h1></font>
<font color = "blue"><h3>Forgot Password Page</h3></font>
<font color= "red">${message}</font>
<table>
<tr><td>Email iD : </td><td><input type = "text" name = "emailid"/></td></tr>
<tr><td>New Password : </td><td><input type = "text" name = "newpassword"/></td></tr>
<tr><td><input type ="submit" value = "Update"/></td>
<td><input type = "button" onclick="librarianForgotLoginButton()" value = "Login"/></td></tr>
</table>
</form>
</div>
</body>
</html>