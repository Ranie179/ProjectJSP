package Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import java.sql.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import Model.DAO.CheckRegisterDAO;

@WebServlet(name = "register", urlPatterns = {"/register"})
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Username = request.getParameter("Username");
        String Email = request.getParameter("Email");
        String Pass = request.getParameter("Pass");
        String Repass = request.getParameter("Repass");
        
        CheckRegisterDAO register = new CheckRegisterDAO();
        if (register.Register(Username, Email, Pass, Repass)) {
        	String destination= "/Success.jsp";
            RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
            rd.forward(request, response);
        }
        else{
            String destination= "/Register.jsp";
            RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
            rd.forward(request, response);
        }
	}

}
