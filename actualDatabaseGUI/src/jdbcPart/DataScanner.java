package jdbcPart;

import java.sql.*;
import java.util.Scanner;

import java.io.*;

public class DataScanner {
		
	public void arayici()
	
			throws ClassNotFoundException, SQLException,FileNotFoundException, UnsupportedEncodingException
				
			{
				
					Connection baglanti=DBDataAccess.dbBaglanti();
					Statement ifade=baglanti.createStatement();
		
					String SQLifade1="select * from  workers where soyad='Elmas'";
					ResultSet sonucKumesi1=ifade.executeQuery(SQLifade1);
					while(sonucKumesi1.next())
					{
					
						System.out.println(sonucKumesi1.getString(1)
						+" "+sonucKumesi1.getString(2)
						+" "+sonucKumesi1.getString(3)
						+" "+sonucKumesi1.getString(4)
						+" "+sonucKumesi1.getString(5)
						+" "+sonucKumesi1.getString(6)
						+" "+sonucKumesi1.getString(7));
						
					}
			
				System.out.println("workers tablosundan soyadi 'Elmas' olan herkes bulundu.\n");
			}

	
}
