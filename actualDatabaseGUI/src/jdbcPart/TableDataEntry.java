package jdbcPart;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class TableDataEntry {
	public void data()
			throws ClassNotFoundException, SQLException,
			FileNotFoundException,UnsupportedEncodingException
			{
			
			Connection baglanti=DBDataAccess.dbBaglanti();
			Statement ifade=baglanti.createStatement();
			
			String SQLifade1="Insert into companies(id, sirket, ad, sahipAd, sahipSoyad, email) " +
					"values (1, 'Dunder', 'Mifflin', 'Michael', 'Mifflin', 'Mifflin@gmail.com'); " +
					"Insert into companies(id, sirket, ad, sahipAd, sahipSoyad, email) " +
					"values (2, 'Eryilmaz', 'Limited', 'Esma', 'Eryilmaz', 'esmanureryilmaz1206@gmail.com'); " +
					"Insert into companies(id, sirket, ad, sahipAd, sahipSoyad, email) " +
					"values (3, 'Bilgin', 'Tech', 'Omer', 'Bilgin', 'gates@gmail.com'); " +
					"Insert into companies(id, sirket, ad, sahipAd, sahipSoyad, email) " +
					"values (4, 'Google', 'Corporation', 'Larry', 'Page', 'page@gmail.com'); " +
					"Insert into companies(id, sirket, ad, sahipAd, sahipSoyad, email) " +
					"values (5, 'Amazon', 'Inc', 'Jeff', 'Bezos', 'bezos@gmail.com'); ";
			
			String SQLifade2="Insert into workspaces(id, calismaAlani, alanAciklama)" +
					"values (1,'Sells','paper');" +
					"Insert into workspaces(id, calismaAlani, alanAciklama)" +
					"values (2,'Hardware','store');" +
					"Insert into workspaces(id, calismaAlani, alanAciklama)" +
					"values (3,'Software','store');" +
					"Insert into workspaces(id, calismaAlani, alanAciklama)" +
					"values (4,'Search','engine');" +
					"Insert into workspaces(id, calismaAlani, alanAciklama)" +
					"values (5,'Online','Marketing');";
			
			String SQLifade3="Insert into workers(id, departmanId, ad, soyad, email, dogum, maas)" +
					"values (1, 12, 'Azade','Elmas','info@azade.info.com', '1979-09-05', 2200);" +
					"Insert into workers(id, departmanId, ad, soyad, email, dogum, maas)" +
					"values (2, 16, 'Ahmet','Elmas','ahmet@gmail.com', '1973-09-05', 1100);" +
					"Insert into workers(id, departmanId, ad, soyad, email, dogum, maas)" +
					"values (3, 8, 'Cengiz','Elmas','cengiz@gmail.com', '1950-01-01', 2600);" +
					"Insert into workers(id, departmanId, ad, soyad, email, dogum, maas)" +
					"values (4, 18, 'Seval','Elmas','sevalc@gmail.com', '1962-05-01', 1200);" +
					"Insert into workers(id, departmanId, ad, soyad, email, dogum, maas)" +
					"values (5, 12, 'Aytek','Karadeniz','aytek@ghotmail.com', '1983-10-11', 950);";
			
			String SQLifade4="Insert into localBuyers(id, firma_id, baslangic, bitis, adres, telefon, faks)" +
					"values (1, 1, '2004-01-01', '2004-12-31', 'Erenkoy Istanbul','2164671458','2164671459');" +
					"Insert into localBuyers(id, firma_id, baslangic, bitis, adres, telefon, faks)" +
					"values (2, 2, '2004-01-01', '9999-12-31', 'Mecidiyekoy Istanbul','2121112233','2122223344');" +
					"Insert into localBuyers(id, firma_id, baslangic, bitis, adres, telefon, faks)" +
					"values (3, 3, '2004-01-01', '2005-05-31', 'Kartal Istanbul','2163334455','2167748594');" +
					"Insert into localBuyers(id, firma_id, baslangic, bitis, adres, telefon, faks)" +
					"values (4, 4, '2004-01-01', '9999-12-31', 'Dudullu Istanbul','2164756475','2169405839');" +
					"Insert into localBuyers(id, firma_id, baslangic, bitis, adres, telefon, faks)" +
					"values (6, 2, '2005-06-01', '9999-12-31', 'Maslak Istanbul','2125344332','2125344335');";
			
			String SQLifade5="Insert into countries(id, ad, sehirSayisi, sehirAdi)" +
					"values ('1', 'Almanya', '79', 'Deutschland');" +
					"Insert into countries(id, ad, sehirSayisi, sehirAdi)" +
					"values ('2', 'Turkiye', '81', 'Istanbul');" +
					"Insert into countries(id, ad, sehirSayisi, sehirAdi)" +
					"values ('3', 'Ingiltere', '34', 'London');";
					
			int etkilenensatirsayisi1=ifade.executeUpdate(SQLifade1);
			if(etkilenensatirsayisi1>0)
			System.out.println("companies Tablosuna veri girilmiþtir.\n");
			int etkilenensatirsayisi2=ifade.executeUpdate(SQLifade2);
			if(etkilenensatirsayisi2>0)
			System.out.println("workspaces Tablosuna veri girilmiþtir.\n");
			int etkilenensatirsayisi3=ifade.executeUpdate(SQLifade3);
			if(etkilenensatirsayisi3>0)
			System.out.println("workers Tablosuna veri girilmiþtir.\n");
			int etkilenensatirsayisi4=ifade.executeUpdate(SQLifade4);
			if(etkilenensatirsayisi4>0)
			System.out.println("localBuyers Tablosuna veri girilmiþtir.\n");
			int etkilenensatirsayisi5=ifade.executeUpdate(SQLifade5);
			if(etkilenensatirsayisi5>0)
			System.out.println("countries Tablosuna veri girilmiþtir.\n");
		
			}
}
