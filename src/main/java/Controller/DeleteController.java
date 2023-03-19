package Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import Model.BO.ContentBO;

@WebServlet(name = "delete", urlPatterns = {"/delete"})
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int contentID = Integer.parseInt(request.getParameter("Content_ID").trim());
		ContentBO bo = new ContentBO();
		
		if(bo.delete(contentID)){
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


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
