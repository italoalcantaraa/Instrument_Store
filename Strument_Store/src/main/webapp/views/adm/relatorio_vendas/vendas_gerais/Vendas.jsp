<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pagina ADM</title>
<link rel='stylesheet' type='text/css' media='screen' href='Vendas.css'>
<link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100..900;1,100..900&display=swap"
        rel="stylesheet">
</head>
<body>
<main>

	<article>
		<section class="parede-cabecalho">
				<div class="logo">
					<img src="${pageContext.request.contextPath}/img/logo.png"
						alt="Logo">
				</div>

				<div class="bloco-opcoes">

					<div class="row">
						<img
							src="${pageContext.request.contextPath}/img/adm/pagina-inicial 1.png"
							alt="Home">
						<h2>
							<a href="${pageContext.request.contextPath}/views/adm/home/Home.jsp">Home</a>
						</h2>
					</div>

					<div class="row">
						<img
							src="${pageContext.request.contextPath}/img/adm/melhor-produto 1.png"
							alt="Cadastrar">
						<h2>
							<a href="${pageContext.request.contextPath}/views/adm/cadastro_produto/cadastroProd.jsp">Cadastrar Produto</a>
						</h2>
					</div>

					 <div class="row">	
                        <img src="${pageContext.request.contextPath}/img/adm/home/caracteristicas (1).png" alt="Listar">
                        <h2><a href="${pageContext.request.contextPath}/views/adm/listaProdutos/listaProdutos.jsp">Listar Produtos</a></h2>
                    </div>
				</div>

				<div class="row-exit">
					<img src="${pageContext.request.contextPath}/img/adm/home/sair (1) 1.png"
						alt="Sair">
					<h2>
						<a href="${pageContext.request.contextPath}/views/adm/login/LoginAdm.jsp">Sair</a>
					</h2>
				</div>
			</section>
			<section class="container">
				   <div class="info">

            <div class="titulo">

                <p>Relatorios de Vendas</p>

                <div id="underline">

                </div>
            </div>

            <div>
                <div>
                    <img src="https://icons.veryicon.com/png/o/miscellaneous/esgcc-basic-icon-library/date-71.png" />
                </div>

                <input type="date" placeholder="Data Inicial">
            </div>

            <div>
                <div>
                    <img src="https://icons.veryicon.com/png/o/miscellaneous/esgcc-basic-icon-library/date-71.png" />
                </div>

                <input type="date" placeholder="Data Final">
            </div>

            <input id="pes" type="button" value="Pesquisar">

        </div>
			</section>
	</article>

</main>
    </body>
</html>