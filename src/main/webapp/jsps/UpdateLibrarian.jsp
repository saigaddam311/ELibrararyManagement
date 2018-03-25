<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>
			Update Librarian Page
		</title>
	</head>
	<body>
	<div align = "center">
			<form action="${pageContext.request.contextPath}/updateLibrarian" method="post">
			<font color = "blue"><h1>Library Management</h1></font>
				<font color = "blue"><h3>Welcome to Update Librarian page!!...Please Update Librarian details</h3></font>
				<font color = "green"><h1>Update Librarian Name is ::: ${LibrarianDetails.librarianName}</h1></font>
				<table>
					<tr><td>Librarian Id : </td> <td> <input type = "text" name = "librarianId" value = "${LibrarianDetails.librarianId}" readonly="readonly"/></td></tr>				
					<tr><td>Librarian Name : </td> <td> <input type = "text" name = "librarianName" value = "${LibrarianDetails.librarianName}"/></td></tr>
					<tr><td>Librarian Email : </td> <td> <input type = "text" name = "librarianEmail" value = "${LibrarianDetails.librarianEmail}"/></td></tr>
					<tr><td>Librarian Password : </td> <td> <input type ="password" name ="librarianPassword" value = "${LibrarianDetails.librarianPassword}"/></td></tr>
					<tr><td>Librarian Mobile Number : </td> <td> <input type = "text" name = "librarianMobileNumber" value = "${LibrarianDetails.librarianMobileNumber}"/></td></tr>
					<tr><td><input type="submit" value="Update Librarian" /></td></tr>
				</table>
			</form>
		</div>
	</body>
</html>