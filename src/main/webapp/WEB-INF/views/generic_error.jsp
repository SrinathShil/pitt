<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="<spring:url value="/resources/css/Home.css"/>" type="text/css"/>

</head>
<body>
	<jsp:include page="../views/Header.jsp"></jsp:include>
<h1>Blog for Music and Sports, Around the World.</h1>
 <%-- <span>${exception.description}</span> --%>
<br/>Error <%=request.getAttribute("exception") %>

</body>
</html>