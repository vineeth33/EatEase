package frontend.order_ui;

import main.App;
public class CartItem extends javax.swing.JPanel {

    String item_id;
    public CartItem(String item_id, String item_name, double price, int quantity) {
        initComponents();
        this.item_id = item_id;
        
        item_name_label.setText(item_name);
        price_label.setText("Rs. "+price);
        qty_label.setText(String.valueOf(quantity));
        total_price_label.setText("Rs. "+String.valueOf(quantity * price));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        item_name_label = new javax.swing.JLabel();
        price_label = new javax.swing.JLabel();
        qty_label = new javax.swing.JLabel();
        total_price_label = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(600, 60));
        setMinimumSize(new java.awt.Dimension(600, 60));
        setPreferredSize(new java.awt.Dimension(600, 60));

        item_name_label.setBackground(new java.awt.Color(255, 255, 255));
        item_name_label.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        item_name_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item_name_label.setText("Item name");

        price_label.setBackground(new java.awt.Color(255, 255, 255));
        price_label.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        price_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        price_label.setText("Price");

        qty_label.setBackground(new java.awt.Color(255, 255, 255));
        qty_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        qty_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qty_label.setText("0");

        total_price_label.setBackground(new java.awt.Color(255, 255, 255));
        total_price_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        total_price_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total_price_label.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(item_name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(price_label, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qty_label, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(total_price_label, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item_name_label, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(total_price_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(qty_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(price_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel item_name_label;
    private javax.swing.JLabel price_label;
    private javax.swing.JLabel qty_label;
    private javax.swing.JLabel total_price_label;
    // End of variables declaration//GEN-END:variables
}
