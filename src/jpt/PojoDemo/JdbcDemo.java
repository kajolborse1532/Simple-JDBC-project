package jpt.PojoDemo;
import java.sql.*;

public class JdbcDemo {

	public static void main(String[] args) throws Exception {
		
		String url="jdbc:mysql://localhost:3306/aliens";
		String uname="root";
		String pass="Rashi@21";
		String query = "SELECT userName FROM students WHERE userid = 1";


		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs= st.executeQuery(query);
		
		rs.next();
		String name=rs.getString("userName");
		System.out.println(name);
		
		st.close();
		
		con.close();
	}

}