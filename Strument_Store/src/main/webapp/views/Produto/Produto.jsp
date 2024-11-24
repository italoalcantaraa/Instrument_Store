<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link rel="stylesheet" type="text/css" href="ProdutoStyle.css">
<link rel="icon" href="../../img/logoIcon.png" type="image/x-icon">
</head>
<body>
	
	<jsp:include page="../../includes/Header.jsp"/>
	
	<div id="Page">
	<nav>
		<div class="inicio_i"></div>
		<div class="inicio">
			<div class="barra"></div>
			<img src="../../img/marcas/yamaha.png">
			<img id="seta" alt="" src="../../img/right-arrow-svgrepo-com.png">
			<h1>Guitarra Cassio Red Elétrica</h1>
		</div>
		<div class="inicio_i"></div>
	</nav>
	
	<section>
		<figure>
			<img alt="" src="../../img/produtos/guitarra-vermelha.png">
		</figure>
	
		<div class="info">
			<h3>Guitarra Cassio Red Elétrica</h3>
			
			<div class="infoDin">
				<h2>R$ 560,00</h2>
				<img alt="" src="../../img/product/contorno-em-forma-de-coracao 26.svg">
			</div>
			
			<div class="o">
				<h6> ou R$ <strong>280,00</strong> sem juros</h6>
			</div>
			<div class="button">
				<div class="add">
					<input class="btn-s" type="button" value="-">
					<p>1</p>
					<input class="btn-s" type="button" value="+">
				</div>
				<input class="add-cart-btn" type="button" value="Adicionar ao Carrinho">
			</div>
		</div>
	</section>	
	
	<article>
		
		<div class="desc">
			<hr>
			<div class="desc-box">
				<h5>Descrição</h5>	
			</div>
	
		</div>
		
		<p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Commodi nostrum aperiam dicta quisquam eligendi fugit quasi harum, reiciendis consequuntur pariatur quae sint ducimus ipsum illum laudantium suscipit officiis maxime recusandae! Lorem ipsum dolor, sit amet consectetur adipisicing elit. Commodi nostrum aperiam dicta quisquam eligendi fugit quasi harum, reiciendis consequuntur pariatur quae sint ducimus ipsum illum laudantium suscipit officiis maxime recusandae! <p/>
	</article>
</div>
	<jsp:include page="../../includes/Footer.jsp" />
</body>
</html>