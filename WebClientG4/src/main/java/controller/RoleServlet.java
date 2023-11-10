package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.RoleService;

import java.io.IOException;
import java.util.List;

import entities.Role;
@WebServlet("/role")
/**
 * Servlet implementation class RoleServlet
 */
public class RoleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private RoleService roleService;

    @Override
    public void init() throws ServletException {
        roleService = new RoleService(); // Initialisation du service, adaptez-le à votre configuration
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Role> roles = roleService.getAllRoles();
        request.setAttribute("roles", roles);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/role.jsp");
        dispatcher.forward(request, response);
    }

}
