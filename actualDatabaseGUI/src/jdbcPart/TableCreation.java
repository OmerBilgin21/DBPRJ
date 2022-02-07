package jdbcPart;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class TableCreation {
	public void table()
			throws ClassNotFoundException, SQLException,
			FileNotFoundException,UnsupportedEncodingException
	{
			Connection baglanti=DBDataAccess.dbBaglanti();
			Statement ifade=baglanti.createStatement();
			
			String SQLifade1="CREATE TABLE companies" +
					"(id int," + 
					"sirket NVARCHAR(32)," +
					"ad NVARCHAR(32)," +
					"sahipAd NVARCHAR(32)," +
					"sahipSoyad NVARCHAR(32)," +
					"email NVARCHAR(32)," +
					"PRIMARY KEY (id));";
			
			String SQLifade2="CREATE TABLE workspaces"+
					"(id int," +
					"calismaAlani NVARCHAR(32)," +
					"alanAciklama NVARCHAR(32)," +
					"PRIMARY KEY (id));";
			
			String SQLifade3="CREATE TABLE workers" +
					"(id int," +
					"departmanId int," +
					"ad NVARCHAR(32)," +
					"soyad NVARCHAR(32)," +
					"email NVARCHAR(32)," +
					"dogum date," +
					"maas int,"+
					"PRIMARY KEY (id));";
			
			String SQLifade4="CREATE TABLE localBuyers" +
					"(id int," +
					"firma_id int," +
					"baslangic date," +
					"bitis date," +
					"adres NVARCHAR(32)," +
					"telefon NVARCHAR(32)," +
					"faks NVARCHAR(32)," +
					"PRIMARY KEY (id));";
			
			String SQLifade5="CREATE TABLE countries" +
					"(id NVARCHAR(32)," +
					"ad NVARCHAR(32)," +
					"sehirSayisi int," +
					"sehirAdi NVARCHAR(32)," +
					"PRIMARY KEY (id));";
			
			int etkilenensatirsayisi1=ifade.executeUpdate(SQLifade1);
			if(etkilenensatirsayisi1==0)
			System.out.println("companies Tablosu olusturulmustur.");
			int etkilenensatirsayisi2=ifade.executeUpdate(SQLifade2);
			if(etkilenensatirsayisi2==0)
			System.out.println("workspaces Tablosu olusturulmustur.");
			int etkilenensatirsayisi3=ifade.executeUpdate(SQLifade3);
			if(etkilenensatirsayisi3==0)
			System.out.println("workers Tablosu olusturulmustur.");
			int etkilenensatirsayisi4=ifade.executeUpdate(SQLifade4);
			if(etkilenensatirsayisi4==0)
			System.out.println("localBuyers Tablosu olusturulmustur.");
			int etkilenensatirsayisi5=ifade.executeUpdate(SQLifade5);
			if(etkilenensatirsayisi5==0)
			System.out.println("countries Tablosu olusturulmustur.");

			
			
	}
}
