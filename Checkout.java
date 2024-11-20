package com.mycompany.mavenproject1;

import javax.swing.*;
import java.awt.*;
import jkava.sql.*;
import java.util.Date;
import java.awt.event.*;


public class Checkout extends JFrame implements ActionListener{
    Choice ccustomer;
    JLabel lblroomnumber, lblcheckouttime, lblcheckinttime
    JButton checkout, back;
    Checkout() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel text = new JLabel("Checkout");
        text.setBounds(100,20,100,30);
        text.setForeground(Color.BLUE);
        text.setFont(new Font("Tohma",Font.PLAIN,20));
        add(text);
        
        JLabel lblid = new JLabel("Customer Id");
        lblid.setBounds(30,80,100,30);
        add(lblid);
        
        ccustomer = new Choice();
        ccustomer.setBounds(150,80,150,25);
        add(ccustomer);
        
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer");
            while (rs.next())
                ccustomer.add(rs.getString("number"));

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/tick.png"));
        Image i2 = i1.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel tick = new JLabel(i3);
        tick.setBounds(310, 80, 20, 20);
        add(tick);
        
        
        lblroom = new JLabel("room number");
        lblroom.setBounds(30, 130, 100, 30);
        add(lblroom);
                
        
        lblroomnumber = new JLabel();
        lblroomnumber.setBounds(150, 130, 100, 30);
        add(lblroomnumber);
        
        JLabel lblcheckin = new JLabel("chekin time");
        lblcheckin.setBounds(30, 180, 100, 30);
        add(lblcheckin);
                
        
        JLabel lblchekin = new JLabel();
        lblchekin.setBounds(150, 180, 100, 30);
        add(lblchekin);
        
        JLabel lblcheckout = new JLabel("checkout time");
        lblcheckout.setBounds(30, 230, 100, 30);
        add(lblcheckout);
                
        Date date = new Date();
        lblcheckouttime = new JLabel("" + date);
        lblcheckouttime.setBounds(150, 230, 150, 30);
        add(lblcheckouttime);
          
        
       checkout = new JButtton("Checkout");
       checkout.setBackground(color.BLACK);
       checkout.setForeground(color.WHITE);
       checkout.setBounds(30, 280, 120, 30);
       checkout.addActionlistener(this);
       add(checkout);
       
       back = new JButtton("BAck");
       back.setBackground(color.BLACK);
       back.setForeground(color.WHITE);
       back.setBounds(170, 280, 120, 30);
       back.addActionlistener(this);
       add(back);
       
         ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/sixth.jpg"));
         Image i2 = i4.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
         ImageIcon i6 = new ImageIcon(i5);
         JLabel tick = new JLabel(i6);
         tick.setBounds(350, 50, 400, 250);
         add(image);
        
        
        setBounds(300, 200, 800, 400);  // Corrected "seBounds" to "setBounds"
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
         if (ae.getSource() == checkout ) {
             String query = "delete from customer where number = '"+ccustomer+"'";
             String query2 = "update room set availabilty = 'available' where roomnumber= '"+lblroomnumber.getText()+"' "
                     
             try  P{    
         }
    
        }else
     setVisible(false);
     new Reception();
    

     public static void main(String[] args) {
         new Checkout();
    }
}


19:00
