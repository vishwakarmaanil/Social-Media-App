<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>Login</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script type="text/javascript">
	</script>
</head>
<body>
<h1>
	Login
</h1>
<form:form commandName="user" method="POST">
	Username:<form:input path ="username"/><br/><br/>
	Password: <form:password path ="password"/> <br/><br/>
	<input type = "submit" id="submitbtn" value ="submit"/>
	<div style= "color:red;">${result}</div>
</form:form>
</body>
</html>
