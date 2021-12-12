/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SystemAdminWorkArea;



import MainCentralisationSystem.MedicalServiceCentralisationEcoSystem;


import MainCentralisationSystem.Role.CustomerSupportTeamAdminRole;
import MainCentralisationSystem.Role.Role;

import CustomerSupportTeam.CustomerSupportTeam;
import CustomerSupportTeam.CustomerSupportTeamDirectory;
import MainCentralisationSystem.UserAccount;
import MainCentralisationSystem.UserAccountDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shreya
 */
public class MedicalEquipWarehouseAccountsPage extends javax.swing.JPanel {

    /**
     * Creates new form OperationalAccountsPage
     */
    JPanel userProcessContainer;
    MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem;
    CustomerSupportTeamDirectory customerSupportTeamDirectory;
//    FrontDeskOperatorDirectory frontDeskOperatorDirectory;
    UserAccount userAccount;
    UserAccountDirectory UserAccountDirectory;

    public MedicalEquipWarehouseAccountsPage(JPanel userProcessContainer , MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem) {
        
        this.userProcessContainer = userProcessContainer;
        this.medicalServiceCentralisationEcoSystem = medicalServiceCentralisationEcoSystem;
        initComponents();
        if(medicalServiceCentralisationEcoSystem.getCustomerSupportTeamDirectory()== null)
           medicalServiceCentralisationEcoSystem.setCustomerSupportTeamDirectory(new CustomerSupportTeamDirectory());
        
//        addRolesComboBox();
        addDefaultvalues();
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
        jTableEmployee = new javax.swing.JTable();
        jButtonCreate = new javax.swing.JButton();
        jTextFieldTeamName = new javax.swing.JTextField();
        jButtonUpdate = new javax.swing.JButton();
        jLabelPassword = new javax.swing.JLabel();
        jTextFieldTeamPassword = new javax.swing.JTextField();
        jButtonView = new javax.swing.JButton();
        jTextFieldTeamID = new javax.swing.JTextField();
        jLabelEmpID = new javax.swing.JLabel();
        jButtonDelete = new javax.swing.JButton();
        jLabelEmpName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 70, 169));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Med Equip Warehouse");

        jButton2.setBackground(new java.awt.Color(0, 70, 169));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("HOME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTableEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Warehouse ID", "Warehouse Name", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEmployee);

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
        jLabelPassword.setText("Password:");

        jTextFieldTeamPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTeamPasswordActionPerformed(evt);
            }
        });

        jButtonView.setText("VIEW");

        jTextFieldTeamID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTeamIDActionPerformed(evt);
            }
        });

        jLabelEmpID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmpID.setText("Warehouse ID");

        jButtonDelete.setText("DELETE");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jLabelEmpName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmpName.setText("Warehouse Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelEmpID, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                .addComponent(jLabelPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabelEmpName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldTeamID, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                            .addComponent(jTextFieldTeamName)
                            .addComponent(jTextFieldTeamPassword, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCreate)
                            .addComponent(jButtonDelete))
                        .addGap(178, 178, 178)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonView)
                            .addComponent(jButtonUpdate)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(216, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton2))
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmpID)
                    .addComponent(jTextFieldTeamID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEmpName)
                            .addComponent(jTextFieldTeamName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCreate)
                            .addComponent(jButtonUpdate))))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonView))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword)
                    .addComponent(jTextFieldTeamPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(410, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
            crdLyt.show(userProcessContainer,"Sysadmin");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldTeamPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTeamPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTeamPasswordActionPerformed

    private void jTextFieldTeamIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTeamIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTeamIDActionPerformed

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        ArrayList<String> user_input = check_empty_field();
        customerSupportTeamDirectory = medicalServiceCentralisationEcoSystem.getCustomerSupportTeamDirectory();
        UserAccountDirectory usersList = medicalServiceCentralisationEcoSystem.getUserAccountDirectory();
        if(usersList.checkIfUserIsUnique(user_input.get(0))){
            
//            Employee employee = new Employee(user_input.get(0),user_input.get(1),new CustomerSupportTeamAdminRole());
            
            
            userAccount = new UserAccount(user_input.get(0), user_input.get(2), new CustomerSupportTeamAdminRole());
            
            CustomerSupportTeam customerSupportTeam = new CustomerSupportTeam(user_input.get(0), user_input.get(1));
            userAccount.setCustomerSupportTeam(customerSupportTeam);
            customerSupportTeamDirectory.addCustomerSupportTeam(customerSupportTeam);
            
            usersList.addUserAccount(userAccount);
            
            JOptionPane.showMessageDialog(this, "New CustomerSupportTeam Information has been added.");
            model.addRow(new Object[]{userAccount,user_input.get(1),user_input.get(2)});
            clearFields();
        }
        else{
            JOptionPane.showMessageDialog(this, "This username is not available. Please select a new one.");
        }
    }//GEN-LAST:event_jButtonCreateActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        int selected_row_ix = jTableEmployee.getSelectedRow();

        if(selected_row_ix < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        UserAccount select_account_details = (UserAccount)model.getValueAt(selected_row_ix, 0);        
        UserAccountDirectory = medicalServiceCentralisationEcoSystem.getUserAccountDirectory();
        customerSupportTeamDirectory = medicalServiceCentralisationEcoSystem.getCustomerSupportTeamDirectory();
        ArrayList<UserAccount> userAccountList = UserAccountDirectory.getUserAccountList();
        for(UserAccount userAccount: userAccountList)
        {
            if(userAccount.getUsername().equals(select_account_details.getUsername()))
            {
                CustomerSupportTeam customerSupportTeam = userAccount.getCustomerSupportTeam();
                ArrayList<String> user_input = check_empty_field();
//                model.setValueAt(user_input.get(1), selected_row_ix, 0);
                model.setValueAt(user_input.get(1), selected_row_ix, 1);
                model.setValueAt(user_input.get(2), selected_row_ix, 2);
                customerSupportTeamDirectory.updateCustomerSupportTeam(user_input, customerSupportTeam);
                UserAccountDirectory.updateAccount(set_user_input_values(userAccount, user_input));
                break;
            }
        }
        
//        medicalServiceCentralisationEcoSystem.setRestaurantDirectory(restaurantDirectory);
        JOptionPane.showMessageDialog(this, "Values updated");
//        addrecordstotable();
        
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int selected_row_ix = jTableEmployee.getSelectedRow();

        if(selected_row_ix < 0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        UserAccount select_user_account_details = (UserAccount)model.getValueAt(selected_row_ix, 0);
        UserAccountDirectory = medicalServiceCentralisationEcoSystem.getUserAccountDirectory();
        CustomerSupportTeam customerSupportTeam = select_user_account_details.getCustomerSupportTeam();
        customerSupportTeamDirectory.deleteCustomerSupportTeam(customerSupportTeam);
        UserAccountDirectory.deleteAccount(select_user_account_details);
//        ecosystem.setRestaurantDirectory(restaurantDirectory);
        model.removeRow(selected_row_ix);
        addrecordstotable();
        clearFields();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTableEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmployeeMouseClicked
        // TODO add your handling code here:
        jButtonCreate.setEnabled(false);
        int selected_row_ix = jTableEmployee.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        UserAccount select_user_account_details = (UserAccount)model.getValueAt(selected_row_ix, 0);
        jTextFieldTeamID.setEditable(false);
        jTextFieldTeamID.setText(select_user_account_details.getUsername());
        jTextFieldTeamName.setText(select_user_account_details.getCustomerSupportTeam().getCustomerSupportTeamName());
        jTextFieldTeamPassword.setText(select_user_account_details.getPassword());
        
    }//GEN-LAST:event_jTableEmployeeMouseClicked
    private UserAccount set_user_input_values(UserAccount userAccount, ArrayList<String> user_input) {
//        userAccount.getEmployee().setEmployee_id(user_input.get(0));
        userAccount.getCustomerSupportTeam().setCustomerSupportTeamName(user_input.get(1));
        userAccount.setPassword(user_input.get(2));
        return userAccount;
    }
    private void clearFields(){
        jTextFieldTeamID.setText("");
        jTextFieldTeamName.setText("");
        jTextFieldTeamPassword.setText("");
    }
    
    public ArrayList<String> check_empty_field(){
        ArrayList<String> user_input = new ArrayList<>();
        String user_emp_id = jTextFieldTeamID.getText();
        String user_emp_name = jTextFieldTeamName.getText();
        String user_password = jTextFieldTeamPassword.getText();

        
        if(user_emp_id.isEmpty()){
            JOptionPane.showMessageDialog(this, "User ID can't be left empty.");
        }
        else if(user_emp_name.isEmpty()){
            JOptionPane.showMessageDialog(this, "User Name can't be left empty.");
        }
        else if(user_password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a Password.");
        }
        
        
        user_input.add(user_emp_id);
        user_input.add(user_emp_name);
        user_input.add(user_password);
        
        return user_input;
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEmpID;
    private javax.swing.JLabel jLabelEmpName;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmployee;
    private javax.swing.JTextField jTextFieldTeamID;
    private javax.swing.JTextField jTextFieldTeamName;
    private javax.swing.JTextField jTextFieldTeamPassword;
    // End of variables declaration//GEN-END:variables

    
    private void addrecordstotable() {
        UserAccountDirectory userAccountDirectory = medicalServiceCentralisationEcoSystem.getUserAccountDirectory();
        ArrayList<UserAccount> usersList = userAccountDirectory.getUserAccountList();
//        customerSupportTeamDirectory = medicalServiceCentralisationEcoSystem.getCustomerSupportTeamDirectory();
    
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        model.setRowCount(0);
//        ArrayList<CustomerSupportTeam> customerSupportTeamList = customerSupportTeamDirectory.getCustomerSupportTeamList();
        for(UserAccount userAccount: usersList)
        {   
            if(userAccount.getRole().toString() == "CustomerSupportTeamAdmin"){
                model.addRow(new Object[]{userAccount,userAccount.getCustomerSupportTeam().getCustomerSupportTeamName(),userAccount.getPassword()});
            }
            
        }
        
        jTableEmployee.setModel(model);
    }

    private void addDefaultvalues() {
        
        UserAccountDirectory usersList = medicalServiceCentralisationEcoSystem.getUserAccountDirectory();
        userAccount = new UserAccount("custsupp121", "pass",new CustomerSupportTeamAdminRole());
        CustomerSupportTeam customerSupportTeam = new CustomerSupportTeam("custsupp121","custteam1");
        userAccount.setCustomerSupportTeam(customerSupportTeam);
        if(usersList.checkIfUserIsUnique("custsupp121")){
            usersList.addUserAccount(userAccount);
        }
        
        userAccount = new UserAccount("custsupp122", "pass",new CustomerSupportTeamAdminRole());
        customerSupportTeam = new CustomerSupportTeam("custsupp122","custteam2");
        userAccount.setCustomerSupportTeam(customerSupportTeam);
        if(usersList.checkIfUserIsUnique("custsupp122")){
            usersList.addUserAccount(userAccount);
        }    
    }
    
}
