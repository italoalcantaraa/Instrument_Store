<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/views/adm/cadastro_produto/cadastroProdAdm.css">
	<link rel="icon" href="../../../img/logoIcon.png" type="image/x-icon">
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
			<jsp:include page="../../../includes/menu.jsp" />
			<section class="informacoes-cad">

				<div class="titulo-cadastro">
					<h1>Cadastro Produto</h1>
				</div>

				<div class="divisao-form">

					<div class="formulario-cad">
						<form action="${produto == null ? '/Strument_Store/produto/inserir' : '/Strument_Store/produto/alterar'}"
							method="get">
							
							<input type="hidden" name="id" value="${produto.cod_produto}">

							<input type="text" id="nome" name="nome" placeholder="Nome"
								value="${produto.ds_nome}"> <input type="text" id="marca"
								name="marca" placeholder="Marca" value="${produto.ds_marca}">

							<input type="text" id="preco" name="preco" placeholder="Preco"
								value="${produto.vl_preco}"> <input type="text"
								id="quantidade" name="quantidade" placeholder="Quantidade"
								value="${produto.qtd_estoque}"> <select name="instrumento"
								id="instrumento">

								<option value="">Categoria</option>
								<option value="Acessórios">Acessórios</option>
								<option value="Cordas">Cordas</option>
								<option value="Percussão">Percussão</option>
								<option value="Sopro">Sopro</option>
								<option value="Teclado">Teclado</option>
							</select>
											
								
							<select name="img" >  
								<option value="">Imagem</option>
								<option value="guitarra-vermelha.png">Guitarra Vermelha</option>
							</select>

							<div class="Descricao">
								<textarea name="descricao" id="descricao"
									placeholder="Descrição">${produto.ds_descricao}</textarea>
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

					

				</div>
			</section>

		</article>
	</main>
</body>
</html>