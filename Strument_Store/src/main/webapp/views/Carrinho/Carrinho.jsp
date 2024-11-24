<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Carrinho</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/views/Carrinho/Carrinho.css">
<link rel="icon" href="../../img/logoIcon.png" type="image/x-icon">
</head>
<body>
	<jsp:include page="../../includes/Header.jsp"/>
    <div class="container_carrinho">
        <div class="cabecalho_carrinho">
            <div>
                <div id="linha"></div>
                <p>Carrinho de compras</p>
            </div>
            <a href="${pageContext.request.contextPath}/views/home/Home.jsp">Voltar para a loja</a>
        </div>
        <div class="conteudo_carrinho">
            <div class="linha_preco">
                <p>Preço</p>
                <div></div>
            </div>
            <div class="produto">
                <img src="${pageContext.request.contextPath}/img/produtos/guitarra-vermelha.png" alt="">
                <div class="informacoes">
                    <p>Violão asdssaadsadsadsad sdada
                        adasssasd, 212, madeira</p>
                    <div>
                        <p id="estoque">Em estoque</p>
                        <p id="frete">Frete GRÁTIS</p>
                    </div>
                    <div>
                        <p id="qtd">Qtd: 1</p>
                        <p id="excluir">Excluir</p>
                    </div>
                </div>
                <p id="preco">R$ 200,00</p>
            </div>
            <div id="linha-horizont"></div>
            <div class="produto">
                <img src="${pageContext.request.contextPath}/img/produtos/guitarra-vermelha.png" alt="">
                <div class="informacoes">
                    <p>Violão asdssaadsadsadsad sdada
                        adasssasd, 212, madeira</p>
                    <div>
                        <p id="estoque">Em estoque</p>
                        <p id="frete">Frete GRÁTIS</p>
                    </div>
                    <div>
                        <p id="qtd">Qtd: 1</p>
                        <p id="excluir">Excluir</p>
                    </div>
                </div>
                <p id="preco">R$ 200,00</p>
            </div>
            <div id="linha-horizont"></div>
            <div class="produto">
                <img src="${pageContext.request.contextPath}/img/produtos/guitarra-vermelha.png" alt="">
                <div class="informacoes">
                    <p>Violão asdssaadsadsadsad sdada
                        adasssasd, 212, madeira</p>
                    <div>
                        <p id="estoque">Em estoque</p>
                        <p id="frete">Frete GRÁTIS</p>
                    </div>
                    <div>
                        <p id="qtd">Qtd: 1</p>
                        <p id="excluir">Excluir</p>
                    </div>
                </div>
                <p id="preco">R$ 200,00</p>
            </div>
            <div id="linha-horizont"></div>
        </div>
    </div>
</body>
</html>