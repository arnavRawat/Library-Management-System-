// Project V2- Code for Add Student Window

package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class AddStudent extends JFrame implements ActionListener{

	// Components Declaration
    private JPanel contentPane;
    private JTextField t1,t2,t3,t4;
    private JComboBox comboBox, comboBox_1, comboBox_2, comboBox_3;
    JButton b1,b2;

    public static void main(String[] args) {
        new AddStudent().setVisible(true);
    }

    // Random ID Generator
    public void random() {
        Random rd = new Random();
	t1.setText("" + rd.nextInt(10000 + 1));
    }

    public AddStudent() {

    	// Title
        super(" Operations - Add Student");

        // JPanel
        setBounds(700, 200, 1000, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(null);

		// Title Label Add Students
		JLabel lblTitle = new JLabel("Add Student");
		lblTitle.setForeground(Color.DARK_GRAY);
		lblTitle.setFont(new Font("Noto Sans", Font.BOLD, 20));
		lblTitle.setForeground(new java.awt.Color(0,0,0));
		lblTitle.setBounds(30, 15, 500, 60);
		contentPane.add(lblTitle);

		// Non-Editable Text Field for Student ID (Auto-Generated)
		t1 = new JTextField();
		t1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 134, 247), 2, true), " Student ID ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.ROMAN_BASELINE, 15), new java.awt.Color(79, 134, 247))); // NOI18N
		t1.setBounds(30, 85, 250, 55);
		t1.setEditable(false);
		t1.setBackground(Color.WHITE);
		t1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		contentPane.add(t1);
		t1.setColumns(10);

		// First Name Text Field
		t2 = new JTextField();
		t2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 134, 247), 2, true), " First Name ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.ROMAN_BASELINE, 15), new java.awt.Color(79, 134, 247))); // NOI18N
		t2.setBounds(300, 85, 250, 50);
		t2.setBackground(Color.WHITE);
		t2.setFont(new Font("Segoe UI", Font.BOLD, 13));
		t2.setColumns(10);
		contentPane.add(t2);

		// Last Name Text Field
		t4 = new JTextField();
		t4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 134, 247), 2, true), " Last Name ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.ROMAN_BASELINE, 15), new java.awt.Color(79, 134, 247))); // NOI18N
		t4.setBounds(300, 155, 250, 50);
		t4.setBackground(Color.WHITE);
		t4.setFont(new Font("Segoe UI", Font.BOLD, 13));
		t4.setColumns(10);
		contentPane.add(t4);

		// Father's Name Text Field
		t3 = new JTextField();
		t3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 134, 247), 2, true), " Father's Name ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.ROMAN_BASELINE, 15), new java.awt.Color(79, 134, 247))); // NOI18N
		t3.setBounds(30, 155, 250, 50);
		t3.setBackground(Color.WHITE);
		t3.setFont(new Font("Segoe UI", Font.BOLD, 13));
		t3.setColumns(10);
		contentPane.add(t3);

		// Branch Dropbox
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "","Mechanical", "CSE", "IT", "Civil", "Automobile", "EEE", "Other" }));
		comboBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 134, 247), 2, true), " Branch ",javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.ROMAN_BASELINE, 15), new java.awt.Color(79, 134, 247)));
		comboBox.setBounds(30, 225, 250, 55);
		comboBox.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		comboBox.setBackground(Color.WHITE);
		contentPane.add(comboBox);

		// Year Dropbox
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "","First", "Second", "Third", "Four" }));
		comboBox_1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		comboBox_1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 134, 247), 2, true), " Year ",javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.ROMAN_BASELINE, 15), new java.awt.Color(79, 134, 247)));
		comboBox_1.setBounds(300, 225, 250, 55);
		comboBox_1.setBackground(Color.WHITE);
		contentPane.add(comboBox_1);

		// Semester Drop Box
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "","I- FIRST", "II- SECOND", "III- THIRD", "IV- FOURTH", "V- FIFTH", "VI- SIXTH", "VII- SEVENTH", "VIII- EIGHTH" }));
		comboBox_2.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		comboBox_2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 134, 247), 2, true), " Semester ",javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.ROMAN_BASELINE, 15), new java.awt.Color(79, 134, 247)));
		comboBox_2.setBounds(30, 300, 250, 55);
		comboBox_2.setBackground(Color.WHITE);
		contentPane.add(comboBox_2);

		// Course Dropbox
		comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] { "","B.E", "B.Tech", "M.Tech", "MBA", "BBA", "BCA", "B.Sc", "M.Sc", "B.Com", "M.Com" }));
		comboBox_3.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		comboBox_3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 134, 247), 2, true), " Course ",javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.ROMAN_BASELINE, 15), new java.awt.Color(79, 134, 247)));
		comboBox_3.setBounds(300, 300, 250, 55);
		comboBox_3.setBackground(Color.WHITE);
		contentPane.add(comboBox_3);

		// Button to Add
		ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/ADD1.png"));
		Image i2 = i1.getImage().getScaledInstance(40, 40,Image.SCALE_SMOOTH);
		ImageIcon i3 = new ImageIcon(i2);
		b1 = new JButton("Add", i3);
		b1.addActionListener(this);
		b1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
		b1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		b1.setForeground( new java.awt.Color(0xFFA700));
		b1.setBounds(135, 390, 120, 50);
        b1.setBackground(Color.WHITE);
        contentPane.add(b1);

		// Button to Go Back
		ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/back.jpg"));
		Image i5 = i4.getImage().getScaledInstance(40, 40,Image.SCALE_SMOOTH);
		ImageIcon i6 = new ImageIcon(i5);
		b2 = new JButton("Back", i6);
		b2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
		b2.setFont(new Font("Segoe UI", Font.BOLD, 15));
		b2.setForeground( new java.awt.Color(0xFFA700));
		b2.setBounds(340, 390, 120, 50);
		b2.setBackground(Color.WHITE);
		b2.addActionListener(this);
        contentPane.add(b2);

        // Iamge Icon 3 (Library)
		JLabel limg = new JLabel();
		limg.setVerticalAlignment(SwingConstants.TOP);
		ImageIcon inew  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/photo.jpg"));
		Image inew1 = inew.getImage().getScaledInstance(600, 600,Image.SCALE_SMOOTH);
		ImageIcon inew2 = new ImageIcon(inew1);
		limg= new JLabel(inew2);
		limg.setBounds(600, 0, 600, 600);
		contentPane.add(limg);

		random();
    }

	// Connection to MySQL and Actions Class
    public void actionPerformed(ActionEvent ae){
        try{
            
            if(ae.getSource() == b1){
                try{

                //conn con = new conn();
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibMgmSys_ProjectV2?characterEncoding=latin1", "root", "password");
					Statement s =c.createStatement();
					String sql = "insert into student(student_id, firstname, lastname, fathername, branch, year, semester, course) values(?, ?, ?, ?, ?, ?, ?, ?)";
					PreparedStatement st = c.prepareStatement(sql);
					st.setString(1, t1.getText());
					st.setString(2, t2.getText());
					st.setString(4, t3.getText());
					st.setString(3, t4.getText());
					st.setString(8, (String) comboBox_3.getSelectedItem());
					st.setString(5, (String) comboBox.getSelectedItem());
					st.setString(6, (String) comboBox_1.getSelectedItem());
					st.setString(7, (String) comboBox_2.getSelectedItem());

		int i = st.executeUpdate();
		if (i > 0){
                    JOptionPane.showMessageDialog(null, "Successfully Added");
                    this.setVisible(false);
                    new Home().setVisible(true);
                }
		else
                    JOptionPane.showMessageDialog(null, "error");
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            
            if(ae.getSource() == b2){
                this.setVisible(false);
		new Home().setVisible(true);		
            }
        }catch(Exception e){
            
        }
    }
}

