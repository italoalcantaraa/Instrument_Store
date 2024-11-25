<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Perfil Usuario</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: Arial, sans-serif;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            overflow: hidden;
            animation: gradientAnimation 8s infinite alternate;
        }


		form{
		width: 100%;
		display: flex;
		justify-content: center;
		align-items: center;
		}
		
        header {
            background: rgba(255, 255, 255, 0.8);
            padding: 20px;
            border-radius: 12px;
            box-shadow: 0px 4px 20px rgba(0, 0, 0, 0.1);
            text-align: center;
            width: 25%;
        }

        figure img {
            width: 100px;
            height: 100px;
            border-radius: 50%;
            border: 2px solid #F0D085;
        }

        section input {
            display: block;
            width: 100%;
            margin: 10px 0;
            padding: 10px;
            font-size: 14px;
            border: 1px solid #ddd;
            border-radius: 8px;
            background: #fff;
        }

        /* Animação do fundo com gradenteee! */
        @keyframes gradientAnimation {
            0% {
                background: linear-gradient(135deg, #F0D085, #F1DFB3);
            }
            50% {
                background: linear-gradient(135deg, #F1DFB3, #F0D085);
            }
            100% {
                background: linear-gradient(135deg, #F0D085, #F1DFB3);
            }
        }

article{
    display: flex;
    padding: 10px;
    justify-content: center;
    justify-content: space-between;
}
        
.botao{
    appearance: none;
    background-color: #FFFFFF;
    border-radius: 40em;
    border-style: none;
    box-shadow: #ffe5ad 0 -12px 6px inset;
    box-sizing: border-box;
    color: #000000;
    cursor: pointer;
    display: inline-block;
    font-family: -apple-system, sans-serif;
    font-size: 1.2rem;
    font-weight: 700;
    letter-spacing: -.24px;
    margin: 0;
    outline: none;
    padding: 1rem 1.3rem;
    text-align: center;
    text-decoration: none;
    transition: all .15s;
    user-select: none;
    -webkit-user-select: none;
    touch-action: manipulation;
  }
  
  article form #d:hover {
    background: linear-gradient(67deg, #ffe097, #fd877e);
    box-shadow: rgba(241, 208, 136, 0.7) 0 -6px 8px inset;
    transform: scale(1.125);
}

article form #e:hover {
    background: linear-gradient(67deg, #ffe944, #fdc87e);
    box-shadow: rgba(241, 208, 136, 0.7) 0 -6px 8px inset;
    transform: scale(1.125);
}

  
article button:active {
    transform: scale(1.025);
  }
    </style>
</head>
<body>
<form action="${pageContext.request.contextPath}" method="post" var="cliente">
	    <header>
        <figure>
            <img src="${pageContext.request.contextPath}/img/user-avatar-filled-alt-svgrepo-com.svg" alt="Avatar do Usuário">
        </figure>
        <section>
            <input type="text" value="${cliente.getDs_nome()}" readonly> <!--nome -->
            <input type="text" value="${cliente.getDs_email()}" readonly><!--email -->
            <input type="text" value="${cliente.getDs_telefone()}" readonly><!--telefone -->
            <input type="password" value="${cliente.getDs_senha()}" readonly> <!--senha -->
        </section>
        
      <article>
    		
        		<input type="hidden" name="cpf" value="${cliente.getDs_cpf()}">
        			<button type="submit" class="botao" id="d" onclick="return confirm('Tem certeza de que deseja excluir sua conta?')">
            		Deletar Conta
        			</button>

    
		   
		        <input type="hidden" name="cpf" value="${cliente.getDs_cpf()}">
		        <button type="submit" class="botao" id="e">Editar</button>

</article>
    </header>
</form>
</body>
</html>