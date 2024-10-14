<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	
    <link rel="stylesheet" href="${pageContext.request.contextPath}/views/adm/login/login-adm.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100..900;1,100..900&display=swap"
        rel="stylesheet">
    <link rel="icon" href="../image/Logo.png" type="image/x-icon">
	<meta charset="UTF-8">
	<title>Login ADM</title>
</head>

<body class="corpo">

    <main class="elementos">
        <article class="alinhamento-elementos">

            <section class="parede-image">

                <img src="${pageContext.request.contextPath}/img/logo.png" alt="Logo" />
                <h1>Seja Bem-vindo ADM!</h1>

            </section>

            <section class="parede-cabecalho">
		
                <h1>Login</h1>
				
                
                <form action = "${pageContext.request.contextPath}/ServletLoginAdm" method="post">
                    <label>Nome:</label>
                    <input type="text" id="nome" name="nome">

                    <label>Senha:</label>
                    <input type="password" id="senha" name="senha">

                    <input id="botão" type="submit" value="Acessar">
                    <p style="font-size: 10px; color: red; margin-left: 16%;">
                    	<% if(request.getAttribute("erro") != null) {
                    	out.print(request.getAttribute("erro"));} %></p>
                </form>

            </section>
        </article>
    </main>
</body>
</html>