package frontend.order_ui;
import main.App;
import java.util.*;
import javax.swing.BoxLayout;
import java.sql.*;
import javax.swing.*;
import frontend.homepage.HomePagePanel;
public class Cart extends javax.swing.JPanel {
    RestaurantMenu r_menu;
    App app;
    Random random = new Random();
    double total = 0;
    List<MenuItem> cart_items = new LinkedList<>();
    public Cart(List<MenuItem> menu_items, RestaurantMenu r_menu) {
        initComponents();
        this.r_menu = r_menu;
        this.app = r_menu.app;
        // Remove menu items with 0 qty
        for(MenuItem menu_item:menu_items){
            if(menu_item.quantity > 0){
                cart_items.add(menu_item);
            }
        }
        CartDetailsPanel.setLayout(new BoxLayout(CartDetailsPanel, BoxLayout.Y_AXIS));
        loadCartItems(cart_items);
    }
    
    void loadCartItems(List<MenuItem> menu_items){
        
        CartDetailsPanel.removeAll();
        
        for(MenuItem menu_item:menu_items){
            total += menu_item.price * menu_item.quantity;
            CartDetailsPanel.add(new CartItem(menu_item.item_id, menu_item.item_name, menu_item.price, menu_item.quantity));
            
        }
        FinalPriceLabel.setText("Rs. "+total);
        CartDetailsPanel.revalidate();
        CartDetailsPanel.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        CartLabel = new javax.swing.JLabel();
        PlaceOrderPanel = new javax.swing.JPanel();
        PlaceOrderButton = new javax.swing.JButton();
        PlaceOrderButton1 = new javax.swing.JButton();
        ScrollPane = new javax.swing.JScrollPane();
        CartDetailsPanel = new javax.swing.JPanel();
        AttributesPanel = new javax.swing.JPanel();
        item_name_label = new javax.swing.JLabel();
        price_label = new javax.swing.JLabel();
        qty_label = new javax.swing.JLabel();
        total_price_label = new javax.swing.JLabel();
        PaymentDetailsPanel = new javax.swing.JPanel();
        FinalPriceLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 0));
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                formComponentRemoved(evt);
            }
        });

        HeaderPanel.setBackground(new java.awt.Color(0, 0, 0));

        CartLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        CartLabel.setForeground(new java.awt.Color(255, 255, 255));
        CartLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CartLabel.setText("Cart");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CartLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(CartLabel)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        PlaceOrderPanel.setBackground(new java.awt.Color(255, 204, 0));
        PlaceOrderPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        PlaceOrderButton.setBackground(new java.awt.Color(200, 207, 45));
        PlaceOrderButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        PlaceOrderButton.setForeground(new java.awt.Color(255, 255, 255));
        PlaceOrderButton.setText("Place Order");
        PlaceOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceOrderButtonActionPerformed(evt);
            }
        });

        PlaceOrderButton1.setBackground(new java.awt.Color(255, 69, 35));
        PlaceOrderButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        PlaceOrderButton1.setForeground(new java.awt.Color(255, 255, 255));
        PlaceOrderButton1.setText("Back");
        PlaceOrderButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceOrderButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PlaceOrderPanelLayout = new javax.swing.GroupLayout(PlaceOrderPanel);
        PlaceOrderPanel.setLayout(PlaceOrderPanelLayout);
        PlaceOrderPanelLayout.setHorizontalGroup(
            PlaceOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlaceOrderPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PlaceOrderButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(PlaceOrderButton)
                .addGap(163, 163, 163))
        );
        PlaceOrderPanelLayout.setVerticalGroup(
            PlaceOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlaceOrderPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PlaceOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PlaceOrderButton)
                    .addComponent(PlaceOrderButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        ScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPane.setMaximumSize(new java.awt.Dimension(600, 32767));
        ScrollPane.setMinimumSize(new java.awt.Dimension(600, 300));
        ScrollPane.setPreferredSize(new java.awt.Dimension(600, 300));

        CartDetailsPanel.setBackground(new java.awt.Color(255, 255, 255));
        CartDetailsPanel.setMaximumSize(new java.awt.Dimension(600, 32767));
        CartDetailsPanel.setMinimumSize(new java.awt.Dimension(600, 300));
        CartDetailsPanel.setPreferredSize(new java.awt.Dimension(600, 300));

        javax.swing.GroupLayout CartDetailsPanelLayout = new javax.swing.GroupLayout(CartDetailsPanel);
        CartDetailsPanel.setLayout(CartDetailsPanelLayout);
        CartDetailsPanelLayout.setHorizontalGroup(
            CartDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 703, Short.MAX_VALUE)
        );
        CartDetailsPanelLayout.setVerticalGroup(
            CartDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        ScrollPane.setViewportView(CartDetailsPanel);

        AttributesPanel.setBackground(new java.awt.Color(255, 204, 0));

        item_name_label.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        item_name_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item_name_label.setText("Item name");

        price_label.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        price_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        price_label.setText("Price");

        qty_label.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        qty_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qty_label.setText("Qty.");

        total_price_label.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        total_price_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total_price_label.setText("Total");

        javax.swing.GroupLayout AttributesPanelLayout = new javax.swing.GroupLayout(AttributesPanel);
        AttributesPanel.setLayout(AttributesPanelLayout);
        AttributesPanelLayout.setHorizontalGroup(
            AttributesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AttributesPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(item_name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(price_label, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qty_label, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total_price_label, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        AttributesPanelLayout.setVerticalGroup(
            AttributesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(item_name_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(total_price_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
            .addGroup(AttributesPanelLayout.createSequentialGroup()
                .addGroup(AttributesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(price_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(qty_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PaymentDetailsPanelLayout = new javax.swing.GroupLayout(PaymentDetailsPanel);
        PaymentDetailsPanel.setLayout(PaymentDetailsPanelLayout);
        PaymentDetailsPanelLayout.setHorizontalGroup(
            PaymentDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 703, Short.MAX_VALUE)
        );
        PaymentDetailsPanelLayout.setVerticalGroup(
            PaymentDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        FinalPriceLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        FinalPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FinalPriceLabel.setText("Price");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FinalPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
            .addComponent(HeaderPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PlaceOrderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AttributesPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(ScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PaymentDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AttributesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FinalPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PlaceOrderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(410, 410, 410)
                    .addComponent(PaymentDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(120, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentRemoved

    private void PlaceOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceOrderButtonActionPerformed
        // TODO add your handling code here:
        
        // Create an order
        try{
            int new_order_id_int = 0;
            String query = "SELECT order_id FROM orders ORDER BY order_id DESC";
            app.ps = app.con.prepareStatement(query);
            app.rs = app.ps.executeQuery();
            if(app.rs.next()){
                String order_id_int = app.rs.getString(1).substring(1, 4);
                new_order_id_int = Integer.parseInt(order_id_int) + 1;
            }
            
            String new_order_id = "O";
            if(new_order_id_int < 10){
                    new_order_id += "00" + new_order_id_int;
            }
            else if(new_order_id_int < 100){
                new_order_id += "0" + new_order_id_int;
            }
            else{
                new_order_id += new_order_id_int;
            }
            
            String user_id = app.current_user_id;
            String restaurant_id = app.current_restaurant_id;
            // select random delivery person
            query = "SELECT dp_id FROM delivery_personnel WHERE availability = 'Available'";
            app.ps = app.con.prepareStatement(query);
            app.rs = app.ps.executeQuery();
            List<String> dp_ids = new LinkedList<>();
            while(app.rs.next()){
                dp_ids.add(app.rs.getString(1));
            }
            System.out.println(dp_ids.size());
            int index = random.nextInt(dp_ids.size());
            System.out.println(index);
            String dp_id = dp_ids.get(index);
            // order_time
            // delivery_time
            String payment_id = "P"+new_order_id_int;
            
            // Insert into orders
            query = "INSERT INTO orders (order_id, user_id, restaurant_id, dp_id, order_time, payment_id, status) VALUES(?, ?, ?, ?, SYSTIMESTAMP, ?, 'Preparing')";
            app.ps = app.con.prepareStatement(query);
            app.ps.setString(1, new_order_id);
            app.ps.setString(2, user_id);
            app.ps.setString(3, restaurant_id);
            app.ps.setString(4, dp_id);
            app.ps.setString(5, payment_id);
            int rows = app.ps.executeUpdate();
            
            if(rows == 0){
                JOptionPane.showMessageDialog(this, "Failed to place order");
            }
            
            // Insert into payment
            query = "INSERT INTO payment VALUES(?, ?, SYSDATE)";
            app.ps = app.con.prepareStatement(query);
            app.ps.setString(1, payment_id);
            app.ps.setDouble(2, total);
            rows = app.ps.executeUpdate();
            if(rows == 0){
                JOptionPane.showMessageDialog(this, "Failed to make payment");
                return;
            }
            
            // Insert into order_items
            for(MenuItem menu_item:cart_items){
                query = "INSERT INTO order_item VALUES(?, ?, ?)";
                app.ps = app.con.prepareStatement(query);
                app.ps.setString(1, new_order_id);
                app.ps.setString(2, menu_item.item_id);
                app.ps.setInt(3, menu_item.quantity);
                rows = app.ps.executeUpdate();
                if(rows == 0){
                    JOptionPane.showMessageDialog(this, "Failed to get item "+menu_item.item_id);
                    return;
                }
            }
            
            // Set delivery personnel as busy
            query = "UPDATE delivery_personnel SET availability = 'Unavailable' WHERE dp_id = ?";
            app.ps = app.con.prepareStatement(query);
            app.ps.setString(1, dp_id);
            rows = app.ps.executeUpdate();
            if(rows == 0){
                JOptionPane.showMessageDialog(this, "Couldn't assign delivery personnel"+dp_id);
                return;
            }
            
            JOptionPane.showMessageDialog(this, "Order placed successfully");
            app.switchPanel(new HomePagePanel(app));
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(this, "Failed to place order" + ex.getMessage());
        }
    }//GEN-LAST:event_PlaceOrderButtonActionPerformed

    private void PlaceOrderButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceOrderButton1ActionPerformed
        // TODO add your handling code here:
        app.switchPanel(r_menu);
    }//GEN-LAST:event_PlaceOrderButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AttributesPanel;
    private javax.swing.JPanel CartDetailsPanel;
    private javax.swing.JLabel CartLabel;
    private javax.swing.JLabel FinalPriceLabel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JPanel PaymentDetailsPanel;
    private javax.swing.JButton PlaceOrderButton;
    private javax.swing.JButton PlaceOrderButton1;
    private javax.swing.JPanel PlaceOrderPanel;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JLabel item_name_label;
    private javax.swing.JLabel price_label;
    private javax.swing.JLabel qty_label;
    private javax.swing.JLabel total_price_label;
    // End of variables declaration//GEN-END:variables
}
