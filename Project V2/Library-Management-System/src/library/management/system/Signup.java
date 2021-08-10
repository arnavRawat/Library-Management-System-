// Project V2- Code for SignUp Window

package library.management.system;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.border.*;

public class Signup extends JFrame implements ActionListener{

	// Component Declaration
	private JPanel contentPane;
    private JTextField textFieldFirst;
	private JTextField textFieldLast;
	private JTextField textFieldUser;
	private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JButton b1, b2;
    private JComboBox comboBox;


    public static void main(String[] args) {
        new Signup().setVisible(true);
    }

    public Signup() {

    	// Title
		super ("Sign Up");

		// JPanel
		setBounds(600, 250, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(null);

		// Icon 1 (New User Icon)
		JLabel limg = new JLabel("");
		limg.setVerticalAlignment(SwingConstants.TOP);
		ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/1.png"));
		Image i2 = i1.getImage().getScaledInstance(200, 200,Image.SCALE_SMOOTH);
		ImageIcon i3 = new ImageIcon(i2);
		limg= new JLabel(i3);
		limg.setBounds(450, 120, 200, 200);
		contentPane.add(limg);

		// Title Label
		JLabel lblTitle = new JLabel("Create your Account");
		lblTitle.setForeground(Color.DARK_GRAY);
		lblTitle.setFont(new Font("Noto Sans", Font.BOLD, 20));
		lblTitle.setForeground(new java.awt.Color(0,0,0));
		lblTitle.setBounds(30, 30, 500, 60);
		contentPane.add(lblTitle);

		// First Name Text Field
		textFieldFirst = new JTextField();
		textFieldFirst.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 134, 247), 2, true), "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.ROMAN_BASELINE, 12), new java.awt.Color(79, 134, 247))); // NOI18N
		textFieldFirst.setBounds(30, 100, 175, 40);
		contentPane.add(textFieldFirst);
		textFieldFirst.setColumns(10);

		// Last Name Text Field
		textFieldLast = new JTextField();
		textFieldLast.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 134, 247), 2, true), "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.ROMAN_BASELINE, 12), new java.awt.Color(79, 134, 247))); // NOI18N
		textFieldLast.setBounds(215, 100, 175, 40);
		contentPane.add(textFieldLast);
		textFieldLast.setColumns(10);

		// User-Name Text Field
		textFieldUser= new JTextField();
		textFieldUser.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 134, 247), 2, true), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.ROMAN_BASELINE, 12), new java.awt.Color(79, 134, 247))); // NOI18N
		textFieldUser.setBounds(30, 150, 360, 40);
		contentPane.add(textFieldUser);
		textFieldUser.setColumns(10);

		// Password Text Field
		textField_1= new JTextField();
		textField_1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 134, 247), 2, true), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.ROMAN_BASELINE, 12), new java.awt.Color(79, 134, 247))); // NOI18N
		textField_1.setBounds(30, 200, 175, 40);
		contentPane.add(textField_1);
		textFieldUser.setColumns(10);

		// Confirm Password Text Field
		textField_2= new JTextField();
		textField_2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 134, 247), 2, true), "Confirm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.ROMAN_BASELINE, 12), new java.awt.Color(79, 134, 247))); // NOI18N
		textField_2.setBounds(215, 200, 175, 40);
		contentPane.add(textField_2);
		textFieldUser.setColumns(10);

		// Security Question Dropbox
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { " ","Your NickName?", "Your Lucky Number?","Your child SuperHero?", "Your childhood Name?" }));
		comboBox.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 134, 247), 2, true), "Security Question",javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.ROMAN_BASELINE, 12), new java.awt.Color(79, 134, 247)));
		comboBox.setBounds(30, 250, 360, 55);
		comboBox.setBackground(Color.WHITE);
		contentPane.add(comboBox);

		// Your Answer Text Field
		textField_3= new JTextField();
		textField_3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 134, 247), 2, true), "Answer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", Font.ROMAN_BASELINE, 12), new java.awt.Color(79, 134, 247))); // NOI18N
		textField_3.setBounds(30, 315, 360, 40);
		contentPane.add(textField_3);
		textFieldUser.setColumns(10);

		// Create Account Button
		b1 = new JButton("Create");
		b1.setBackground(new java.awt.Color(255, 255, 255));
		b1.setFont(new java.awt.Font("Microsoft JhengHei", Font.BOLD, 14)); // NOI18N
		b1.setForeground(new java.awt.Color(102, 102, 255));
		b1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(175, 200, 255), 2, true));
		b1.addActionListener(this);
		b1.setBounds(80, 380, 113, 39);
		contentPane.add(b1);

		// Go Back Button
		b2 = new JButton("Back");
		b2.setBackground(new java.awt.Color(255, 255, 255));
		b2.setFont(new java.awt.Font("Microsoft JhengHei", Font.BOLD, 14)); // NOI18N
		b2.setForeground(new java.awt.Color(102, 102, 255));
		b2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(175, 200, 255), 2, true));
		b2.addActionListener(this);
		b2.setBounds(230, 380, 113, 39);
		contentPane.add(b2);

		// JPanel Settings
		JPanel panel = new JPanel();
		panel.setBounds(30, 30, 476, 296);
        panel.setBackground(Color.WHITE);
		contentPane.add(panel);
    }

    // Connection to MySQL and Actions Class
    public void actionPerformed(ActionEvent ae){
        try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibMgmSys_ProjectV2?characterEncoding=latin1", "root", "password");
			Statement s =c.createStatement();

			if(ae.getSource() == b1)
            	{
                	String sql = "insert into accounts(firstname, lastname, userrname, password, confirm, sec_q, sec_ans) values(?, ?, ?, ?, ?, ?, ?)";
					PreparedStatement st = c.prepareStatement(sql);

					st.setString(1, textFieldFirst.getText());
					st.setString(2, textFieldLast.getText());
					st.setString(3, textFieldUser.getText());
					st.setString(4, textField_1.getText());
					st.setString(5, textField_2.getText());
					st.setString(6, (String) comboBox.getSelectedItem());
					st.setString(7, textField_3.getText());

					int i = st.executeUpdate();
					if (i > 0)
					{
                    	JOptionPane.showMessageDialog(null, "Successfully Created");
                	}

                	textFieldFirst.setText("");
					textFieldLast.setText("");
					textFieldUser.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
            }

            if(ae.getSource() == b2)
            {
                this.setVisible(false);
				new Login_user().setVisible(true);

            }
        }catch(Exception e){
            
        }
    }
}

