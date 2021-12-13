/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SystemAdminWorkArea;


import MainCentralisationSystem.MedicalServiceCentralisationEcoSystem;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author MyPC1
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem;
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer,MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.medicalServiceCentralisationEcoSystem = medicalServiceCentralisationEcoSystem;
        jPanel1.setVisible(false);
        //jSplitPane.setVisible(false);
        //jPanel2.setVisible(true);
        populateTree();
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
        jPanel2 = new javax.swing.JPanel();
        jButtonCreateHospital = new javax.swing.JButton();
        jButtonCreateCustomerSupport = new javax.swing.JButton();
        jButtonCreateWarehouse = new javax.swing.JButton();
        jButtonCreateCustomerSupport1 = new javax.swing.JButton();
        bgdimg = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1720, 1080));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSplitPane.setPreferredSize(new java.awt.Dimension(1720, 1080));

        jPanel2.setBackground(new java.awt.Color(0, 70, 169));
        jPanel2.setPreferredSize(new java.awt.Dimension(1720, 1080));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCreateHospital.setBackground(new java.awt.Color(204, 204, 204));
        jButtonCreateHospital.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonCreateHospital.setText("Manage Hospitals");
        jButtonCreateHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateHospitalActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCreateHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 401, -1));

        jButtonCreateCustomerSupport.setBackground(new java.awt.Color(204, 204, 204));
        jButtonCreateCustomerSupport.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonCreateCustomerSupport.setText("Manage Customer Support");
        jButtonCreateCustomerSupport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateCustomerSupportActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCreateCustomerSupport, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 401, -1));

        jButtonCreateWarehouse.setBackground(new java.awt.Color(204, 204, 204));
        jButtonCreateWarehouse.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonCreateWarehouse.setText("Manage Warehouses");
        jButtonCreateWarehouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateWarehouseActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCreateWarehouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 401, -1));

        jButtonCreateCustomerSupport1.setBackground(new java.awt.Color(204, 204, 204));
        jButtonCreateCustomerSupport1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonCreateCustomerSupport1.setText("Manage Delivery Agency");
        jButtonCreateCustomerSupport1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateCustomerSupport1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCreateCustomerSupport1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, 401, -1));

        bgdimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/Images/SystemAdminWorkAreaJPanel.jpg"))); // NOI18N
        jPanel2.add(bgdimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1740, 1080));

        jSplitPane.setRightComponent(jPanel2);

        jPanel1.setPreferredSize(new java.awt.Dimension(0, 1080));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1078, Short.MAX_VALUE)
        );

        jSplitPane.setLeftComponent(jPanel1);

        add(jSplitPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1747, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCreateHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateHospitalActionPerformed
        // TODO add your handling code here:
        HospitalAccountsPage hospitalAccountsPage = new HospitalAccountsPage(userProcessContainer,medicalServiceCentralisationEcoSystem);
        userProcessContainer.add("HospitalAccountsPage",hospitalAccountsPage);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.show(userProcessContainer,"HospitalAccountsPage");
    }//GEN-LAST:event_jButtonCreateHospitalActionPerformed

    private void jButtonCreateCustomerSupportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateCustomerSupportActionPerformed
        // TODO add your handling code here:
        CustomerSupportAccountsPage customerSupportAccountsPage = new CustomerSupportAccountsPage(userProcessContainer,medicalServiceCentralisationEcoSystem);
        userProcessContainer.add("CustomerSupportAccountsPage",customerSupportAccountsPage);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.show(userProcessContainer,"CustomerSupportAccountsPage");
    }//GEN-LAST:event_jButtonCreateCustomerSupportActionPerformed

    private void jButtonCreateWarehouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateWarehouseActionPerformed
        // TODO add your handling code here:
        MedicalEquipWarehouseAccountsPage medicalEquipWarehouseAccountsPage = new MedicalEquipWarehouseAccountsPage(userProcessContainer,medicalServiceCentralisationEcoSystem);
        userProcessContainer.add("MedicalEquipWarehouseAccountsPage",medicalEquipWarehouseAccountsPage);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.show(userProcessContainer,"MedicalEquipWarehouseAccountsPage");
    }//GEN-LAST:event_jButtonCreateWarehouseActionPerformed

    private void jButtonCreateCustomerSupport1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateCustomerSupport1ActionPerformed
        // TODO add your handling code here:
        DeliveryAgencyAccountsPage deliveryAgencyAccountsPage = new DeliveryAgencyAccountsPage(userProcessContainer,medicalServiceCentralisationEcoSystem);
        userProcessContainer.add("DeliveryAgencyAccountsPage",deliveryAgencyAccountsPage);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.show(userProcessContainer,"DeliveryAgencyAccountsPage");
        
    }//GEN-LAST:event_jButtonCreateCustomerSupport1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgdimg;
    private javax.swing.JButton jButtonCreateCustomerSupport;
    private javax.swing.JButton jButtonCreateCustomerSupport1;
    private javax.swing.JButton jButtonCreateHospital;
    private javax.swing.JButton jButtonCreateWarehouse;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane;
    // End of variables declaration//GEN-END:variables
}
