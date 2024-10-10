<%@page import="br.com.teste.Produtos"%>
<%@page import="br.com.teste.ProdutosList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link rel="stylesheet" type="text/css" href="StyleHome.css">
</head>
<body>
	
	<jsp:include page="../../includes/Header.jsp"/>
	<h1>Home</h1>
	<p>opa</p>
	<p>opa2</p>
	<div class="produtos">
		<% 
			ProdutosList.produtosList.add(new Produtos("https://cdn3.iconfinder.com/data/icons/solid-locations-icon-set/64/Music_Band_2-256.png", "Guitarra Cassio Red Elétrica", 500));
		if(!ProdutosList.produtosList.isEmpty()) {
			for(Produtos p : ProdutosList.produtosList) {
				out.print("<div class=\"produto\">");
				
				out.print("<div class=\"img_produto\">");
					out.print("<img src=\""+p.getImg()+"\"/>");
				out.print("</div>");
				
				out.print("<p id=\"desc\">"+p.getDescricao()+"</p>");
					out.print("<div class=\"preco_produto\">");
						out.print("<p>R$ "+p.getPreco()+"</p>");
						out.print("<img src=\"https://cdn-icons-png.flaticon.com/512/1077/1077035.png\"/>");
					out.print("</div>");
					out.print("<form action=\"\" method=\"post\">");
					out.print("<input type=\"submit\" value=\"Adicionar ao Carrinho\">");
					out.print("</form>");
					
				out.print("</div>");
			}
		}else {
			out.print("<div class=\"sem_produtos\"><p>Não há produtos.</p></div>");
		}
		%>
	</div>
	<jsp:include page="../../includes/Footer.jsp" />
</body>
</html>