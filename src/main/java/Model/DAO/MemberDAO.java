package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Model.Bean.Member;

public class MemberDAO {
	public boolean edit(String Username, String Firstname, String Lastname, String Email, String Phone, String Descript) {
		try {
			LocalDate todayLocalDate = LocalDate.now();
		 	java.sql.Date sqlDate = java.sql.Date.valueOf(todayLocalDate);
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    	Connection connection = DriverManager
                .getConnection("jdbc:sqlserver://DESKTOP-DGL2A4A\\RAINIE:1433;databaseName=JSP1;\"\r\n"
                		+ "	+ \"encrypt=true;trustServerCertificate=true;", "sa", "123456789");
        String sql = "update Member set Firstname = ?, Lastname = ?, Email = ?, Phone = ?, Descript = ?, UpdateTime = ? where Username = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, Firstname);
        statement.setString(2, Lastname);
        statement.setString(3, Email);
        statement.setString(4, Phone);
        statement.setString(5, Descript);
        statement.setDate(6, sqlDate);
        statement.setString(7, Username);
        statement.executeUpdate();
        if(statement != null){
            return true;
        }
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
}

