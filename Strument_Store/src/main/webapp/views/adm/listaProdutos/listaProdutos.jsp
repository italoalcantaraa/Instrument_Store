<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-BR">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/views/adm/listaProdutos/listaProdutos.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100..900;1,100..900&display=swap"
	rel="stylesheet">
<link rel="icon" href="../../image/Logo.png" type="image/x-icon">

<title>Lista Produtos</title>
</head>

<body>
	<main>
		<article>
			<jsp:include page="../../../includes/menu.jsp" />
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

				<c:forEach var="produto" items="${produtoList}">
					<div class="produto">
						<p>${produto.cod_produto}</p>
						<p>${produto.ds_nome}</p>
						<p>${produto.vl_preco}</p>
						<p>${produto.ds_marca}</p>
						<p>${produto.ds_categoria}</p>

						<div>
							<a href="/Strument_Store/views/adm/remover?id=${produto.cod_produto}"> <img
								src="${pageContext.request.contextPath}/img/adm/lixeira 1.svg"
								alt="">

							</a> <a href="/Strument_Store/views/adm/editar?id=${produto.cod_produto}"> <img
								src="${pageContext.request.contextPath}/img/adm/ferramenta-lapis 1.svg"
								alt="">
							</a>

						</div>
					</div>
				</c:forEach>
		</article>
	</main>
</body>

</html>