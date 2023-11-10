package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.StudentService;

import java.io.IOException;
import java.util.List;

import entities.Student;
@WebServlet("/student")
/**
 * Servlet implementation class StudentServlet
 */
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	 private StudentService studentService;

	    @Override
	    public void init() throws ServletException {
	        studentService = new StudentService(); // Initialisation du service, adaptez-le à votre configuration
	    }

	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        List<Student> students = studentService.getAllStudents();
	        request.setAttribute("students", students);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/student.jsp");
	        dispatcher.forward(request, response);
	    }

}
