<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/views/user/login/LoginUser.css">
</head>
<body>
    <div class="container_login">
        <div class="cabecalho_container">
            <img src="${pageContext.request.contextPath}/img/logo.png" alt="">
            <p>Login</p>
        </div>
        <form action="${pageContext.request.contextPath}/ServletLoginUser" method="post" class="conteudo">
            <div class="email_senha">
                <input type="email" name="email" placeholder="E-mail" id="">
               
                <input type="password" name="senha" placeholder="Senha" id="">
                </div>

            <div class="entrar_cadastrar">
                <input type="submit" id="Enviar">
                	<% 
                		if(request.getAttribute("erro") != null){
                			out.print("<p id=\"erro\">");
                				out.print(request.getAttribute("erro"));
                			out.print("<p>");
                			}
                	 %>
                
                <a href="${pageContext.request.contextPath}/views/user/cadastro/CadastroUser.jsp">Cadastrar</a>
            </div>

        </form>
    </div>
    
    <jsp:include page="../../../includes/Footer.jsp" />
</body>
</html>