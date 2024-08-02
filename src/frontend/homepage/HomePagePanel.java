package frontend.homepage;

import main.App;
import frontend.authentication.LoginPanel;
import frontend.order_ui.*;
import frontend.myorders.*;
public class HomePagePanel extends javax.swing.JPanel {

    App app;
    public HomePagePanel(App app) {
        initComponents();
        this.app = app;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        HomePageLabel = new javax.swing.JLabel();
        ButtonPanel = new javax.swing.JPanel();
        MyOrdersButton = new javax.swing.JButton();
        PlaceOrderButton = new javax.swing.JButton();
        ProfileButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();

        HeaderPanel.setBackground(new java.awt.Color(0, 0, 0));

        HomePageLabel.setBackground(new java.awt.Color(238, 103, 35));
        HomePageLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        HomePageLabel.setForeground(new java.awt.Color(247, 247, 247));
        HomePageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HomePageLabel.setText("Home Page");
        HomePageLabel.setMaximumSize(new java.awt.Dimension(110, 48));
        HomePageLabel.setMinimumSize(new java.awt.Dimension(110, 48));
        HomePageLabel.setPreferredSize(new java.awt.Dimension(110, 48));

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(HomePageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(HomePageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        ButtonPanel.setBackground(new java.awt.Color(255, 255, 255));
        ButtonPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MyOrdersButton.setBackground(new java.awt.Color(255, 204, 0));
        MyOrdersButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        MyOrdersButton.setForeground(new java.awt.Color(255, 255, 255));
        MyOrdersButton.setText("My Orders");
        MyOrdersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyOrdersButtonActionPerformed(evt);
            }
        });
        ButtonPanel.add(MyOrdersButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 179, 45));

        PlaceOrderButton.setBackground(new java.awt.Color(255, 204, 0));
        PlaceOrderButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        PlaceOrderButton.setForeground(new java.awt.Color(255, 255, 255));
        PlaceOrderButton.setText("Place Order");
        PlaceOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceOrderButtonActionPerformed(evt);
            }
        });
        ButtonPanel.add(PlaceOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 179, 45));

        ProfileButton.setBackground(new java.awt.Color(255, 204, 0));
        ProfileButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ProfileButton.setForeground(new java.awt.Color(255, 255, 255));
        ProfileButton.setText("Profile");
        ProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileButtonActionPerformed(evt);
            }
        });
        ButtonPanel.add(ProfileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 179, 46));

        LogoutButton.setBackground(new java.awt.Color(255, 69, 35));
        LogoutButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LogoutButton.setForeground(new java.awt.Color(255, 255, 255));
        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });
        ButtonPanel.add(LogoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 179, 45));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                    .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PlaceOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceOrderButtonActionPerformed
        // TODO add your handling code here:
        app.switchPanel(new SearchRestaurantPanel(app));
    }//GEN-LAST:event_PlaceOrderButtonActionPerformed

    private void MyOrdersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyOrdersButtonActionPerformed
        // TODO add your handling code here:
        app.switchPanel(new MyOrdersPanel(app));
    }//GEN-LAST:event_MyOrdersButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        // TODO add your handling code here:
        app.current_user_id = null;
        app.switchPanel(new LoginPanel(app));
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void ProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileButtonActionPerformed
        // TODO add your handling code here:
        app.switchPanel(new ProfilePagePanel(app));
    }//GEN-LAST:event_ProfileButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel HomePageLabel;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton MyOrdersButton;
    private javax.swing.JButton PlaceOrderButton;
    private javax.swing.JButton ProfileButton;
    // End of variables declaration//GEN-END:variables
}
