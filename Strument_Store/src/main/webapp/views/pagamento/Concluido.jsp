<!DOCTYPE html>
<html lang="pt-BR">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Obrigado!</title>
    <script src="<%= request.getContextPath() %>/components/prisma/loader.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css">
    <style>
      body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        margin: 0;
        padding: 0;
        display: flex;
        align-items: center;
        justify-content: center;
        height: 100vh;
      }

      .obrigado-container {
        background: #ffffff;
        border-radius: 8px;
        padding: 20px 30px;
        text-align: center;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
        max-width: 400px;
        width: 90%;
      }

      .obrigado-container h1 {
        font-size: 30px;
        color: #4caf50;
        margin-bottom: 10px;
      }

      .obrigado-container img {
        max-width: 100px;
        max-height: 80px;
      }

      .obrigado-container p {
        font-size: 16px;
        color: #555555;
        margin-bottom: 20px;
      }

      .obrigado-container .order-details {
        font-size: 14px;
        color: #777777;
        margin-bottom: 20px;
      }

      .obrigado-container button {
        background-color: #4caf50;
        color: white;
        border: none;
        border-radius: 4px;
        padding: 10px 20px;
        cursor: pointer;
        font-size: 16px;
        transition: background-color 0.3s ease;
      }

      .obrigado-container button:hover {
        background-color: #45a049;
      }
    </style>
  </head>

  <body>
    <script>
      loader();
    </script>
    <div class="obrigado-container">
      <h1 class="animate__animated animate__fadeInDownBig">Obrigado!</h1>
      <h4>Estamos Lisonjeados com sua compra</h4>

      <img class="animate__animated animate__backInRight" src="<%= request.getContextPath() %>/img/confirm-purchase-svgrepo-com.svg" alt="" />
      <p>Seu pedido foi recebido e est� sendo processado. </p>

      <div class="order-details">
        <strong>N�mero do pedido: </strong> #12345<br />
        <strong>Data:</strong> 25 de Novembro 2024
      </div>
    <button onclick="window.location.href='<%= request.getContextPath() %>/views/home/home.jsp'">
  Return to Homepage
</button>
    </div>

  </body>
</html>
