// Project V2- Code for Login Window

package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;

public class Login_user extends JFrame implements ActionListener{

	// Component Declaration
	public final JTextField textField;
	private final JPasswordField passwordField;
	private final JButton b1,b2,b3;

	public Login_user() {

		// Title
		super ("Login");

		// JPanel
		setBackground(new Color(203, 43, 43));
        setBounds(600, 300, 825, 475);
        JPanel panel = new JPanel();
		panel.setBackground(new Color(253, 253, 253, 253));
		setContentPane(panel);
		panel.setLayout(null);

		// Image Icon 1 (Logo)
		JLabel limg = new JLabel("");
		limg.setVerticalAlignment(SwingConstants.TOP);
		ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/TITLEnew.png"));
		Image i2 = i1.getImage().getScaledInstance(135, 25,Image.SCALE_SMOOTH);
		ImageIcon i3 = new ImageIcon(i2);
		limg= new JLabel(i3);
		limg.setBounds(180, 60, 165, 152);
		panel.add(limg);

		// Image Icon 2 (Library)
		JLabel limgPrime = new JLabel("");
		limg.setVerticalAlignment(SwingConstants.TOP);
		ImageIcon iPrime  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/LoginImg.jpg"));
		Image iPPrime = iPrime.getImage().getScaledInstance(500, 500,Image.SCALE_DEFAULT);
		ImageIcon iPPPrime = new ImageIcon(iPPrime);
		limg= new JLabel(iPPPrime);
		limg.setBounds(500, 0,530 , 500);
		panel.add(limg);

		// User-Name Text Field
		textField = new JTextField();
		textField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.ROMAN_BASELINE, 14), new java.awt.Color(102,153,235)));
		textField.setBounds(100, 110, 325, 50);
		panel.add(textField);

		// Password Field
		passwordField = new JPasswordField();
		passwordField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.ROMAN_BASELINE, 14), new java.awt.Color(102,153,235)));
		passwordField.setBounds(100, 170, 325, 50);
		panel.add(passwordField);

		JLabel l3 = new JLabel("");
		l3.setBounds(267, 79, 46, 34);
		panel.add(l3);
		JLabel l4 = new JLabel("");
		l4.setBounds(267, 124, 46, 34);
		panel.add(l3);

		// Sign In Button
		b1 = new JButton("Sign In");
		b1.setBackground(new java.awt.Color(255, 255, 255));
		b1.setFont(new java.awt.Font("Microsoft JhengHei", Font.BOLD, 14)); // NOI18N
		b1.setForeground(new java.awt.Color(102, 102, 255));
		b1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(175, 200, 255), 2, true));
		b1.addActionListener(this);
		b1.setBounds(280, 250, 113, 39);
		panel.add(b1);

		// Sign Up Button
		b2 = new JButton("Sign Up");
		b2.setBackground(new java.awt.Color(255, 255, 255));
		b2.setFont(new java.awt.Font("Microsoft JhengHei", Font.BOLD, 14)); // NOI18N
		b2.setForeground(new java.awt.Color(102, 102, 255));
		b2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(175, 200, 255), 2, true));
		b2.addActionListener(this);
		b2.setBounds(130, 250, 113, 39);
		panel.add(b2);

		// Forgot Password Button
		b3 = new JButton("Forgot your Password? Click Here");
		b3.setBorder(null);
		b3.addActionListener(this);
		b3.setForeground(new Color(255, 167, 0));
		b3.setBackground(new Color(253, 253, 253));
		b3.setBounds(115, 300, 303, 39);
		panel.add(b3);

	}

	// Connection to MySQL and Actions Class
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == b1) {
				Boolean status = false;
				try {
					Connection c;
					Statement s;
					Class.forName("com.mysql.cj.jdbc.Driver");
					c = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibMgmSys_ProjectV2?characterEncoding=latin1", "root", "password");
					s = c.createStatement();

					String sql = "select * from accounts where userrname=? and password=?";
					PreparedStatement st = c.prepareStatement(sql);

					st.setString(1, textField.getText());
					st.setString(2, passwordField.getText());

					ResultSet rs = st.executeQuery();
					if (rs.next()) {
						this.setVisible(false);
						new Loading().setVisible(true);
					} else
						JOptionPane.showMessageDialog(null, "Invalid Login...!.");

				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
            if(ae.getSource() == b2){
                setVisible(false);
		Signup su = new Signup();
		su.setVisible(true);
            }   
            if(ae.getSource() == b3){
                setVisible(false);
		Forgot forgot = new Forgot();
		forgot.setVisible(true);
            }
        }
        
  	public static void main(String[] args) {
                new Login_user().setVisible(true);
	}

}
