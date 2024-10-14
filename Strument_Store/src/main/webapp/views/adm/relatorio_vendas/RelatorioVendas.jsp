<%@page import="br.com.model.PopUp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="Style.css">
</head>
<body>

<form action="${pageContext.request.contextPath}/ServletTeste" method="post">
	<input type="submit" value="Clique aqui!">
</form>



<div 
	style="<% if(PopUp.enabled) out.print("display: none;"); %>"
	
	class="container_vendas">
        <p>Venda nº10</p>

        <table>
            <tr>
                <td>Data</td>
                <td>ID</td>
                <td>Nome</td>
                <td>Qtd</td>
                <td>Preço</td>
                <td>Total</td>
            </tr>
            <tr>
                <td>11/10/24</td>
                <td>111</td>
                <td>Guitarra</td>
                <td>Qtd</td>
                <td>R$ 600,00</td>
                <td></td>
            </tr>
            <tr>
                <td>11/10/24</td>
                <td>111</td>
                <td>Guitarra</td>
                <td>Qtd</td>
                <td>R$ 600,00</td>
                <td></td>
            </tr>
            <tr>
                <td>11/10/24</td>
                <td>111</td>
                <td>Guitarra</td>
                <td>Qtd</td>
                <td>R$ 600,00</td>
                <td></td>
            </tr>
            <tr>
                <td>11/10/24</td>
                <td>111</td>
                <td>Guitarra</td>
                <td>Qtd</td>
                <td>R$ 600,00</td>
                <td id="total">R$ 2400,00</td>
            </tr>  
        </table>
    </div>
	
</body>
</html>