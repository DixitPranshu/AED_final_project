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
import HospitalManagement.Requests.Request;
import HospitalManagement.Requests.RequestDirectory;


import MainCentralisationSystem.Role.CustomerSupportMemberRole;
import MainCentralisationSystem.Role.FrontDeskOperatorRole;
import MainCentralisationSystem.Role.Role;

import MainCentralisationSystem.UserAccount;
import MainCentralisationSystem.UserAccountDirectory;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shreya
 */
public class CustomerSupportMemberWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OperationalAccountsPage
     */
    JPanel userProcessContainer;
    MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem;
    
    CustomerSupportTeam customerSupportTeam;
    private String request_category;
    Request request;
    public CustomerSupportMemberWorkAreaJPanel(JPanel userProcessContainer , MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem) {
        
        this.userProcessContainer = userProcessContainer;
        this.medicalServiceCentralisationEcoSystem = medicalServiceCentralisationEcoSystem;
        initComponents();
        
        addrecordstotable();
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
        jButtonCreate = new javax.swing.JButton();
        jTextFieldCustPhone = new javax.swing.JTextField();
        jButtonUpdate = new javax.swing.JButton();
        jLabelPassword = new javax.swing.JLabel();
        jTextFieldNotes = new javax.swing.JTextField();
        jButtonView = new javax.swing.JButton();
        jTextFieldCustName = new javax.swing.JTextField();
        jLabelEmpID = new javax.swing.JLabel();
        jButtonDelete = new javax.swing.JButton();
        jLabelEmpName = new javax.swing.JLabel();
        jRadioButtonMedTest = new javax.swing.JRadioButton();
        jRadioButtonConsultation = new javax.swing.JRadioButton();
        jRadioButtonMedEquipment = new javax.swing.JRadioButton();
        jLabelEmpName1 = new javax.swing.JLabel();
        jLabelEmpName2 = new javax.swing.JLabel();
        jTextFieldCustEmail = new javax.swing.JTextField();
        jLabelEmpName3 = new javax.swing.JLabel();
        jTextFieldCustPincode = new javax.swing.JTextField();
        jButtonSearchMedTest = new javax.swing.JButton();
        jButtonSearchConsultation = new javax.swing.JButton();
        jButtonSearchMedEquip = new javax.swing.JButton();
        jLabelEmpName5 = new javax.swing.JLabel();
        jDateChooserTestDate = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(0, 70, 169));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer Support Members");

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
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CaseId", "Customer Name", "CustomerPhone", "CustomerEmail", "CustomerPincode", "Request Date", "RequestCategory", "CaseDescription", "Timestamp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
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

        jButtonCreate.setText("CREATE");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("UPDATE");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setText("Notes");

        jTextFieldNotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNotesActionPerformed(evt);
            }
        });

        jButtonView.setText("VIEW");

        jTextFieldCustName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCustNameActionPerformed(evt);
            }
        });

        jLabelEmpID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmpID.setText("Customer Name");

        jButtonDelete.setText("DELETE");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jLabelEmpName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmpName.setText("Customer Phone");

        jRadioButtonMedTest.setText("Medical Test");
        jRadioButtonMedTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMedTestActionPerformed(evt);
            }
        });

        jRadioButtonConsultation.setText("Consulation");
        jRadioButtonConsultation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonConsultationActionPerformed(evt);
            }
        });

        jRadioButtonMedEquipment.setText("Medical equipment");
        jRadioButtonMedEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMedEquipmentActionPerformed(evt);
            }
        });

        jLabelEmpName1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmpName1.setText("Request Category");

        jLabelEmpName2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmpName2.setText("Customer Email");

        jLabelEmpName3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmpName3.setText("Customer Pincode");

        jTextFieldCustPincode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCustPincodeActionPerformed(evt);
            }
        });
        jTextFieldCustPincode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCustPincodeKeyPressed(evt);
            }
        });

        jButtonSearchMedTest.setText("ADD MEDICAL TEST");
        jButtonSearchMedTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchMedTestActionPerformed(evt);
            }
        });

        jButtonSearchConsultation.setText("SEARCH CONSULTATION");
        jButtonSearchConsultation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchConsultationActionPerformed(evt);
            }
        });

        jButtonSearchMedEquip.setText("SEARCH MED EQUIP");
        jButtonSearchMedEquip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchMedEquipActionPerformed(evt);
            }
        });

        jLabelEmpName5.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmpName5.setText("Date ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButtonSearchMedTest)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelEmpName2)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabelEmpName)
                                        .addGap(35, 35, 35)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldCustName)
                                    .addComponent(jTextFieldCustPhone)
                                    .addComponent(jTextFieldCustEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(jButtonSearchConsultation)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonSearchMedEquip))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelEmpName3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldCustPincode))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabelEmpName1)
                                                    .addComponent(jLabelEmpName5))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jDateChooserTestDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jRadioButtonMedTest)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jRadioButtonConsultation)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jRadioButtonMedEquipment))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextFieldNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCreate)
                            .addComponent(jButtonDelete))
                        .addGap(178, 178, 178)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonView)
                            .addComponent(jButtonUpdate)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(96, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1007, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGap(238, 238, 238))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton2))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSearchMedTest)
                    .addComponent(jButtonSearchConsultation)
                    .addComponent(jButtonSearchMedEquip))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelEmpID)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonCreate)
                                    .addComponent(jButtonUpdate))
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabelEmpName)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonDelete)
                                    .addComponent(jButtonView)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabelEmpName2)
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldCustPincode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelEmpName3, javax.swing.GroupLayout.Alignment.LEADING)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldCustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldCustPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jTextFieldCustEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonMedTest)
                    .addComponent(jRadioButtonConsultation)
                    .addComponent(jRadioButtonMedEquipment)
                    .addComponent(jLabelEmpName1))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelEmpName5)
                    .addComponent(jDateChooserTestDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPassword))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(310, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
            crdLyt.show(userProcessContainer,"Sysadmin");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldNotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNotesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNotesActionPerformed

    private void jTextFieldCustNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCustNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCustNameActionPerformed
    public void raise_request(ArrayList<String> user_input){
        
        DefaultTableModel model = (DefaultTableModel) jTableRequests.getModel();
        
//        UserAccountDirectory usersList = medicalServiceCentralisationEcoSystem.getUserAccountDirectory();
        RequestDirectory requestList = medicalServiceCentralisationEcoSystem.getRequestDirectory();
        System.out.println(requestList.getLast_case_id());
//        userAccount = new UserAccount(user_input.get(0), user_input.get(2),new CustomerSupportMemberRole());
        request = new Request();
        String current_timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String last_case_id = requestList.getLast_case_id();
        int last_case_id_int = Integer.parseInt(last_case_id.replaceAll("[\\D]", ""));
        last_case_id_int++;
        

        request.setCase_id(last_case_id);
        request.setCustomer_name(user_input.get(0));
        request.setCustomer_phone(user_input.get(1));
        request.setCustomer_email(user_input.get(2));
//        request.setHospital_id(user_input.get(3));
        request.setCustomer_pincode(user_input.get(3));
        request.setRequest_date(user_input.get(4));
        request.setRequest_category(user_input.get(5));
        request.setRequest_description(user_input.get(6));
        request.setModified_time(current_timeStamp);
        request.setRequest_status("new");
        requestList.addRequest(request);
        String last_case_id_new = "REQUEST" + String.format("%03d", last_case_id_int);
        requestList.setLast_case_id(last_case_id_new);
        
            
        JOptionPane.showMessageDialog(this, "New Request Information has been added.");
        model.addRow(new Object[]{request,request.getCustomer_name(),request.getCustomer_phone(),request.getCustomer_email(),request.getCustomer_pincode(),request.getRequest_date(),request.getRequest_category(),request.getRequest_description(),current_timeStamp});
        clearFields();
        
    }
    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        // TODO add your handling code here:
        
        ArrayList<String> user_input = check_empty_field();
        raise_request(user_input);
        
    }//GEN-LAST:event_jButtonCreateActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        int selected_row_ix = jTableRequests.getSelectedRow();

        if(selected_row_ix < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) jTableRequests.getModel();
        UserAccount select_account_details = (UserAccount)model.getValueAt(selected_row_ix, 0);        
//        UserAccountDirectory = medicalServiceCentralisationEcoSystem.getUserAccountDirectory();
//        ArrayList<UserAccount> userAccountList = UserAccountDirectory.getUserAccountList();
//        for(UserAccount userAccount: userAccountList)
//        {
//            if(userAccount.getUsername().equals(select_account_details.getUsername()))
//            {
//                CustomerSupportTeam customerSupportTeam = userAccount.getCustomerSupportTeam();
//                ArrayList<String> user_input = check_empty_field();
//                model.setValueAt(user_input.get(1), selected_row_ix, 1);
//                model.setValueAt(user_input.get(2), selected_row_ix, 2);
//                UserAccountDirectory.updateAccount(set_user_input_values(userAccount, user_input));
//                break;
//            }
//        }   
        
//        medicalServiceCentralisationEcoSystem.setRestaurantDirectory(restaurantDirectory);
        JOptionPane.showMessageDialog(this, "Values updated");
//        addrecordstotable();
        
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int selected_row_ix = jTableRequests.getSelectedRow();

        if(selected_row_ix < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTableRequests.getModel();
        UserAccount select_user_account_details = (UserAccount)model.getValueAt(selected_row_ix, 0);
//        UserAccountDirectory = medicalServiceCentralisationEcoSystem.getUserAccountDirectory();
//        UserAccountDirectory.deleteAccount(select_user_account_details);
////        ecosystem.setRestaurantDirectory(restaurantDirectory);
        model.removeRow(selected_row_ix);
        addrecordstotable();
        clearFields();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTableRequestsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRequestsMouseClicked
        // TODO add your handling code here:
        jButtonCreate.setEnabled(false);
        int selected_row_ix = jTableRequests.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTableRequests.getModel();
        UserAccount select_user_account_details = (UserAccount)model.getValueAt(selected_row_ix, 0);
        jTextFieldCustName.setEditable(false);
        jTextFieldCustName.setText(select_user_account_details.getUsername());
        
        Role role = select_user_account_details.getRole();
        System.out.println("role.toString(): "+role.toString());
        
        
//        if(role.toString().equals("CustomerSupportMember")){
//            CustomerSupportTeam customerSupportTeam = select_user_account_details.getCustomerSupportTeam();
////            accountantDirectory = customerSupportTeam.getCustomerSupportMemberDirectory();
////            HashMap<String, CustomerSupportMember> accountantList = accountantDirectory.getCustomerSupportMemberList();
//            CustomerSupportMember accountant = accountantList.get(select_user_account_details.getUsername());
//            jTextFieldCustPhone.setText(accountant.getCustomerSupportMemberName());
//        }
        
        jTextFieldNotes.setText(select_user_account_details.getPassword());
        
    }//GEN-LAST:event_jTableRequestsMouseClicked

    private void jButtonSearchMedTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchMedTestActionPerformed
        // TODO add your handling code here:
        System.out.println("jTextFieldCustPincode.getText(): "+jTextFieldCustPincode.getText());
        CustomerSupportMemberSearchMedicalTests customerSupportMemberSearchMedicalTests = new CustomerSupportMemberSearchMedicalTests(userProcessContainer, medicalServiceCentralisationEcoSystem, jTextFieldCustPincode.getText());
        userProcessContainer.add("CustomerSupportMemberSearchMedicalTests",customerSupportMemberSearchMedicalTests);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.show(userProcessContainer,"CustomerSupportMemberSearchMedicalTests");
    }//GEN-LAST:event_jButtonSearchMedTestActionPerformed

    private void jButtonSearchConsultationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchConsultationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSearchConsultationActionPerformed

    private void jButtonSearchMedEquipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchMedEquipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSearchMedEquipActionPerformed

    private void jRadioButtonMedTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMedTestActionPerformed
        // TODO add your handling code here:
        if(jRadioButtonMedTest.isSelected()){
            jRadioButtonConsultation.setSelected(false);
            jRadioButtonMedEquipment.setSelected(false);
            request_category = "MedicalTest";
        }
    }//GEN-LAST:event_jRadioButtonMedTestActionPerformed

    private void jRadioButtonConsultationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonConsultationActionPerformed
        // TODO add your handling code here:
        if(jRadioButtonConsultation.isSelected()){
            jRadioButtonMedTest.setSelected(false);
            jRadioButtonMedEquipment.setSelected(false);
            request_category = "Consultation";
        }
    }//GEN-LAST:event_jRadioButtonConsultationActionPerformed

    private void jRadioButtonMedEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMedEquipmentActionPerformed
        // TODO add your handling code here:
        if(jRadioButtonMedEquipment.isSelected()){
            jRadioButtonMedTest.setSelected(false);
            jRadioButtonConsultation.setSelected(false);
            request_category = "MedicalEquipment";
        }
    }//GEN-LAST:event_jRadioButtonMedEquipmentActionPerformed

    private void jTextFieldCustPincodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCustPincodeActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jTextFieldCustPincodeActionPerformed

    private void jTextFieldCustPincodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCustPincodeKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldCustPincodeKeyPressed
    private UserAccount set_user_input_values(UserAccount userAccount, ArrayList<String> user_input) {
//        userAccount.getEmployee().setEmployee_id(user_input.get(0));
//        userAccount.getEmployee().setEmployee_name(user_input.get(1));
        userAccount.setPassword(user_input.get(2));
        return userAccount;
    }
    private void clearFields(){
        jTextFieldCustName.setText("");
        jTextFieldCustPhone.setText("");
        jTextFieldNotes.setText("");
    }
    public ArrayList<String> check_empty_field(){
        ArrayList<String> user_input = new ArrayList<>();
        String user_cust_name = jTextFieldCustName.getText();
        String user_cust_phone = jTextFieldCustPhone.getText();
        String user_cust_email = jTextFieldCustEmail.getText();
//        String user_hospital_id = (String) jComboBoxHospitalList.getSelectedItem();
        String user_pincode = jTextFieldCustPincode.getText();
        Date date = jDateChooserTestDate.getDate();
        String user_request_date = new SimpleDateFormat("MM.dd.yyyy").format(date);
//        String user_request_date = jDateChooserTestDate.getDateFormatString();
        String user_cust_notes = jTextFieldNotes.getText();
        
        
        if(user_cust_name.isEmpty()){
            JOptionPane.showMessageDialog(this, "User Name can't be left empty.");
        }
        else if(user_cust_phone.isEmpty()){
            JOptionPane.showMessageDialog(this, "User Phone Number can't be left empty.");
        }
        else if(user_cust_email.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter an email.");
        }

        else if(user_pincode.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter the user pincode");
        }
        else if(user_request_date.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a request date.");
        }
        else if(request_category.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please choose a category.");
        }
        else if(user_cust_notes.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter the request details.");
        }
        
        user_input.add(user_cust_name);
        user_input.add(user_cust_phone);
        user_input.add(user_cust_email);
//        user_input.add(user_hospital_id);
        user_input.add(user_pincode);
        user_input.add(user_request_date);
        user_input.add(request_category);
        user_input.add(user_cust_notes);
        
        return user_input;
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonSearchConsultation;
    private javax.swing.JButton jButtonSearchMedEquip;
    private javax.swing.JButton jButtonSearchMedTest;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonView;
    private com.toedter.calendar.JDateChooser jDateChooserTestDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEmpID;
    private javax.swing.JLabel jLabelEmpName;
    private javax.swing.JLabel jLabelEmpName1;
    private javax.swing.JLabel jLabelEmpName2;
    private javax.swing.JLabel jLabelEmpName3;
    private javax.swing.JLabel jLabelEmpName5;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JRadioButton jRadioButtonConsultation;
    private javax.swing.JRadioButton jRadioButtonMedEquipment;
    private javax.swing.JRadioButton jRadioButtonMedTest;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRequests;
    private javax.swing.JTextField jTextFieldCustEmail;
    private javax.swing.JTextField jTextFieldCustName;
    private javax.swing.JTextField jTextFieldCustPhone;
    private javax.swing.JTextField jTextFieldCustPincode;
    private javax.swing.JTextField jTextFieldNotes;
    // End of variables declaration//GEN-END:variables

    

    private void addrecordstotable() {
    
        DefaultTableModel model = (DefaultTableModel) jTableRequests.getModel();
        model.setRowCount(0);
        RequestDirectory requestDirectory = medicalServiceCentralisationEcoSystem.getRequestDirectory();
        if(requestDirectory!=null){
            ArrayList<Request> requestList = requestDirectory.getRequestList();
            for(Request request: requestList)
            {   
                model.addRow(new Object[]{request,request.getCustomer_name(),request.getCustomer_phone(),request.getCustomer_email(),request.getCustomer_pincode(),request.getRequest_date(),request.getRequest_category(),request.getRequest_description(), request.getModified_time()});

            }

            jTableRequests.setModel(model);
        }
        
    }
    
    
}
