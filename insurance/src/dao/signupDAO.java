package dao;

import java.awt.image.RescaleOp;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import DBconnection.connectionDb;
import beans.person;

public class signupDAO 
{
	public static boolean authentication(person obj)
	{
		
		try
		{
			Connection con  =  connectionDb.getConnectionDb();
			Statement st=con.createStatement(); 			//permission to execute query
			String q  =  "select * from persons where Email  =  '"+obj.getEmail()+"'";
			ResultSet rs  =  st.executeQuery(q);
			while(rs.next())
			{
				return false;
			}
			String qry="insert into persons( LastName , FirstName , Email, Phone , Age) values  ( '"+obj.getLname()+"','"+obj.getFname()+"','"+obj.getEmail()+"','"+obj.getPhone()+"',"+obj.getAge()+")";
			System.out.println(qry);
			int x = st.executeUpdate(qry); 		//returns 0:means unsucessful
			if(x != 0)
			{
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
