package Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import Model.BO.ContentBO;
import Model.DAO.ContentDAO;

@WebServlet(name = "create", urlPatterns = {"/create"})
public class CreateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = "";
		Cookie[] cookies = request.getCookies();
		for (int i = 0; i < cookies.length; i++) {
            if(cookies[i].getName().compareTo("Username") == 0) {
            	name = cookies[i].getValue();
            }
        }
		ContentBO bo = new ContentBO();
		String title = request.getParameter("Title");
		String brief = request.getParameter("Brief");
		String content = request.getParameter("Content");
		if(bo.create(name, title, brief, content)){
            String destination= "/show";
            RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
            rd.forward(request, response);
        }
		 else{
	            String destination= "/Index.jsp";
	            RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
	            rd.forward(request, response);
	        }
	}
}

