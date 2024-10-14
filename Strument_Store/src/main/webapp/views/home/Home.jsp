<%@page import="br.com.model.Produtos"%>
<%@page import="br.com.model.ProdutosList"%>
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
	
	<div style="width: 100%" class="image">
	    <img style="width: 100%" alt="sla" src="../../img/violao.jpg">
	</div>
	
    
	<div class="produtos">	
		<% 
			ProdutosList.produtosList.add(new Produtos("../../img/produtos/guitarra-vermelha.png", "Guitarra Cassio Red Elétrica Muito Boa", 500));
		if(!ProdutosList.produtosList.isEmpty()) {
			for(Produtos p : ProdutosList.produtosList) {
				out.print("	<a class=\"container_prod\" href=\"../Produto/Produto.jsp\">");
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

				out.print("</a>");
			}
		}else {
			out.print("<div class=\"sem_produtos\"><p>Não há produtos.</p></div>");
		}
		%>
	</div>
	<jsp:include page="../../includes/Footer.jsp" />
</body>
</html>