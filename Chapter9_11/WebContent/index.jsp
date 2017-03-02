<%@ taglib prefix="mine" uri="randomThings" %><%--This uri matches in the tld file uri --%>
<%@ taglib prefix="fun" uri="randomThings" %><%-- We use same uri but we have another prefix --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
  <c:set scope="session" var="userName" value="Andrius"/>
 
	<%--It's ok to use EL here, because the <rtexprevalue> in the TLD is set to "true" for the user attribute
	(Assume the "userName" attribute already exist --%>
	<mine:advice user="${userName}"/>
	 <h4>Roll the number from 1 to 6 :</h4>
	 <%-- using EL Function from same uri but we have set it as well EL function!! --%>
	 ${fun:rollIt()}
</body>
</html>