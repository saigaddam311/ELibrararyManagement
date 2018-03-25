<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>
			Fetch Librarian Page
		</title>
		<style>
			table, th, td {
			    border: 1px solid fuchsia;
			}
		</style>
		<script type="text/javascript">
			function deleteLibrarian(id) {
				document.forms[0].action="${pageContext.request.contextPath}/deleteLibrarian?librarianId="+id;
				document.forms[0].method="post";
				document.forms[0].submit();
			}
			function editLibrarian(id) {
				document.forms[0].action="${pageContext.request.contextPath}/editLibrarian?librarianId="+id;
				document.forms[0].method="post";
				document.forms[0].submit();
			}
		</script>
	</head>
	<body>
		<font color="blue"><h1> Library Management </h1></font>
				<font color="blue"><h3> View Librarians  </h3></font>
		<form action="">
			<table>
				<tr>
					<th>Librarian Id </th>
					<th>Librarian Name </th>
					<th>Librarian Email </th>
					<th>Librarian Password </th>					
					<th>Librarian Mobile Number </th>
					<th>EDIT</th>
					<th>DELETE</th>
				</tr>	
			  	<c:forEach items="${librarianDetails}" var="LibrarianDetails">
					<tr>
						<td>${LibrarianDetails.librarianId}</td>
						<td>${LibrarianDetails.librarianName}</td>
						<td>${LibrarianDetails.librarianEmail}</td>
						<td>${LibrarianDetails.librarianPassword}</td>
						<td>${LibrarianDetails.librarianMobileNumber}</td>
						<td><input type="button" value="Edit" onclick="editLibrarian('${LibrarianDetails.librarianId}')" /></td>
						<td><input type="button" value="Delete" onclick="deleteLibrarian('${LibrarianDetails.librarianId}')" /></td>
					</tr>
				</c:forEach>
			</table>
		</form>
	</body>
</html>