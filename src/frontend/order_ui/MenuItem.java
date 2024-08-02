package frontend.order_ui;

import main.App;
public class MenuItem extends javax.swing.JPanel {

    App app;
    String item_id;
    String item_name;
    Double price;
    int quantity;
    
    public MenuItem(String item_id, String item_name, double price, App app) {
        initComponents();
        this.item_id = item_id;
        this.item_name = item_name;
        this.price = price;
        item_name_label.setText(item_name);
        price_label.setText("Rs. "+price);
        this.app = app;
    }
    
    public void setQuantity(){
        quantity = Integer.parseInt(quantity_tf.getText());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        item_name_label = new javax.swing.JLabel();
        price_label = new javax.swing.JLabel();
        quantity_tf = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(500, 60));
        setMinimumSize(new java.awt.Dimension(500, 60));
        setPreferredSize(new java.awt.Dimension(500, 60));

        item_name_label.setBackground(new java.awt.Color(255, 255, 255));
        item_name_label.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        item_name_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item_name_label.setText("Item name");

        price_label.setBackground(new java.awt.Color(255, 255, 255));
        price_label.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        price_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        price_label.setText("     Price");

        quantity_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        quantity_tf.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(item_name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(price_label, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(quantity_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item_name_label, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
            .addComponent(price_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(quantity_tf)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel item_name_label;
    private javax.swing.JLabel price_label;
    private javax.swing.JTextField quantity_tf;
    // End of variables declaration//GEN-END:variables
}
