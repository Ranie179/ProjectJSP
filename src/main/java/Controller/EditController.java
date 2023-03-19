package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import Model.DAO.MemberDAO;

import java.io.IOException;

@WebServlet(name = "edit", urlPatterns = {"/edit"})
public class EditController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Username = request.getParameter("Username");
		String Firstname = request.getParameter("Firstname");
        String Lastname = request.getParameter("Lastname");
        String Email = request.getParameter("Email");
        String Phone = request.getParameter("Phone");
        String Descript = request.getParameter("Descript");
        MemberDAO dao = new MemberDAO();
        if (dao.edit(Username, Firstname, Lastname, Email, Phone, Descript)) {
        	String destination= "/Success.jsp";
            RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
            rd.forward(request, response);
        } else{
            String destination= "/Edit.jsp";
            RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
            rd.forward(request, response);
        } 
	}

}
