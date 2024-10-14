<%@page import="br.com.model.PopUp"%>
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
<link
	href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100..900;1,100..900&display=swap"
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
							<a
								href="${pageContext.request.contextPath}/views/adm/listaProdutos/listaProdutos.jsp">Listar
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
						<a href="${pageContext.request.contextPath}/views/adm/login/LoginAdm.jsp">Sair</a>
					</h2>
				</div>
			</section>

			<div style="<%if (!PopUp.enabled)
	out.print("display: none;");%>"
				class="container_vendas">

				<div class="titulo_voltar">
					<form action="${pageContext.request.contextPath}/ServletPopUp"
						method="post">
						<input type="submit" value="Voltar">
					</form>

					<p>Venda nº10</p>
				</div>

				<table>
					<tr>
						<td>Data</td>
						<td>ID</td>
						<td>Nome</td>
						<td>Qtd</td>
						<td>Preço</td>
						<td>Total</td>
					</tr>
					<tr>
						<td>11/10/24</td>
						<td>111</td>
						<td>Guitarra</td>
						<td>Qtd</td>
						<td>R$ 600,00</td>
						<td></td>
					</tr>
					<tr>
						<td>11/10/24</td>
						<td>111</td>
						<td>Guitarra</td>
						<td>Qtd</td>
						<td>R$ 600,00</td>
						<td></td>
					</tr>
					<tr>
						<td>11/10/24</td>
						<td>111</td>
						<td>Guitarra</td>
						<td>Qtd</td>
						<td>R$ 600,00</td>
						<td></td>
					</tr>
					<tr>
						<td>11/10/24</td>
						<td>111</td>
						<td>Guitarra</td>
						<td>Qtd</td>
						<td>R$ 600,00</td>
						<td id="total">R$ 2400,00</td>
					</tr>
				</table>
			</div>

			<section
				style="<%if (PopUp.enabled)
	out.print("display: none;");%>"
				class="container">
				<div class="info">

					<div class="titulo">

						<p>Relatorios de Vendas</p>

						<div id="underline"></div>
					</div>

					<div>
						<div>
							<img
								src="${pageContext.request.contextPath}/img/adm/calendario.png" />
						</div>

						<input type="date" placeholder="Data Inicial">
					</div>

					<div>
						<div>
							<img
								src="${pageContext.request.contextPath}/img/adm/calendario.png" />
						</div>

						<input type="date" placeholder="Data Final">
					</div>

					<input id="pes" type="button" value="Pesquisar">

				</div>
				<div class="container_v">
					<div class="vendas">
						<div class="total">
							<p>Total</p>
							<p>R$ 1000.00</p>
						</div>

						<table border="1px solid black" cellspacing="0">

							<tr>
								<td>Data</td>
								<td>Nome</td>
								<td>Total</td>
							</tr>
							<tr>
								<td>19/09/24</td>
								<td>Fulano</td>
								<td>R$ 200,00</td>
								<td>
									<form action="${pageContext.request.contextPath}/ServletPopUp"
										method="post">
										<input type="submit" value="Detalhes">
									</form>
								</td>
							</tr>
							<tr>
								<td>19/09/24</td>
								<td>Fulano</td>
								<td>R$ 200,00</td>
								<td>
									<form action="${pageContext.request.contextPath}/ServletPopUp"
										method="post">
										<input type="submit" value="Detalhes">
									</form>
								</td>
							</tr>
							<tr>
								<td>19/09/24</td>
								<td>Fulano</td>
								<td>R$ 200,00</td>
								<td>
									<form action="${pageContext.request.contextPath}/ServletPopUp"
										method="post">
										<input type="submit" value="Detalhes">
									</form>
								</td>
							</tr>
							<tr>
								<td>19/09/24</td>
								<td>Fulano</td>
								<td>R$ 200,00</td>
								<td>
									<form action="${pageContext.request.contextPath}/ServletPopUp"
										method="post">
										<input type="submit" value="Detalhes">
									</form>
								</td>
							</tr>
							<tr>
								<td>19/09/24</td>
								<td>Fulano</td>
								<td>R$ 200,00</td>
								<td>
									<form action="${pageContext.request.contextPath}/ServletPopUp"
										method="post">
										<input type="submit" value="Detalhes">
									</form>
								</td>
							</tr>


						</table>
					</div>
				</div>

			</section>
		</article>

	</main>
</body>
</html>