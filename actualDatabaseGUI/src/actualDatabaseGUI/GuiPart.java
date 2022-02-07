package actualDatabaseGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JScrollBar;
import java.awt.Window.Type;
import javax.swing.UIManager;

public class GuiPart extends JFrame {

	private JPanel contentPane;
	private JTable companiesTablosu;
	private JTable countriesTablosu;
	private JTable localBuyersTablosu;
	private JTable workersTablosu;
	private JTable workspacesTablosu;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiPart frame = new GuiPart();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GuiPart() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 550);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb1 = new JLabel("Companies tablosu: ");
		lb1.setBounds(393, 5, 117, 16);
		JLabel lb2 = new JLabel("Countries tablosu: ");
		lb2.setBounds(397, 5, 108, 16);
		JLabel lb3 = new JLabel("Local Buyers tablosu: ");
		lb3.setBounds(389, 5, 125, 16);
		JLabel lb4 = new JLabel("Workers tablosu: ");
		lb4.setBounds(400, 5, 102, 16);
		JLabel lb5 = new JLabel("Workspaces tablosu: ");
		lb5.setBounds(390, 5, 123, 16);
		
		JPanel companies = new JPanel();
		companies.setBackground(Color.WHITE);
		companies.setLayout(null);
		companies.add(lb1);
		JPanel countries = new JPanel();
		countries.setBackground(Color.WHITE);
		countries.setLayout(null);
		countries.add(lb2);
		JPanel localBuyers = new JPanel();
		localBuyers.setBackground(Color.WHITE);
		localBuyers.setLayout(null);
		localBuyers.add(lb3);
		JPanel workers = new JPanel();
		workers.setBackground(Color.WHITE);
		workers.setLayout(null);
		workers.add(lb4);
		JPanel workspaces = new JPanel();
		workspaces.setBackground(Color.WHITE);
		workspaces.setLayout(null);
		workspaces.add(lb5);
		
		JTabbedPane mainAlan = new JTabbedPane(JTabbedPane.TOP);
		JOptionPane.showMessageDialog(mainAlan, "Baþarýyla giriþ yaptýnýz veritabanýnýzýn tablolarýný ve onlarýn içeriklerini görebilirsiniz");
		mainAlan.setToolTipText("Tablolar");
		mainAlan.setBackground(Color.WHITE);
		mainAlan.add("companies",companies);
	
		String[][] icerikCompanies = {{"ID", "ÞÝRKET" ,"ADI", "SAHÝP AD" ,"SAHÝP SOYAD" ,"EMAÝL"},
				{"1", "Dunder", "Mifflin", "Michael", "Mifflin", "Mifflin@gamil.com"},
				{"2", "Eryilmaz", "Limited", "Esma", "Eryilmaz", "esmanureryilmaz1206@gmail.com"},
				{"3", "Microsoft", "Corporation", "Bill", "Gates", "gates@gmail.com"},
				{"4", "Google", "Corporation", "Larry", "Page", "page@gmail.com"},
				{"5", "Amazon", "Inc", "Jeff", "Bezos", "bezos@gmail.com"}};
		
		String baslikCompanies[] = {"ID", "ÞÝRKET" ,"ADI", "SAHÝP AD" ,"SAHÝP SOYAD" ,"EMAÝL"};
		
		companiesTablosu = new JTable(icerikCompanies,baslikCompanies);
		companiesTablosu.setColumnSelectionAllowed(true);
		companiesTablosu.setCellSelectionEnabled(true);
		companiesTablosu.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		companiesTablosu.setBounds(12, 34, 879, 400);
		companies.add(companiesTablosu);
		mainAlan.add("countries",countries);
		
		String[][] icerikCountries = {{"ID", "ÜLKE ADI", "ÞEHÝR SAYISI", "BAÞKENT ADI"},
				{"1", "Almanya", "79", "Deutschland"},
				{"2", "Turkiye", "81", "Istanbul"},
				{"3", "Ingiltere", "34", "London"},};
		
		String baslikCountries[] = {"ID", "Ülke Adý", "Þehir sayýsý", "Þehir Adý"};
		
		countriesTablosu = new JTable(icerikCountries,baslikCountries);
		countriesTablosu.setFont(new Font("Tahoma", Font.BOLD, 13));
		countriesTablosu.setForeground(Color.BLACK);
		countriesTablosu.setColumnSelectionAllowed(true);
		countriesTablosu.setCellSelectionEnabled(true);
		countriesTablosu.setBounds(12, 34, 879, 382);
		countries.add(countriesTablosu);
		mainAlan.add("localBuyers",localBuyers);
		
		String[][] icerikLocalBuyers = {{"ID", "BAÞLANGIÇ", "BÝTÝÞ", "ADRES", "TELEFON", "FAKS"},
				{"1", "2004-01-01", "2004-12-31", "Erenkoy Istanbul","2164671458","2164671459"},
				{"2", "2004-01-01", "9999-12-31", "Mecidiyekoy Istanbul","2121112233","2122223344"},
				{"3", "2004-01-01", "2005-05-31", "Kartal Istanbul","2163334455","2167748594"},
				{"4", "2004-01-01", "9999-12-31", "Dudullu Istanbul","2164756475","2169405839"},
				{"2", "2005-06-01", "9999-12-31", "Maslak Istanbul","2125344332","2125344335"}};
		
		String[] baslikLocalBuyers = {"ID", "Baþlangýç", "Bitiþ", "Adres", "Telefon", "faks"};
		
		localBuyersTablosu = new JTable(icerikLocalBuyers,baslikLocalBuyers);
		localBuyersTablosu.setFont(new Font("Tahoma", Font.BOLD, 13));
		localBuyersTablosu.setBounds(12, 34, 879, 400);
		localBuyers.add(localBuyersTablosu);
		mainAlan.add("workers",workers);
		
		String[][] icerikWorkers = {{"ID", "AD", "SOYAD", "EMAIL", "DOÐUM", "MAAÞ"},
				{"1", "Azade","Elmas","info@azade.info.com", "1979-09-05", "2200"},
				{"2", "Ahmet","Elmas","ahmet@gmail.com", "1973-09-05", "1100"},
				{"3", "Cengiz","Elmas","cengiz@gmail.com", "1950-01-01", "2600"},
				{"4", "Seval","Elmas","sevalc@gmail.com", "1962-05-01", "1200"},
				{"5", "Aytek","Karadeniz","aytek@ghotmail.com", "1983-10-11", "950"}};
		
		String baslikWorkers[] = {"ID", "Ad", "SOYAD", "EMAIL", "DOÐUM", "MAAÞ"};
		
		workersTablosu = new JTable(icerikWorkers,baslikWorkers);
		workersTablosu.setFont(new Font("Tahoma", Font.BOLD, 13));
		workersTablosu.setBounds(12, 34, 879, 400);
		workers.add(workersTablosu);
		mainAlan.add("workspaces",workspaces);
		
		String[][] icerikWorkspaces = {{"ID", "ÇALIÞMA ALANI", "ALAN AÇIKLAMASI"},
				{"1","Sells","paper"},
				{"2","Hardware","store"},
				{"3","Software","store"},
				{"4","Search","engine"},
				{"5","Online","Marketing"}};
		
		String[] baslikWorkspaces = {"ID", "ÇALIÞMA ALANI", "ALAN AÇIKLAMASI"};
		
		workspacesTablosu = new JTable(icerikWorkspaces,baslikWorkspaces);
		workspacesTablosu.setFont(new Font("Tahoma", Font.BOLD, 13));
		workspacesTablosu.setBounds(12, 34, 879, 395);
		workspaces.add(workspacesTablosu);
		
		mainAlan.setBounds(12, 13, 908, 477);
		contentPane.add(mainAlan);
	}
}
