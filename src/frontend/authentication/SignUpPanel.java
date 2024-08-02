/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package frontend.authentication;
import main.App;
import java.sql.*;
import javax.swing.JOptionPane;
import tools.Tools;

public class SignUpPanel extends javax.swing.JPanel {

    App app;
    public SignUpPanel(App app) {
        initComponents();
        this.app = app;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        SignUpLabel = new javax.swing.JLabel();
        FormPanel = new javax.swing.JPanel();
        UsernameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        ConfirmPasswordLabel = new javax.swing.JLabel();
        PhoneLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        ButtonsPanel = new javax.swing.JPanel();
        signup_button = new javax.swing.JButton();
        back_button = new javax.swing.JButton();
        username_tf = new javax.swing.JTextField();
        phone_tf = new javax.swing.JTextField();
        email_tf = new javax.swing.JTextField();
        DoorLabel = new javax.swing.JLabel();
        StreetLabel = new javax.swing.JLabel();
        PincodeLabel = new javax.swing.JLabel();
        door_tf = new javax.swing.JTextField();
        street_tf = new javax.swing.JTextField();
        pincode_tf = new javax.swing.JTextField();
        password_tf = new javax.swing.JPasswordField();
        confirm_password_tf = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 0));

        HeaderPanel.setBackground(new java.awt.Color(0, 0, 0));
        HeaderPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(247, 247, 247), 3));

        SignUpLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        SignUpLabel.setForeground(new java.awt.Color(247, 247, 247));
        SignUpLabel.setText("SIGN UP");
        SignUpLabel.setAlignmentX(0.5F);

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SignUpLabel)
                .addGap(230, 230, 230))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(SignUpLabel)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        FormPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UsernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(94, 94, 94));
        UsernameLabel.setText("Username");
        FormPanel.add(UsernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, 26));

        PasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(94, 94, 94));
        PasswordLabel.setText("Password");
        FormPanel.add(PasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        ConfirmPasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ConfirmPasswordLabel.setForeground(new java.awt.Color(94, 94, 94));
        ConfirmPasswordLabel.setText("Confirm Password");
        FormPanel.add(ConfirmPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));

        PhoneLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PhoneLabel.setForeground(new java.awt.Color(94, 94, 94));
        PhoneLabel.setText("Phone");
        FormPanel.add(PhoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, -1));

        EmailLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EmailLabel.setForeground(new java.awt.Color(94, 94, 94));
        EmailLabel.setText("Email Id");
        FormPanel.add(EmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        ButtonsPanel.setBackground(new java.awt.Color(255, 204, 0));

        signup_button.setBackground(new java.awt.Color(200, 207, 45));
        signup_button.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        signup_button.setForeground(new java.awt.Color(255, 255, 255));
        signup_button.setText("Sign Up");
        signup_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_buttonActionPerformed(evt);
            }
        });

        back_button.setBackground(new java.awt.Color(255, 69, 35));
        back_button.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        back_button.setForeground(new java.awt.Color(255, 255, 255));
        back_button.setText("Back");
        back_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonsPanelLayout = new javax.swing.GroupLayout(ButtonsPanel);
        ButtonsPanel.setLayout(ButtonsPanelLayout);
        ButtonsPanelLayout.setHorizontalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(signup_button, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        ButtonsPanelLayout.setVerticalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signup_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        FormPanel.add(ButtonsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 341, 620, 100));

        username_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        username_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));
        FormPanel.add(username_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 177, -1));

        phone_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        phone_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));
        FormPanel.add(phone_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 177, -1));

        email_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));
        FormPanel.add(email_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 177, -1));

        DoorLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DoorLabel.setForeground(new java.awt.Color(94, 94, 94));
        DoorLabel.setText("Door No");
        FormPanel.add(DoorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));

        StreetLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        StreetLabel.setForeground(new java.awt.Color(94, 94, 94));
        StreetLabel.setText("Street");
        FormPanel.add(StreetLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));

        PincodeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PincodeLabel.setForeground(new java.awt.Color(94, 94, 94));
        PincodeLabel.setText("Pincode");
        FormPanel.add(PincodeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        door_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        door_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));
        FormPanel.add(door_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 177, -1));

        street_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        street_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));
        FormPanel.add(street_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 177, -1));

        pincode_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pincode_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));
        FormPanel.add(pincode_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 177, -1));

        password_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        password_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FormPanel.add(password_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 177, -1));

        confirm_password_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        confirm_password_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FormPanel.add(confirm_password_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 177, -1));

        jLabel1.setBackground(new java.awt.Color(255, 204, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/authentication/SignUpBg.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        FormPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 620, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void signup_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_buttonActionPerformed
        // TODO add your handling code here:
        
        try{
            // Check if username is empty
            String username = username_tf.getText();
            if(username.equals("")){
                JOptionPane.showMessageDialog(this, "Username cannot be empty");
                return;
            }
            
            // Check username availability
            String query = "SELECT count(*) FROM users WHERE username = ?";
            app.ps = app.con.prepareStatement(query);
            app.ps.setString(1, username_tf.getText());
            app.rs = app.ps.executeQuery();
            app.rs.next();
            if(app.rs.getInt(1) > 0){
                JOptionPane.showMessageDialog(this, "Username already taken");
                return;
            }
            
            // Check if password is empty
            String password = password_tf.getText();
            if(password.equals("")){
                JOptionPane.showMessageDialog(this, "Password cannot be empty");
                return;
            }
            // Check if passwords match
            else if(!password.equals(confirm_password_tf.getText())){
                JOptionPane.showMessageDialog(this, "Passwords do no match");
                return;
            }
            
            // Check if phone no is empty
            String phone_no = phone_tf.getText();
            if(!(phone_no.length() == 10)){
                JOptionPane.showMessageDialog(this, "Invalid phone no");
                return;
            }
            
            // Check if door no is empty
            String door_no = door_tf.getText();
            if(door_no.equals("")){
                JOptionPane.showMessageDialog(this, "Door no cannot be empty");
                return;
            }
            
            // Check if street is empty
            String street = street_tf.getText();
            if(street.equals("")){
                JOptionPane.showMessageDialog(this, "Street cannot be empty");
                return;
            }
            
            // Check if pincode is empty
            String pincode = pincode_tf.getText();
            if(!(pincode.length() == 6 && Tools.isNumeric(pincode))){
                JOptionPane.showMessageDialog(this, "Invalid Pincode");
                return;
            }
            
            // Calculate the new user id
            int new_user_id_int = 0;
            query = "SELECT user_id FROM users ORDER BY user_id DESC";
            app.ps = app.con.prepareStatement(query);
            app.rs = app.ps.executeQuery();
            if(app.rs.next()){
                String user_id_int = app.rs.getString(1).substring(1, 4);
                new_user_id_int = Integer.parseInt(user_id_int) + 1;
            }
            
            String new_user_id = "U";
            if(new_user_id_int < 10){
                    new_user_id += "00" + new_user_id_int;
            }
            else if(new_user_id_int < 100){
                new_user_id += "0" + new_user_id_int;
            }
            else{
                new_user_id += new_user_id_int;
            }
            
            try{
                // Insert into users
                query = "INSERT INTO users VALUES(?, ?, ?, ?, ?)";
                app.ps = app.con.prepareStatement(query);
                app.ps.setString(1, new_user_id);
                app.ps.setString(2, username);
                app.ps.setString(3, password);
                app.ps.setString(4, phone_no);
                app.ps.setString(5, email_tf.getText());

                int rows1 = app.ps.executeUpdate();
                
                
                query = "INSERT INTO user_address VALUES(?, ?, ?, ?)";
                app.ps = app.con.prepareStatement(query);
                app.ps.setString(1, new_user_id);
                app.ps.setString(2, door_no);
                app.ps.setString(3, street);
                app.ps.setString(4, pincode);
                
                int rows2 = app.ps.executeUpdate();
                if(rows1 > 0 && rows2 > 0){
                    JOptionPane.showMessageDialog(this, "New User Created");
                    app.switchPanel(new LoginPanel(app));
                }
                else{
                    JOptionPane.showMessageDialog(this, "Failed to create user");
                }
                
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(this, "Failed to create user" + ex.getMessage());
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(this, "Cannot Execute query"+ex.getMessage());
        }
    }//GEN-LAST:event_signup_buttonActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
        app.switchPanel(new LoginPanel(app));
    }//GEN-LAST:event_back_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonsPanel;
    private javax.swing.JLabel ConfirmPasswordLabel;
    private javax.swing.JLabel DoorLabel;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JPanel FormPanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JLabel PincodeLabel;
    private javax.swing.JLabel SignUpLabel;
    private javax.swing.JLabel StreetLabel;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JButton back_button;
    private javax.swing.JPasswordField confirm_password_tf;
    private javax.swing.JTextField door_tf;
    private javax.swing.JTextField email_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField password_tf;
    private javax.swing.JTextField phone_tf;
    private javax.swing.JTextField pincode_tf;
    private javax.swing.JButton signup_button;
    private javax.swing.JTextField street_tf;
    private javax.swing.JTextField username_tf;
    // End of variables declaration//GEN-END:variables
}
