<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>Home</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script type="text/javascript">
	$(function ()
		{
		$("#submitbtn").click(function()
		{
			var password =$("#password").val();
			var confirmPassword =$("#confirmPassword").val();
			if(password!=confirmPassword)
				{
					alert("Passwords do not match");
					
				}
			else
				{
					$("#User").sumit();
				}
					
		});	
	});
	</script>
</head>
<body>
<h1>
	User Registration
</h1>
<form:form commandName="user" method="POST">
	Username:<form:input path ="username"/><br/><br/>
	Password:<form:password path ="password"/> <br/><br/>
	Confirm Password:<input type="password" id="confirmPassword"/> <br/><br/>
	<form:radiobuttons path="accountype" items="${myaccounttype}" element="div"/><br/>
	<form:checkbox items="terms" path="termsOfCondition" label =" Terms of Condition"/>
	<input type = "submit" id="submitbtn" value ="submit"/>
</form:form>

</body>
</html>
