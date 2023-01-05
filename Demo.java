package hybernate;

import java.sql.*;

public class Demo {

	public static void main(String[] args) throws SQLException
	{
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/rathandb";
		String uname = "root";
		String pass = "Rathan7*";
		String query = "select FirstName from employee where EmpID=2";

		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());;
		//Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name = rs.getString("FirstName");
		System.out.println(name);
		st.close();
		con.close();
		}
	//jdbc:mysql://localhost:3306/?user=root
}
