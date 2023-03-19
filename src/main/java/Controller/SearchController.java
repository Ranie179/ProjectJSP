package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import Model.BO.*;
import Model.Bean.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "search", urlPatterns = {"/search"})
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String option = request.getParameter("option");
        String search = request.getParameter("search");
        String name = "";
        Cookie[] cookies = request.getCookies();
		for (int i = 0; i < cookies.length; i++) {
            if(cookies[i].getName().compareTo("Username") == 0) {
            	name = cookies[i].getValue();
            }
        }
        ContentBO bo = new ContentBO();
        List<Content> list = bo.search(name, search, option);
        request.setAttribute("list", list);
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/Content.jsp");
        rd.forward(request, response);
	}

}
