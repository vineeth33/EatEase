package frontend.myorders;

import main.App;

public class OrderDetails extends javax.swing.JPanel {
    App app;
    String order_id;
    
    public OrderDetails(String order_id, String restaurant_name, double price, App app) {
        initComponents();
        this.app = app;
        this.order_id = order_id;
        order_id_label.setText(order_id);
        restaurant_name_label.setText(restaurant_name);
        price_label.setText("Rs. "+price);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        order_id_label = new javax.swing.JLabel();
        price_label = new javax.swing.JLabel();
        cartButton = new javax.swing.JButton();
        restaurant_name_label = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(800, 80));
        setMinimumSize(new java.awt.Dimension(800, 80));
        setPreferredSize(new java.awt.Dimension(800, 80));
        setRequestFocusEnabled(false);

        order_id_label.setBackground(new java.awt.Color(255, 255, 255));
        order_id_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        order_id_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        order_id_label.setText("Order_id");
        order_id_label.setMaximumSize(new java.awt.Dimension(140, 60));
        order_id_label.setMinimumSize(new java.awt.Dimension(140, 60));
        order_id_label.setPreferredSize(new java.awt.Dimension(140, 60));

        price_label.setBackground(new java.awt.Color(255, 255, 255));
        price_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        price_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        price_label.setText("Total Price");
        price_label.setMaximumSize(new java.awt.Dimension(99, 60));
        price_label.setMinimumSize(new java.awt.Dimension(99, 60));
        price_label.setPreferredSize(new java.awt.Dimension(99, 60));
        price_label.setRequestFocusEnabled(false);

        cartButton.setBackground(new java.awt.Color(200, 207, 45));
        cartButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cartButton.setForeground(new java.awt.Color(255, 255, 255));
        cartButton.setText("Cart");
        cartButton.setMaximumSize(new java.awt.Dimension(89, 60));
        cartButton.setMinimumSize(new java.awt.Dimension(89, 60));
        cartButton.setPreferredSize(new java.awt.Dimension(89, 60));
        cartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartButtonActionPerformed(evt);
            }
        });

        restaurant_name_label.setBackground(new java.awt.Color(255, 255, 255));
        restaurant_name_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        restaurant_name_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        restaurant_name_label.setText("Restaurant Name");
        restaurant_name_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(order_id_label, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(restaurant_name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(price_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(cartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(order_id_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(restaurant_name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(price_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartButtonActionPerformed
        // TODO add your handling code here:
        app.switchPanel(new OrderCart(order_id_label.getText(), app));
    }//GEN-LAST:event_cartButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cartButton;
    private javax.swing.JLabel order_id_label;
    private javax.swing.JLabel price_label;
    private javax.swing.JLabel restaurant_name_label;
    // End of variables declaration//GEN-END:variables
}
