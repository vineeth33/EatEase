package frontend.myorders;

import main.App;
import java.sql.*;
import javax.swing.*;
import java.text.SimpleDateFormat;
import frontend.order_ui.CartItem;
import java.time.*;

public class OrderCart extends javax.swing.JPanel {
    App app;
    String order_id;
    double price = 0;
    public OrderCart(String order_id, App app) {
        this.app = app;
        this.order_id = order_id;
        initComponents();
        CartDetailsPanel.setLayout(new BoxLayout(CartDetailsPanel, BoxLayout.Y_AXIS));
        initHistory();
        initCart();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        HeaderPanel = new javax.swing.JPanel();
        order_details_label = new javax.swing.JLabel();
        PlaceOrderPanel = new javax.swing.JPanel();
        BackButton = new javax.swing.JButton();
        ScrollPane = new javax.swing.JScrollPane();
        CartDetailsPanel = new javax.swing.JPanel();
        AttributesPanel = new javax.swing.JPanel();
        item_name_label = new javax.swing.JLabel();
        price_label = new javax.swing.JLabel();
        qty_label = new javax.swing.JLabel();
        total_price_label = new javax.swing.JLabel();
        PaymentDetailsPanel = new javax.swing.JPanel();
        FinalPriceLabel = new javax.swing.JLabel();
        OrderHistoryPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        order_id_label = new javax.swing.JLabel();
        restaurant_label = new javax.swing.JLabel();
        delivery_personnel_label = new javax.swing.JLabel();
        order_time_label = new javax.swing.JLabel();
        payment_id_label = new javax.swing.JLabel();
        status_label = new javax.swing.JLabel();

        Panel.setBackground(new java.awt.Color(255, 204, 0));
        Panel.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                PanelformComponentRemoved(evt);
            }
        });

        HeaderPanel.setBackground(new java.awt.Color(0, 0, 0));

        order_details_label.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        order_details_label.setForeground(new java.awt.Color(255, 255, 255));
        order_details_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        order_details_label.setText("Order Details");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(order_details_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(order_details_label, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        PlaceOrderPanel.setBackground(new java.awt.Color(255, 204, 0));
        PlaceOrderPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        BackButton.setBackground(new java.awt.Color(255, 69, 35));
        BackButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BackButton.setForeground(new java.awt.Color(255, 255, 255));
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PlaceOrderPanelLayout = new javax.swing.GroupLayout(PlaceOrderPanel);
        PlaceOrderPanel.setLayout(PlaceOrderPanelLayout);
        PlaceOrderPanelLayout.setHorizontalGroup(
            PlaceOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlaceOrderPanelLayout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PlaceOrderPanelLayout.setVerticalGroup(
            PlaceOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlaceOrderPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        ScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPane.setMaximumSize(new java.awt.Dimension(600, 32767));
        ScrollPane.setMinimumSize(new java.awt.Dimension(600, 300));
        ScrollPane.setPreferredSize(new java.awt.Dimension(600, 300));

        CartDetailsPanel.setBackground(new java.awt.Color(255, 255, 255));
        CartDetailsPanel.setMaximumSize(new java.awt.Dimension(600, 32767));
        CartDetailsPanel.setMinimumSize(new java.awt.Dimension(600, 300));

        javax.swing.GroupLayout CartDetailsPanelLayout = new javax.swing.GroupLayout(CartDetailsPanel);
        CartDetailsPanel.setLayout(CartDetailsPanelLayout);
        CartDetailsPanelLayout.setHorizontalGroup(
            CartDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );
        CartDetailsPanelLayout.setVerticalGroup(
            CartDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        ScrollPane.setViewportView(CartDetailsPanel);

        AttributesPanel.setBackground(new java.awt.Color(255, 204, 0));
        AttributesPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AttributesPanelLayout.setVerticalGroup(
            AttributesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(total_price_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(AttributesPanelLayout.createSequentialGroup()
                .addGroup(AttributesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(qty_label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AttributesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(price_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addComponent(item_name_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PaymentDetailsPanelLayout = new javax.swing.GroupLayout(PaymentDetailsPanel);
        PaymentDetailsPanel.setLayout(PaymentDetailsPanelLayout);
        PaymentDetailsPanelLayout.setHorizontalGroup(
            PaymentDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 706, Short.MAX_VALUE)
        );
        PaymentDetailsPanelLayout.setVerticalGroup(
            PaymentDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        FinalPriceLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        FinalPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FinalPriceLabel.setText("Price");

        OrderHistoryPanel.setBackground(new java.awt.Color(255, 204, 0));
        OrderHistoryPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Order ID:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Restaurant:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Delivery Personnel:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Order Time:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Payment ID:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Status:");

        order_id_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        order_id_label.setText("Order ID");

        restaurant_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        restaurant_label.setText("Restaurant");

        delivery_personnel_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        delivery_personnel_label.setText("Delivery Personnel");

        order_time_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        order_time_label.setText("Order Time");

        payment_id_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        payment_id_label.setText("Payment ID");

        status_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        status_label.setText("Status");

        javax.swing.GroupLayout OrderHistoryPanelLayout = new javax.swing.GroupLayout(OrderHistoryPanel);
        OrderHistoryPanel.setLayout(OrderHistoryPanelLayout);
        OrderHistoryPanelLayout.setHorizontalGroup(
            OrderHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderHistoryPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(OrderHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(OrderHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(order_id_label)
                    .addComponent(restaurant_label)
                    .addComponent(delivery_personnel_label)
                    .addComponent(order_time_label)
                    .addComponent(payment_id_label)
                    .addComponent(status_label))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        OrderHistoryPanelLayout.setVerticalGroup(
            OrderHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrderHistoryPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(OrderHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(order_id_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OrderHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(restaurant_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OrderHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(delivery_personnel_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OrderHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(order_time_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OrderHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(payment_id_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OrderHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(status_label))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AttributesPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OrderHistoryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FinalPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addComponent(PlaceOrderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PaymentDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OrderHistoryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AttributesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FinalPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PlaceOrderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelLayout.createSequentialGroup()
                    .addGap(410, 410, 410)
                    .addComponent(PaymentDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(288, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    private void initHistory(){
        try{
            String query = "SELECT o.order_id, r.restaurant_name, d.dp_name, o.order_time, p.payment_id, o.status, d.dp_id"+
                           " FROM orders o JOIN restaurant r ON(o.restaurant_id = r.restaurant_id)"+
                           " JOIN delivery_personnel d ON(o.dp_id = d.dp_id)"+
                           " JOIN payment p ON (o.payment_id = p.payment_id)"+
                           " WHERE order_id = ?";
            app.ps = app.con.prepareStatement(query);
            app.ps.setString(1, this.order_id);
            app.rs = app.ps.executeQuery();
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
            Timestamp time = null;
            if(app.rs.next()){
                order_id_label.setText(app.rs.getString(1));
                restaurant_label.setText(app.rs.getString(2));
                delivery_personnel_label.setText(app.rs.getString(3));
                time = app.rs.getTimestamp(4);
                order_time_label.setText(dateFormat.format(time) + "   " + timeFormat.format(time));
                payment_id_label.setText(app.rs.getString(5));
                status_label.setText(app.rs.getString(6));
                
            }
            else{
                JOptionPane.showMessageDialog(this, "Order history doesn't exist");
                return;
            }
            
            // Update status if time is > 10
            LocalDateTime current_time = LocalDateTime.now();
            LocalDateTime order_time = time.toLocalDateTime();
            if(Duration.between(order_time, current_time).toSeconds() >= 30){
                query = "UPDATE delivery_personnel SET availability = 'Available' WHERE dp_id = ?";
                app.ps = app.con.prepareStatement(query);
                app.ps.setString(1, app.rs.getString(7));
                int rows = app.ps.executeUpdate();
                if(rows == 0){
                    JOptionPane.showMessageDialog(this, "Cannot set delivery personnel available");
                    return;
                }
                
                query = "UPDATE orders SET status = 'Delivered' WHERE order_id=?";
                app.ps = app.con.prepareStatement(query);
                app.ps.setString(1, this.order_id);
                rows = app.ps.executeUpdate();
                if(rows == 0){
                    JOptionPane.showMessageDialog(this, "Cannot set delivered status");
                    return;
                }
            }
            

        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(this, "Cannot load order history"+ex.getMessage());
        }
    }
    
    private void initCart(){
        try{
            String query =  "SELECT m.item_id, m.item_name, m.price, oi.quantity FROM " +
                            "orders o JOIN restaurant r ON (o.restaurant_id = r.restaurant_id) " +
                            "JOIN order_item oi ON (oi.order_id = o.order_id) " +
                            "JOIN menu_item m ON (oi.item_id = m.item_id and r.restaurant_id = m.restaurant_id) " +
                            "WHERE o.order_id = ?";
            app.ps = app.con.prepareStatement(query);
            app.ps.setString(1, this.order_id);
            app.rs = app.ps.executeQuery();
            while(app.rs.next()){
                price += app.rs.getDouble(3) * app.rs.getInt(4);
                CartDetailsPanel.add(new CartItem(app.rs.getString(1), app.rs.getString(2), app.rs.getDouble(3), app.rs.getInt(4)));
            }
            FinalPriceLabel.setText("Rs. "+price);
            CartDetailsPanel.revalidate();
            CartDetailsPanel.repaint();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(this, "Cannot load cart"+ex.getMessage());
        }
    }
    
    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        app.switchPanel(new MyOrdersPanel(app));
        
    }//GEN-LAST:event_BackButtonActionPerformed

    private void PanelformComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_PanelformComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelformComponentRemoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AttributesPanel;
    private javax.swing.JButton BackButton;
    private javax.swing.JPanel CartDetailsPanel;
    private javax.swing.JLabel FinalPriceLabel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JPanel OrderHistoryPanel;
    private javax.swing.JPanel Panel;
    private javax.swing.JPanel PaymentDetailsPanel;
    private javax.swing.JPanel PlaceOrderPanel;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JLabel delivery_personnel_label;
    private javax.swing.JLabel item_name_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel order_details_label;
    private javax.swing.JLabel order_id_label;
    private javax.swing.JLabel order_time_label;
    private javax.swing.JLabel payment_id_label;
    private javax.swing.JLabel price_label;
    private javax.swing.JLabel qty_label;
    private javax.swing.JLabel restaurant_label;
    private javax.swing.JLabel status_label;
    private javax.swing.JLabel total_price_label;
    // End of variables declaration//GEN-END:variables
}
