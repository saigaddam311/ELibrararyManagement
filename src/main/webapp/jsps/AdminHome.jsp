<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>
			Admin Home Page
		</title>
		<script type="text/javascript">
			function addLibrarian() {
				document.forms[0].action = "${pageContext.request.contextPath}/addLibrarian";
				document.forms[0].submit();
			}
			function viewLibrarian() {
				document.forms[0].action = "${pageContext.request.contextPath}/viewLibrarian";
				document.forms[0].submit();
			}
			function logout() {
				document.forms[0].action = "${pageContext.request.contextPath}/logout";
				document.forms[0].submit();
			}
		</script>
	</head>
	<body>
		<div align="center">
			<form action="">
			<font color="blue"><h1> Library Management </h1></font>
				<font color="blue"><h3> Admin Section </h3></font>
				<h4>
					<input type="button" onclick="addLibrarian()" value="Add Librarian" />
				</h4>
				<h4>
					<input type="button" onclick="viewLibrarian()" value="View Librarian" />
				</h4>
				<h4>
					<input type="button" onclick="logout()" value="Logout" />
				</h4>
			</form>
		</div>
	</body>
</html>