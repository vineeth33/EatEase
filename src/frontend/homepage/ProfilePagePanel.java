package frontend.homepage;
import frontend.authentication.*;
import main.App;
import java.sql.*;
import javax.swing.JOptionPane;
import tools.Tools;

public class ProfilePagePanel extends javax.swing.JPanel {

    App app;
    public ProfilePagePanel(App app) {
        initComponents();
        this.app = app;
        loadProfileDetails();
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
        updateButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
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
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 0));

        HeaderPanel.setBackground(new java.awt.Color(0, 0, 0));
        HeaderPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(247, 247, 247), 3));

        SignUpLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        SignUpLabel.setForeground(new java.awt.Color(247, 247, 247));
        SignUpLabel.setText("PROFILE");
        SignUpLabel.setAlignmentX(0.5F);

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(SignUpLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(SignUpLabel)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        FormPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UsernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(94, 94, 94));
        UsernameLabel.setText("Username");
        FormPanel.add(UsernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, 26));

        PasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(94, 94, 94));
        PasswordLabel.setText("Password");
        FormPanel.add(PasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 80, -1));

        ConfirmPasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ConfirmPasswordLabel.setForeground(new java.awt.Color(94, 94, 94));
        ConfirmPasswordLabel.setText("Confirm Password");
        FormPanel.add(ConfirmPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 170, -1));

        PhoneLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PhoneLabel.setForeground(new java.awt.Color(94, 94, 94));
        PhoneLabel.setText("Phone");
        FormPanel.add(PhoneLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        EmailLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EmailLabel.setForeground(new java.awt.Color(94, 94, 94));
        EmailLabel.setText("Email Id");
        FormPanel.add(EmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        ButtonsPanel.setBackground(new java.awt.Color(255, 204, 0));

        updateButton.setBackground(new java.awt.Color(200, 207, 45));
        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(255, 69, 35));
        backButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonsPanelLayout = new javax.swing.GroupLayout(ButtonsPanel);
        ButtonsPanel.setLayout(ButtonsPanelLayout);
        ButtonsPanelLayout.setHorizontalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        ButtonsPanelLayout.setVerticalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        FormPanel.add(ButtonsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 406, 630, 70));

        username_tf.setEditable(false);
        username_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        username_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));
        FormPanel.add(username_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 177, -1));

        phone_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        phone_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));
        FormPanel.add(phone_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 177, -1));

        email_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));
        FormPanel.add(email_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 177, -1));

        DoorLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DoorLabel.setForeground(new java.awt.Color(94, 94, 94));
        DoorLabel.setText("Door No");
        FormPanel.add(DoorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        StreetLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        StreetLabel.setForeground(new java.awt.Color(94, 94, 94));
        StreetLabel.setText("Street");
        FormPanel.add(StreetLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        PincodeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PincodeLabel.setForeground(new java.awt.Color(94, 94, 94));
        PincodeLabel.setText("Pincode");
        FormPanel.add(PincodeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 70, -1));

        door_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        door_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));
        FormPanel.add(door_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 177, -1));

        street_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        street_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));
        FormPanel.add(street_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 177, -1));

        pincode_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pincode_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 50, 50)));
        FormPanel.add(pincode_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 177, -1));

        password_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        password_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FormPanel.add(password_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 177, -1));

        confirm_password_tf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        confirm_password_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FormPanel.add(confirm_password_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 177, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/homepage/homepage.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        FormPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 620, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void loadProfileDetails(){
        try{
            String query = "SELECT u.user_id, username, password, phone_no, email_id, door_no, street, pincode FROM users u JOIN user_address a ON (u.user_id = a.user_id) WHERE(u.user_id = ?)";
            app.ps = app.con.prepareStatement(query);
            app.ps.setString(1, app.current_user_id);
            app.rs = app.ps.executeQuery();
            
            if(app.rs.next()){
                username_tf.setText(app.rs.getString(2));
                password_tf.setText(app.rs.getString(3));
                confirm_password_tf.setText(app.rs.getString(3));
                phone_tf.setText(app.rs.getString(4));
                email_tf.setText(app.rs.getString(5));
                door_tf.setText(app.rs.getString(6));
                street_tf.setText(app.rs.getString(7));
                pincode_tf.setText(app.rs.getString(8));
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(this, "Cannot load Profile");
        }
    }
    
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
                   
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

        try{
            // Insert into users
            String query = "UPDATE users SET password=?, phone_no=?, email_id=? WHERE user_id = ?";
            app.ps = app.con.prepareStatement(query);
            app.ps.setString(1, password_tf.getText());
            app.ps.setString(2, phone_tf.getText());
            app.ps.setString(3, email_tf.getText());
            app.ps.setString(4, app.current_user_id);

            int rows1 = app.ps.executeUpdate();

            query = "UPDATE user_address SET door_no=?, street=?, pincode=? WHERE user_id = ?";
            app.ps = app.con.prepareStatement(query);
            app.ps.setString(4, app.current_user_id);
            app.ps.setString(1, door_no);
            app.ps.setString(2, street);
            app.ps.setString(3, pincode);

            int rows2 = app.ps.executeUpdate();
            if(rows1 > 0 && rows2 > 0){
                JOptionPane.showMessageDialog(this, "Profile Updated");
                app.switchPanel(new HomePagePanel(app));
            }
            else{
                JOptionPane.showMessageDialog(this, "Failed to update profile");
            }

        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(this, "Failed to update profile" + ex.getMessage());
        }
        
    }//GEN-LAST:event_updateButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        app.switchPanel(new HomePagePanel(app));
    }//GEN-LAST:event_backButtonActionPerformed


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
    private javax.swing.JButton backButton;
    private javax.swing.JPasswordField confirm_password_tf;
    private javax.swing.JTextField door_tf;
    private javax.swing.JTextField email_tf;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField password_tf;
    private javax.swing.JTextField phone_tf;
    private javax.swing.JTextField pincode_tf;
    private javax.swing.JTextField street_tf;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField username_tf;
    // End of variables declaration//GEN-END:variables
}
