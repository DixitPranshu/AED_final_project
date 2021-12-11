/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.HospitalManagement.MedTechnicalWorkArea;


import MainCentralisationSystem.MedicalServiceCentralisationEcoSystem;
import MainCentralisationSystem.UserAccount;
import MainCentralisationSystem.UserAccountDirectory;
import userInterface.SystemAdminWorkArea.*;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shreya
 */
public class MedTechnicalTestDatabase extends javax.swing.JPanel {

    /**
     * Creates new form OperationalAccountsPage
     */
    JPanel userProcessContainer;
    MedicalServiceCentralisationEcoSystem hospitalManagementEcoSystem;
    UserAccount userAccount;
    UserAccountDirectory userAccountDirectory;
//    PatientTestDirectory patientTestDirectory;
    public MedTechnicalTestDatabase(JPanel userProcessContainer , MedicalServiceCentralisationEcoSystem hospitalManagementEcoSystem) {
        this.userProcessContainer = userProcessContainer;
        this.hospitalManagementEcoSystem = hospitalManagementEcoSystem;
//        this.ecosystem = dB4OUtil.retrieveSystem();
//        if(hospitalManagementEcoSystem.getCustomerDirectory() == null)
//           ecosystem.setCustomerDirectory(new CustomerDirectory());
//        initComponents();
//        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jButtonHome = new javax.swing.JButton();
        jButtonCreate = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonView = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jLabelPatientID = new javax.swing.JLabel();
        jTextFieldTestName = new javax.swing.JTextField();
        jLabelPatientName = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTestDB1 = new javax.swing.JTable();
        jLabelTitle2 = new javax.swing.JLabel();
        jTextFieldTestPrice = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 70, 169));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("All tests");
        add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 706, -1));

        jButtonHome.setBackground(new java.awt.Color(0, 70, 169));
        jButtonHome.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonHome.setForeground(new java.awt.Color(255, 255, 255));
        jButtonHome.setText("HOME");
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });
        add(jButtonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(846, 62, -1, -1));

        jButtonCreate.setText("CREATE");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });
        add(jButtonCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 219, -1, -1));

        jButtonUpdate.setText("UPDATE");
        add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 220, -1, -1));

        jButtonView.setText("VIEW");
        jButtonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewActionPerformed(evt);
            }
        });
        add(jButtonView, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 290, -1, -1));

        jButtonDelete.setText("DELETE");
        add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, -1, -1));

        jLabelPatientID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPatientID.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelPatientID.setText("Test Name");
        add(jLabelPatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 104, -1));

        jTextFieldTestName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTestNameActionPerformed(evt);
            }
        });
        add(jTextFieldTestName, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 200, 270, -1));

        jLabelPatientName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPatientName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelPatientName.setText("Test Price");
        add(jLabelPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 100, -1));

        jTableTestDB1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Test Name", "Test Price"
            }
        ));
        jScrollPane2.setViewportView(jTableTestDB1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 500, 160));

        jLabelTitle2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelTitle2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle2.setText("Hospital Test Database");
        add(jLabelTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 43, 706, -1));

        jTextFieldTestPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTestPriceActionPerformed(evt);
            }
        });
        add(jTextFieldTestPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 270, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
            crdLyt.show(userProcessContainer,"Sysadmin");
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jTextFieldTestNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTestNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTestNameActionPerformed

    private void jButtonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonViewActionPerformed

    private void jTextFieldTestPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTestPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTestPriceActionPerformed

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        // TODO add your handling code here:
        String test_name = jTextFieldTestName.getText();
        String test_price = jTextFieldTestPrice.getText();
        
    }//GEN-LAST:event_jButtonCreateActionPerformed
    /*private Customer set_user_input_values(Customer customer, ArrayList<String> user_input){
        
        customer.getUserAccount().setPassword(user_input.get(1));
        customer.setCustomerPhone(user_input.get(2));
        return customer;
    }
        private void clearFields(){
        custUsername.setText("");
        custPassword.setText("");
        custContact.setText("");

    }
    public ArrayList<String> check_empty_field(){
        ArrayList<String> user_input = new ArrayList<>();
        String user_custName = custUsername.getText();
        String user_custPass = custPassword.getText();
        String user_contact = custContact.getText();
 
        if(user_custName.isEmpty()){
            JOptionPane.showMessageDialog(this, "Customer Name can't be left empty");
        }
        else if(user_custPass.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter password");
        }
        
        else if(user_contact.isEmpty()){
            JOptionPane.showMessageDialog(this, "Customer Contact No can't be left empty.");
        }
        user_input.add(user_custName);
        user_input.add(user_custPass);
        user_input.add(user_contact);
        
        return user_input;
        
    }
    */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonView;
    private javax.swing.JLabel jLabelPatientID;
    private javax.swing.JLabel jLabelPatientName;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTitle2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableTestDB1;
    private javax.swing.JTextField jTextFieldTestName;
    private javax.swing.JTextField jTextFieldTestPrice;
    // End of variables declaration//GEN-END:variables

    /*private void populateTable() {
        
        customerDirectory = ecosystem.getCustomerDirectory();
        ArrayList<Customer> customers = customerDirectory.getCustomerList();
        DefaultTableModel model = (DefaultTableModel) customersTable.getModel();
        model.setRowCount(0);
//        DefaultComboBoxModel dc = new DefaultComboBoxModel();
        
        for(Customer c: customers)
        {
            model.addRow(new Object[]{c,c.getUserAccount().getPassword(), c.getCustomerPhone()});
//            dc.addElement(c.getCustomerName());
        }
        customersTable.setModel(model);
//        listCustomers.setModel(dc);
        dB4OUtil.storeSystem(ecosystem);
    }*/
}
