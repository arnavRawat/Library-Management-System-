// Project V2- Code for Home Window

package library.management.system;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{

        //Component Declaration
	    private JPanel contentPane;
        private JButton b1,b2,b3,b4,b5,b6;

	public static void main(String[] args) {
            new Home().setVisible(true);
	}
        
        public Home() {

	        // Title
	        super("Home");

	        // JPanel
            setBounds(400, 150, 810, 700);
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            // JMenuBar
            JMenuBar menuBar = new JMenuBar();
            menuBar.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), new Color(255, 255, 255)));
            menuBar.setBackground(new java.awt.Color(0xBCD4E6));
            menuBar.setBounds(0,0,795,35);
            JMenu mnRecord = new JMenu("Record");
            menuBar.add(mnRecord);
            menuBar.add(Box.createHorizontalGlue());
            JMenu mnExit = new JMenu("Exit");
            menuBar.add(mnExit);
            contentPane.add(menuBar);


            // Menu Exit
            mnExit.setForeground(new Color(200, 50, 50));
            mnExit.setFont(new Font("Noto Sans", Font.BOLD, 20));

            // Menu Item Logout
            JMenuItem mntmLogout = new JMenuItem("Logout");
            mntmLogout.setFont(new Font("Noto Sans", Font.ROMAN_BASELINE, 17));
            mntmLogout.setBackground(new Color(255, 255, 255));
            mntmLogout.setForeground(new Color(0, 0, 0));
            mntmLogout.addActionListener(this);
            mnExit.add(mntmLogout);

            // Menu Item Exit
            JMenuItem mntmExit = new JMenuItem("Exit");
            mntmExit.setFont(new Font("Noto Sans", Font.ROMAN_BASELINE, 17));
            mntmExit.setForeground(new Color(0, 0, 0));
            mntmExit.setBackground(new Color(255, 255, 255));
            mntmExit.addActionListener(this);
            mnExit.add(mntmExit);

            // Menu Record
            mnRecord.setForeground(new Color(0, 0, 50));
            mnRecord.setFont(new Font("Noto Sans", Font.BOLD, 20));

            // Menu Item Book Details
            JMenuItem bookdetails = new JMenuItem("Book Details");
            bookdetails.addActionListener(this);
            bookdetails.setFont(new Font("Noto Sans", Font.ROMAN_BASELINE, 17));
            bookdetails.setForeground(new Color(0, 0, 0));
            bookdetails.setBackground(new Color(255, 255, 255));
            mnRecord.add(bookdetails);

            // Menu Item Student Details
            JMenuItem studentdetails = new JMenuItem("Student Details");
            studentdetails.setFont(new Font("Noto Sans", Font.ROMAN_BASELINE, 17));
            studentdetails.setForeground(new Color(0, 0, 0));
            studentdetails.setBackground(new Color(255, 255, 255));
            studentdetails.addActionListener(this);
            mnRecord.add(studentdetails);

            // Title Label 1
            JLabel lblTitle = new JLabel("Welcome to ");
            lblTitle.setForeground(Color.WHITE);
            lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 30));
            lblTitle.setForeground(new java.awt.Color(0,0,0));
            lblTitle.setBounds(170, 65, 500, 60);
            contentPane.add(lblTitle);

            // Title Label 2
            JLabel lblTitle2 = new JLabel("the Dashboard");
            lblTitle2.setForeground(Color.WHITE);
            lblTitle2.setFont(new Font("Segoe UI", Font.BOLD, 30));
            lblTitle2.setForeground(new java.awt.Color(255, 167,0));
            lblTitle2.setBounds(460, 65, 500, 60);
            contentPane.add(lblTitle2);

            // Image Icon 1 (Title)
            JLabel l5 = new JLabel("");
            l5.setVerticalAlignment(SwingConstants.TOP);
            ImageIcon icon_22  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/home.png"));
            Image icon_20 = icon_22.getImage().getScaledInstance(100, 100,Image.SCALE_SMOOTH);
            ImageIcon icon_21 = new ImageIcon(icon_20);
            l5 = new JLabel(icon_21);
            l5.setBounds(350, 45, 100, 100);
            contentPane.add(l5);

            // Image Icon Operation
            JLabel labelOps = new JLabel();
            ImageIcon iA = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/ops.png"));
            Image iB = iA.getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH);
            ImageIcon iC = new ImageIcon(iB);
            labelOps = new JLabel(iC);
            labelOps.setBounds(0, 250, 170, 190);
            contentPane.add(labelOps);

            // Operations Label
            JLabel labelOps1 = new JLabel("OPERATIONS");
            labelOps1.setBounds(38, 405, 115, 35);
            labelOps1.setFont(new Font("Segoe UI", Font.ROMAN_BASELINE, 17));
            contentPane.add(labelOps1);

            // Button to Add Books
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/addBook.png"));
            Image i2 = i1.getImage().getScaledInstance(100, 102,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            b1 = new JButton(i3);
            b1.setVerticalAlignment(SwingConstants.TOP);
            b1.setBounds(190, 165, 100, 100);
            b1.setBorder(null);
            contentPane.add(b1);
            b1.addActionListener(this);
            b1.setBackground(Color.WHITE);
            // Add Books Label
            JLabel labeladdb = new JLabel("ADD BOOKS");
            labeladdb.setBounds(198, 265, 115, 35);
            labeladdb.setFont(new Font("Segoe UI", Font.BOLD, 15));
            contentPane.add(labeladdb);

            // Button to Show Statistics
            ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/stats.jpg"));
            Image i5 = i4.getImage().getScaledInstance(115, 113,Image.SCALE_DEFAULT);
            ImageIcon i6 = new ImageIcon(i5);
            b2 = new JButton(i6);
            b2.setBorder(null);
            b2.setBounds(190, 310, 115, 113);
            b2.addActionListener(this);
            b2.setBackground(Color.WHITE);
            contentPane.add(b2);
            // Statistics Label
            JLabel labelstats = new JLabel("STATISTICS");
            labelstats.setBounds(208, 410, 115, 35);
            labelstats.setFont(new Font("Segoe UI", Font.BOLD, 15));
            contentPane.add(labelstats);

            // Button to Add Student
            ImageIcon i7  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/user.png"));
            Image i8 = i7.getImage().getScaledInstance(115, 113,Image.SCALE_DEFAULT);
            ImageIcon i9 = new ImageIcon(i8);
            b3 = new JButton(i9);
            contentPane.add(b3);
            b3.setBorder(null);
            b3.setBounds(190, 465, 115, 113);
            b3.addActionListener(this);
            b3.setBackground(Color.WHITE);
            contentPane.add(b3);
            // Add Student Label
            JLabel labeladdu = new JLabel("ADD USER");
            labeladdu.setBounds(205, 575, 115, 35);
            labeladdu.setFont(new Font("Segoe UI", Font.BOLD, 15));
            contentPane.add(labeladdu);

            // Image Icon 2 (Actions)
            JLabel labelAct = new JLabel();
            ImageIcon iD = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/act.png"));
            Image iE = iD.getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH);
            ImageIcon iF = new ImageIcon(iE);
            labelAct = new JLabel(iF);
            labelAct.setBounds(670, 280, 100, 100);
            contentPane.add(labelAct);
            // Actions Label
            JLabel labelAct1 = new JLabel("ACTIONS");
            labelAct1.setBounds(690, 390, 115, 35);
            labelAct1.setFont(new Font("Segoe UI", Font.ROMAN_BASELINE, 17));
            contentPane.add(labelAct1);

            // Button to Issue Books
            ImageIcon i10  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/download.png"));
            Image i11 = i10.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
            ImageIcon i12 = new ImageIcon(i11);
            b4 = new JButton(i12);
            b4.setBorder(null);
            b4.setBounds(510, 165, 100, 100);
            b4.setBackground(Color.WHITE);
            b4.addActionListener(this);
            contentPane.add(b4);
            // Issue Books Label
            JLabel is = new JLabel("ISSUE BOOK");
            is.setBounds(518, 260, 115, 35);
            is.setFont(new Font("Segoe UI", Font.BOLD, 15));
            contentPane.add(is);

            // Button to Return Book
            ImageIcon i13  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/up.png"));
            Image i14 = i13.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
            ImageIcon i15 = new ImageIcon(i14);
            b5 = new JButton(i15);
            b5.setBorder(null);
            b5.setBounds(510, 320, 100, 100);
            b5.addActionListener(this);
            b5.setBackground(Color.WHITE);
            contentPane.add(b5);
            // Return Book Label
            JLabel re = new JLabel("RETURN BOOK");
            re.setBounds(508, 415, 115, 35);
            re.setFont(new Font("Segoe UI", Font.BOLD, 15));
            contentPane.add(re);

            // Button to About Us
            ImageIcon i16  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/us.jpg"));
            Image i17 = i16.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
            ImageIcon i18 = new ImageIcon(i17);
            b6 = new JButton(i18);
            b6.addActionListener(this);
            b6.setBackground(Color.WHITE);
            b6.setBorder(null);
            b6.setBounds(515, 470, 100, 100);
            contentPane.add(b6);

            // Label for Separation Line
            JLabel lblLine = new JLabel();
            lblLine.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 64, 64, 255), 11, true));
            lblLine.setBounds(400, 155, 1, 460);
            contentPane.add(lblLine);

            // Image Icon for Background
            JLabel ln = new JLabel("");
            ln.setVerticalAlignment(SwingConstants.TOP);
            ImageIcon iconA  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/light.jpg"));
            Image iconB = iconA.getImage().getScaledInstance(1000, 1000,Image.SCALE_DEFAULT);
            ImageIcon iconC = new ImageIcon(iconB);
            ln = new JLabel(iconC);
            ln.setBounds(0, 0, 1000, 1000);
            contentPane.add(ln);

            getContentPane().setBackground(Color.WHITE);
            contentPane.setBackground(Color.WHITE);
	}

        // Connection to MySQL and Actions Class
        public void actionPerformed(ActionEvent ae){
            String msg = ae.getActionCommand();
            if(msg.equals("Logout")){
                setVisible(false);
		new Login_user().setVisible(true);
            }else if(msg.equals("Exit")){
                System.exit(ABORT);
            
            }else if(msg.equals("Read Me")){
            
            }else if(msg.equals("About Us")){
                setVisible(false);
		new aboutUs().setVisible(true);
            
            }else if(msg.equals("Book Details")){
                setVisible(false);
		new BookDetails().setVisible(true);
            }else if(msg.equals("Student Details")){
                setVisible(false);
                new StudentDetails().setVisible(true);
			
            }
            
            if(ae.getSource() == b1){
                this.setVisible(false);
                new AddBook().setVisible(true);
            }
            if(ae.getSource() == b2){
                this.setVisible(false);
                new Statistics().setVisible(true);
            }
            if(ae.getSource() == b3){
                this.setVisible(false);
                new AddStudent().setVisible(true);
            }
            if(ae.getSource() == b4){
                this.setVisible(false);
                new IssueBook().setVisible(true);
            }
            if(ae.getSource() == b5){
                this.setVisible(false);
                new ReturnBook().setVisible(true);
            
            }
            if(ae.getSource() == b6){
                this.setVisible(false);
                new aboutUs().setVisible(true);
            
            }
            
        }
}
