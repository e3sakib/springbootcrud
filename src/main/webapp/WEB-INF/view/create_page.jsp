<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>
	<form action="save" method="post">
	<div class="container col-md-5">
		<div class="form-floating mb-3">
			<input type="email" class="form-control" id="floatingInput"
				placeholder="name@example.com" name="email"> <label
				for="floatingInput">Email address</label>
		</div>
		<div class="form-floating">
			<input type="password" class="form-control" id="floatingPassword"
				placeholder="Password" name="pasasword"> <label
				for="floatingPassword">Password</label>
		</div>
		<div><button type="submit">save</button></div>
	</div>
	</form>
	
</body>
</html>