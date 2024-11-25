<!DOCTYPE html>
<html lang="pt">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pagamento</title>
    <script src="<%= request.getContextPath() %>/script/pagamento.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/views/pagamento/pagamento.css">
</head>
<body>

    <header>
        <h6>[CARRINHO]</h6>
        <hr>
        <h6>[ENDEREÇO]</h6>
        <hr>
        <h6><strong>[PAGAMENTO]</strong></h6>
        <hr>
        <h6>[CONCLUIR]</h6>
    </header>

    <main>
        <section class="pagamentos">
            <input type="radio" id="1" onclick="radioOn(this, 1)">
            <label for="option1">Pix:</label>

            <div id="ocult1">
                <input type="text" id="pix" value="00020126360014BR.GOV.BCB.PIX0114StrumentStore@email.com52040000530398654041.90000000000000001400000000000000000000000000000000000000000000000000000000000000000000000000000" 
                readonly> 
                <button id="share" onclick="compartilhar()">Copiar</button>

                <div class="qrcode">
                    <img src="<%= request.getContextPath() %>/img/QRCode_Fácil.svg" alt="">
                </div>
            </div>
        </section>
            
        <section id="boleto" class="pagamentos">
            <input type="radio" id="2" onclick="radioOn(this, 2)">
            <label for="option2">BOLETO:</label>

            <div id="ocult2">
                <img src="<%= request.getContextPath() %>/img/Captura de tela 2024-11-16 145241.png" alt="">
            </div>
        </section>

        <section id="cartao" class="pagamentos">
            <div class="cartao">
                <label for="option3">CARTÃO:</label>
                <p>DEBITO</p>
                <input type="radio" id="3" onclick="radioOn(this, 3)">
                <p>CREDITO</p>
                <input type="radio" id="4" onclick="radioOn(this, 4)">
            </div>

            <div id="ocult3">
                <p>DEBITO</p>

                <input type="text" placeholder="NOME" required>
                <input type="number" placeholder="N°" required>
                <input type="number" placeholder="CV" required>

            </div>
            <div id="ocult4">
                <p>CRÉDITO</p>
                <div class="credito-f">
                    <input type="text" placeholder="NOME" required>
                    <input type="number" placeholder="N°" required>
                    <input type="number" placeholder="CV" required>
                    <input type="number" placeholder="Parcelas" required>
                </div>
            </div>
        </section>

        <article>
                <button type="submit"><a href="/Strument_Store/views/pagamento/Concluido.jsp" style="text-decoration: none;color: #241711;">Confirmar Compra!</a></button>
        </article>
    </main>

</body>
</html>
