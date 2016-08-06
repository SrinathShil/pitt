<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="<spring:url value="/resources/css/Home.css"/>" type="text/css"/>

</head>
<body>
	<jsp:include page="../views/Header.jsp"></jsp:include>
<h1>Blog for Music and Sports, Around the World.</h1>
<span>Your Have brought ${desc} instrument</span>
<table>
<tr>
<td><img src="<spring:url value="/resources/img/4.png"/>" alt="" style="width:300px; height:auto;"></td>
<td><img src="<spring:url value="/resources/img/2.jpg"/>" alt=""style="width:300px; height:auto;"></td>
</tr>
<tr>
<td><img src="<spring:url value="/resources/img/3.jpg"/>" alt="" style="width:300px; height:auto;"></td>
<td><img src="<spring:url value="/resources/img/6.jpg"/>" alt="" style="width:300px; height:auto;"></td>
</tr>

</table>
</body>
</html>