<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Header</title>
 <link rel="stylesheet" href="${pageContext.request.contextPath}/includes/Header.css">
</head>
<body>
	<header>
		<div class="logo">
			<img alt="" src="${pageContext.request.contextPath}/img/Logo.png">
		</div>			
		
		<div class="pesquisar">
			<input type="text" placeholder="Pesquisa">
			<span class="lupa">
				<img alt="" src="${pageContext.request.contextPath}/img/lupa.png">
			</span>
		</div>
		
		<div class="login">
			<img alt="" src="${pageContext.request.contextPath}/img/user.svg">
			<div class="login-op">
				<h5><strong>Login |</strong></h5>
				<h5><strong>Cadastrar</strong></h5>
			</div>
		</div>
		
		<img alt="" src="${pageContext.request.contextPath}/img/Carrinho.svg">
	</header>
</body>
</html>