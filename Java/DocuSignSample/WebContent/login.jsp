<%@ page  session="true" import="net.docusign.sample.Utils" language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/homestyle.css" type="text/css">
<title>DocuSign Login</title>
</head>
<body>
<div class="dropshadow-bottomleft">
<p class="leftalign"><b>Log In</b></p>
<hr />
<form action="Login" id="logInForm" method="post">
<div id="container" class="centeralign" style="width: 300px; padding-bottom:40px">
<table style="width: 300px;" align="center">
	<tr>
	    <!--This is the email you use to log into your demo account-->
		<td>DevCenter E-mail</td>
		<td><input id="DevCenterEmail" type="text" name="DevCenterEmail"
			value="<%= session.getAttribute(Utils.SESSION_EMAIL).toString() %>" /></td>
	</tr>
	<tr>
	    <!--This is the password you use to log into your demo account-->
		<td>Password</td>
		<td><input id="DevCenterPassword" type="password"
			name="DevCenterPassword" value="<%= session.getAttribute(Utils.SESSION_PASSWORD).toString() %>"
		/></td>
	</tr>
	<tr>
	    <!--This is the key you requested on the API page of your preferences-->
		<td>Your Integrator Key</td>
		<td><input id="DevCenterIKey" type="password" name="DevCenterIKey"
			value="<%= session.getAttribute(Utils.SESSION_INTEGRATORS_KEY).toString() %>" /></td>
	</tr>
</table>
<div>
<table class="triangle-isosceles left" align="center">
	<tr>
		<td><b>Need a DevCenter Account?</b><br />
		Get it <a
			href="http://www.docusign.com/developers-center">
		here </a>.</td>
	</tr>
</table>
</div>
<div id="action" class="centeralign" style="width: 174px;"><input
	id="Submit1" name="submit" type="submit" value="Login"
	style="width: 70px; margin-right: 5px;" /> <input id="Reset1"
	name="reset" type="submit" value="Reset"
	style="width: 70px; margin-left: 5px;" /></div>
</div>
<%@ include file="footer.html" %>
</form> 
</div>
</body>
</html>