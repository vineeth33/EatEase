package main;

import javax.swing.*;
import java.sql.*;
import frontend.authentication.*;

public class App extends JFrame{
    public Connection con;
    public PreparedStatement ps;
    public ResultSet rs;
    public ResultSetMetaData rsmd;
    
    public String current_user_id;
    public String current_restaurant_id;
    
    public App(){
        // Initialize JFrame
        setTitle("Food Delivery System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
        initConnection();
        
        switchPanel(new LoginPanel(this));
    }
    
    void initConnection(){
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            try{
                con = DriverManager.getConnection("jdbc:oracle:thin:@Tarun:1521:orcl", "scott", "tiger");
                System.out.println("Connected to the database");
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(this, "Connection Failed\n"+ex.getMessage());
            }
        }
        catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(this, "Driver not found\n"+ex.getMessage());
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Unknown Error\n"+ex.getMessage());
        }
    }
    
    public void switchPanel(JPanel panel){
        this.getContentPane().removeAll();
        this.add(panel);
        this.revalidate();
        this.repaint();
        this.pack();
    }
    
    public static void main(String[] args){
        App app = new App();
    }
}
