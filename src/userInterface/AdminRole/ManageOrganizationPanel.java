/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.AdminRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author deepankkhurana
 */
public class ManageOrganizationPanel extends javax.swing.JPanel {
    

    /**
     * Creates new form ManageOrganizationPanel
     */
//   private JPanel manageOrganizationContainer;
//   private OrganizationDirectory directory;
        private final OrganizationDirectory directory;
         private final JPanel userProcessContainer;
         private final String inEnterprise;
   
    public ManageOrganizationPanel(JPanel userProcessContainer,OrganizationDirectory directory, String inEnterprise) {
    
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.directory = directory;
        this.inEnterprise = inEnterprise;
        try{
            populateTable();
            populateCombo();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Something went wrong..ManageOrganizationPanel");
        }
    }

private void populateCombo(){
        try{
            orgTypeComboBox.removeAllItems();

            for (Organization.Type type : Organization.Type.values()){
                if (!type.getValue().equals(Organization.Type.Admin.getValue())){
                   orgTypeComboBox.addItem(type); 
                }    
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Something went wrong..populateCombo");
        }
    }

    private void populateTable(){
        try{
            DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
            model.setRowCount(0);
            for (Organization organization : directory.getOrganizationList()){
                Object[] row = new Object[2];
                row[0] = organization.getOrganizationID();
                row[1] = organization.getName();
                model.addRow(row);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Something went wrong..populateTable");
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

        Container = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        orgTypeComboBox = new javax.swing.JComboBox();
        backBtn = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        Container.setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(0, 140, 190));

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Name"
            }
        ));
        jScrollPane1.setViewportView(organizationJTable);

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Organization Type");

        orgTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orgTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgTypeComboBoxActionPerformed(evt);
            }
        });

        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(backBtn)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(68, 68, 68)
                        .addComponent(orgTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(addBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(323, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(orgTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBtn)
                    .addComponent(backBtn))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(215, Short.MAX_VALUE))
        );

        Container.add(jPanel2, "card2");

        add(Container, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
   try{
            Organization.Type type = (Organization.Type) orgTypeComboBox.getSelectedItem();
            directory.createOrganization(type);
            populateTable();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Something went wrong..addBtnActionPerformed");
        }
       
       
       
    }//GEN-LAST:event_addBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
         try{
            userProcessContainer.remove(this);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Something went wrong..backBtnActionPerformed");
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void orgTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgTypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orgTypeComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox orgTypeComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
