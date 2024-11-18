<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@page import="br.com.model.Produto"%>
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
	<jsp:include page="../../includes/Header.jsp" />

	<div style="width: 100%" class="image">
		<img style="width: 100%" alt="sla" src="../../img/violao.jpg">
	</div>

<div class="produtos">
	<c:forEach var="produto" items="${produtoList}" >
			<div class="container_prod">
				<div class="produto">
					<div class="img_produto">
						<img alt=".sfeef" src="../../img/produtos/${produto.ds_img}"/>
					</div>
					<p>${produto.ds_descricao}</p>
					<div class="preco_produto">
						<p>R$ ${produto.vl_preco}</p>
						<img src="../../img/coracao.png" />
					</div>
					<form>
						<input type="submit" value="Adicionar ao Carrinho">
					</form>
				</div>
			</div>
	</c:forEach>
</div>

	<jsp:include page="../../includes/Footer.jsp" />
</body>
	<script type="text/javascript">
		window.onload = () => {
			window.location.href = "http://localhost:8080/Strument_Store/views/home/listar";
		}
		
	</script>
</html>