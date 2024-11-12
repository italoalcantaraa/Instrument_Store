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
	
	<jsp:include page="../../includes/Header.jsp"/>
	
	<div style="width: 100%" class="image">
	    <img style="width: 100%" alt="sla" src="../../img/violao.jpg">
	</div>
	
    
	<div class="produtos">	
		
	</div>
	<jsp:include page="../../includes/Footer.jsp" />
</body>
</html>