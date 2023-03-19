package Model.BO;

import java.util.ArrayList;
import java.util.List;

import Model.Bean.*;
import Model.DAO.ContentDAO;
public class ContentBO {
		ContentDAO dao = new ContentDAO();
	    public List<Content> getContent(String name){
	        return dao.getContent(name);
	    }
		public boolean delete(int contentID) {
			return dao.delete(contentID);
		}
		public boolean show(int contentID) {
			return dao.show(contentID);
		}
		public boolean editcontent(int contentID, String title, String brief, String content) {
			return dao.editcontent(contentID, title, brief, content);
		}
		public boolean create(String name, String title, String brief, String content) {
			return dao.create(name, title, brief, content);
		}
		public List<Content> search(String name, String search, String option) {
			 List<Content> list = new ArrayList<>();
		        switch(option){
		            case "Title":
		                list = dao.search(name, search, "Title");
		                break;
		            case "Brief":
		                list = dao.search(name, search, "Brief");
		                break;
		            case "Content":
		                list = dao.search(name, search, "Content");
		                break;
		        }
		        return list;
		    }
		}

