/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.WarehouseCollectionRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.BloodBankOrganization;
import Business.Organization.Organization;
import Business.Organization.WarehouseCollectionOrganization;
import Business.UserAccount.UserAccount;
import Business.Workqueue.CollectDonationWorkRequest;
import Business.Workqueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sahebsingh
 */
public class WarehouseCollectionRoleWorkAreaP extends javax.swing.JPanel {

    /**
     * Creates new form WarehouseCollectionRoleWorkAreaP
     */
   private final JPanel userProcessContainer;
    private final WarehouseCollectionOrganization organization;
    private final Enterprise enterprise;
    private final UserAccount userAccount;
    private final ArrayList<Organization> orgs;
    private final EcoSystem system;
    private final Network network;
    
    public WarehouseCollectionRoleWorkAreaP(JPanel userProcessContainer, UserAccount account, WarehouseCollectionOrganization organization, Enterprise enterprise, EcoSystem system, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.orgs = new ArrayList<>();
        this.system = system;
        this.network = network;
        
        try{
        valuelabel.setText(enterprise.getName());
        networklbl.setText(network.getName());
        
        for(Network n : system.getNetworkList()){
            if(n.equals(network)){
                for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
                    for(Organization o : e.getOrganizationDirectory().getOrganizationList()){
                        orgs.add(o);
                    }
                }
            }
        }
        
        populateCollectionRequestJTable();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Something went wrong..");
        }
    }
    
    public void populateCollectionRequestJTable(){
        try{
        DefaultTableModel model = (DefaultTableModel)collectionRequestJTable.getModel();
        model.setRowCount(0);
        for(Organization org : orgs){
           if(org instanceof WarehouseCollectionOrganization) {
            for (CollectDonationWorkRequest request : org.getWorkQueue().getCollectionWorkRequestList()){
                Object[] row = new Object[7];
                row[0] = request;
                row[1] = request.getDonationType();
                //row[2] = request.getDonorAddress();
                //row[3] = request.getDonorContactNumber();
                row[4] = request.getRequestedBy();
                row[5] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getEmpName();
                row[6] = request.getStatus();
                model.addRow(row);
                } 
            }
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

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        valuelabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        networklbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        collectionRequestJTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnAccept = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 140, 190));
        setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(0, 140, 190));

        jLabel1.setText("Donation Received at");

        valuelabel.setText("<Enterprise name>");

        jLabel3.setText("Network");

        networklbl.setText("<network name>");

        collectionRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Donor name", "Donation type", "Donation Address", "Contact Number", "Accepted By", "Rejected by", "Status"
            }
        ));
        jScrollPane1.setViewportView(collectionRequestJTable);

        jLabel5.setText("Accept Collection Request");

        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        jLabel6.setText("Update collection detalis");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1)
                        .addGap(56, 56, 56)
                        .addComponent(valuelabel)
                        .addGap(160, 160, 160)
                        .addComponent(jLabel3)
                        .addGap(56, 56, 56)
                        .addComponent(networklbl))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(59, 59, 59)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnUpdate)
                                    .addComponent(btnAccept))))))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(valuelabel)
                    .addComponent(jLabel3)
                    .addComponent(networklbl))
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btnAccept))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnUpdate))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        add(jPanel3, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
         try{
        int selectedRow = collectionRequestJTable.getSelectedRow();
        String acceptedBy = String.valueOf(collectionRequestJTable.getValueAt(selectedRow, 5));
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a collection request to accept.");
        }
        else {
            if(acceptedBy.equals("null")){
                WorkRequest request = (WorkRequest)collectionRequestJTable.getValueAt(selectedRow, 0);
                CollectDonationWorkRequest req = (CollectDonationWorkRequest)collectionRequestJTable.getValueAt(selectedRow, 0);
                request.setReceiver(userAccount);
                request.setStatus("Pending");
                populateCollectionRequestJTable();
                
                //Send Email to donor
                String to = req.getDonorEmailId();
                String subject = "Donation collected!";
             //   String message =  "Thank you! Your donation is collected and will be stored with us until it is distributed. We appreciate you endeavor to support a needy!";

           //     String user = "aeddemogss@gmail.com";
           //     String pass = "aed_gss123";

      //          SendEmail.send(to,subject, message, user, pass);
            }
            else JOptionPane.showMessageDialog(null, "Already accepted.");
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Something went wrong..");
        }
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
           try{
        int selectedRow = collectionRequestJTable.getSelectedRow();
        if (selectedRow >= 0){
            CollectDonationWorkRequest request = (CollectDonationWorkRequest)collectionRequestJTable.getValueAt(selectedRow, 0);
            String status = String.valueOf(collectionRequestJTable.getValueAt(selectedRow, 6));
            String acceptedBy = String.valueOf(collectionRequestJTable.getValueAt(selectedRow, 5));
            if(status.equals("Pending") && acceptedBy.equals(userAccount.getEmployee().getEmpName())){
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                for(Organization o: orgs){
                    if(o instanceof WarehouseCollectionOrganization){
                        userProcessContainer.add("UpdateCollectionRequestJPanel", new UpdateCollectionRequestPanel(userProcessContainer, userAccount, organization, request, system));
                        layout.next(userProcessContainer);
                        break;
                    }
                }
            }
            else JOptionPane.showMessageDialog(null, "Please select a 'Pending' collection request accepted by you to update.");
        }
        else JOptionPane.showMessageDialog(null, "Please select a collection request to update.");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Something went wrong..");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTable collectionRequestJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel networklbl;
    private javax.swing.JLabel valuelabel;
    // End of variables declaration//GEN-END:variables
}
