package Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import Model.BO.ContentBO;
import Model.DAO.MemberDAO;

@WebServlet(name = "editcontent", urlPatterns = {"/editcontent"})
public class EditContentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int contentID = Integer.parseInt(request.getParameter("Content_ID").trim());
		ContentBO bo = new ContentBO();
		if(bo.show(contentID)){
            String destination= "/EditContent.jsp";
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
		int contentID = Integer.parseInt(request.getParameter("Content_ID").trim());
		String title = request.getParameter("Title");
		String brief = request.getParameter("Brief");
        String content = request.getParameter("Content");
        ContentBO bo = new ContentBO();
        if (bo.editcontent(contentID, title, brief, content)) {
        	String destination= "/show";
            RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
            rd.forward(request, response);
        } else{
            String destination= "/Index.jsp";
            RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
            rd.forward(request, response);
        } 
	}
}


