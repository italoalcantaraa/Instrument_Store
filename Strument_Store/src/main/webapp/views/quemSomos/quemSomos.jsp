<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quem Somos?</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/views/quemSomos/quemSomos.css">
<link rel="icon" href="../../img/logoIcon.png" type="image/x-icon">
</head>
<body>
	
	<jsp:include page="../../includes/Header.jsp"/>
	
	<div>
		<div class="title">
			<div id="barra-reta"></div>
			<h2 class="quem">Quem Somos ?</h2>
		</div>

		<div class="text">
			<p>Na Instrument Store, a música é mais do que um negócio – é a
				nossa paixão! Fundada com o propósito de conectar músicos de todos
				os níveis aos melhores instrumentos e equipamentos, nossa loja
				oferece uma seleção diversificada de produtos de alta qualidade para
				atender a todos, desde iniciante até profissional.
				<br>
				<br>
				 Acreditamos que a
				música tem o poder de transformar vidas, e estamos aqui para apoiar
				essa jornada. Seja você um guitarrista em busca de um som único, um
				baterista explorando novos ritmos, ou alguém que está começando a
				descobrir o mundo musical, nós temos as ferramentas certas para
				você.
				<br>
				<br>
				Além de oferecer uma ampla variedade de instrumentos, nossa
				equipe é composta por músicos experientes, prontos para ajudar com
				orientações personalizadas e dicas que vão muito além da venda. Para
				nós, cada cliente é um parceiro na criação de novas melodias e
				harmonias. 
				<br>
				<br>
				Estamos comprometidos em proporcionar uma experiência de
				compra excepcional, com atendimento dedicado, produtos de alta
				qualidade e preços justos. Na Instrument Store, ajudamos você a
				encontrar o instrumento perfeito para expressar seu talento e
				explorar novos horizontes musicais. Venha nos visitar e faça parte
				da nossa comunidade musical!</p>

			<h2 class="meio">Desde 2003, a maior loja de Instrumentos Musicais da América Latina</h2>

			<div class="info">
				<div class="colab">
					<img src="../../img/icon/users-alt.png">
					<h3>+ 500</h3>
					<p>Colaboradores</p>
				</div>

				<div class="loc">
					<img src="../../img/icon/map-marker.png">
					<h3>+ 1.000</h3>
					<p>Cidades Atendidas</p>
				</div>

				<div class="client">
					<img src="../../img/icon/handshake.png">
					<h3>+ 1 milhão</h3>
					<p>de Clientes</p>
				</div>

				<div class="pedidos">
					<img src="../../img/icon/truck-side.png">
					<h3>+ 8 milhões</h3>
					<p>de Pedidos</p>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="../../includes/Footer.jsp" />
</body>
</html>