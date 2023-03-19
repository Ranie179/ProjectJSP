package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Model.Bean.Content;

public class ContentDAO {
	public List<Content> getContent(String name){
        List<Content> list = new ArrayList<>();
        try {
        	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	Connection connection = DriverManager
	                .getConnection("jdbc:sqlserver://DESKTOP-DGL2A4A\\RAINIE:1433;databaseName=JSP1;\"\r\n"
	                		+ "	+ \"encrypt=true;trustServerCertificate=true;", "sa", "123456789");
            String sql = "SELECT * FROM Content\r\n"
            		+ "LEFT JOIN Member ON Content.AuthorID = Member_ID\r\n"
            		+ "WHERE Username = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                list.add(new Content(rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getDate(6), rs.getInt(1)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

	public boolean delete(int contentID) {
		try {
	    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	Connection connection = DriverManager
	                .getConnection("jdbc:sqlserver://DESKTOP-DGL2A4A\\RAINIE:1433;databaseName=JSP1;\"\r\n"
	                		+ "	+ \"encrypt=true;trustServerCertificate=true;", "sa", "123456789");
	        String sql = "delete from Content where Content_ID = ?";
	        PreparedStatement statement = connection.prepareStatement(sql);
	        statement.setInt(1, contentID);
	        int resultSet = statement.executeUpdate();
	        if(resultSet != 0){
	            return true;
	        }
	    } catch (Exception e) {
	    	System.out.println(e);
	    }
	    return false;
	}

	public boolean show(int contentID) {
		try {
	    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	Connection connection = DriverManager
	                .getConnection("jdbc:sqlserver://DESKTOP-DGL2A4A\\RAINIE:1433;databaseName=JSP1;\"\r\n"
	                		+ "	+ \"encrypt=true;trustServerCertificate=true;", "sa", "123456789");
	        String sql = "select * from Content where Content_ID = ?";
	        PreparedStatement statement = connection.prepareStatement(sql);
	        statement.setInt(1, contentID);
	        ResultSet resultSet = statement.executeQuery();
	        if(resultSet.next()){
	            return true;
	        }
	    } catch (Exception e) {
	    	System.out.println(e);
	    }
	    return false;
	}

	public boolean editcontent(int contentID, String title, String brief, String content) {
		try {
			LocalDate todayLocalDate = LocalDate.now();
		 	java.sql.Date sqlDate = java.sql.Date.valueOf(todayLocalDate);
	    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	Connection connection = DriverManager
	                .getConnection("jdbc:sqlserver://DESKTOP-DGL2A4A\\RAINIE:1433;databaseName=JSP1;\"\r\n"
	                		+ "	+ \"encrypt=true;trustServerCertificate=true;", "sa", "123456789");
	        String sql = "update Content set Title = ?, Brief = ?, Content = ?, UpdateTime = ? where Content_ID = ?";
	        PreparedStatement statement = connection.prepareStatement(sql);
	        statement.setString(1, title);
	        statement.setString(2, brief);
	        statement.setString(3, content);
	        statement.setDate(4, sqlDate);
	        statement.setInt(5,  contentID);
	        statement.executeUpdate();
	        if(statement != null){
	            return true;
	        }
	    } catch (Exception e) {
	    	System.out.println(e);
	    }
		return false;
	}

	public boolean create(String name, String title, String brief, String content) {
		try {
			LocalDate todayLocalDate = LocalDate.now();
		 	java.sql.Date sqlDate = java.sql.Date.valueOf(todayLocalDate);
	    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	Connection connection = DriverManager
	                .getConnection("jdbc:sqlserver://DESKTOP-DGL2A4A\\RAINIE:1433;databaseName=JSP1;\"\r\n"
	                		+ "	+ \"encrypt=true;trustServerCertificate=true;", "sa", "123456789");
	        String sql = "insert into Content(Title, Brief, Content, CreatedDate, AuthorID)"
	        		+ "values (?, ?, ?, ?, (select Member_ID from Member where Username = ? ))";
	        PreparedStatement statement = connection.prepareStatement(sql);
	        statement.setString(1, title);
	        statement.setString(2, brief);
	        statement.setString(3, content);
	        statement.setDate(4, sqlDate);
	        statement.setString(5, name);
	        statement.executeUpdate();
	        if(statement != null){
	            return true;
	        }
	    } catch (Exception e) {
	    	System.out.println(e);
	    }
		return false;
	}

	public List<Content> search(String name, String search, String option) {
		List<Content> list = new ArrayList<>();
        try {
        	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	Connection connection = DriverManager
	                .getConnection("jdbc:sqlserver://DESKTOP-DGL2A4A\\RAINIE:1433;databaseName=JSP1;\"\r\n"
	                		+ "	+ \"encrypt=true;trustServerCertificate=true;", "sa", "123456789");
            String sql = null;
            if (search != null)
            	sql = "select * from Content where (AuthorID = (select Member_ID from Member where Username = ?)) and " + option + " LIKE " + "'%" + search + "%'";
            else sql = "select * from Content";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                list.add(new Content(rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getDate(6), rs.getInt(1)));
            }
        } catch (Exception e) {
            System.out.println("Error!!");
        }
        return list;
	}
	
	
		
}

