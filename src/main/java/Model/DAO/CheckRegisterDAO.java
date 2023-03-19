package Model.DAO;

import java.sql.Connection;
import java.util.Calendar;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDate;

public class CheckRegisterDAO {

	public boolean Register(String Username, String Email, String Pass, String Repass) {
		 try {
			 	LocalDate todayLocalDate = LocalDate.now();
			 	java.sql.Date sqlDate = java.sql.Date.valueOf(todayLocalDate);
		    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		    	Connection connection = DriverManager
		                .getConnection("jdbc:sqlserver://DESKTOP-DGL2A4A\\RAINIE:1433;databaseName=JSP1;\"\r\n"
		                		+ "	+ \"encrypt=true;trustServerCertificate=true;", "sa", "123456789");
		    	if (Pass.equals(Repass)) {
		        String sql = "INSERT INTO Member(Username, Email, Pass, CreatedDate)"
		        		+ "VALUES (?, ?, ?, ?);";
		        PreparedStatement statement = connection.prepareStatement(sql);
		        statement.setString(1, Username);
		        statement.setString(2, Email);
		        statement.setString(3, Pass);
		        statement.setDate(4, sqlDate);
		        statement.executeUpdate();
		        if(statement != null){
		            return true;
		        	}
		    	}
		    } catch (Exception e) {
		    	System.out.println(e);
		    }
		    return false;
	}

}
