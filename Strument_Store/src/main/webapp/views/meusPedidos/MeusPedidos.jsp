<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="br.com.model.Pedidos"%>
<%@page import="br.com.model.PedidosList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Meus Pedidos</title>
<link rel="stylesheet" type="text/css" href="StyleMeusPedidos.css">
<link rel="icon" href="../../img/logoIcon.png" type="image/x-icon">
</head>
<body>
	<div class="container_pedidos">
		<div class="titulo_voltar">
			<div>
				<div></div>
				<h1>Seus pedidos</h1>
			</div>
		
			<a href="${pageContext.request.contextPath}/pages/home/Home.jsp">Voltar para a loja</a>
		</div>
	
	<table>
		<tr class="cabecalho">
			<th id="espaco"></th>
			<th>Pedido</th>
			<th>Status</th>
			<th>Enviar para</th>
			<th>Total</th>
		</tr>
			
		
		<tr>
			<th style="padding: 10px;"></th>
		</tr>
		
		<% 
		
		PedidosList.pedidosList.add(new Pedidos(1123,"https://http2.mlstatic.com/D_NQ_NP_2X_908282-MLU72574760628_112023-F.webp","Á caminho","Italo Ribeiro de Alcântara", 100));

		
		if(!PedidosList.pedidosList.isEmpty()){
			for(Pedidos p : PedidosList.pedidosList) {
				out.print("<tr class=\"pedido\">");
				out.print("<th>");
				out.print("<img src=\""+p.getImg()+"\"/>");
				out.print("</th>");
				out.print("<th id=\"cdg\">"+p.getCdg()+"</th>");
				
				out.print("<th>");
				out.print("<img id=\"icon\" src=\"https://cdn-icons-png.flaticon.com/512/3607/3607300.png\" />");
				out.print("<p>"+p.getStatus()+"</p>");
				out.print("</th>");
				out.print("<th>"+p.getDestinatario()+"</th>");
				out.print("<th>R$ "+p.getTotal()+"</th>");
				out.print("</tr>");	
			}
			
		}else{
			out.print("<tr>");
			out.print("<th colspan=\"5\">");
			out.print("<h1 style=\"padding-top:100px\">Você ainda não fez pedidos.</h1>");
			out.print("</th>");
			out.print("</tr>");
		}
			
		%>
	</table>
	
	
	</div>
	
	
</body>
</html>