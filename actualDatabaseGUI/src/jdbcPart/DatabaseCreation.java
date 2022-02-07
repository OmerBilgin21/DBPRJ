package jdbcPart;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseCreation {
public void creation() 
	
			throws ClassNotFoundException, SQLException,
			FileNotFoundException,UnsupportedEncodingException
			
			{
				
				Connection baglanti=DBCreationAccess.dbCreation();
				
				Statement ifade=baglanti.createStatement();
				
				String SQLifade="Create database DBPRJ";
				
				int etkilenensatirsayisi=ifade.executeUpdate(SQLifade);
				
				if(etkilenensatirsayisi==0)
				System.out.println("DBPRJ Veritabani olusturulmustur.");
				
			}
}
