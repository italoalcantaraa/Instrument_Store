<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/views/adm/home/HomeStyle.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100..900;1,100..900&display=swap"
        rel="stylesheet">
    <link rel="icon" href="../image/Logo.png" type="image/x-icon">
	<title>Home</title>
</head>
<body>
	
    <main>
        <article>
            <section class="parede-cabecalho">
				<div class="logo">
					<img src="${pageContext.request.contextPath}/img/logo.png">
				</div>

				<div class="bloco-opcoes">

					<div class="row">
						<img
							src="${pageContext.request.contextPath}/img/adm/home/pagina-inicial 1.png">
						<h2>
							<a href="${pageContext.request.contextPath}/views/adm/home/Home.jsp">Home</a>
						</h2>
					</div>

					<div class="row">
						<img
							src="${pageContext.request.contextPath}/img/adm/home/melhor-produto 1.png"/>
						<h2>
							<a href="${pageContext.request.contextPath}/views/adm/cadastro_produto/cadastroProd.jsp">Cadastrar Produto</a>
						</h2>
					</div>

					 <div class="row">
                        <img src="${pageContext.request.contextPath}/img/adm/home/caracteristicas (1).png"	>
                        <h2><a href="${pageContext.request.contextPath}/views/adm/listaProdutos/listaProdutos.jsp">Listar Produtos</a></h2>
                    </div>
                    
                    <div class="row">	
                        <img src="${pageContext.request.contextPath}/img/adm/venda.png" alt="Listar">
                        <h2><a href="${pageContext.request.contextPath}/views/adm/relatorio_vendas/Vendas.jsp">Vendas</a></h2>
                    </div>
				</div>

				<div class="row-exit">
					<img src="${pageContext.request.contextPath}/img/adm/home/sair (1) 1.png">
					<h2>
						<a href="${pageContext.request.contextPath}/views/adm/login/LoginAdm.jsp">Sair</a>
					</h2>
				</div>

			</section>

        </article>
    </main>
    
</body>
</html>