package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class aboutUs extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new aboutUs().setVisible(true);			
	}
    
        public aboutUs() {
            
            super("Actions- About Us");



            setBackground(new Color(255, 255, 255));
            setBounds(500, 250, 700, 500);
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);
            contentPane.setBackground(new Color(255, 255, 255));


            JLabel lTitle = new JLabel("Library Management System");
            lTitle.setFont(new Font("Segoe UI", Font.BOLD, 20));
            lTitle.setForeground(Color.black);
            lTitle.setBounds(10, 10, 600, 35);
            contentPane.add(lTitle);

            JLabel lTitle2 = new JLabel("v2.0");
            lTitle2.setFont(new Font("Segoe UI", Font.BOLD, 20));
            lTitle2.setForeground(new Color(0xFFA700));
            lTitle2.setBounds(285, 10, 600, 35);
            contentPane.add(lTitle2);

            JLabel cdn = new JLabel("Codename - Project V2");
            cdn.setFont(new Font("Segoe UI", Font.ITALIC, 13));
            cdn.setForeground(new Color(0x172E41));
            cdn.setBounds(10, 35, 600, 35);
            contentPane.add(cdn);

            JLabel devs = new JLabel("Developed By - Arnav Rawat & Omee Karve");
            devs.setFont(new Font("Product Sans", Font.BOLD, 15));
            lTitle.setForeground(Color.black);
            devs.setBounds(10, 70, 600, 35);
            contentPane.add(devs);

            JLabel soft = new JLabel("Software Used - IntelliJ Idea IDE & MySQL");
            soft.setFont(new Font("Product Sans", Font.BOLD, 15));
            soft.setForeground(Color.black);
            soft.setBounds(10, 90, 600, 35);
            contentPane.add(soft);

            JLabel dets = new JLabel("Project");
            dets.setFont(new Font("Product Sans", Font.BOLD, 15));
            dets.setForeground(Color.black);
            dets.setBounds(10, 120, 600, 15);
            contentPane.add(dets);

            JLabel det = new JLabel("Description: ");
            det.setFont(new Font("Product Sans", Font.BOLD, 15));
            det.setForeground(new Color(0xFFA700));
            det.setBounds(70,  120, 600, 15);
            contentPane.add(det);

            JTextArea d = new JTextArea(" The project is a simulation of a sophisticated Library Management System. The project uses Java Swing Components \n for designing and SQL Queries for database construction. " +
                    "Project is codenamed Project V2 which stands for Version 2,\nsince it is the second version of what was originally intended. PV2 is based on a librarians P.O.V.and employs features \nuseful for them. " +
                    " It allows the users to Create a new account, if there isn't one originally, and let's you Sign In. If a user forgets\n their password, they can easily retrieve it from the Forgot Password button on the Login Page." +
                    "The user will then see\n a loading window which uses a progress bar (Java Swing Component). The user will then be brought to the Home Page,\n where they can add books, add students, check details for the both" +
                    ", issue books to a student and return a previously \nissued book. A user can either log out of their account via Exit Menu >> Logout, or they can exit the program all together.\n" +
                    "The Program can check databases, store content and retrieve information in Real-Time by employing the use of SQL Queries.\n" +
                    "\nLet us know if you like our project!!!  " +
                    "Thank You!! ");
            d.setEditable(false);
            d.setFont(new Font("Product Sans", Font.PLAIN, 13));
            d.setForeground(new Color(0x141C21));
            d.setBorder(BorderFactory.createLineBorder(new Color(0x73C2FB), 2, true));
            d.setBounds(10,  160, 665, 210);
            contentPane.add(d);


            JLabel contactUs = new JLabel("Contact Us: rawatarnav2602@gmail.com  ");
            contactUs.setFont(new Font("Product Sans", Font.BOLD, 15));
            contactUs.setForeground(new Color(0x030303));
            contactUs.setBounds(10, 390 , 600, 15);
            contentPane.add(contactUs);
            JLabel contactUsO = new JLabel("omeekarve2002@gmail.com ");
            contactUsO.setFont(new Font("Product Sans", Font.BOLD, 15));
            contactUsO.setForeground(new Color(0x030303));
            contactUsO.setBounds(100,415 , 600, 15);
            contentPane.add(contactUsO);

            JLabel l5 = new JLabel("");
            l5.setVerticalAlignment(SwingConstants.TOP);
            ImageIcon icon_22  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/about.jpg"));
            Image icon_20 = icon_22.getImage().getScaledInstance(125, 130,Image.SCALE_SMOOTH);
            ImageIcon icon_21 = new ImageIcon(icon_20);
            l5 = new JLabel(icon_21);
            l5.setBounds(500, 10, 125, 130);
            contentPane.add(l5);





            contentPane.setBackground(Color.WHITE);
	}
        

}

