<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/views/adm/cadastro_produto/cadastroProdAdm.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100..900;1,100..900&display=swap"
	rel="stylesheet">
<link rel="icon" href="../image/Logo.png" type="image/x-icon">

<title>Cadastro Prodruto</title>
</head>
<body>
	<main>
		<article>
			<section class="parede-cabecalho">
				<div class="logo">
					<img src="${pageContext.request.contextPath}/img/logo.png" alt="Logo">
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

			<section class="informacoes-cad">

				<div class="titulo-cadastro">
					<h1>Cadastro Produto</h1>
				</div>

				<div class="divisao-form">

					<div class="formulario-cad">
						<form action="${pageContext.request.contextPath}/ProdutoServlet"
							method="get">

							<input type="text" id="nome" name="nome" placeholder="Nome"
								value="${param.nome}"> <input type="text" id="marca"
								name="marca" placeholder="Marca" value="${param.marca}">

							<input type="text" id="preco" name="preco" placeholder="Preco"
								value="${param.preco}"> <input type="text"
								id="quantidade" name="quantidade" placeholder="Quantidade"
								value="${param.quantidade}"> <select name="instrumento"
								id="instrumento">

								<option value="">Categoria</option>
								<option value="Acessórios">Acessórios</option>
								<option value="Cordas">Cordas</option>
								<option value="Percussão">Percussão</option>
								<option value="Sopro">Sopro</option>
								<option value="Teclado">Teclado</option>
							</select>

							<div class="Descricao">
								<textarea name="descricao" id="descricao"
									placeholder="Descrição">${param.descricao}</textarea>
							</div>

							<div class="botao-cadastro">
								<button type="submit">Cadastrar</button>

								<c:if test="${not empty erro}">
									<div style="font-weight: normal; font-family: 'Montserrat'; color: red;">${erro}</div>
								</c:if>
								<c:if test="${not empty sucesso}">
									<div style="font-weight: normal; font-family: 'Montserrat'; color: green;">${sucesso}</div>
								</c:if>
							</div>
						</form>
					</div>

					<div class="image-upload">
						<label for="file-input"> <img
							src="${pageContext.request.contextPath}/img/adm/cadastro_produto/imagem 1.png"
							alt="Icone de upload" />
						</label> <input id="file-input" type="file" />
					</div>

				</div>
			</section>

		</article>
	</main>
</body>
</html>