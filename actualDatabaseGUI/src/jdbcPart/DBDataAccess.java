package jdbcPart;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBDataAccess {
	public static Connection dbBaglanti() 
			throws ClassNotFoundException,SQLException,
			FileNotFoundException,UnsupportedEncodingException
	{
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	Connection dbBaglanti=
	DriverManager.getConnection("jdbc:sqlserver://LOCALHOST;"
	+ "databaseName=DBPRJ","root","toor");
	return dbBaglanti;
	}
}
