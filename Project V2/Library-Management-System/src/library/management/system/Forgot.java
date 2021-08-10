// Project V2- Code for Forgot Window

package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import java.awt.event.*;

public class Forgot extends JFrame implements ActionListener{

	// Component Declaration
    private JPanel contentPane;
    private JTextField t1,t2,t3,t4,t5,t6;
    private JButton b1,b2,b3;

    public static void main(String[] args) {
	new Forgot().setVisible(true);
    }

    public Forgot() {

    	// Title
    	super("Forgot Password");

    	// JPanel
    	setBounds(500, 200, 850, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(null);

		// Title Label
		JLabel lblTitle = new JLabel("Retrieve your Account");
		lblTitle.setForeground(Color.DARK_GRAY);
		lblTitle.setFont(new Font("Noto Sans", Font.BOLD, 20));
		lblTitle.setForeground(new java.awt.Color(0,0,0));
		lblTitle.setBounds(30, 20, 500, 60);
		contentPane.add(lblTitle);

		// User-Name Text Field
		t1 = new JTextField();
		t1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(115, 194, 251), 2, true), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", 3, 12), new java.awt.Color(115, 194, 251))); // NOI18N
		t1.setFont(new Font("Product Sans", Font.PLAIN, 13));
		t1.setBounds(30, 80, 252, 42);
		contentPane.add(t1);
		t1.setColumns(10);

		// Search Button
		b1 = new JButton();
		ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/search.jpg"));
		Image i2 = i1.getImage().getScaledInstance(30, 30,Image.SCALE_REPLICATE);
		ImageIcon i3 = new ImageIcon(i2);
		b1 = new JButton(i3);
		b1.setVerticalAlignment(SwingConstants.TOP);
		b1.setBounds(300, 88, 30, 30);
		b1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(137, 207, 240), 1, true));
		b1.addActionListener(this);
		b1.setBackground(Color.WHITE);
		contentPane.add(b1);

		// Non-Editable First Name Text Field
		t2 = new JTextField();
		t2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(115, 194, 251), 2, true), "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", 3, 12), new java.awt.Color(115, 194, 251))); // NOI18N
		t2.setFont(new Font("Product Sans", Font.PLAIN, 13));
		t2.setBackground(Color.WHITE);
		t2.setColumns(10);
		t2.setEditable(false);
		t2.setBounds(30, 150, 200, 42);
		contentPane.add(t2);

		// Non-Editable Last Name Text Field
		t6 = new JTextField();
		t6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(115, 194, 251), 2, true), "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", 3, 12), new java.awt.Color(115, 194, 251))); // NOI18N
		t6.setFont(new Font("Product Sans", Font.PLAIN, 13));
		t6.setBackground(Color.WHITE);
		t6.setColumns(10);
		t6.setEditable(false);
		t6.setBounds(260, 150, 200, 42);
		contentPane.add(t6);

		// No-Editable Your Security Question Text Field
		t3 = new JTextField();
		t3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(115, 194, 251), 2, true), "Your Security Question", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", 3, 12), new java.awt.Color(115, 194, 251))); // NOI18N
		t3.setFont(new Font("Product Sans", Font.PLAIN, 13));
		t3.setBackground(Color.WHITE);
		t3.setColumns(10);
		t3.setEditable(false);
		t3.setBounds(30, 200, 430, 42);
		contentPane.add(t3);

		// Your Answer Text Field
		t4 = new JTextField();
		t4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(115, 194, 251), 2, true), "Your Answer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", 3, 12), new java.awt.Color(115, 194, 251))); // NOI18N
		t4.setFont(new Font("Product Sans", Font.PLAIN, 13));
		t4.setColumns(10);
		t4.setBounds(30, 250, 370, 40);
		contentPane.add(t4);

		// Retrieve Account Button
		ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/re1.jpg"));
		Image i5 = i4.getImage().getScaledInstance(50, 55,Image.SCALE_REPLICATE);
		ImageIcon i6 = new ImageIcon(i5);
		b2 = new JButton(i6);
		b2.setVerticalAlignment(SwingConstants.TOP);
		b2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(137, 207, 240), 0, true));
		b2.addActionListener(this);
		b2.setBackground(Color.WHITE);
		b2.setBounds(410, 270, 50, 55);
		contentPane.add(b2);

		// Non-Editable Your Password Text Field
		t5 = new JTextField();
		t5.setEditable(false);
		t5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(115, 194, 251), 2, true), "Your Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", 3, 12), new java.awt.Color(115, 194, 251))); // NOI18N
		t5.setFont(new Font("Product Sans", Font.PLAIN, 13));
		t5.setBackground(Color.WHITE);
		t5.setBounds(30, 300, 370, 40);
		contentPane.add(t5);

		// Go Back Button
		ImageIcon i7  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/back.jpg"));
		Image i8 = i7.getImage().getScaledInstance(35, 35,Image.SCALE_DEFAULT);
		ImageIcon i9 = new ImageIcon(i8);
		b3 = new JButton(i9);
		b3.addActionListener(this);
		b3.setBounds(30, 390, 35, 35);
        b3.setBackground(Color.WHITE);
        contentPane.add(b3);

		// Image Icon 1 (Old Library)
		JLabel limgPrime = new JLabel("");
		limgPrime.setVerticalAlignment(SwingConstants.TOP);
		ImageIcon iPrime  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/OLD.jpg"));
		Image iPPrime = iPrime.getImage().getScaledInstance(500, 500,Image.SCALE_DEFAULT);
		ImageIcon iPPPrime = new ImageIcon(iPPrime);
		limgPrime= new JLabel(iPPPrime);
		limgPrime.setBounds(500, 0,400 , 500);
		contentPane.add(limgPrime);

    }

	// Connection to MySQL and Actions Class
    public void actionPerformed(ActionEvent ae){
        try{
            //conn con = new conn();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibMgmSys_ProjectV2?characterEncoding=latin1", "root", "password");
			Statement s =c.createStatement();

			if(ae.getSource() == b1){

                String sql = "select * from accounts where userrname=?";
				PreparedStatement st = c.prepareStatement(sql);

				st.setString(1, t1.getText());
				ResultSet rs = st.executeQuery();

		while (rs.next()) {
                    t2.setText(rs.getString("firstname"));
                    t6.setText(rs.getString("lastname"));
                    t3.setText(rs.getString("sec_q"));
		}

            }
            if(ae.getSource() == b2){

                String sql = "select * from accounts where sec_ans=?";
				PreparedStatement st = c.prepareStatement(sql);

				st.setString(1, t4.getText());
				ResultSet rs = st.executeQuery();

			while (rs.next()) {

				t5.setText(rs.getString("password"));
		}

            }
            if(ae.getSource() == b3){
                this.setVisible(false);
		new Login_user().setVisible(true);
			
            }
        }catch(Exception e){
            
        }
    }

}
