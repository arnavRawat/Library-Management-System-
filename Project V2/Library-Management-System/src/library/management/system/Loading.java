// Project V2- Code for Loading Window

package library.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Loading extends JFrame implements Runnable {

    // Component Declaration
	private JPanel contentPane;
	private JProgressBar progressBar;
	Connection conn;
	int s;
	Thread th;

	public static void main(String[] args) {
            new Loading().setVisible(true);
	}

	public void setUploading() {
	    setVisible(false);
            th.start();
	}

	// Progress Bar
	public void run() {
            try {
                for (int i = 0; i < 200; i++) {
                    s = s + 1;
                    int m = progressBar.getMaximum();
                    int v = progressBar.getValue();
                    if (v < m) {
                        progressBar.setValue(progressBar.getValue() + 1);
                    } else {
                        i = 201;
                        setVisible(false);
                        new Home().setVisible(true);
                    }
                    Thread.sleep(50);
                }
            } catch (Exception e) {
		e.printStackTrace();
            }
	}

	public Loading() {


	    // Title
	    super("Loading");
	    th = new Thread((Runnable) this);

	        // JPanel
            setBounds(600, 300, 500, 350);
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setBackground(new Color(0xB0D8E6));
            contentPane.setLayout(null);

            // Title Label 1
            JLabel lbllibraryManagement = new JLabel("Welcome to the");
            lbllibraryManagement.setForeground(new Color(3, 3, 3));
            lbllibraryManagement.setFont(new Font("Product Snas", Font.BOLD, 20));
            lbllibraryManagement.setBounds(137, 70, 500, 35);
            contentPane.add(lbllibraryManagement);

            // Title Label 2
            JLabel l = new JLabel("Library");
            l.setForeground(new Color(255, 79, 0));
            l.setFont(new Font("Product Snas", Font.BOLD, 20));
            l.setBounds(290, 70, 500, 35);
            contentPane.add(l);

            // Progress Bar
            progressBar = new JProgressBar();
            progressBar.setFont(new Font("Noto Snas", Font.BOLD, 14));
            progressBar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
            progressBar.setStringPainted(true);
            progressBar.setForeground(new Color(0xFFA700));
            progressBar.setBackground(Color.BLACK);
            progressBar.setBounds(75, 135, 340, 30);
            contentPane.add(progressBar);

            // Sub-Title
            JLabel lblNewLabel_2 = new JLabel("Please Wait!");
            lblNewLabel_2.setFont(new Font("Noto Snas", Font.BOLD, 14));
            lblNewLabel_2.setForeground(new Color(200, 0, 0));
            lblNewLabel_2.setBounds(210, 190, 275, 20);
            contentPane.add(lblNewLabel_2);

            // Image Icon for Background
            JPanel panel = new JPanel();
            JLabel l5 = new JLabel("");
            l5.setVerticalAlignment(SwingConstants.TOP);
            ImageIcon icon_22  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/wall1.jpg"));
            Image icon_20 = icon_22.getImage().getScaledInstance(500, 500,Image.SCALE_DEFAULT);
            ImageIcon icon_21 = new ImageIcon(icon_20);
            l5 = new JLabel(icon_21);
            l5.setBounds(0, 0, 500, 500);
            contentPane.add(l5);
            panel.setBackground(new Color(0xB0D8E6));
            panel.setBounds(0, 0, 400, 400);
            contentPane.add(panel);
                
            setUploading();
	}
}
