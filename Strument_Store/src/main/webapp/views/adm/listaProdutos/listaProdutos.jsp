<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/views/adm/listaProdutos/listaProdutosStyle.css">
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


            <section class="informacoes-cad">

                <div class="titulo-cadastro">
                    <h1>Lista de Produtos</h1>

                    <table>
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Produto</th>
                                <th>Preço</th>
                                <th>Marca</th>
                                <th>Categoria</th>
                                <th>Ações</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>10</td>
                                <td>Guitarra Pacifica</td>
                                <td>R$ 100,00</td>
                                <td>Yamaha</td>
                                <td>Guitarra</td>
                                <td id="acoes"> 
                                    <img src="${pageContext.request.contextPath}/img/adm/ferramenta-lapis 1.svg" alt="alterar">
                                    <img src="${pageContext.request.contextPath}/img/adm/lixeira 1.svg" alt="excluir">
                                </td>
                            </tr>
                            <tr>
                                <td>10</td>
                                <td>Guitarra Pacifica</td>
                                <td>R$ 100,00</td>
                                <td>Yamaha</td>
                                <td>Guitarra</td>
                                <td id="acoes"> 
                                    <img src="${pageContext.request.contextPath}/img/adm/ferramenta-lapis 1.svg" alt="alterar">
                                    <img src="${pageContext.request.contextPath}/img/adm/lixeira 1.svg" alt="excluir">
                                </td>
                            </tr>
                            <tr>
                                <td>10</td>
                                <td>Guitarra Pacifica</td>
                                <td>R$ 100,00</td>
                                <td>Yamaha</td>
                                <td>Guitarra</td>
                                <td id="acoes"> 
                                    <img src="${pageContext.request.contextPath}/img/adm/ferramenta-lapis 1.svg" alt="alterar">
                                    <img src="${pageContext.request.contextPath}/img/adm/lixeira 1.svg" alt="excluir">
                                </td>
                            </tr>
                        </tbody>
                    </table>
                
                </div>
            </section>
        </article>
    </main>
</body>

</html>