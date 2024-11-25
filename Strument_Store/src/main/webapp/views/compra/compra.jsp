<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Finalizar compra</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/views/compra/StyleCompra.css">
<link rel="icon" href="../../img/logoIcon.png" type="image/x-icon">
</head>
<body>

	<jsp:include page="../../includes/Header.jsp" />

	<nav class="estado">
		<p>Pedido</p>
		<div id="linha"></div>

		<div id="linha"></div>
		<p>Pagamento</p>

	</nav>
	<main>
		<section class="detalhes_produto">
			<nav>
				<button onclick="removeProduts()">Remover produtos</button>
			</nav>

			<div class="produtos-carrinho">
				<c:forEach var="produto" items="${produtos}">
					<img alt=""
						src="${pageContext.request.contextPath}/img/produtos/${produto.ds_img}">
					<h3>${produto.ds_descricao}</h3>
					<div>
						<p>QTD</p>
						<div class="botao_quantidade">
							<button>-</button>
							<p>1</p>
							<button>+</button>
						</div>
					</div>
					<div>
						<p>À vista ou no pix:</p>
						<strong>R$ ${produto.vl_preco}</strong>
					</div>
				</c:forEach>

			</div>

		</section>
		<section class="resumo">
			<div class="resumo_carrinho">
				<h1>Resumo</h1>
				<div>
					<p>Valor dos produtos:</p>
					<p>
						<strong id="totalProcucts">R$ 200,00</strong>
					</p>
				</div>
				<div>
					<p>Frete:</p>
					<p>
						<strong>Grátis</strong>
					</p>
				</div>

				<div>
					<p>Total à vista no pix:</p>
					<p>
						<strong id="total">R$ 200,00</strong>
					</p>
				</div>
			</div>


			<form class="finalizar compra" action="/Strument_Store/pedido/salvar" method="get">
				<input type="hidden" name="cpf" value="${param.cpf}">

				<c:forEach var="produto" items="${produtos}">
					<input type="hidden" name="produtos" value="${produto.cod_produto}">
				</c:forEach>

				<button type="submit">Finalizar compra</button>
			</form>
		</section>
	</main>
</body>
</html>