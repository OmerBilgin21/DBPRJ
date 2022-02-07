package jdbcPart;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) 
	
			throws ClassNotFoundException, SQLException,FileNotFoundException, UnsupportedEncodingException
	{	
		
		{
			
			Scanner okuyucu = new Scanner(System.in);
			
			int cevap=0;
			
			DatabaseCreation yarat = new DatabaseCreation();
			
			yarat.creation();
			
			TableCreation tabloyarat = new TableCreation();
			
			tabloyarat.table();
			
			TableDataEntry verigiris = new TableDataEntry();
			
			verigiris.data();
			
			DataWriter vericikis = new DataWriter();
			
			vericikis.yazici();
			
			DataScanner arar = new DataScanner();
			
			System.out.println("Bir veri aratmak istiyor musunuz ?\nevet ise 2'yi hayir ise 3'u tuslayin. ");
			cevap=okuyucu.nextInt();
			
			if(cevap==2) {
			
				arar.arayici();
			}
			if(cevap==3) {
				
				System.out.println("hiçbir veri aratilmadi. \n");
				
			}
			
			okuyucu.close();
			
		}

}
}