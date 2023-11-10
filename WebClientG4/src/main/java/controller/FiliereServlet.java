package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.FiliereService;

import java.io.IOException;
import java.util.List;

import entities.Filiere;
@WebServlet("/filiere")
/**
 * Servlet implementation class FiliereServlet
 */
public class FiliereServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	private FiliereService filiereService;

    @Override
    public void init() throws ServletException {
        filiereService = new FiliereService(); // Initialisation du service, adaptez-le à votre configuration
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Filiere> filieres = filiereService.getAllFilieres();
        request.setAttribute("filieres", filieres);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/filiere.jsp");
        dispatcher.forward(request, response);
    }

}
