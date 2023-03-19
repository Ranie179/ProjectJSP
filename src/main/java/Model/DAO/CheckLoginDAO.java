package Model.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CheckLoginDAO {
	public boolean LoginMember (String Username, String Pass){
	    try {
	    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	Connection connection = DriverManager
	                .getConnection("jdbc:sqlserver://DESKTOP-DGL2A4A\\RAINIE:1433;databaseName=JSP1;\"\r\n"
	                		+ "	+ \"encrypt=true;trustServerCertificate=true;", "sa", "123456789");
	        String sql = "select * from Member where Username = ? and Pass = ?";
	        PreparedStatement statement = connection.prepareStatement(sql);
	        statement.setString(1, Username);
	        statement.setString(2, Pass);
	        ResultSet resultSet = statement.executeQuery();
	        if(resultSet.next()){
	            return true;
	        }
	    } catch (Exception e) {
	    	System.out.println(e);
	    }
	    return false;
    }
		
}


