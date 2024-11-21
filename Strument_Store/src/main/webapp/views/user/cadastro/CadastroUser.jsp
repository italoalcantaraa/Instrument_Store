<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro Usuário</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/views/user/cadastro/CadastroUserStyle.css">
</head>
<body>

    <div class="container">
        <div class="cabec_container">
            <img src="${pageContext.request.contextPath}/img/logo.png" alt="">
            <p id="cadastro_titulo">Cadastro</p>
        </div>
        <form action="${pageContext.request.contextPath}/cliente/inserir" method="get" class="conteudo">
        	<div>
                <p>Nome</p>
                <input type="text" placeholder="Informe o nome" name="nome" id="nome" value = "${param.nome}">
                <p id="erro"><% if(request.getAttribute("erroNome") != null) {
                	out.print(request.getAttribute("erroNome"));		
                } %></p>
            </div>
            <div>
                <p>E-mail</p>
                <input type="email" placeholder="Informe o seu e-mail" name="email" id="" value = "${param.email}">
                <p id="erro"><% if(request.getAttribute("erroEmail") != null) {
                	out.print(request.getAttribute("erroEmail"));		
                } %></p>
            </div>
            <div class="cpf_tel">
                <div>
                    <p>CPF</p>
                    <input type="text" name="cpf" pattern="\d{3}\.\d{3}\.\d{3}-\d{2}"
                        title="Digite um CPF no formato: xxx.xxx.xxx-xx" placeholder="xxx.xxx.xxx-xx" value = "${param.cpf}">
                	<p id="erro">
                		<% 
                		if(request.getAttribute("erroCpfNull") != null)
                			out.print(request.getAttribute("erroCpfNull"));		
                		else if(request.getAttribute("erroCpfInvalido") != null) 
                			out.print(request.getAttribute("erroCpfInvalido"));					
              		 %></p>
                </div>
                <div>
                    <p>Telefone</p>
                    <input type="tel" name="telefone" id="" placeholder="Número de telefone" value = "${param.telefone}">
                    <p id="erro">
                		<% 
                		if(request.getAttribute("erroTelefoneNull") != null)
                			out.print(request.getAttribute("erroTelefoneNull"));		
                		else if(request.getAttribute("erroTelefoneInvalido") != null) 
                			out.print(request.getAttribute("erroTelefoneInvalido"));					
              		 %></p>
                </div>
            </div>
            <div class="senha_confir">
                <div>
                    <p>Senha</p>
                    <input type="password" placeholder="Informe a senha" name="senha" id="" value = "${param.senha}">
                     <p id="erro">
                		<% 
                		if(request.getAttribute("erroSenhaNull") != null)
                			out.print(request.getAttribute("erroSenhaNull"));
              		 %></p>
                </div>
                <div>
                    <p>Confirme a senha</p>
                    <input type="password" placeholder="Confirme a senha" name="confirmaSenha" id="">
                	 <p id="erro">
                		<% 
                		if(request.getAttribute("erroSenhaConfereNull") != null)
                			out.print(request.getAttribute("erroSenhaConfereNull"));		
                		else if(request.getAttribute("erroSenhaConfereInvalida") != null) 
                			out.print(request.getAttribute("erroSenhaConfereInvalida"));					
              		 %></p>
                
                </div>
            </div>
            <div class="cidade_estado">
                <div>
                    <p>Cidade</p>
                    <input type="text" placeholder="Informe o estado" name="cidade" id="" value = "${param.cidade}">
                    <p id="erro">
                		<% 
                		if(request.getAttribute("erroCidadeNull") != null)
                			out.print(request.getAttribute("erroCidadeNull"));
              		 %></p>
                </div>
                <div>
                    <p>Estado</p>
                    <select required name="uf">
                    	<option value="">UF</option>
                        <option value="AC">AC</option>
                        <option value="AL">AL</option>
                        <option value="AP">AP</option>
                        <option value="UF">AM</option>
                        <option value="BA">BA</option>
                        <option value="CE">CE</option>
                        <option value="DF">DF</option>
                        <option value="ES">ES</option>
                        <option value="GO">GO</option>
                        <option value="MA">MA</option>
                        <option value="MT">MT</option>
                        <option value="MS">MS</option>
                        <option value="MG">MG</option>
                        <option value="PA">PA</option>
                        <option value="PB">PB</option>
                        <option value="PR">PR</option>
                        <option value="PE">PE</option>
                        <option value="PI">PI</option>
                        <option value="RJ">RJ</option>
                        <option value="RN">RN</option>
                        <option value="RS">RS</option>
                        <option value="RO">RO</option>
                        <option value="RR">RR</option>
                        <option value="SC">SC</option>
                        <option value="SP">SP</option>
                        <option value="SE">SE</option>
                        <option value="TO">TO</option>
                    </select>
                </div>
            </div>
            <input type="submit" value="Cadastrar" name="" id="cadastrar">	
            <a id="login" href="${pageContext.request.contextPath}/views/user/login/LoginUser.jsp">Fazer Login</a>
        </form>
            
        </div>
        <jsp:include page="../../../includes/Footer.jsp"/>
    
</body>
</html>