<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>library management admin registrarion</title>
</head>
<body>
<div align = "center">
<form action="adminRegisterLogic" method = "post">
<font color = "blue"><h1>Library Management</h1></font>
<font color = "blue"><h3>Admin Registration Page</h3></font>
<table>
<tr><td>FullName : </td> <td> <input type="text" name = "fullname" /></td></tr>
<tr><td>UserName : </td> <td> <input type="text" name = "username" /></td></tr>
<tr><td>Password : </td> <td> <input type="text" name = "password" /></td></tr>
<tr><td>EmailId : </td> <td> <input type="text" name = "emailid" /></td></tr>
<tr><td>Mobile No : </td> <td> <input type="text" name = "mobileno" /></td></tr>
<tr><td><input type = "submit"  value = "Register"/></td></tr>
</table>
</form>
</div>
</body>
</html>