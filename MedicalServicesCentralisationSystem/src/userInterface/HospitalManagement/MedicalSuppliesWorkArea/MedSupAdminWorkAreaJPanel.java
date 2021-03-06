/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.HospitalManagement.MedicalSuppliesWorkArea;

import userInterface.HospitalManagement.MedTechnicalWorkArea.*;
import HospitalManagement.Hospital.Hospital;
import userInterface.SystemAdminWorkArea.*;
import MainCentralisationSystem.MedicalServiceCentralisationEcoSystem;
import MainCentralisationSystem.HospitalManagementEnterprise;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
//import userinterface.createNewUser.createLogin;

public class MedSupAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem;
    Hospital hospital;
    public MedSupAdminWorkAreaJPanel(JPanel userProcessContainer,MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem, Hospital hospital) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.medicalServiceCentralisationEcoSystem = medicalServiceCentralisationEcoSystem;
        this.hospital = hospital;
        jPanel1.setVisible(false);
        //jSplitPane.setVisible(false);
        //jPanel2.setVisible(true);
//        populateTree();
    }
    
    public void populateTree(){
        //DefaultTreeModel model=(DefaultTreeModel)Admin.getModel();
       // Add the code for draw your system structure shown by JTree
       
      //  model.reload();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButtonTestDatabase = new javax.swing.JButton();
        jButtonPlaceOrder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1720, 1080));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSplitPane.setPreferredSize(new java.awt.Dimension(1720, 1080));

        jPanel1.setPreferredSize(new java.awt.Dimension(0, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jSplitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 70, 169));
        jPanel2.setPreferredSize(new java.awt.Dimension(1720, 1080));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonTestDatabase.setBackground(new java.awt.Color(0, 0, 0));
        jButtonTestDatabase.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonTestDatabase.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTestDatabase.setText("Medical Supplies Database");
        jButtonTestDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTestDatabaseActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonTestDatabase, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 387, 430, 70));

        jButtonPlaceOrder.setBackground(new java.awt.Color(0, 0, 0));
        jButtonPlaceOrder.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonPlaceOrder.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPlaceOrder.setText("Place Order");
        jButtonPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlaceOrderActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonPlaceOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 477, 430, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/Images/MedSupAdminWorkAreaJPanel_1920x1183.jpeg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1830, 1100));

        jSplitPane.setRightComponent(jPanel2);

        add(jSplitPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1833, 1102));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlaceOrderActionPerformed
        MedSuppliesOrder medSuppliesOrder = new MedSuppliesOrder(userProcessContainer,medicalServiceCentralisationEcoSystem, hospital);
        userProcessContainer.add("medSuppliesOrder",medSuppliesOrder);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.show(userProcessContainer,"medSuppliesOrder");
    }//GEN-LAST:event_jButtonPlaceOrderActionPerformed

    private void jButtonTestDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTestDatabaseActionPerformed

        MedSuppliesDatabase medSuppliesDatabase = new MedSuppliesDatabase(userProcessContainer,medicalServiceCentralisationEcoSystem, hospital);
        userProcessContainer.add("medSuppliesDatabase",medSuppliesDatabase);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.show(userProcessContainer,"medSuppliesDatabase");
    }//GEN-LAST:event_jButtonTestDatabaseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPlaceOrder;
    private javax.swing.JButton jButtonTestDatabase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane;
    // End of variables declaration//GEN-END:variables
}
