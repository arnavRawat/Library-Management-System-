// Project V2- Code for Issue Book Window

package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.*;

public class IssueBook extends JFrame implements ActionListener{

	// Components Declaration
    private JPanel contentPane;
    JDateChooser dateChooser;
    private JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15;
    private JButton b1,b2,b3,b4;

    public static void main(String[] args) {
	new IssueBook().setVisible(true);
    }

    public IssueBook() {

    	// Title
		super("Actions- Issue Book");

		// JPanel
		setBounds(300, 200, 1000, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(null);

		// Title Label 1
		JLabel lblTitle = new JLabel("Student Details");
		lblTitle.setForeground(Color.DARK_GRAY);
		lblTitle.setFont(new Font("Noto Sans", Font.BOLD, 20));
		lblTitle.setForeground(new java.awt.Color(0, 0, 0));
		lblTitle.setBounds(30, 15, 500, 60);
		contentPane.add(lblTitle);

		// Student ID Text Field
		t8 = new JTextField();
		t8.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 50), 2, true), "Student ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.BOLD, 12), new java.awt.Color(0, 0, 50))); // NOI18N
		t8.setFont(new Font("Segoe UI", Font.BOLD, 14));
		t8.setForeground(new Color(255, 194, 0));
		t8.setBounds(30, 75, 150, 40);
		contentPane.add(t8);
		t8.setColumns(10);

		// Button to Search
		b2 = new JButton("Search");
		b2.addActionListener(this);
		b2.setFont(new Font("Noto Sans", Font.BOLD, 14));
		b2.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		b2.setBounds(200, 80, 75, 35);
		b2.setBackground(Color.WHITE);
		b2.setForeground(new Color(255, 194, 0));
		contentPane.add(b2);

		// Non-Editable Text Field for First Name
		t9 = new JTextField();
		t9.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 50), 2, true), "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.BOLD, 12), new java.awt.Color(0, 0, 50))); // NOI18N
		t9.setFont(new Font("Segoe UI", Font.BOLD, 14));
		t9.setForeground(new Color(255, 194, 0));
		t9.setBounds(30, 125, 250, 40);
		t9.setEditable(false);
		t9.setBackground(Color.WHITE);
		t9.setColumns(10);
		contentPane.add(t9);

		// Non-Editable Text Field for Last Name
		t15 = new JTextField();
		t15.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 50), 2, true), "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.BOLD, 12), new java.awt.Color(0, 0, 50))); // NOI18N
		t15.setFont(new Font("Segoe UI", Font.BOLD, 14));
		t15.setForeground(new Color(255, 194, 0));
		t15.setBounds(30, 175, 250, 40);
		t15.setEditable(false);
		t15.setBackground(Color.WHITE);
		t15.setColumns(10);
		contentPane.add(t15);

		// Non-Editable Text Field for Father's Name
		t10 = new JTextField();
		t10.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 50), 2, true), "Father's Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.BOLD, 12), new java.awt.Color(0, 0, 50))); // NOI18N
		t10.setFont(new Font("Segoe UI", Font.BOLD, 14));
		t10.setForeground(new Color(255, 194, 0));
		t10.setBounds(30, 225, 250, 40);
		t10.setEditable(false);
		t10.setBackground(Color.WHITE);
		t10.setColumns(10);
		contentPane.add(t10);

		// Non-Editable Text Field for Course Name
		t11 = new JTextField();
		t11.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 50), 2, true), "Course", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.BOLD, 12), new java.awt.Color(0, 0, 50))); // NOI18N
		t11.setFont(new Font("Segoe UI", Font.BOLD, 14));
		t11.setForeground(new Color(255, 194, 0));
		t11.setBounds(30, 275, 250, 40);
		t11.setEditable(false);
		t11.setBackground(Color.WHITE);
		t11.setColumns(10);
		contentPane.add(t11);

		// Non-Editable Text Field for Branch Name
		t12 = new JTextField();
		t12.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 50), 2, true), "Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.BOLD, 12), new java.awt.Color(0, 0, 50))); // NOI18N
		t12.setFont(new Font("Segoe UI", Font.BOLD, 14));
		t12.setForeground(new Color(255, 194, 0));
		t12.setBounds(30, 325, 250, 40);
		t12.setEditable(false);
		t12.setBackground(Color.WHITE);
		t12.setColumns(10);
		contentPane.add(t12);

		// Non-Editable Text Field for Year
		t13 = new JTextField();
		t13.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 50), 2, true), "Year", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.BOLD, 12), new java.awt.Color(0, 0, 50))); // NOI18N
		t13.setFont(new Font("Segoe UI", Font.BOLD, 14));
		t13.setForeground(new Color(255, 194, 0));
		t13.setBounds(30, 375, 110, 40);
		t13.setEditable(false);
		t13.setBackground(Color.WHITE);
		t13.setColumns(10);
		contentPane.add(t13);

		// Non-Editable Text Field for Semester
		t14 = new JTextField();
		t14.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 50), 2, true), "Semester", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.BOLD, 12), new java.awt.Color(0, 0, 50))); // NOI18N
		t14.setFont(new Font("Segoe UI", Font.BOLD, 14));
		t14.setForeground(new Color(255, 194, 0));
		t14.setBounds(150, 375, 135, 40);
		t14.setEditable(false);
		t14.setBackground(Color.WHITE);
		t14.setColumns(10);
		contentPane.add(t14);

		// Line Label
		JLabel lblLine = new JLabel();
		lblLine.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 10, true));
		lblLine.setBounds(335, 0, 2, 500);
		contentPane.add(lblLine);

		// Title Label 2
		JLabel lblTitle1 = new JLabel("Book Details");
		lblTitle1.setForeground(Color.DARK_GRAY);
		lblTitle1.setFont(new Font("Noto Sans", Font.BOLD, 20));
		lblTitle1.setForeground(new java.awt.Color(0, 0, 0));
		lblTitle1.setBounds(375, 15, 500, 60);
		contentPane.add(lblTitle1);

		// Text Field for Book ID
		t1 = new JTextField();
		t1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 50), 2, true), "Book ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.BOLD, 12), new java.awt.Color(0, 0, 50))); // NOI18N
		t1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		t1.setForeground(new Color(255, 194, 0));
		t1.setBounds(375, 75, 150, 40);
		contentPane.add(t1);
		t1.setColumns(10);

		// Button to search
		b1 = new JButton("Search");
		b1.addActionListener(this);
		b1.setFont(new Font("Noto Sans", Font.BOLD, 14));
		b1.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		b1.setBounds(550, 80, 75, 35);
		b1.setBackground(Color.WHITE);
		b1.setForeground(new Color(255, 194, 0));
		contentPane.add(b1);

		// Non-Editable Text Field for Book Name
		t2 = new JTextField();
		t2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 50), 2, true), "Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.BOLD, 12), new java.awt.Color(0, 0, 50))); // NOI18N
		t2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		t2.setForeground(new Color(255, 194, 0));
		t2.setBounds(375, 125, 250, 40);
		t2.setEditable(false);
		t2.setBackground(Color.WHITE);
		t2.setColumns(10);
		contentPane.add(t2);

		// Non-Editable Text Field for ISBN
		t3 = new JTextField();
		t3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 50), 2, true), "ISBN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.BOLD, 12), new java.awt.Color(0, 0, 50))); // NOI18N
		t3.setFont(new Font("Segoe UI", Font.BOLD, 14));
		t3.setForeground(new Color(255, 194, 0));
		t3.setBounds(375, 175, 250, 40);
		t3.setEditable(false);
		t3.setBackground(Color.WHITE);
		t3.setColumns(10);
		contentPane.add(t3);

		// Non-Editable Text Field for Publisher Name
		t4 = new JTextField();
		t4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 50), 2, true), "Publisher", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.BOLD, 12), new java.awt.Color(0, 0, 50))); // NOI18N
		t4.setFont(new Font("Segoe UI", Font.BOLD, 14));
		t4.setForeground(new Color(255, 194, 0));
		t4.setBounds(375, 225, 250, 40);
		t4.setEditable(false);
		t4.setBackground(Color.WHITE);
		t4.setColumns(10);
		contentPane.add(t4);

		// Non-Editable Text Field for Edition
		t5 = new JTextField();
		t5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 50), 2, true), "Edition", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.BOLD, 12), new java.awt.Color(0, 0, 50))); // NOI18N
		t5.setFont(new Font("Segoe UI", Font.BOLD, 14));
		t5.setForeground(new Color(255, 194, 0));
		t5.setBounds(375, 275, 80, 40);
		t5.setEditable(false);
		t5.setBackground(Color.WHITE);
		t5.setColumns(10);
		contentPane.add(t5);

		// Non-Editable Text Field for Price
		t6 = new JTextField();
		t6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 50), 2, true), "Price", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.BOLD, 12), new java.awt.Color(0, 0, 50))); // NOI18N
		t6.setFont(new Font("Segoe UI", Font.BOLD, 14));
		t6.setForeground(new Color(255, 194, 0));
		t6.setBounds(460, 275, 80, 40);
		t6.setEditable(false);
		t6.setBackground(Color.WHITE);
		t6.setColumns(10);
		contentPane.add(t6);

		// Non-Editable Text Field for Pages
		t7 = new JTextField();
		t7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 50), 2, true), "Pages", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.BOLD, 12), new java.awt.Color(0, 0, 50))); // NOI18N
		t7.setFont(new Font("Segoe UI", Font.BOLD, 14));
		t7.setForeground(new Color(255, 194, 0));
		t7.setBounds(545, 275, 80, 40);
		t7.setEditable(false);
		t7.setBackground(Color.WHITE);
		t7.setColumns(10);
		contentPane.add(t7);

		// Date Chooser for Date of Issue
		dateChooser = new JDateChooser();
		dateChooser.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 50), 2, true), "Date of Issue", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.BOLD, 12), new java.awt.Color(0, 0, 50))); // NOI18N
		dateChooser.setForeground(new Color(255, 194, 0));
		dateChooser.setBackground(Color.WHITE);
		dateChooser.setFont(new Font("Segoe UI", Font.BOLD, 14));
		dateChooser.setBounds(375, 325, 250, 45);
		contentPane.add(dateChooser);

		// Button to Issue
		b3 = new JButton("Issue");
		b3.addActionListener(this);
		b3.setFont(new Font("Noto Sans", Font.BOLD, 14));
		b3.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		b3.setBounds(475, 380, 75, 35);
		b3.setBackground(Color.WHITE);
		b3.setForeground(new Color(255, 194, 0));
		contentPane.add(b3);

		// Button to Go Back
		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/back.jpg"));
		Image i5 = i4.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		ImageIcon i6 = new ImageIcon(i5);
		b4 = new JButton(i6);
		b4.addActionListener(this);
		b4.setFont(new Font("Noto Sans", Font.BOLD, 14));
		b4.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		b4.setBounds(375, 380, 45, 35);
		b4.setBackground(Color.WHITE);
		b4.setForeground(new Color(255, 194, 0));
		contentPane.add(b4);

		// Image Icon (Books)
		JLabel limg = new JLabel("");
		limg.setVerticalAlignment(SwingConstants.TOP);
		ImageIcon iPrime  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/is.jpg"));
		Image iPPrime = iPrime.getImage().getScaledInstance(500, 500,Image.SCALE_DEFAULT);
		ImageIcon iPPPrime = new ImageIcon(iPPrime);
		limg= new JLabel(iPPPrime);
		limg.setBounds(635, 0,530 , 500);
		contentPane.add(limg);
    }

	// Connection to MySQL and Actions Class
    public void actionPerformed(ActionEvent ae){
        try{
            //conn con = new conn();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibMgmSys_ProjectV2?characterEncoding=latin1", "root", "password");
			Statement s =c.createStatement();
			if(ae.getSource() == b1){
                String sql = "select * from book where book_id = ?";
		PreparedStatement st = c.prepareStatement(sql);
		st.setString(1, t1.getText());
		ResultSet rs = st.executeQuery();
		
                while (rs.next()) {
                    t2.setText(rs.getString("name"));
                    t3.setText(rs.getString("isbn"));
                    t4.setText(rs.getString("publisher"));
                    t5.setText(rs.getString("edition"));
                    t6.setText(rs.getString("price"));
                    t7.setText(rs.getString("pages"));
		}
		st.close();
		rs.close();
		
            }
            if(ae.getSource() == b2){
                String sql = "select * from student where student_id = ?";
		PreparedStatement st = c.prepareStatement(sql);
		st.setString(1, t8.getText());
		ResultSet rs = st.executeQuery();
		
                while (rs.next()) {
                    t9.setText(rs.getString("firstname"));
                    t15.setText(rs.getString("lastname"));
                    t10.setText(rs.getString("fathername"));
                    t11.setText(rs.getString("course"));
                    t12.setText(rs.getString("branch"));
                    t13.setText(rs.getString("year"));
                    t14.setText(rs.getString("semester"));
		}
		st.close();
		rs.close();
		
            }
            if(ae.getSource() == b3){
                    try{
                String sql = "insert into issueBook(book_id, student_id, bname, sfname, slname, course, branch, dateOfIssue) values(?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement st = c.prepareStatement(sql);
		st.setString(1, t1.getText());
		st.setString(2, t8.getText());
		st.setString(3, t2.getText());
		st.setString(4, t9.getText());
		st.setString(5, t15.getText());
		st.setString(6, t11.getText());
		st.setString(7, t12.getText());
		st.setString(8, ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText());
		int i = st.executeUpdate();
		if (i > 0)
                    JOptionPane.showMessageDialog(null, "Successfully Book Issued..!");
		else
                    JOptionPane.showMessageDialog(null, "error");
                    }catch(Exception e){
                        e.printStackTrace();
                                }
            }
            if(ae.getSource() == b4){
                this.setVisible(false);
		new Home().setVisible(true);
			
            }
            
            c.close();
        }catch(Exception e){
            
        }
    }
}
