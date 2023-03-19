package Controller;

import java.io.IOException;

import Model.BO.CheckLoginBO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(name = "login", urlPatterns = {"/login"})
public class CheckLoginServlet extends HttpServlet {   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String destination  = null;
		Cookie cookie = new Cookie("Username", request.getParameter("Username"));
		cookie.setMaxAge(60*60*24*365);
		response.addCookie(cookie);
        String Username = request.getParameter("Username");
        String Pass = request.getParameter("Password");
        CheckLoginBO checkLoginBO = new CheckLoginBO();
        
        if(checkLoginBO.isValidUser(Username, Pass)){
            destination= "/Edit.jsp";
            RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
            rd.forward(request, response);
        }
        else{
            destination= "/Index.jsp";
            RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
            rd.forward(request, response);
        }
    }
}
