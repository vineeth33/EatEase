package frontend.order_ui;
import main.App;
import java.sql.*;
import javax.swing.*;
import java.util.*;

public class RestaurantMenu extends javax.swing.JPanel {

    App app;
    List<MenuItem> menu_items = new LinkedList<>();
    
    public RestaurantMenu(App app) {
        initComponents();
        this.app = app;
        loadRestaurantName();
        loadMenuItems();
    }
    
    void loadRestaurantName(){
        try{
            String query = "SELECT restaurant_name FROM restaurant WHERE restaurant_id = ?";
            app.ps = app.con.prepareStatement(query);
            app.ps.setString(1, app.current_restaurant_id);
            app.rs = app.ps.executeQuery();
            if(app.rs.next()){
                RestaurantName.setText(app.rs.getString(1));
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(this, "Cannot execute query "+ex.getMessage());
        }
    }
    
    void loadMenuItems(){
        MenuItemsPanel.setLayout(new BoxLayout(MenuItemsPanel, BoxLayout.Y_AXIS));
        MenuItemsPanel.removeAll();
        menu_items.clear();
        try{
            String query = "SELECT item_id, item_name, price FROM menu_item WHERE restaurant_id = ?";
            app.ps = app.con.prepareStatement(query);
            app.ps.setString(1, app.current_restaurant_id);
            app.rs = app.ps.executeQuery();
            
            while(app.rs.next()){
                MenuItem menu_item = new MenuItem(app.rs.getString(1), app.rs.getString(2), app.rs.getDouble(3), app);
                menu_items.add(menu_item);
                MenuItemsPanel.add(menu_item);
                
            }
            MenuItemsPanel.revalidate();
            MenuItemsPanel.repaint();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(this, "Cannot execute query" + ex.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Restaurant_name_panel = new javax.swing.JPanel();
        RestaurantName = new javax.swing.JLabel();
        bottom_panel = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        cartButton = new javax.swing.JButton();
        ScrollPanel = new javax.swing.JScrollPane();
        MenuItemsPanel = new javax.swing.JPanel();

        Restaurant_name_panel.setBackground(new java.awt.Color(0, 0, 0));
        Restaurant_name_panel.setMaximumSize(new java.awt.Dimension(500, 32767));
        Restaurant_name_panel.setMinimumSize(new java.awt.Dimension(500, 0));
        Restaurant_name_panel.setPreferredSize(new java.awt.Dimension(500, 136));

        RestaurantName.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        RestaurantName.setForeground(new java.awt.Color(255, 255, 255));
        RestaurantName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RestaurantName.setText("Name of the Restaurant");

        javax.swing.GroupLayout Restaurant_name_panelLayout = new javax.swing.GroupLayout(Restaurant_name_panel);
        Restaurant_name_panel.setLayout(Restaurant_name_panelLayout);
        Restaurant_name_panelLayout.setHorizontalGroup(
            Restaurant_name_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Restaurant_name_panelLayout.createSequentialGroup()
                .addComponent(RestaurantName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Restaurant_name_panelLayout.setVerticalGroup(
            Restaurant_name_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Restaurant_name_panelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(RestaurantName)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        bottom_panel.setBackground(new java.awt.Color(255, 204, 0));

        backButton.setBackground(new java.awt.Color(255, 69, 35));
        backButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        cartButton.setBackground(new java.awt.Color(200, 207, 45));
        cartButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cartButton.setForeground(new java.awt.Color(255, 255, 255));
        cartButton.setText("Go to cart");
        cartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bottom_panelLayout = new javax.swing.GroupLayout(bottom_panel);
        bottom_panel.setLayout(bottom_panelLayout);
        bottom_panelLayout.setHorizontalGroup(
            bottom_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottom_panelLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(cartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        bottom_panelLayout.setVerticalGroup(
            bottom_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottom_panelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(bottom_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(cartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        ScrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        MenuItemsPanel.setBackground(new java.awt.Color(255, 255, 255));
        MenuItemsPanel.setMaximumSize(new java.awt.Dimension(500, 20000));
        MenuItemsPanel.setMinimumSize(new java.awt.Dimension(500, 300));
        MenuItemsPanel.setPreferredSize(new java.awt.Dimension(500, 300));

        javax.swing.GroupLayout MenuItemsPanelLayout = new javax.swing.GroupLayout(MenuItemsPanel);
        MenuItemsPanel.setLayout(MenuItemsPanelLayout);
        MenuItemsPanelLayout.setHorizontalGroup(
            MenuItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
        );
        MenuItemsPanelLayout.setVerticalGroup(
            MenuItemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        ScrollPanel.setViewportView(MenuItemsPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Restaurant_name_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
            .addComponent(ScrollPanel)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bottom_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Restaurant_name_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottom_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        app.current_restaurant_id = null;
        app.switchPanel(new SearchRestaurantPanel(app));
    }//GEN-LAST:event_backButtonActionPerformed

    private void cartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartButtonActionPerformed
        // TODO add your handling code here:
        for(MenuItem menu_item:menu_items){
            menu_item.setQuantity();
        }
        app.switchPanel(new Cart(menu_items, this));
    }//GEN-LAST:event_cartButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuItemsPanel;
    private javax.swing.JLabel RestaurantName;
    private javax.swing.JPanel Restaurant_name_panel;
    private javax.swing.JScrollPane ScrollPanel;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel bottom_panel;
    private javax.swing.JButton cartButton;
    // End of variables declaration//GEN-END:variables
}
