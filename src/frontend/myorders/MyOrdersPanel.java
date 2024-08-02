package frontend.myorders;
import main.App;
import javax.swing.*;
import java.sql.*;
import frontend.homepage.HomePagePanel;
public class MyOrdersPanel extends javax.swing.JPanel {
    App app;
    
    public MyOrdersPanel(App app) {
        initComponents();
        this.app = app;
        
        OrdersPanel.setLayout(new BoxLayout(OrdersPanel, BoxLayout.Y_AXIS));
        loadOrderDetails();
    }
    
    private void loadOrderDetails(){
        try{
            OrdersPanel.removeAll();
            String query =  "SELECT o.order_id, r.restaurant_name, p.amount FROM orders o JOIN restaurant r ON (o.restaurant_id = r.restaurant_id) JOIN payment p ON (o.payment_id = p.payment_id) WHERE (o.user_id = '" + app.current_user_id + "')";
            app.ps = app.con.prepareStatement(query);
            app.rs= app.ps.executeQuery();
            while(app.rs.next()){
                OrdersPanel.add(new OrderDetails(app.rs.getString(1), app.rs.getString(2), app.rs.getDouble(3), app));
            }
            OrdersPanel.revalidate();
            OrdersPanel.repaint();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(this, "Cannot load orders"+ex.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ButtonPanel = new javax.swing.JPanel();
        back_button = new javax.swing.JButton();
        ScrollPanel = new javax.swing.JScrollPane();
        OrdersPanel = new javax.swing.JPanel();
        TitlePanel = new javax.swing.JPanel();
        order_id_label = new javax.swing.JLabel();
        restaurant_name_label = new javax.swing.JLabel();
        price_label = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 0));
        setMaximumSize(new java.awt.Dimension(750, 700));
        setMinimumSize(new java.awt.Dimension(750, 500));
        setPreferredSize(new java.awt.Dimension(750, 600));

        HeaderPanel.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setText("All that you've ordered");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        ButtonPanel.setBackground(new java.awt.Color(255, 204, 0));

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

        javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
        ButtonPanel.setLayout(ButtonPanelLayout);
        ButtonPanelLayout.setHorizontalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230))
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        ScrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPanel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        OrdersPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout OrdersPanelLayout = new javax.swing.GroupLayout(OrdersPanel);
        OrdersPanel.setLayout(OrdersPanelLayout);
        OrdersPanelLayout.setHorizontalGroup(
            OrdersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 888, Short.MAX_VALUE)
        );
        OrdersPanelLayout.setVerticalGroup(
            OrdersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );

        ScrollPanel.setViewportView(OrdersPanel);

        TitlePanel.setBackground(new java.awt.Color(255, 204, 0));

        order_id_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        order_id_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        order_id_label.setText("Order_id");
        order_id_label.setMaximumSize(new java.awt.Dimension(140, 60));
        order_id_label.setMinimumSize(new java.awt.Dimension(140, 60));
        order_id_label.setPreferredSize(new java.awt.Dimension(140, 60));

        restaurant_name_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        restaurant_name_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        restaurant_name_label.setText("Restaurant Name");
        restaurant_name_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        price_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        price_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        price_label.setText("Total Price");
        price_label.setMaximumSize(new java.awt.Dimension(99, 60));
        price_label.setMinimumSize(new java.awt.Dimension(99, 60));
        price_label.setPreferredSize(new java.awt.Dimension(99, 60));
        price_label.setRequestFocusEnabled(false);

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addComponent(order_id_label, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(restaurant_name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(price_label, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        TitlePanelLayout.setVerticalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(price_label, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(restaurant_name_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(order_id_label, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TitlePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(ScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
        app.switchPanel(new HomePagePanel(app));
    }//GEN-LAST:event_back_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JPanel OrdersPanel;
    private javax.swing.JScrollPane ScrollPanel;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JButton back_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel order_id_label;
    private javax.swing.JLabel price_label;
    private javax.swing.JLabel restaurant_name_label;
    // End of variables declaration//GEN-END:variables
}
