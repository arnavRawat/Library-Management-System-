// Project V2- Code for Student Details Window

package library.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;
import net.proteanit.sql.DbUtils;

public class StudentDetails extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTable table;
    private JTextField search;
    private JButton b1,b2;
    
    public static void main(String[] args) {
	new StudentDetails().setVisible(true);
    }

    public void student() {
        try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibMgmSys_ProjectV2?characterEncoding=latin1", "root", "password");
			Statement s =c.createStatement();
            String sql = "select * from student";
            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            st.close();
            c.close();
        } catch (Exception e) {

        }
    }

    public StudentDetails() {

    	// Title
    	super ("Records- Student Details");

    	// JPanel
        setBounds(350, 200, 890, 475);
        contentPane = new JPanel();
		contentPane.setBackground(new Color(220, 220, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(null);

		// Scroll Pane
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 133, 815, 282);
		contentPane.add(scrollPane);

		// Table to display students
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
            	@Override
           	 	public void mouseClicked(MouseEvent arg0) {
                	int row = table.getSelectedRow();
                	search.setText(table.getModel().getValueAt(row, 1).toString());
            	}
		});
		table.setBackground(new Color(240, 248, 255));
		table.setForeground(Color.DARK_GRAY);
		table.setFont(new Font("Noto Snas", Font.PLAIN, 12));
		scrollPane.setViewportView(table);

		// Line Label
		JLabel lblLine = new JLabel();
		lblLine.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
		lblLine.setBounds(0, 50, 890, 1);
		contentPane.add(lblLine);

		// Title Label
		JLabel lblTitle = new JLabel("Student Details");
		lblTitle.setForeground(Color.DARK_GRAY);
		lblTitle.setFont(new Font("Noto Sans", Font.BOLD, 20));
		lblTitle.setForeground(new java.awt.Color(0,0,0));
		lblTitle.setBounds(30, 0, 500, 55);
		contentPane.add(lblTitle);

		// Button to search
		JButton b1 = new JButton("Search");
		b1.addActionListener(this);
		b1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/eight.png"));
        Image i2 = i1.getImage().getScaledInstance(20, 21, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        b1.setIcon(i3);
		b1.setForeground(new Color(255, 167, 0));
		b1.setFont(new Font("Segoe UI", 3, 18));
		b1.setBounds(600, 75, 110, 33);
		contentPane.add(b1);

		// Button to delete
		JButton b2 = new JButton("Delete");
		b2.addActionListener(this);
		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/nineth.png"));
        Image i5 = i4.getImage().getScaledInstance(20, 21, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        b2.setIcon(i6);
		b2.setForeground(new Color(255, 167, 0));
		b2.setFont(new Font("Segoe UI", 3, 18));
		b2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		b2.setBounds(730, 75, 110, 33);
		contentPane.add(b2);

		// Search Text Field
		search = new JTextField();
		search.setBackground(new Color(255, 240, 245));
		search.setBorder(new LineBorder(new Color(115, 194, 251), 2, true));
		search.setFont(new Font("Noto Sans", Font.ITALIC, 15));
		search.setBounds(170, 75, 400, 33);
		contentPane.add(search);
		search.setColumns(10);

		// Go Back
		JLabel l2 = new JLabel("Back");
		l2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                Home home = new Home();
		home.setVisible(true);
		            }
		});
		l2.setForeground(Color.GRAY);
		l2.setFont(new Font("Segoe UI", Font.ITALIC, 18));
		ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/back.jpg"));
		Image i8 = i7.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
		ImageIcon i9 = new ImageIcon(i8);
		l2.setIcon(i9);
		l2.setBounds(30, 75, 72, 33);
		contentPane.add(l2);

		student();
    }

	// Connection to MySQL and Actions Class
    public void actionPerformed(ActionEvent ae){
        try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibMgmSys_ProjectV2?characterEncoding=latin1", "root", "password");
			Statement s =c.createStatement();
            
            //conn con = new conn();
            if( ae.getSource() == b1){
                String sql = "select * from student where concat(student_id, firstname) like ?";
		PreparedStatement st = c.prepareStatement(sql);
		st.setString(1, "%" + search.getText() + "%");
		ResultSet rs = st.executeQuery();

		table.setModel(DbUtils.resultSetToTableModel(rs));
		rs.close();
		st.close();
            }
    
            if(ae.getSource() == b2){
                String sql = "delete from student where name = '" + search.getText() + "'";
		PreparedStatement st = c.prepareStatement(sql);

		JDialog.setDefaultLookAndFeelDecorated(true);
		int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm",
		JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (response == JOptionPane.NO_OPTION) {

		} else if (response == JOptionPane.YES_OPTION) {
                    int rs = st.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Deleted !!");
		} else if (response == JOptionPane.CLOSED_OPTION) {
                
                }
		st.close();
		
            }
            c.close();
        }catch(Exception e){
            
        }
    }
}
