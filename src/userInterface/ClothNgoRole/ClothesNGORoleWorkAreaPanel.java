/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ClothNgoRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.BloodBankOrganization;
import Business.Organization.ClothesNGOOrganization;
import Business.Organization.FoodNGOOrganization;
import Business.Organization.Organization;
import Business.Organization.WarehouseCollectionOrganization;
import Business.UserAccount.UserAccount;
import Business.Workqueue.AcceptDonationWorkRequest;
import Business.Workqueue.CollectDonationWorkRequest;
import Business.Workqueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rashikamoza
 */
public class ClothesNGORoleWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form ClothesNGORoleWorkAreaPanel
     */
        private JPanel userProcessContainer;
    private BloodBankOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    private final ArrayList<Organization> orgs;
   public ClothesNGORoleWorkAreaPanel(JPanel userProcessContainer, UserAccount account, ClothesNGOOrganization clothNgoOrganization, Enterprise enterprise, EcoSystem system, Network network) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.orgs = new ArrayList<>();
        this.network = network;
        try {
            orgLabel.setText(organization.getName());
            netLabel.setText(network.getName());
            for (Network n : system.getNetworkList()) {
                if (n.getName().equals(network.getName())) {
                    for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                        for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                            orgs.add(o);
                        }
                    }
                }
            }
            populateRequestTable();
            send.setEnabled(false);
        } catch (NullPointerException ne) {
            JOptionPane.showMessageDialog(null, "Error : "+ne.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : "+e.getMessage());
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
        orgLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        netLabel = new javax.swing.JLabel();
        scrollPane1 = new java.awt.ScrollPane();
        scrollpanel1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAccept = new javax.swing.JButton();
        send = new javax.swing.JButton();
        btnTrack = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(0, 140, 190));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel1.setText("Donation Received at");

        orgLabel.setText("<Enterprise Name>");

        jLabel2.setText("Network");

        netLabel.setText("<NetworkName>");

        scrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Email", "Contact", "Address", "Cloth Description", "Accepted By"
            }
        ));
        workRequestJTable.setPreferredSize(new java.awt.Dimension(450, 404));
        scrollpanel1.setViewportView(workRequestJTable);

        scrollPane1.add(scrollpanel1);

        jLabel3.setText("Accept Request For Donation :");

        jLabel4.setText("Send Request to Admin for Approval: ");

        jLabel5.setText("Track Previous Requests:");

        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        send.setText("Send");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });

        btnTrack.setText("Track");
        btnTrack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(orgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(netLabel)
                        .addGap(350, 350, 350))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(318, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAccept, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(send, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTrack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(orgLabel)
                    .addComponent(jLabel2)
                    .addComponent(netLabel))
                .addGap(59, 59, 59)
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnAccept))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(send))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btnTrack))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a donation to collect.");
            return;
        }
        try {
            String approvedBy = String.valueOf(workRequestJTable.getValueAt(selectedRow, 5));
            if (approvedBy.equals("null")) {
                WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
                request.setSender(userAccount);
                populateRequestTable();
                AcceptDonationWorkRequest req = (AcceptDonationWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);

                send.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "Already processed.");
            }
        } catch (NullPointerException ne) {
            JOptionPane.showMessageDialog(null, "Error : "+ne.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : "+e.getMessage());
        }
    }//GEN-LAST:event_btnAcceptActionPerformed
    public void populateRequestTable() {
       try {
            DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

            model.setRowCount(0);
            for (Organization org : orgs) {
                if (org instanceof ClothesNGOOrganization) {
                    for (AcceptDonationWorkRequest request : org.getWorkQueue().getDonationWorkRequestList()) {
                        if (request.getDonor().getNetwork().equals(network.getName())) {
                            Object[] row = new Object[5];
                            row[0] = request;
                            row[1] = request.getDonor().getEmailid();
                            row[2] = request.getDonor().getContactNumber();
                            row[3] = request.getDonor().getAddress();
                            
                            row[4] = request.getSender() == null ? null : request.getSender().getEmployee().getEmpName();
                            model.addRow(row);
                        }
                    }
                }
            }
        } catch (NullPointerException ne) {
            JOptionPane.showMessageDialog(null, "Error : "+ne.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : "+e.getMessage());
        }
    }
    
    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
         // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a donation to process.");
            return;
        }
        try {
            String approvedBy = String.valueOf(workRequestJTable.getValueAt(selectedRow, 4));
            AcceptDonationWorkRequest req = (AcceptDonationWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
            String donationType = req.getDonor().getDonationType();

            for (Organization org : orgs) {
                if (org instanceof WarehouseCollectionOrganization) {
                    CollectDonationWorkRequest collectDonationRequest = new CollectDonationWorkRequest();
                    collectDonationRequest.setDonationType(donationType);
                    collectDonationRequest.setStatus("Sent");
                    
                    
                    collectDonationRequest.setRequestedBy(approvedBy);
                    collectDonationRequest.setDonorEmailId(req.getDonor().getEmailid());
                    collectDonationRequest.setNetwork(network.getName());
                    org.getWorkQueue().getCollectionWorkRequestList().add(collectDonationRequest);
                    

                    JOptionPane.showMessageDialog(null, "Request sent");
                    break;
                }

            }
        } catch (NullPointerException ne) {
            JOptionPane.showMessageDialog(null, "Error : "+ne.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : "+e.getMessage());
        }
    }//GEN-LAST:event_sendActionPerformed

    private void btnTrackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrackActionPerformed
        // TODO add your handling code here:
        try {
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            for (Organization o : orgs) {
                if (o instanceof ClothesNGOOrganization) {
                    userProcessContainer.add("TrackRequestStatusJPanel", new userInterface.BloodBankRole.TrackRequestStatusJPanel(userProcessContainer, userAccount, enterprise, o.getWorkQueue().getDoctorWorkRequestList()));
                    layout.next(userProcessContainer);
                    break;
                }
            }
        } catch (NullPointerException ne) {
            JOptionPane.showMessageDialog(null, "Error : "+ne.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : "+e.getMessage());
        }
    }//GEN-LAST:event_btnTrackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnTrack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel netLabel;
    private javax.swing.JLabel orgLabel;
    private java.awt.ScrollPane scrollPane1;
    private javax.swing.JScrollPane scrollpanel1;
    private javax.swing.JButton send;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
