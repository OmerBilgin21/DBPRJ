package jdbcPart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCreationAccess {
	public static Connection dbCreation() 
		
				throws ClassNotFoundException,SQLException
				
		{
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection dbCreation=DriverManager.getConnection("jdbc:sqlserver://LOCALHOST;"
		+ "databaseName=master","root","toor");
		return dbCreation;
		
		}
}
