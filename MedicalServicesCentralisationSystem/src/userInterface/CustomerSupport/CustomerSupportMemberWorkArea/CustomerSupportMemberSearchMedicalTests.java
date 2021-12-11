/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.CustomerSupport.CustomerSupportMemberWorkArea;



import userInterface.CustomerSupport.CustomerSupportAdminWorkArea.*;
import MainCentralisationSystem.MedicalServiceCentralisationEcoSystem;

import CustomerSupportTeam.CustomerSupportMember.CustomerSupportMemberDirectory;
import CustomerSupportTeam.CustomerSupportMember.CustomerSupportMember;
import CustomerSupportTeam.CustomerSupportTeam;
import HospitalManagement.Hospital.Hospital;
import HospitalManagement.Hospital.HospitalDirectory;
import HospitalManagement.PatientTest.LabTest;


import MainCentralisationSystem.Role.CustomerSupportMemberRole;
import MainCentralisationSystem.Role.FrontDeskOperatorRole;
import MainCentralisationSystem.Role.Role;

import MainCentralisationSystem.UserAccount;
import MainCentralisationSystem.UserAccountDirectory;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shreya
 */
public class CustomerSupportMemberSearchMedicalTests extends javax.swing.JPanel {

    /**
     * Creates new form OperationalAccountsPage
     */
    JPanel userProcessContainer;
    MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem;
    CustomerSupportMemberDirectory accountantDirectory;
    
    UserAccount userAccount;
    UserAccountDirectory UserAccountDirectory;
    CustomerSupportTeam customerSupportTeam;
    ArrayList<LabTest> finallabTestList = new ArrayList<>();
    String cust_pincode;
    public CustomerSupportMemberSearchMedicalTests(JPanel userProcessContainer , MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem, String pincode) {
        
        this.userProcessContainer = userProcessContainer;
        this.medicalServiceCentralisationEcoSystem = medicalServiceCentralisationEcoSystem;
        this.cust_pincode = pincode;
        initComponents();
        populateHospitals(pincode);
//        addrecordstotable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRequests = new javax.swing.JTable();
        jButtonSearch = new javax.swing.JButton();
        jTextFieldTestName = new javax.swing.JTextField();
        jLabelEmpID = new javax.swing.JLabel();
        jLabelEmpID1 = new javax.swing.JLabel();
        jTextFieldPincode = new javax.swing.JTextField();
        jButtonRefresh = new javax.swing.JButton();
        jComboBoxHospitalList = new javax.swing.JComboBox<>();
        jLabelEmpName6 = new javax.swing.JLabel();
        jButtonSearch1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableRequests2 = new javax.swing.JTable();
        jButtonSearch2 = new javax.swing.JButton();
        jButtonSearch3 = new javax.swing.JButton();
        jLabelEmpName7 = new javax.swing.JLabel();
        jLabelEmpName8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 70, 169));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lab Test Directory");

        jButton2.setBackground(new java.awt.Color(0, 70, 169));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("HOME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTableRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Test Name", "Pincode", "Hospital ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableRequests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRequestsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableRequests);

        jButtonSearch.setText("SEARCH");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jTextFieldTestName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTestNameActionPerformed(evt);
            }
        });

        jLabelEmpID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmpID.setText("Test Name");

        jLabelEmpID1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmpID1.setText("Pincode");

        jTextFieldPincode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPincodeActionPerformed(evt);
            }
        });
        jTextFieldPincode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPincodeKeyPressed(evt);
            }
        });

        jButtonRefresh.setText("REFRESH");
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });

        jComboBoxHospitalList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelEmpName6.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmpName6.setText("Hospital");

        jButtonSearch1.setText("ADD TO CART");
        jButtonSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearch1ActionPerformed(evt);
            }
        });

        jTableRequests2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Test Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableRequests2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRequests2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableRequests2);

        jButtonSearch2.setText("DELETE");
        jButtonSearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearch2ActionPerformed(evt);
            }
        });

        jButtonSearch3.setText("SUBMIT");
        jButtonSearch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearch3ActionPerformed(evt);
            }
        });

        jLabelEmpName7.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmpName7.setText("CART");

        jLabelEmpName8.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmpName8.setText("TEST SEARCH RESULTS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabelEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldTestName, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelEmpID1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelEmpName6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxHospitalList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldPincode, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(186, 186, 186))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEmpName8)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonSearch1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelEmpName7))
                                .addGap(48, 48, 48)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(jButtonRefresh))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonSearch3)
                                    .addComponent(jButtonSearch2))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton2))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldTestName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmpID))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPincode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmpID1)
                    .addComponent(jButtonSearch)
                    .addComponent(jButtonRefresh))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmpName6)
                    .addComponent(jComboBoxHospitalList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabelEmpName7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelEmpName8)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSearch2)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSearch3)))
                .addGap(19, 19, 19)
                .addComponent(jButtonSearch1)
                .addContainerGap(585, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
            crdLyt.show(userProcessContainer,"Sysadmin");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldTestNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTestNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTestNameActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTableRequests.getModel();
        model.setRowCount(0);
        ArrayList<String> user_input = check_empty_field();
        HospitalDirectory hospitalDirectory = medicalServiceCentralisationEcoSystem.getHospitalDirectory();
        ArrayList<Hospital> hospitalList = hospitalDirectory.getHospitalList();
        
        for(Hospital hospital: hospitalList){
            if(hospital.getHospitalpincode().equals(user_input.get(1))){
                ArrayList<LabTest> labTestList = hospital.getLabTestDirectory().getLabTestList();
                for(LabTest labTest: labTestList){
                    if(labTest.getTest_name().equals(user_input.get(0))){
                        if(!finallabTestList.contains(labTest)){
                            finallabTestList.add(labTest);
                            model.addRow(new Object[]{user_input.get(0), user_input.get(1), hospital});
                        }
                        
                    }
                }
            }
        }
        
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jTableRequestsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRequestsMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTableRequestsMouseClicked

    private void jTextFieldPincodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPincodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPincodeActionPerformed

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTableRequests.getModel();
        model.setRowCount(0);
        jTableRequests.setModel(model);
        jTextFieldPincode.setText("");
        jTextFieldTestName.setText("");
        finallabTestList.clear();
    }//GEN-LAST:event_jButtonRefreshActionPerformed

    private void jButtonSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSearch1ActionPerformed

    private void jTableRequests2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRequests2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableRequests2MouseClicked

    private void jButtonSearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearch2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSearch2ActionPerformed

    private void jButtonSearch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearch3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSearch3ActionPerformed

    private void jTextFieldPincodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPincodeKeyPressed
        // TODO add your handling code here:
        jComboBoxHospitalList.removeAllItems();
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            populateHospitals(jTextFieldPincode.getText());
        }
        
    }//GEN-LAST:event_jTextFieldPincodeKeyPressed
    
    
    public ArrayList<String> check_empty_field(){
        ArrayList<String> user_input = new ArrayList<>();
        String user_test_name = jTextFieldTestName.getText();
        String user_pincode = jTextFieldPincode.getText();

        if(user_test_name.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter Test Name");
        }
        if(user_pincode.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please pincode.");
        }

        user_input.add(user_test_name);
        user_input.add(user_pincode);
   
        return user_input;
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonSearch1;
    private javax.swing.JButton jButtonSearch2;
    private javax.swing.JButton jButtonSearch3;
    private javax.swing.JComboBox<String> jComboBoxHospitalList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEmpID;
    private javax.swing.JLabel jLabelEmpID1;
    private javax.swing.JLabel jLabelEmpName6;
    private javax.swing.JLabel jLabelEmpName7;
    private javax.swing.JLabel jLabelEmpName8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableRequests;
    private javax.swing.JTable jTableRequests2;
    private javax.swing.JTextField jTextFieldPincode;
    private javax.swing.JTextField jTextFieldTestName;
    // End of variables declaration//GEN-END:variables

    

    private void addrecordstotable() {
        accountantDirectory = customerSupportTeam.getCustomerSupportMemberDirectory();
    
        DefaultTableModel model = (DefaultTableModel) jTableRequests.getModel();
        model.setRowCount(0);
//        ArrayList<CustomerSupportMember> accountantList = accountantDirectory.getCustomerSupportMemberList();
//        for(CustomerSupportMember accountant: accountantList)
//        {
//            model.addRow(new Object[]{accountant.getUserAccount(),accountant.getUserAccount().getEmployee().getEmployee_name(),"CustomerSupportMember",accountant.getUserAccount().getPassword()});
//        }
        UserAccountDirectory userAccountDirectory = medicalServiceCentralisationEcoSystem.getUserAccountDirectory();
        ArrayList<UserAccount> usersList = userAccountDirectory.getUserAccountList();
//        customerSupportTeamDirectory = medicalServiceCentralisationEcoSystem.getCustomerSupportTeamDirectory();
        
        model.setRowCount(0);
//        ArrayList<CustomerSupportTeam> customerSupportTeamList = customerSupportTeamDirectory.getCustomerSupportTeamList();
        for(UserAccount userAccount: usersList)
        {   
            System.out.println("userAccount.getRole().toString(): "+userAccount.getRole().toString());
            if(userAccount.getRole().toString() == "CustomerSupportMember" && userAccount.getCustomerSupportTeam().equals(customerSupportTeam)){
                
                accountantDirectory = customerSupportTeam.getCustomerSupportMemberDirectory();
                HashMap<String, CustomerSupportMember> accountantList = accountantDirectory.getCustomerSupportMemberList();
                CustomerSupportMember accountant = accountantList.get(userAccount.getUsername());
                model.addRow(new Object[]{userAccount,accountant.getCustomerSupportMemberName(),userAccount.getPassword()});
            }
        }

        jTableRequests.setModel(model);
    }

    private void populateHospitals(String pincode) {
        jTextFieldPincode.setText(pincode);
        jComboBoxHospitalList.removeAllItems();
        HospitalDirectory hospitalDirectory = medicalServiceCentralisationEcoSystem.getHospitalDirectory();
            ArrayList<Hospital> hospitalList = hospitalDirectory.getHospitalList();

            for(Hospital hospital: hospitalList){
                if(hospital.getHospitalpincode().equals(pincode)){
                    jComboBoxHospitalList.addItem(hospital.getHospitalId());

                }
    }
    
    }
}
