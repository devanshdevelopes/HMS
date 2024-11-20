package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class UpdateCheck extends JFrame implements ActionListener{
    
    Choise ccustomer;
    JTextFeild tfroom, tfname, tfcheckin, tfpaid, tfpending;
    Jbutton check, update, back;

    UpdateCheck() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel text = new JLabel("Update Status");
        text.setFont(new Font("Tahoma", Font.PLAIN, 20));
        text.setBounds(90, 20, 200, 30);
        text.setForeground(color.BLUE);
        add(text);
        
        
        
        JLabel lblid = new JLabel("customer id");
        lblid.setBounds(30, 80, 100, 20);
        add(lblid);
        
        ccustomer = new choise();
        ccustomer.setBounds(200, 80, 150 , 25);
        add(ccustomer);
        
        try {
            conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer");
            while(rs.next())
                ccustomer.add(rs.getString("number"));
                    
        } catch (Exception e) {
            e.printStackTrace();
        }
        
         JLabel lblroom = new JLabel("Room Number ");
         lblroom.setBounds(30, 80, 100, 20);
         add(lblroom);
        
         tfroom = new JTextFeild();
         tfroom.setBopunds(200, 120, 150,25);
        
         JLabel lblname JLabel( "Name");
         lblname.setBounds(30, 160, 100, 20);
         add(lblname);
        
         tfname= new JtextFeild();
         tfname.setbounds(200 160 ,150 ,25);
         add(tfname);
        
         JLabel lblcheckin JLabel( "checkin time");
         lblcheckin.setBounds(30, 200, 100, 20);
         add(lblcheckin);
        
         tfcheckin= new JtextFeild();
         tfcheckin.setbounds(200 ,200 ,150 ,25);
         add(tfcheckin);
       
        
         tfroom = new JtextFeild();
         tfroom.setBound(200, 120 ,150 ,25);
        
         JLabel lblpaid = new  JLabel( "Amount paid");
         lblpaid.setBounds(30, 240, 100, 20);
         add(lblpaid);
        
         tfpaid= new JtextFeild();
         tfpaid.setbounds(200 240 ,150 ,25);
         add(tfpaid);
        
        
         JLabel lblpending = new  JLabel( "Amount paid");
         lblpending.setBounds(30, 280, 100, 20);
         add(lblpending);
        
         tfpending= new JtextFeild();
         tfpending.setbounds(200 280 ,150 ,25);
         add(tfpending);
          
         
         check = new JButton("Check");
         check.setBackground(Color.BLACK);
         check.setForeground(Color.WHITE);
         check.setBounds(30 ,340, 100, 30);
         check.addActionListener(this);
         add(check);
         
        
        
         update = new JButton("Update");
         update.setBackground(Color.BLACK);
         update.setForeground(Color.WHITE);
         update.setBounds(150 ,340, 100, 30);
         update.addActionListener(this);
         add(update);
        
         back = new JButton("Back");
         back.setBackground(Color.BLACK);
         back.setForeground(Color.WHITE);
         back.setBounds(270 ,340, 100, 30);
         back.addActionListener(this);
         add(back);
         
         ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/nine.jpg"));
         JLabel image = new Jlabel(il);
         image.setBounds(400, 50, 500, 300 );
         add(image);
         
        

        setBounds(300, 200, 980, 500);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if {ae.getSource() == check) {
            String id = ccustomer.getSelectedItem();
            String query = " select * from customer where number = '"+id"'";
            try {
                conn c = new conn();
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                tfroom.setText(rs.getString("room"));
                tfname.setText(rs.getString("name"));
                tfcheckin.setText(rs.getString("checkin time"));
                tfpaid.setText(rs.getString("paid"));
            }
             }
            
            ResultSet rs2 = c.s.executeQuery("select * from room roomnumber = '"+tfroom.getText()+"'");
            while (rs2.next()){
                
                String price = rs.getString("price");
                int amountpaid = integer .parseInt(price) - Integer.parseInt(tfpaid.getText());
                tfpending.setText(""+amountPaid);
            }
        }catch (Exeception e){
                e.printStackTrace();
            }
        }else if (ae.getSource() == update) {
            String number = ccustomer.getSelectedItem();
            String room = tfroom.getText();
            String name = tfname.getText();
            String checkin = tfcheckin.getText();
            String deposit = tfpaid.getText();
            
            
            
           try {
               conn c = new conn();
               c.s.executeUpdate("update customer set room = ' "+room+"', name = '"+name+"',checkintime = ' "checkin"', deposit = ' "+deposit+"' where number = '"+number+"'");
               JOptionPane.showMessageDialog(null,"Data Updated Successfully");
               
               setVisible(false);
               new Reception();
           }
           
           
                
        }catch(Exception e){
            e.printStackTrace();
     =}else {
        setVisible(false);
               new Reception();
        
        }   
        
    }

    public static void main(String[] args) {
        new UpdateCheck();
    }
}


32:00
