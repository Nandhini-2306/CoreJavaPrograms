package mysqlex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckConnectionEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/dbstudent";
		Connection c = DriverManager.getConnection(url, "root", "yesh");
		System.out.println("Database dbstudent connection successfully established.");

	}

}
