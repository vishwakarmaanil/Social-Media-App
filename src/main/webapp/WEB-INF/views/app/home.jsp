<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>Home</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script type="text/javascript">
	</script>
</head>
<body>
<h1>
	Home
</h1>
<c:forEach items="${messages}" var = "message">
${message.content}<br/>

</c:forEach>
Thanks For Login  
</body>
</html>
