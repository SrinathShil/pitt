<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="<spring:url value="/resources/css/Home.css"/>" type="text/css"/>

</head>
<body>

	<jsp:include page="../views/Header.jsp"></jsp:include>
	
			<form action="<spring:url value="/sub"/>" method="post">
			
				<div>
					<label>Name</label>
					<input type="text"  name="name"/>
				</div>

				<div>
					<label for="project_type">Subscription Type</label>
					<select name="type">
						<option></option>
						<option value="single">Single Year</option>
						<option value="multi">Multi-Year</option>
						<option value="many">Many-Year</option>
					</select>
				</div>
							
					
				<div >
					<label for="project-name">Description</label>
					<textarea  rows="3"></textarea>
				</div>
				
				
			
				<button type="submit" >Submit</button>
	
			</form>
			
</body>
</html>