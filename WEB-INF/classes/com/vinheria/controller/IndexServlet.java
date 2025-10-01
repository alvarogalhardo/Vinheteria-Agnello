package com.vinheria.controller;

import com.vinheria.dao.ProdutoDAO;
import com.vinheria.model.Produto;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class IndexServlet extends HttpServlet {
    private ProdutoDAO produtoDAO;

    @Override
    public void init() throws ServletException {
        super.init();
        produtoDAO = new ProdutoDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        try {
            System.out.println("[IndexServlet] Iniciando processamento da requisição");
            
            // Buscar produtos em destaque
            List<Produto> destaques = produtoDAO.buscarDestaques();
            request.setAttribute("destaques", destaques);
            System.out.println("[IndexServlet] Produtos em destaque carregados: " + destaques.size());
            
            // Contar itens no carrinho (simulação)
            HttpSession session = request.getSession();
            Integer carrinhoCount = (Integer) session.getAttribute("carrinhoCount");
            if (carrinhoCount == null) {
                carrinhoCount = 0;
            }
            request.setAttribute("carrinhoCount", carrinhoCount);
            
            // Forward para index.jsp
            RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
            dispatcher.forward(request, response);
            
            System.out.println("[IndexServlet] Página inicial carregada com sucesso");
            
        } catch (Exception e) {
            System.err.println("[IndexServlet] Erro ao carregar página inicial: " + e.getMessage());
            e.printStackTrace();
            
            // Tentar redirecionar para página de erro
            try {
                request.setAttribute("errorMessage", "Erro ao carregar página inicial: " + e.getMessage());
                RequestDispatcher errorDispatcher = request.getRequestDispatcher("/error.jsp");
                errorDispatcher.forward(request, response);
            } catch (Exception errorEx) {
                System.err.println("[IndexServlet] Erro ao redirecionar para página de erro: " + errorEx.getMessage());
                response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Erro interno do servidor");
            }
        }
    }
}

