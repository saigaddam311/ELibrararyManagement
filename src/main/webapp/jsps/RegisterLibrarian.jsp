<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>
			Register Librarian Page
		</title>
	</head>
	<body>
		<div align = "center">
			<form action="${pageContext.request.contextPath}/registerLibrarian" method="post">
				<font color = "blue"><h1>Library Management</h1></font>
				<font color = "green"><h1>Librarian Registration Page</h1></font>
				<table>
					<tr><td>Librarian Name : </td> <td> <input type = "text" name = "librarianName"/></td></tr>
					<tr><td>Librarian Email : </td> <td> <input type = "text" name = "librarianEmail"/></td></tr>
					<tr><td>Librarian Password : </td> <td> <input type ="password" name ="librarianPassword"/></td></tr>
					<tr><td>Librarian Mobile Number : </td> <td> <input type = "text" name = "librarianMobileNumber"/></td></tr>
					<tr><td><input type="submit" value="Register Librarian" /></td></tr>
				</table>
			</form>
		</div>
	</body>
</html>