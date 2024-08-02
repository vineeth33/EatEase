package frontend.order_ui;
import main.App;
import java.sql.*;
import javax.swing.*;
import frontend.homepage.HomePagePanel;
public class SearchRestaurantPanel extends javax.swing.JPanel {
    App app;
    
    public SearchRestaurantPanel(App app) {
        initComponents();
        this.app = app;
        
        SearchResultPanel.setLayout(new BoxLayout(SearchResultPanel, BoxLayout.Y_AXIS));
        refreshSearchResults();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SearchPanel = new javax.swing.JPanel();
        restaurant_name_tf = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        ButtonPanel = new javax.swing.JPanel();
        back_button = new javax.swing.JButton();
        ScrollPanel = new javax.swing.JScrollPane();
        SearchResultPanel = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(700, 700));
        setMinimumSize(new java.awt.Dimension(700, 700));
        setPreferredSize(new java.awt.Dimension(700, 700));

        HeaderPanel.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setText("Looking for Restaurant?");

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        SearchPanel.setBackground(new java.awt.Color(255, 204, 0));

        restaurant_name_tf.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        searchButton.setBackground(new java.awt.Color(200, 207, 45));
        searchButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SearchPanelLayout = new javax.swing.GroupLayout(SearchPanel);
        SearchPanel.setLayout(SearchPanelLayout);
        SearchPanelLayout.setHorizontalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchPanelLayout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addComponent(searchButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(restaurant_name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
        );
        SearchPanelLayout.setVerticalGroup(
            SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(SearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(restaurant_name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addContainerGap(24, Short.MAX_VALUE))
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

        SearchResultPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout SearchResultPanelLayout = new javax.swing.GroupLayout(SearchResultPanel);
        SearchResultPanel.setLayout(SearchResultPanelLayout);
        SearchResultPanelLayout.setHorizontalGroup(
            SearchResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 888, Short.MAX_VALUE)
        );
        SearchResultPanelLayout.setVerticalGroup(
            SearchResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );

        ScrollPanel.setViewportView(SearchResultPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SearchPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ScrollPanel)
            .addComponent(ButtonPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
        app.switchPanel(new HomePagePanel(app));
    }//GEN-LAST:event_back_buttonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        refreshSearchResults();
    }
    private void refreshSearchResults(){
        SearchResultPanel.removeAll();
        try{
            String query = "SELECT restaurant_id, restaurant_name, address, cuisine_type FROM restaurant WHERE restaurant_name LIKE('" + restaurant_name_tf.getText() + "%')";
            app.ps = app.con.prepareStatement(query);
            app.rs = app.ps.executeQuery();
            while(app.rs.next()){
                SearchResultPanel.add(new RestaurantDetails(app.rs.getString(1), app.rs.getString(2), app.rs.getString(3), app.rs.getString(4), app));  
            }
            SearchResultPanel.revalidate();
            SearchResultPanel.repaint();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(this, "Query error "+ex.getMessage());
        }
        
        
    }//GEN-LAST:event_searchButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JScrollPane ScrollPanel;
    private javax.swing.JPanel SearchPanel;
    private javax.swing.JPanel SearchResultPanel;
    private javax.swing.JButton back_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField restaurant_name_tf;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
