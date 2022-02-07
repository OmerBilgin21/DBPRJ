package actualDatabaseGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginGUI extends JFrame {

	private JPanel wPane;
	private JTextField fieldID;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI frame = new LoginGUI();
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
	public LoginGUI() {
		setResizable(false);
		setTitle("Holding Database");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 540);
		wPane = new JPanel();
		wPane.setBackground(Color.WHITE);
		wPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(wPane);
		wPane.setLayout(null);
		
		JLabel lblicon = new JLabel(new ImageIcon(getClass().getResource("IconDBPRJ.jpg")));
		lblicon.setBounds(0, 0, 358, 498);
		wPane.add(lblicon);
		
		JLabel lblWelcome = new JLabel("DBPRJ Sistemine Ho\u015Fgeldiniz.");
		lblWelcome.setFont(new Font("Times New Roman", lblWelcome.getFont().getStyle() | Font.BOLD, lblWelcome.getFont().getSize() + 13));
		lblWelcome.setBounds(400, 65, 360, 47);
		wPane.add(lblWelcome);
		
		JTabbedPane loginTabPane = new JTabbedPane(JTabbedPane.TOP);
		loginTabPane.setBackground(Color.WHITE);
		loginTabPane.setForeground(Color.BLACK);
		loginTabPane.setBounds(400, 145, 470, 335);
		wPane.add(loginTabPane);
		
		JPanel registerPanel = new JPanel();
		registerPanel.setForeground(Color.WHITE);
		registerPanel.setBackground(Color.WHITE);
		loginTabPane.addTab("Yönetici Giriþi", null, registerPanel, null);
		registerPanel.setLayout(null);
		
		JLabel lblIDinfo = new JLabel("Kullan\u0131c\u0131 Ad\u0131:");
		lblIDinfo.setBounds(25, 28, 121, 22);
		registerPanel.add(lblIDinfo);
		
		JLabel lblPassInfo = new JLabel("\u015Eifre:");
		lblPassInfo.setBounds(25, 103, 93, 22);
		registerPanel.add(lblPassInfo);
		
		fieldID = new JTextField();
		fieldID.setFont(new Font("Tahoma", Font.BOLD, 13));
		fieldID.setColumns(10);
		fieldID.setBounds(25, 63, 116, 22);
		registerPanel.add(fieldID);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(25, 138, 116, 22);
		registerPanel.add(passwordField);
		
		JButton btnNewButton = new JButton("Giri\u015F Yap");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String pass = new String(passwordField.getPassword());
				
				if(fieldID.getText().length() == 0 || pass.length() == 0) {
					
					JOptionPane.showMessageDialog(wPane, "Lütfen tüm alanlarý doldurun !", "Hata !", JOptionPane.WARNING_MESSAGE);
				}
				
				else if(fieldID.getText().contentEquals("root") && pass.equals("toor")) {
					
					GuiPart tabloGUI = new GuiPart();
					tabloGUI.setVisible(true);
					dispose();
					
				}
				else {
					
					JOptionPane.showMessageDialog(wPane, "Kullanýcý Adý veya Þifre yanlýþ !", "Hata !", JOptionPane.WARNING_MESSAGE);
					
				}
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(165, 42, 42));
		btnNewButton.setBounds(25, 232, 200, 60);
		registerPanel.add(btnNewButton);
	}
}
