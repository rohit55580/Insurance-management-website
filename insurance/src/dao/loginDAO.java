package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import DBconnection.connectionDb;
import beans.person;

public class loginDAO 
{
	public static boolean authentication(person obj)
	{
		
		try
		{
			Connection con  =  connectionDb.getConnectionDb();
			Statement st=con.createStatement(); 			//permission to execute query
			String q  =  "select * from persons where Email  =  '"+obj.getEmail()+"' and cid = "+obj.getId();
			ResultSet rs  =  st.executeQuery(q);
			while(rs.next())
			{
				obj.setFname(rs.getString(2));
				obj.setLname(rs.getString(3));
				obj.setPhone(rs.getString(5));
				obj.setAge(rs.getInt(6));
				return true;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return false;
	}
}
