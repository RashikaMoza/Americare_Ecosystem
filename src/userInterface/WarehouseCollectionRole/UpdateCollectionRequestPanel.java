/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.WarehouseCollectionRole;

import Business.EcoSystem;
import Business.Inventory.InventoryDetails;
import Business.Inventory.InventoryDirectory;
import Business.Organization.WarehouseCollectionOrganization;
import Business.UserAccount.UserAccount;
import Business.Workqueue.CollectDonationWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author deepankkhurana
 */
public class UpdateCollectionRequestPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateCollectionRequestPanel
     */
   private final JPanel userProcessContainer;
    private final UserAccount userAccount;
    private final CollectDonationWorkRequest request;
    private final EcoSystem system;
    private final WarehouseCollectionOrganization organization;
    private final InventoryDirectory inventoryDirectory;
    
    public UpdateCollectionRequestPanel(JPanel userProcessContainer, UserAccount account, WarehouseCollectionOrganization organization, CollectDonationWorkRequest request, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.request = request;
        this.system = system;
        this.organization = organization;
        if (organization.getInventoryDirectory() == null){
            this.inventoryDirectory = new InventoryDirectory();
        }
        else {
            this.inventoryDirectory = organization.getInventoryDirectory();
            
            populateInventoryListJTable();
        }
        try{
        
        donationTypeTxtBox.setEnabled(false);
        donationIdTxtBox.setEnabled(false);;
        descTxtBox.setEnabled(false);
        quantityTxtBox.setEnabled(false);
        btnAdd.setEnabled(false);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Something went wrong..");
        }
    }
    
    public void populateInventoryListJTable(){
        try{
        DefaultTableModel model = (DefaultTableModel)inventoryListJTable.getModel();
        model.setRowCount(0);
        for(InventoryDetails inventory : inventoryDirectory.getInventory()){
            Object[] row = new Object[4];
            row[0] = inventory.getDonationId();
            row[1] = inventory.getDonationType();
            row[2] = inventory.getDescription();
            row[3] = inventory.getQuantity();
            model.addRow(row);
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Something went wrong..");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnYes = new javax.swing.JButton();
        btnNo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        donationTypeTxtBox = new javax.swing.JTextField();
        donationIdTxtBox = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descTxtBox = new javax.swing.JTextArea();
        quantityTxtBox = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        inventoryListJTable = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(0, 140, 190));

        jLabel1.setText("Is donation Item Collected?");

        btnYes.setText("Yes");
        btnYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYesActionPerformed(evt);
            }
        });

        btnNo.setText("No");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        jLabel2.setText("Enter Inventory Details below");

        jLabel3.setText("Donation Type");

        jLabel4.setText("Donation Id");

        jLabel5.setText("Description");

        jLabel6.setText("Quantity");

        descTxtBox.setColumns(20);
        descTxtBox.setRows(5);
        jScrollPane1.setViewportView(descTxtBox);

        inventoryListJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Donation Id", "Donation Type", "Description", "Quantity"
            }
        ));
        jScrollPane2.setViewportView(inventoryListJTable);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(btnYes)
                        .addGap(30, 30, 30)
                        .addComponent(btnNo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel4)))
                                        .addGap(89, 89, 89)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(quantityTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnAdd))
                                            .addComponent(donationIdTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(donationTypeTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(125, 125, 125)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnYes)
                    .addComponent(btnNo))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(donationTypeTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(donationIdTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(quantityTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(226, Short.MAX_VALUE))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesActionPerformed
        // TODO add your handling code here:
         try{
        request.setStatus("Complete");
        descTxtBox.setEnabled(true);
        quantityTxtBox.setEnabled(true);
        donationTypeTxtBox.setText(request.getDonationType());
        donationIdTxtBox.setText(String.valueOf(request.getDonationId()));
        btnYes.setEnabled(false);
        btnAdd.setEnabled(true);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Something went wrong..");
        }
    }//GEN-LAST:event_btnYesActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
          try{
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        WarehouseCollectionRoleWorkAreaP jp = (WarehouseCollectionRoleWorkAreaP)component;
        jp.populateCollectionRequestJTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Something went wrong..");
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        int donationId = Integer.parseInt(donationIdTxtBox.getText());
        String donationType = donationTypeTxtBox.getText();
        String desc = descTxtBox.getText();
        try{
            int quantity = Integer.parseInt(quantityTxtBox.getText());
            if(!donationType.isEmpty() && !desc.isEmpty() && !quantityTxtBox.getText().isEmpty()){
                inventoryDirectory.createInventory(donationId,donationType, desc, quantity);
                JOptionPane.showMessageDialog(null,"Inventory Updated");
                populateInventoryListJTable();
                btnAdd.setEnabled(false);
            }
            else JOptionPane.showMessageDialog(null,"Fields marked with * are compulsory.");
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please input value of quantity in whole numbers");
        }
        
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNo;
    private javax.swing.JButton btnYes;
    private javax.swing.JTextArea descTxtBox;
    private javax.swing.JTextField donationIdTxtBox;
    private javax.swing.JTextField donationTypeTxtBox;
    private javax.swing.JTable inventoryListJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField quantityTxtBox;
    // End of variables declaration//GEN-END:variables
}
