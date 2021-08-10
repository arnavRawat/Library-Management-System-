// Project V2- Code for Add Book Window

package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class AddBook extends JFrame implements ActionListener{

	// Component Declaration
    private JPanel contentPane;
    private JTextField t1,t2,t3,t4,t5,t6;
    private JButton b1,b2;
    JComboBox comboBox;
        
    public static void main(String[] args) {
	new AddBook().setVisible(true);
    }

    public void random() {

		Random rd = new Random();
		t1.setText("" + rd.nextInt(1000 + 1));
    }

    public AddBook() {

    	// Title
    	super (" Operations - Add Book");

    	// JPanel
        setBounds(600, 200, 800, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Title Label
		JLabel lblTitle = new JLabel("Add Book");
		lblTitle.setForeground(Color.DARK_GRAY);
		lblTitle.setFont(new Font("Noto Sans", Font.BOLD, 20));
		lblTitle.setForeground(new java.awt.Color(0,0,0));
		lblTitle.setBounds(30, 3, 500, 60);
		contentPane.add(lblTitle);


		// Book ID Text Field
		t1 = new JTextField();
		t1.setForeground(new Color(0, 0, 0));
		t1.setFont(new Font("Segoe UI", Font.BOLD,12));
		contentPane.add(t1);
		t1.setColumns(10);
		t1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 134, 247), 2, true), "Book ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.ROMAN_BASELINE, 12), new java.awt.Color(79, 134, 247))); // NOI18N
		t1.setBounds(30, 70, 225, 40);
		t1.setBackground(Color.WHITE);
		t1.setEditable(false);
		t1.setColumns(10);

		// Book Name Text Field
		t2 = new JTextField();
		t2.setForeground(new Color(0, 0, 0));
		t2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 134, 247), 2, true), "Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.ROMAN_BASELINE, 12), new java.awt.Color(79, 134, 247))); // NOI18N
		t2.setFont(new Font("Segoe UI", Font.BOLD, 12));
		t2.setColumns(10);
		t2.setBounds(30, 120, 225, 40);
		contentPane.add(t2);

		// Publisher Text Field
		t3 = new JTextField();
		t3.setForeground(new Color(0, 0, 0));
		t3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 134, 247), 2, true), "Publisher", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.ROMAN_BASELINE, 12), new java.awt.Color(79, 134, 247))); // NOI18N
		t3.setFont(new Font("Segoe UI", Font.BOLD, 12));
		t3.setColumns(10);
		t3.setBounds(30, 170, 225, 40);
		contentPane.add(t3);

		// Price Text Field
		t4 = new JTextField();
		t4.setForeground(new Color(0, 0, 0));
		t4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 134, 247), 2, true), "Price", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.ROMAN_BASELINE, 12), new java.awt.Color(79, 134, 247))); // NOI18N
		t4.setFont(new Font("Segoe UI", Font.BOLD, 12));
		t4.setColumns(10);
		t4.setBounds(30, 380, 225, 40);
		contentPane.add(t4);

		// Pages Text Field
        t5 = new JTextField();
		t5.setForeground(new Color(0, 0, 0));
		t5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 134, 247), 2, true), "Pages", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.ROMAN_BASELINE, 12), new java.awt.Color(79, 134, 247))); // NOI18N
		t5.setFont(new Font("Segoe UI", Font.BOLD, 12));
		t5.setColumns(10);
		t5.setBounds(30, 280, 225, 40);
		contentPane.add(t5);

		// ISBN Text Field
		t6 = new JTextField();
		t6.setForeground(new Color(0, 0, 0));
		t6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 134, 247), 2, true), "ISBN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.ROMAN_BASELINE, 12), new java.awt.Color(79, 134, 247))); // NOI18N
		t6.setFont(new Font("Segoe UI", Font.BOLD, 12));
		t6.setColumns(10);
		t6.setBounds(30, 330, 225, 40);
		contentPane.add(t6);

		// Edition Combo Box
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
		comboBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 134, 247), 2, true), "Edition",javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.ROMAN_BASELINE, 12), new java.awt.Color(79, 134, 247)));
		comboBox.setBounds(30, 220, 225, 50);
		comboBox.setBackground(Color.WHITE);
		contentPane.add(comboBox);

		// Button to Add
		b1 = new JButton("Add");
		b1.addActionListener(this);
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/add.jpg"));
		Image i2 = i1.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		ImageIcon i3 = new ImageIcon(i2);
		b1.setIcon(i3);
		b1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		b1.setFont(new Font("Segoe UI",Font.ROMAN_BASELINE, 14));
		b1.setBounds(30, 450, 100, 33);
		b1.setBackground(Color.white);
		b1.setForeground(new java.awt.Color(0xFFC200));
		contentPane.add(b1);

		// Button to Go Back
		b2 = new JButton("Back");
		b2.addActionListener(this);
		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/BACK.jpg"));
		Image i5 = i4.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		ImageIcon i6 = new ImageIcon(i5);
		b2.setIcon(i6);
		b2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		b2.setFont(new Font("Segoe UI",Font.ROMAN_BASELINE, 14));
		b2.setBounds(160, 450, 100, 33);
		b2.setBackground(Color.white);
		b2.setForeground(new java.awt.Color(0xFFC200));

		contentPane.add(b2);

		// Image Icon (Book in Library)
		JLabel limgPrime = new JLabel("");
		limgPrime.setVerticalAlignment(SwingConstants.TOP);
		ImageIcon iPrime  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/jp.jpeg"));
		Image iPPrime = iPrime.getImage().getScaledInstance(550, 550,Image.SCALE_DEFAULT);
		ImageIcon iPPPrime = new ImageIcon(iPPrime);
		limgPrime= new JLabel(iPPPrime);
		limgPrime.setBounds(335, 0,550 , 550);
		contentPane.add(limgPrime);

		random();

    }

    // Connection to MySQL and Actions Class
    public void actionPerformed(ActionEvent ae){
        try{
            // conn con = new conn();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibMgmSys_ProjectV2?characterEncoding=latin1", "root", "password");
			Statement s =c.createStatement();
			if(ae.getSource() == b1){
                String sql = "insert into book(book_id, name, publisher, edition, pages, isbn, price) values(?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement st = c.prepareStatement(sql);
                // st.setInt(1, Integer.parseInt(textField.getText()));
		st.setString(1, t1.getText());
		st.setString(2, t2.getText());
		st.setString(3, t3.getText());
		st.setString(7, t4.getText());
		st.setString(4, (String) comboBox.getSelectedItem());
		st.setString(5, t5.getText());
		st.setString(6, t6.getText());

		int rs = st.executeUpdate();
		if (rs > 0)
                    JOptionPane.showMessageDialog(null, "Successfully Added");
		else
                    JOptionPane.showMessageDialog(null, "Error");
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                t6.setText("");
		st.close();
            }
            if(ae.getSource() == b2){
                this.setVisible(false);
		new Home().setVisible(true);

            }
            c.close();
        }catch(Exception e){
            
        }
    }
}
