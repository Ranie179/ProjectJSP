package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.net.HttpCookie;

import jakarta.servlet.RequestDispatcher;
import java.util.List;

import Model.Bean.Content;
import Model.BO.ContentBO;
@WebServlet(name = "show", urlPatterns = {"/show"})
public class ShowController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContentBO bo = new ContentBO();
		String name = "";
		Cookie[] cookies = request.getCookies();
		for (int i = 0; i < cookies.length; i++) {
            if(cookies[i].getName().compareTo("Username") == 0) {
            	name = cookies[i].getValue();
            }
        }
		List<Content> list = bo.getContent(name);
		request.setAttribute("list", list);
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/Content.jsp");
        rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
