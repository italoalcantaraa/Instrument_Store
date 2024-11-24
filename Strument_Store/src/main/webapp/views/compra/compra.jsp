<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/views/compra/compra.css">
</head>
<body>

	<jsp:include page="../../includes/Header.jsp"/>
	
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
            <img alt="" src="../../img/produtos/guitarra-vermelha.png">
            </div>
            
            
        </section>
        <section class="resumo">
            <div class="resumo_carrinho">
                <h1>Resumo</h1>
                <div>
                    <p>Valor dos produtos: </p>
                    <p><strong id="totalProcucts">R$ 200,00</strong></p>
                </div>
                <div>
                    <p>Frete: </p>
                    <p><strong>Grátis</strong></p>
                </div>
                
                <div>
                    <p>Total à vista no pix: </p>
                    <p><strong id="total">R$ 200,00</strong></p>
                </div>
            </div>

            <div class="finalizar_compra">
                <a href="../pagamento/pagamento.html">Finalizar compra</a>
                <a href="../Home/Home.html">Continuar comprando</a>
            </div>
        </section>
    </main>
</body>
</html>