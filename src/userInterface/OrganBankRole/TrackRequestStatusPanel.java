/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.OrganBankRole;

import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import Business.Workqueue.DoctorWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sahebsingh
 */
public class TrackRequestStatusPanel extends javax.swing.JPanel {

    /**
     * Creates new form TrackRequestStatusPanel
     */
    private final JPanel userProcessContainer;
    private final Enterprise enterprise;
    private UserAccount userAccount;
    ArrayList<DoctorWorkRequest> doctorWorkReqList;
    
    public TrackRequestStatusPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, ArrayList<DoctorWorkRequest> doctorWorkRequestList) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.doctorWorkReqList = doctorWorkRequestList;
        
        try{
            populateTrackStatusJTable();
        }
        catch(NullPointerException ne){
           JOptionPane.showMessageDialog(null, "Error : "+ne.getMessage()); 
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : "+e.getMessage());
        }

    }

        public void populateTrackStatusJTable(){
        try{
            DefaultTableModel model = (DefaultTableModel) trackStatusJTable.getModel();
            model.setRowCount(0);
            for(DoctorWorkRequest request : doctorWorkReqList){
                if(request.getDonationType().equals("Blood")){
                   Object[] row = new Object[5];
                   row[0] = request;
                   row[1] = request.getDescription();
                   row[2] = request.getRequestedBy();
                   row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getEmpName();
                   row[4] = request.getStatus();
                   model.addRow(row); 
                }
            }
        }
        catch(NullPointerException ne){
           JOptionPane.showMessageDialog(null, "Error : "+ne.getMessage()); 
        } 
        catch (Exception e) {
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
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        scrollPane1 = new java.awt.ScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        trackStatusJTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 140, 190));
        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(0, 140, 190));

        backBtn.setText("<< BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Check Previous Request");

        trackStatusJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Recieved At", "Organ Type", "Request Sent By", "Request Received By", "Status"
            }
        ));
        jScrollPane1.setViewportView(trackStatusJTable);

        scrollPane1.add(jScrollPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn)
                    .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(215, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(backBtn)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        try{
            userProcessContainer.remove(this);
            Component[] componentArray = userProcessContainer.getComponents();
            Component component = componentArray[componentArray.length - 1];
            OrganBankRoleWorkAreaPanel jp = (OrganBankRoleWorkAreaPanel)component;
            jp.populateRequestTable();
            CardLayout layout = (CardLayout)userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        }
        catch(NullPointerException ne){
            JOptionPane.showMessageDialog(null, "Error : "+ne.getMessage());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : "+e.getMessage());
        }
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.ScrollPane scrollPane1;
    private javax.swing.JTable trackStatusJTable;
    // End of variables declaration//GEN-END:variables
}
