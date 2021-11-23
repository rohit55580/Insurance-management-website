package DBconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectionDb 
{
	public static Connection getConnectionDb()
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");		// driver loading
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance","root",""); 	//connection
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}
}
