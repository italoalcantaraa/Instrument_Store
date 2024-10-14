<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Header</title>
 <link rel="stylesheet" href="${pageContext.request.contextPath}/includes/StyleHeader.css">
</head>
<body>
	<header>
			<a href="${pageContext.request.contextPath}/views/home/Home.jsp">
				<img style="width: 160px; cursor: pointer" id="logo" alt="" src="${pageContext.request.contextPath}/img/logo.png">		
			</a>
		
		<div class="pesquisar">
			<input type="text" placeholder="Pesquisa">
			<span class="lupa">
				<img alt="" src="${pageContext.request.contextPath}/img/lupa.png">
			</span>
		</div>
		
		<div class="login">
			<img alt="" src="${pageContext.request.contextPath}/img/user.svg">
			<a href="${pageContext.request.contextPath}/views/user/login/LoginUser.jsp" class="login-op">
				<p><strong>Login |</strong></p>
				<p><strong>Cadastrar</strong></p>
			</a>
		</div>
			
		<a href="${pageContext.request.contextPath}/views/Carrinho/Carrinho.jsp">
			<img src="${pageContext.request.contextPath}/img/Carrinho.svg">
		</a>
		
	</header>
	
	<nav class="dp-menu">
    <ul>
        <li id="nav-categorias"> 
            <a href="#" id="categoriasn"> 
                <i class="bi-justify"></i>
                <img src="${pageContext.request.contextPath}/img/menu.png" href="">
                <p> Todas as Categorias </p>
            </a>

            <ul>
                <li id="nav-cordas">
                    <a href="#">
                        <p>Cordas</p>
                    </a>
                </li>

                <li id="nav-sopro">
                    <a href="#">
                        <p>Sopro</p>
                    </a>
                </li>

                <li id="nav-teclas">
                    <a href="#">
                        <p>Teclas</p>
                    </a>
                </li>

                <li id="nav-percurssao">
                    <a href="#">
                        <p> Percurssão </p>
                    </a>
                </li>
            </ul>
        </li>

        <li id="nav-marcas">
            <a href="#">
                <p>Marcas</p>
            </a>
        </li>

        <li id="nav-acessórios">
            <a href="#">
                <p>Acessórios</p>
            </a>
        </li>

        <li id="nav-quemS">
            <a href="#">
                <p> Quem Somos? </p>
            </a>
        </li>

    </ul>

</nav>
</body>
</html>