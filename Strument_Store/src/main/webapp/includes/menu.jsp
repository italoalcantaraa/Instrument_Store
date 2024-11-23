<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.parede-cabecalho {
	display: flex;
	flex-direction: column;
	justify-content: center;
	background-color: #F1DFB3;
	text-align: center;
	width: 100%;
	color: black !important;
}

.parede-cabecalho h2>a {
	color: black !important;
}

.logo {
	display: flex;
	flex-direction: column;
	align-items: center;
	margin-top: 2.5em; img { height : 150px;
	width: 290px;
}

}
.row {
	display: flex;
	flex-direction: row;
	margin-top: 12%; h2 { font-family : "Montserrat";
	font-weight: normal;
	font-size: 1.2em;
	margin-left: 1em;
	cursor: pointer;
	color: black;
}

img {
	height: 2%;
	width: 30px;
	margin-left: 2em;
	margin-bottom: 1em;
}

h2:hover {
	transform: scale(1.1);
	border-bottom: 2px solid #241711;
}

}
.row-exit {
	display: flex;
	flex-direction: row;
	margin-top: 50%; h2 { font-family : "Montserrat";
	font-weight: normal;
	font-size: 1.2em;
	margin-left: 1em;
	cursor: pointer;
}

img {
	height: 60%;
	width: 30px;
	margin-left: 2em;
	margin-bottom: 1.3em;
}
}
</style>

</head>
<body>

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
					<a
						href="${pageContext.request.contextPath}/views/adm/home/Home.jsp">Home</a>
				</h2>
			</div>

			<div class="row">
				<img
					src="${pageContext.request.contextPath}/img/adm/melhor-produto 1.png"
					alt="Cadastrar">
				<h2>
					<a
						href="${pageContext.request.contextPath}/views/adm/cadastro_produto/cadastroProd.jsp">Cadastrar
						Produto</a>
				</h2>
			</div>

			<div class="row">
				<img
					src="${pageContext.request.contextPath}/img/adm/home/caracteristicas (1).png"
					alt="Listar">
				<h2>
					<a href="/Strument_Store/views/adm/listaProdutos">Listar
						Produtos</a>
				</h2>
			</div>

			<div class="row">
				<img src="${pageContext.request.contextPath}/img/adm/venda.png"
					alt="Listar">
				<h2>
					<a
						href="${pageContext.request.contextPath}/views/adm/relatorio_vendas/Vendas.jsp">Vendas</a>
				</h2>
			</div>
		</div>

		<div class="row-exit">
			<img
				src="${pageContext.request.contextPath}/img/adm/home/sair (1) 1.png"
				alt="Sair">
			<h2>
				<a
					href="${pageContext.request.contextPath}/views/adm/login/LoginAdm.jsp">Sair</a>
			</h2>
		</div>

	</section>
</body>
</html>