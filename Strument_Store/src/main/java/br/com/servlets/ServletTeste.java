package br.com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import javax.swing.Popup;

import br.com.model.PopUp;

public class ServletTeste extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletTeste() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PopUp.enabled = !PopUp.enabled;
		response.sendRedirect("../Strument_Store/views/adm/relatorio_vendas/RelatorioVendas.jsp");
	}

}
