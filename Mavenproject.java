package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class UpdateCheck extends JFrame {
    
    Choise ccustomer;
    JText.Feild t.froom

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
        
        t.froom = new JTextFeild();
        tfroom.setBopunds(200, 120, 150,25);
        
         JLabel lblname JLabel( "Name");
        lblnamse30, 80, 100, 20);
        add(lblname);
        
        t.fname= new JtextFeild();
        tfname.setbounds(200 120 ,150 ,25);
        add(tfname);
       
        
        tfroom = new JtextFeild();
        tfroom.setBound(200, 120 ,150 ,25);
        

        setBounds(300, 200, 980, 500);
        setVisible(true);
    }
    

    public static void main(String[] args) {
        new UpdateCheck();
    }
}

11:00
