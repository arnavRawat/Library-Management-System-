// Project V2- Code for Return  Book Window

package library.management.system;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.*;

public class ReturnBook extends JFrame implements ActionListener{

	// Component Declration
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
	private JTextField textField_7;
    private JButton b1,b2,b3;
    private JDateChooser dateChooser;

    public static void main(String[] args) {
	new ReturnBook().setVisible(true);
    }

	// Connection to MySQL
    public void delete() {

        try {

        	Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibMgmSys_ProjectV2?characterEncoding=latin1", "root", "password");
			Statement s =c.createStatement();

            String sql = "delete from issueBook where book_id=?";
            PreparedStatement st = c.prepareStatement(sql);
            st.setString(1, textField.getText());
            int i = st.executeUpdate();

            if (i > 0)
                JOptionPane.showConfirmDialog(null, "Book Returned");
            else
                JOptionPane.showMessageDialog(null, "error in Deleting");
        } catch (SQLException | ClassNotFoundException e) {

           	 JOptionPane.showMessageDialog(null, e);
           	 e.printStackTrace();
          }
    }

    
    public ReturnBook() {

    	// Title
    	super("Action- Return Book");

    	// JPanel
        setBounds(450, 300, 900, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(null);

		// Title Label
		JLabel lblTitle = new JLabel("Return Book");
		lblTitle.setFont(new Font("Noto Sans", Font.BOLD, 20));
		lblTitle.setForeground(new java.awt.Color(0, 0, 0));
		lblTitle.setBounds(30, 5, 500, 60);
		contentPane.add(lblTitle);

		// Book ID Text Field
		textField = new JTextField();
		textField.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 50), 2, true), " Book ID ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.BOLD, 12), new java.awt.Color(0, 0, 50))); // NOI18N
		textField.setFont(new Font("Segoe UI", Font.BOLD, 14));
		textField.setForeground(new Color(255, 194, 0));
		textField.setBounds(30, 75, 200, 40);
		contentPane.add(textField);
		textField.setColumns(10);

		// Student ID Text Field
		textField_1 = new JTextField();
		textField_1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 50), 2, true), " Student ID ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.BOLD, 12), new java.awt.Color(0, 0, 50))); // NOI18N
		textField_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		textField_1.setForeground(new Color(255, 194, 0));
		textField_1.setBounds(30, 125, 200, 40);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		// Button to Search
		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/s.jpg"));
		Image i5 = i4.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		ImageIcon i6 = new ImageIcon(i5);
		b1 = new JButton(i6);
		b1.addActionListener(this);
		b1.setFont(new Font("Noto Sans", Font.BOLD, 12));
		b1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		b1.setBounds(250, 105, 30, 30);
		b1.setBackground(Color.WHITE);
		b1.setForeground(new Color(255, 194, 0));
		contentPane.add(b1);

		// Non-Editable Text Field for Book Name
		textField_2 = new JTextField();
		textField_2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 50), 2, true), " Book ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.BOLD, 12), new java.awt.Color(0, 0, 50))); // NOI18N
		textField_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		textField_2.setForeground(new Color(255, 194, 0));
		textField_2.setBackground(Color.WHITE);
		textField_2.setEditable(false);
		textField_2.setBounds(30, 175, 200, 40);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		// Non-Editable Text Field for First Name
		textField_3 = new JTextField();
		textField_3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 50), 2, true), " First Name ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.BOLD, 12), new java.awt.Color(0, 0, 50))); // NOI18N
		textField_3.setFont(new Font("Segoe UI", Font.BOLD, 14));
		textField_3.setForeground(new Color(255, 194, 0));
		textField_3.setBackground(Color.WHITE);
		textField_3.setEditable(false);
		textField_3.setBounds(30, 225, 200, 40);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		textField_3.setEditable(false);

		// Non-Editable Text Field for Last Name
		textField_7 = new JTextField();
		textField_7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 50), 2, true), " Last Name ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.BOLD, 12), new java.awt.Color(0, 0, 50))); // NOI18N
		textField_7.setFont(new Font("Segoe UI", Font.BOLD, 14));
		textField_7.setForeground(new Color(255, 194, 0));
		textField_7.setBackground(Color.WHITE);
		textField_7.setEditable(false);
		textField_7.setBounds(250, 225, 200, 40);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		textField_7.setEditable(false);

		// Non-Editable Text Field for Course Name
		textField_4 = new JTextField();
		textField_4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 50), 2, true), " Course ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.BOLD, 12), new java.awt.Color(0, 0, 50))); // NOI18N
		textField_4.setFont(new Font("Segoe UI", Font.BOLD, 14));
		textField_4.setForeground(new Color(255, 194, 0));
		textField_4.setBackground(Color.WHITE);
		textField_4.setEditable(false);
		textField_4.setBounds(30, 275, 200, 40);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		textField_4.setEditable(false);

		// Non-Editable Text Field for Branch Name
		textField_5 = new JTextField();
		textField_5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 50), 2, true), " Branch ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.BOLD, 12), new java.awt.Color(0, 0, 50))); // NOI18N
		textField_5.setFont(new Font("Segoe UI", Font.BOLD, 14));
		textField_5.setForeground(new Color(255, 194, 0));
		textField_5.setBackground(Color.WHITE);
		textField_5.setEditable(false);
		textField_5.setBounds(250, 275, 200, 40);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		textField_5.setEditable(false);

		// Non-Editable Text Field for Date of Issue
		textField_6 = new JTextField();
		textField_6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 50), 2, true), " Date of Issue ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.BOLD, 12), new java.awt.Color(0, 0, 50))); // NOI18N
		textField_6.setFont(new Font("Segoe UI", Font.BOLD, 14));
		textField_6.setForeground(new Color(255, 194, 0));
		textField_6.setBackground(Color.WHITE);
		textField_6.setEditable(false);
		textField_6.setBounds(30, 325, 200, 40);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		textField_6.setEditable(false);

		// Date Chooser for Date of Return
		dateChooser = new JDateChooser();
		dateChooser.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 50), 2, true), " Return Date", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.BOLD, 12), new java.awt.Color(0, 0, 50))); // NOI18N
		dateChooser.setForeground(new Color(255, 194, 0));
		dateChooser.setBackground(Color.WHITE);
		dateChooser.setFont(new Font("Segoe UI", Font.BOLD, 14));
		dateChooser.setBounds(30, 385, 250, 45);
		contentPane.add(dateChooser);

		// Return Book Button
		ImageIcon i9 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/ret.jpg"));
		Image i10 = i9.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		ImageIcon i11 = new ImageIcon(i10);
		b2 = new JButton(i11);
		b2.addActionListener(this);
		b2.setFont(new Font("Noto Sans", Font.BOLD, 12));
		b2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		b2.setBounds(300, 395, 30, 30);
		b2.setBackground(Color.WHITE);
		b2.setForeground(new Color(255, 194, 0));
		contentPane.add(b2);

		// Go Back Button
		ImageIcon ia = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/back.jpg"));
		Image ib = ia.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
		ImageIcon ic = new ImageIcon(ib);
		b3 = new JButton(ic);
		b3.addActionListener(this);
		b3.setFont(new Font("Noto Sans", Font.BOLD, 12));
		b3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		b3.setBounds(350, 395, 30, 30);
		b3.setBackground(Color.WHITE);
		b3.setForeground(new Color(255, 194, 0));
		contentPane.add(b3);

		// Image Icon (Library)
		JLabel limg = new JLabel("");
		limg.setVerticalAlignment(SwingConstants.TOP);
		ImageIcon iPrime  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/g.jpg"));
		Image iPPrime = iPrime.getImage().getScaledInstance(500, 500,Image.SCALE_DEFAULT);
		ImageIcon iPPPrime = new ImageIcon(iPPrime);
		limg= new JLabel(iPPPrime);
		limg.setBounds(475, 0,500 , 500);
		contentPane.add(limg);

    }

	// Connection to MySQL and Actions Class
    public void actionPerformed(ActionEvent ae){
        try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibMgmSys_ProjectV2?characterEncoding=latin1", "root", "password");
			Statement s =c.createStatement();

            if(ae.getSource() == b1){
                String sql = "select * from issueBook where student_id = ? and book_id =?";
		PreparedStatement st = c.prepareStatement(sql);
		st.setString(1, textField_1.getText());
		st.setString(2, textField.getText());
		ResultSet rs = st.executeQuery();
		
                while (rs.next()) {
                    textField_2.setText(rs.getString("bname"));
                    textField_3.setText(rs.getString("sfname"));
					textField_7.setText(rs.getString("slname"));
                    textField_4.setText(rs.getString("course"));
                    textField_5.setText(rs.getString("branch"));
                    textField_6.setText(rs.getString("dateOfIssue"));
		}
		st.close();
		rs.close();
		
            }
            if(ae.getSource() == b2){
                String sql = "insert into returnBook(book_id, student_id, bname, sfname, slname, course, branch, dateOfIssue, dateOfReturn) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement st = c.prepareStatement(sql);
		st.setString(1, textField.getText());
		st.setString(2, textField_1.getText());
		st.setString(3, textField_2.getText());
		st.setString(4, textField_3.getText());
		st.setString(5, textField_7.getText());
		st.setString(6, textField_4.getText());
		st.setString(7, textField_5.getText());
		st.setString(8, textField_6.getText());
		st.setString(9, ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText());

		int i = st.executeUpdate();
		if (i > 0) {
                    JOptionPane.showMessageDialog(null, "Processing..");
                    delete();
		} else
                    JOptionPane.showMessageDialog(null, "error");
		
            }
            if(ae.getSource() == b3){
                this.setVisible(false);
		new Home().setVisible(true);
			
            }
        }catch(Exception e){
            
        }
    }
}
