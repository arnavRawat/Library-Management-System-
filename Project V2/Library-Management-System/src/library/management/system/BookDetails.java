// Project V2- Code for Add Book Window

package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import net.proteanit.sql.DbUtils;
import java.sql.*;
import java.awt.event.*;

public class BookDetails extends JFrame implements ActionListener{

	// Component Declaration
    private JPanel contentPane;
    private JTable table;
    private JTextField search;
    private JButton b1,b2,b3;

    public static void main(String[] args) {
	new BookDetails().setVisible(true);
    }

    // Connection to MySQL
    public void Book() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibMgmSys_ProjectV2?characterEncoding=latin1", "root", "password");
			Statement s =c.createStatement();
			String sql = "select * from book";
            PreparedStatement st = c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            st.close();
            c.close();

		} catch (Exception e) {
		  }
    }

    public BookDetails()
	{
		// Title
		super("Records- Book Details");

		// JPanel
		setBounds(350, 200, 890, 475);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Scroll Pane
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 133, 815, 282);
		contentPane.add(scrollPane);

			// Table for displaying books
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

		// Label for Table Border
		JLabel lblLine = new JLabel();
		lblLine.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
		lblLine.setBounds(0, 50, 890, 1);
		contentPane.add(lblLine);

		// Title Label Book Details
		JLabel lblTitle = new JLabel("Book Details");
		lblTitle.setForeground(Color.DARK_GRAY);
		lblTitle.setFont(new Font("Noto Sans", Font.BOLD, 20));
		lblTitle.setForeground(new java.awt.Color(0,0,0));
		lblTitle.setBounds(30, 0, 500, 55);
		contentPane.add(lblTitle);

		// Button for Search
		JButton b1 = new JButton("Search");
		b1.addActionListener(this);
		b1.setBorder(new LineBorder(new Color(115, 194, 251), 2, true));
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/eight.png"));
        Image i2 = i1.getImage().getScaledInstance(20, 21, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        b1.setIcon(i3);
		b1.setForeground(new Color(0, 33, 77));
		b1.setFont(new Font("Segoe UI", 3, 18));
		b1.setBounds(600, 75, 110, 33);
		contentPane.add(b1);

		// Button to Delete
		JButton b2 = new JButton("Delete");
		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/nineth.png"));
        Image i5 = i4.getImage().getScaledInstance(20, 21, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        b2.setIcon(i6);
        b2.setForeground(new Color(0, 33, 77));
		b2.setFont(new Font("Segoe UI", 3, 18));
		b2.setBorder(new LineBorder(new Color(115, 194, 251), 2, true));
		b2.setBounds(730, 75, 110, 33);
		b2.addActionListener(this);
		contentPane.add(b2);

		// Search Text Field
		search = new JTextField();
		search.setBackground(new Color(255, 250, 245));
		search.setBorder(new LineBorder(new Color(115, 194, 251), 3, true));
		search.setFont(new Font("Noto Sans", Font.ITALIC, 15));
		search.setBounds(170, 75, 400, 33);
		contentPane.add(search);
		search.setColumns(10);

		// Go Back
		JLabel l3 = new JLabel("Back");
		l3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				Home home = new Home();
				home.setVisible(true);
			}
		});
		l3.setForeground(Color.black);
		l3.setFont(new Font("Segoe UI", Font.ITALIC, 18));
		ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/back.jpg"));
        Image i8 = i7.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        l3.setIcon(i9);
		l3.setBounds(30, 75, 72, 33);
		contentPane.add(l3);

		Book();
    }

    // // Connection to MySQL and Actions Class
    public void actionPerformed(ActionEvent ae){

        try{

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/LibMgmSys_ProjectV2?characterEncoding=latin1", "root", "password");
			Statement s =c.createStatement();

			if(ae.getSource() == b1){

				String sql = "select * from book where concat(name, book_id) like ?";
				PreparedStatement st = c.prepareStatement(sql);
				st.setString(1, "%" + search.getText() + "%");
				ResultSet rs = st.executeQuery();

				table.setModel(DbUtils.resultSetToTableModel(rs));
				rs.close();
				st.close();

            }

			if(ae.getSource() == b2){
				String sql = "delete from book where name = '" + search.getText() + "'";
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
