<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function adminbutton() {
	document.forms[0].action="${pageContext.request.contextPath}/adminbutton";
	document.forms[0].submit();
}
function librarianButton() {
	document.forms[0].action="${pageContext.request.contextPath}/librarianButton";
	document.forms[0].submit();
}

</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align = "center">
<form action="">
<font color = "blue"><h1>Library Management</h1></font>


<table>

<tr><td><input type = "button" onclick="adminbutton()" value = "ADMIN"/></td>
<td><input type = "button" onclick="librarianButton()" value = "LIBRARIAN"/></td>

</table>
</form>
</div>
</body>
</html>