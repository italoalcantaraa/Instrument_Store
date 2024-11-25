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
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/views/home/StyleHome.css">
<link rel="icon" href="../../img/logoIcon.png" type="image/x-icon">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css">
</head>
<body>
	<jsp:include page="../../includes/Header.jsp" />

	<div style="width: 100%" class="image">
		<img style="width: 100%" alt="sla" src="${pageContext.request.contextPath}/img/violao.jpg">
	</div>

<div class="produtos">
	
			<div class="container_prod">
			<c:forEach var="produto" items="${produtoList}" >
				<div class="produto">
					<div class="img_produto">
						<img alt="erro" src="${pageContext.request.contextPath}/img/produtos/${produto.ds_img}"/>
					</div>
					<p>${produto.ds_descricao}</p>
					<div class="preco_produto">
						<p>R$ ${produto.vl_preco}</p>
						<img src="${pageContext.request.contextPath}/img/coracao.png" />
					</div>
					
						<a type="submit" href="/Strument_Store/pedido/inserir?id=${produto.cod_produto}&cpf=${param.cpf}">Adicionar ao Carrinho</a>
					
				</div>
			</c:forEach>
			</div>
	
	
</div>
	<jsp:include page="../../includes/Footer.jsp" />
</body>
	<script type="text/javascript">
			//window.location.href = "http://localhost:8080/Strument_Store/views/home/listar";
	</script>
</html>