package frontend.order_ui;

import main.App;
import frontend.order_ui.*;

public class RestaurantDetails extends javax.swing.JPanel {
    App app;
    String restaurant_id;
    
    public RestaurantDetails(String restaurant_id, String restaurant_name, String address, String cuisine_type, App app) {
        initComponents();
        this.app = app;
        this.restaurant_id = restaurant_id;
        restaurant_name_label.setText(restaurant_name);
        address_label.setText(address);
        cuisine_label.setText(cuisine_type);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        restaurant_name_label = new javax.swing.JLabel();
        cuisine_label = new javax.swing.JLabel();
        viewButton = new javax.swing.JButton();
        address_label = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(800, 80));
        setMinimumSize(new java.awt.Dimension(800, 80));
        setPreferredSize(new java.awt.Dimension(800, 80));
        setRequestFocusEnabled(false);

        restaurant_name_label.setBackground(new java.awt.Color(255, 255, 255));
        restaurant_name_label.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        restaurant_name_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        restaurant_name_label.setText("Restaurant Name");
        restaurant_name_label.setMaximumSize(new java.awt.Dimension(140, 60));
        restaurant_name_label.setMinimumSize(new java.awt.Dimension(140, 60));
        restaurant_name_label.setPreferredSize(new java.awt.Dimension(140, 60));

        cuisine_label.setBackground(new java.awt.Color(255, 255, 255));
        cuisine_label.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        cuisine_label.setText("Cuisine type");
        cuisine_label.setMaximumSize(new java.awt.Dimension(99, 60));
        cuisine_label.setMinimumSize(new java.awt.Dimension(99, 60));
        cuisine_label.setPreferredSize(new java.awt.Dimension(99, 60));
        cuisine_label.setRequestFocusEnabled(false);

        viewButton.setBackground(new java.awt.Color(0, 0, 0));
        viewButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewButton.setForeground(new java.awt.Color(255, 255, 255));
        viewButton.setText("View Menu");
        viewButton.setMaximumSize(new java.awt.Dimension(89, 60));
        viewButton.setMinimumSize(new java.awt.Dimension(89, 60));
        viewButton.setPreferredSize(new java.awt.Dimension(89, 60));
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        address_label.setBackground(new java.awt.Color(255, 255, 255));
        address_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        address_label.setText("Address");
        address_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(restaurant_name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(address_label, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cuisine_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(restaurant_name_label, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addComponent(address_label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cuisine_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        app.current_restaurant_id = restaurant_id;
        app.switchPanel(new RestaurantMenu(app));
    }//GEN-LAST:event_viewButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address_label;
    private javax.swing.JLabel cuisine_label;
    private javax.swing.JLabel restaurant_name_label;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
