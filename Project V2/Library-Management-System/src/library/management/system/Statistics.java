// Project V2- Code for Statistics Window

package library.management.system;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;

public class Statistics extends JFrame{

    private JPanel contentPane;
    private JTable table;
    private JTable table_1;

    public static void main(String[] args) {
        new Statistics().setVisible(true);
    }

    // Connection to MySQL
    public void issueBook() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibMgmSys_ProjectV2?characterEncoding=latin1", "root", "password");
		Statement s =c.createStatement();

            String sql = "select * from issueBook";
            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(rs));

	} catch (Exception e) {
			// TODO: handle exception
	}
    }

    // Connection to MySQL
    public void returnBook() {
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibMgmSys_ProjectV2?characterEncoding=latin1", "root", "password");
			Statement s =c.createStatement();

            String sql = "select * from returnBook";
            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            table_1.setModel(DbUtils.resultSetToTableModel(rs));
	} catch (Exception e) {
			// TODO: handle exception
	}
    }

    public Statistics() {

    	// Title
    	super("Operations- Statistics");

		// JPanel
        setBounds(400, 200, 810, 670);
		contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Title Label 1
		JLabel lblTitle = new JLabel("Issued Books");
		lblTitle.setFont(new Font("Noto Sans", Font.BOLD, 20));
		lblTitle.setForeground(new java.awt.Color(0, 0, 0));
		lblTitle.setBounds(30, 5, 500, 60);
		contentPane.add(lblTitle);

		// Scroll Pane
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 78, 720, 217);
		contentPane.add(scrollPane);

		// Table to display issued books
        table = new JTable();
		table.setBackground(new Color(255, 255, 255));
		table.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		table.setForeground(new Color(29, 41, 81));
		table.setFont(new Font("Segoe UI", Font.ITALIC, 14));
		scrollPane.setViewportView(table);

		// JPanel acting as border for table
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(47, 79, 79), 3, true), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 128)));
		panel.setForeground(new Color(0, 128, 128));
		panel.setBounds(26, 75, 727, 222);
        panel.setBackground(Color.WHITE);
		contentPane.add(panel);

		// Go Back
		JLabel l1 = new JLabel();
		l1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {

            	setVisible(false);
				Home home = new Home();
				home.setVisible(true);
            }
		});

		l1.setForeground(new Color(204, 0, 102));
		l1.setFont(new Font("Tahoma", Font.BOLD, 18));
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/back.jpg"));
        Image i2 = i1.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l1.setIcon(i3);
		l1.setBounds(690, 20, 40, 40);
		contentPane.add(l1);

		// Title Label 2
		JLabel lblTitle1 = new JLabel("Returned Books");
		lblTitle1.setFont(new Font("Noto Sans", Font.BOLD, 20));
		lblTitle1.setForeground(new java.awt.Color(0, 0, 0));
		lblTitle1.setBounds(30, 300, 500, 60);
		contentPane.add(lblTitle1);

		// Scroll Pane
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(32, 373, 718, 217);
		contentPane.add(scrollPane_1);

		// Table to display returned books
		table_1 = new JTable();
		table_1.setBackground(new Color(255, 255, 255));
		table.setForeground(new Color(29, 41, 81));
		table.setFont(new Font("Segoe UI", Font.ITALIC, 14));
		scrollPane_1.setViewportView(table_1);

		// JPanel acting as Border for table
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 3, true), "", TitledBorder.RIGHT, TitledBorder.TOP, null, new Color(0, 102, 51)));
		panel_1.setBounds(30, 370, 722, 222);
        panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1);


	issueBook();
	returnBook();
    }
}
