/**
 * 
 */document.addEventListener('DOMContentLoaded', () => {
  const cartTable = document.getElementById('cart-table').querySelector('tbody');
  const subtotalElement = document.getElementById('subtotal');
  const totalElement = document.getElementById('total');
  const cartModal = document.getElementById('cart-modal');
  const cartBtn = document.getElementById('cart-btn');
  const finalizeBtn = document.getElementById('finalize-btn');
  const closeBtns = document.querySelectorAll('.close-btn');
  const shippingCost = 50; // Valor fixo do frete

  let subtotal = 0;

  // Função para adicionar item ao carrinho
  const addToCart = (productName, price, quantity) => {
      const row = document.createElement('tr');
      const totalItem = price * quantity;

      row.innerHTML = `
          <td>${productName}</td>
          <td class="price">R$ ${price.toFixed(2).replace('.', ',')}</td>
          <td>
              <input type="number" value="${quantity}" min="1" class="quantity">
          </td>
          <td class="total">R$ ${totalItem.toFixed(2).replace('.', ',')}</td>
          <td><button class="remove-btn">Remover</button></td>
      `;

      cartTable.appendChild(row);

      // Atualizar subtotal
      subtotal += totalItem;
      updateTotals();

      // Evento para remover item do carrinho
      row.querySelector('.remove-btn').addEventListener('click', () => {
          subtotal -= totalItem;
          row.remove();
          updateTotals();
      });

      // Evento para atualizar quantidade de itens no carrinho
      row.querySelector('.quantity').addEventListener('input', (event) => {
          const newQuantity = parseInt(event.target.value);
          const price = parseFloat(row.querySelector('.price').textContent.replace('R$ ', '').replace(',', '.'));
          const newTotal = price * newQuantity;
          row.querySelector('.total').textContent = `R$ ${newTotal.toFixed(2).replace('.', ',')}`;

          // Atualiza subtotal
          subtotal = Array.from(cartTable.querySelectorAll('tr')).reduce((acc, tr) => {
              const rowTotal = parseFloat(tr.querySelector('.total').textContent.replace('R$ ', '').replace(',', '.'));
              return acc + rowTotal;
          }, 0);

          updateTotals();
      });
  };

  // Função para atualizar os valores de subtotal e total
  const updateTotals = () => {
      subtotalElement.textContent = subtotal.toFixed(2).replace('.', ',');
      totalElement.textContent = (subtotal + shippingCost).toFixed(2).replace('.', ',');
  };

  // Adicionar itens ao carrinho ao clicar no botão "Adicionar ao Carrinho"
  document.querySelectorAll('.add-to-cart-btn').forEach((button) => {
      button.addEventListener('click', () => {
          const product = button.closest('.product');
          const productName = product.querySelector('h2').textContent;
          const price = parseFloat(product.querySelector('.price').textContent.replace('R$ ', '').replace('.', '').replace(',', '.'));
          const quantity = parseInt(product.querySelector('.quantity-input').value);
          addToCart(productName, price, quantity);
      });
  });

  // Abrir modal do carrinho
  cartBtn.addEventListener('click', () => {
      cartModal.style.display = 'flex';
  });

  // Fechar modal do carrinho
  closeBtns.forEach(btn => {
      btn.addEventListener('click', () => {
          cartModal.style.display = 'none';
      });
  });

  // Fechar modal ao clicar fora do conteúdo
  window.addEventListener('click', (event) => {
      if (event.target === cartModal) {
          cartModal.style.display = 'none';
      }
  });

  // Finalizar compra
  finalizeBtn.addEventListener('click', () => {
      alert('Compra finalizada!');
      cartTable.innerHTML = ''; // Limpa o carrinho
      subtotal = 0; // Reseta subtotal
      updateTotals(); // Atualiza valores
      cartModal.style.display = 'none'; // Fecha o modal
  });
});
