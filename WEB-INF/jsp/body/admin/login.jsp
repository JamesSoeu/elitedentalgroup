<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript"
	src='<c:url value="/resources/js/jquery-1.11.0.min.js"/>'></script>
<script type="text/javascript"
	src='<c:url value="/resources/js/bootstrap.min.js"/>'></script>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/signin.css" />"
	rel="stylesheet">
<div class="container">
	<form name='loginForm' class="form-signin"
		action="<c:url value='j_spring_security_check' />" method='POST'>

		<h2 class="form-signin-heading">Please sign in</h2>
		<div class="login-message">
			<c:if test="${not empty error}">
				<div class="label label-danger">${error}</div>
			</c:if>
			<c:if test="${not empty msg}">
				<div class="label label-success">${msg}</div>
			</c:if>
		</div>
		<label for="inputEmail" class="sr-only">User Name</label> <input
			type="text" id="inputEmail" class="form-control" name='username'
			placeholder="User Name" required="" autofocus=""> <label
			for="inputPassword" class="sr-only">Password</label> <input
			type="password" id="inputPassword" class="form-control"
			name="password" placeholder="Password" required="">


		<div class="checkbox">
			<label> <input type="checkbox" value="remember-me">
				Remember me
			</label>
		</div>
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
		
		<button class="btn btn-lg btn-primary btn-block" type="submit">Sign
			in</button>
	</form>

</div>
