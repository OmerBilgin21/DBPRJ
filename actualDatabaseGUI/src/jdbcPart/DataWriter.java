package jdbcPart;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DataWriter {
public void yazici() 
	
			throws ClassNotFoundException, SQLException,FileNotFoundException, UnsupportedEncodingException
	
	{
		
		File file = new File("C:\\Users\\user\\Desktop\\veriler.txt");
		
		try {
			FileWriter yaz = new FileWriter(file);
			
			Connection baglanti=DBDataAccess.dbBaglanti();
			Statement ifade=baglanti.createStatement();
			
			yaz.write("===companies Tablosu==="+"\n");
			System.out.println("===companies Tablosu===");
			
			String SQLifade="Select * from companies";
			ResultSet sonucKumesi=ifade.executeQuery(SQLifade);
			while(sonucKumesi.next())
			{
				System.out.println(sonucKumesi.getString(1)
						+" "+sonucKumesi.getString(2)
						+" "+sonucKumesi.getString(3)
						+" "+sonucKumesi.getString(4)
						+" "+sonucKumesi.getString(5)
						+" "+sonucKumesi.getString(6)+"\n");
				
				yaz.write(sonucKumesi.getString(1)
						+" "+sonucKumesi.getString(2)
					    +" "+sonucKumesi.getString(3)
						+" "+sonucKumesi.getString(4)
						+" "+sonucKumesi.getString(5)
						+" "+sonucKumesi.getString(6)+"\n");
				
						}
			
			yaz.write("============================\n");
			System.out.println("============================\n");
			
			Connection baglanti2=DBDataAccess.dbBaglanti();
			Statement ifade2=baglanti2.createStatement();
			
			yaz.write("\n===workspaces Tablosu==="+"\n");
			System.out.println("===workspaces Tablosu===");
			
			String SQLifade2="Select * from workspaces";
			ResultSet sonucKumesi2=ifade2.executeQuery(SQLifade2);
			while(sonucKumesi2.next())
			{
				System.out.println(sonucKumesi2.getString(1)
						+" "+sonucKumesi2.getString(2)
						+" "+sonucKumesi2.getString(3)+"\n");
				
				yaz.write(sonucKumesi2.getString(1)
						+" "+sonucKumesi2.getString(2)
					    +" "+sonucKumesi2.getString(3)+"\n");
				
						}
				
				

			System.out.println("============================\n");
			yaz.write("============================\n");
			
			yaz.write("\n===workers Tablosu==="+"\n");
			System.out.println("===workers Tablosu===");
			
			Connection baglanti3=DBDataAccess.dbBaglanti();
			Statement ifade3=baglanti3.createStatement();
			
			String SQLifade3="Select * from workers";
			ResultSet sonucKumesi3=ifade3.executeQuery(SQLifade3);
			while(sonucKumesi3.next())
			{
				System.out.println(sonucKumesi3.getString(1)
						+" "+sonucKumesi3.getString(2)
						+" "+sonucKumesi3.getString(3)
						+" "+sonucKumesi3.getString(4)
						+" "+sonucKumesi3.getString(5)
						+" "+sonucKumesi3.getString(6)+"\n");
				
				yaz.write(sonucKumesi3.getString(1)
						+" "+sonucKumesi3.getString(2)
					    +" "+sonucKumesi3.getString(3)
						+" "+sonucKumesi3.getString(4)
						+" "+sonucKumesi3.getString(5)
						+" "+sonucKumesi3.getString(6)
						+" "+sonucKumesi3.getString(7)+"\n");
				
						}
			
			System.out.println("============================\n");
			yaz.write("============================\n");
			
			yaz.write("\n===localBuyers Tablosu==="+"\n");
			System.out.println("===localBuyers Tablosu===");
			
			
			Connection baglanti4=DBDataAccess.dbBaglanti();
			Statement ifade4=baglanti4.createStatement();
			
			String SQLifade4="Select * from localBuyers";
			ResultSet sonucKumesi4=ifade4.executeQuery(SQLifade4);
			while(sonucKumesi4.next())
			{
				System.out.println(sonucKumesi4.getString(1)
						+" "+sonucKumesi4.getString(2)
						+" "+sonucKumesi4.getString(3)
						+" "+sonucKumesi4.getString(4)
						+" "+sonucKumesi4.getString(5)
						+" "+sonucKumesi4.getString(6)+"\n");
				
				yaz.write(sonucKumesi4.getString(1)
						+" "+sonucKumesi4.getString(2)
					    +" "+sonucKumesi4.getString(3)
						+" "+sonucKumesi4.getString(4)
						+" "+sonucKumesi4.getString(5)
						+" "+sonucKumesi4.getString(6)
						+" "+sonucKumesi4.getString(7)+"\n");
				
						}
			
			
			System.out.println("============================\n");
			yaz.write("============================\n");
			
			yaz.write("\n===countries Tablosu==="+"\n");
			System.out.println("===countries Tablosu===");
			
			
			Connection baglanti5=DBDataAccess.dbBaglanti();
			Statement ifade5=baglanti5.createStatement();
			
			String SQLifade5="Select * from countries";
			ResultSet sonucKumesi5=ifade5.executeQuery(SQLifade5);
			while(sonucKumesi5.next())
			{
				System.out.println(sonucKumesi5.getString(1)
						+" "+sonucKumesi5.getString(2)
						+" "+sonucKumesi5.getString(3)
						+" "+sonucKumesi5.getString(4)+"\n");
				
				yaz.write(sonucKumesi5.getString(1)
						+" "+sonucKumesi5.getString(2)
					    +" "+sonucKumesi5.getString(3)
						+" "+sonucKumesi5.getString(4)+"\n");
				
						}
			
			
			System.out.println("============================\n");
			yaz.write("============================\n");
			
			
			
			
			yaz.close();
		} catch (IOException e) {
			System.out.print("Veriler dosyaya yazilamadi.");
			e.printStackTrace();
		}
		
	}
}
