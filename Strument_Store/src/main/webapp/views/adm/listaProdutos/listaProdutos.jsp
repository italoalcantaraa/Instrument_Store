<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/views/adm/listaProdutos/listaProdutos.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100..900;1,100..900&display=swap"
        rel="stylesheet">
    <link rel="icon" href="../../image/Logo.png" type="image/x-icon">

    <title>Lista Produtos</title>
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
                    
                   	<div class="row">	
                        <img src="${pageContext.request.contextPath}/img/adm/venda.png" alt="Listar">
                        <h2><a href="${pageContext.request.contextPath}/views/adm/relatorio_vendas/Vendas.jsp">Vendas</a></h2>
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

	<div class="container_pedidos">
						<div class="titulo">
		
						<p>Produtos</p>

						<div id="underline"></div>
					</div>
	
        <div class="buscar">
            <input type="text" name="" id="" placeholder="Buscar produtos">
            <input type="submit" name="" id="" value="Buscar">
        </div>
        <div class="cabecalho_pedidos">
            <p>ID</p>
            <p>Produto</p>
            <p>Preço</p>
            <p>Marca</p>
            <p>Categoria</p>
            <p>Ações</p>
        </div>
        <div class="produto">
            <p>01</p>
            <p>Violão</p>
            <p>450,00</p>
            <p>Yamaha</p>
            <p>Corda</p>
            <div>
                <img src="${pageContext.request.contextPath}/img/adm/lixeira 1.svg" alt="">
                <img src="${pageContext.request.contextPath}/img/adm/ferramenta-lapis 1.svg" alt="">
            </div>
            
        </div>
        <div class="produto">
            <p>01</p>
            <p>Violão</p>
            <p>450,00</p>
            <p>Yamaha</p>
            <p>Corda</p>
            <div>
                <img src="${pageContext.request.contextPath}/img/adm/lixeira 1.svg" alt="">
                <img src="${pageContext.request.contextPath}/img/adm/ferramenta-lapis 1.svg" alt="">
            </div>
            
        </div>
    </div>
        </article>
    </main>
</body>

</html>