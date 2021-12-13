/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.HospitalManagement.HospitalAdminWorkArea;


import HospitalManagement.Nurse.NurseDirectory;
import HospitalManagement.Employee.Employee;
import MainCentralisationSystem.MedicalServiceCentralisationEcoSystem;

import HospitalManagement.Accountant.AccountantDirectory;
import HospitalManagement.Accountant.Accountant;
import HospitalManagement.Doctor.Doctor;
import HospitalManagement.Doctor.DoctorDirectory;
import HospitalManagement.Nurse.Nurse;
import HospitalManagement.Hospital.Hospital;


import MainCentralisationSystem.Role.AccountantRole;
import MainCentralisationSystem.Role.DoctorRole;
import MainCentralisationSystem.Role.NurseRole;
import MainCentralisationSystem.Role.Role;

import MainCentralisationSystem.UserAccount;
import MainCentralisationSystem.UserAccountDirectory;
import java.awt.CardLayout;
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
public class OperationalAccountsPage extends javax.swing.JPanel {

    /**
     * Creates new form OperationalAccountsPage
     */
    JPanel userProcessContainer;
    MedicalServiceCentralisationEcoSystem hospitalManagementEcoSystem;
    DoctorDirectory doctorDirectory;
    NurseDirectory nurseDirectory;
    UserAccount userAccount;
    UserAccountDirectory UserAccountDirectory;
    Hospital hospital;
    public OperationalAccountsPage(JPanel userProcessContainer , MedicalServiceCentralisationEcoSystem hospitalManagementEcoSystem, Hospital hospital) {
        
        this.userProcessContainer = userProcessContainer;
        this.hospitalManagementEcoSystem = hospitalManagementEcoSystem;
        this.hospital = hospital;
        initComponents();
        if(hospital.getDoctorDirectory()== null)
           hospital.setDoctorDirectory(new DoctorDirectory());
        if(hospital.getNurseDirectory()== null)
           hospital.setNurseDirectory(new NurseDirectory());
        
        addRolesComboBox();
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
        jTextFieldEmpName = new javax.swing.JTextField();
        jButtonUpdate = new javax.swing.JButton();
        jLabelPassword = new javax.swing.JLabel();
        jTextFieldPassword = new javax.swing.JTextField();
        jTextFieldEmpID = new javax.swing.JTextField();
        jLabelRole = new javax.swing.JLabel();
        jComboBoxRole = new javax.swing.JComboBox<>();
        jLabelEmpID = new javax.swing.JLabel();
        jButtonDelete = new javax.swing.JButton();
        jLabelEmpName = new javax.swing.JLabel();
        bgdimg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 70, 169));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Operational");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 706, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("HOME");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1690, 50, -1, -1));

        jTableEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Employee ID", "Employee Name", "Role", "Password"
            }
        ));
        jTableEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEmployee);

<<<<<<< HEAD
        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 690, 570, 90));
=======
        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 570, 90));
>>>>>>> b10ebf3e17590649219c5c85b28d7c2f509bce7d

        jButtonCreate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCreate.setText("CREATE");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });
<<<<<<< HEAD
        add(jButtonCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 110, 40));
        add(jTextFieldEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 270, -1));
=======
        add(jButtonCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 570, -1, -1));
        add(jTextFieldEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 270, -1));
>>>>>>> b10ebf3e17590649219c5c85b28d7c2f509bce7d

        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonUpdate.setText("UPDATE");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
<<<<<<< HEAD
        add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, 110, 40));
=======
        add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 550, -1, -1));
>>>>>>> b10ebf3e17590649219c5c85b28d7c2f509bce7d

        jLabelPassword.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelPassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelPassword.setText("Password:");
<<<<<<< HEAD
        add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 140, -1));
=======
        add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, 140, -1));
>>>>>>> b10ebf3e17590649219c5c85b28d7c2f509bce7d

        jTextFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPasswordActionPerformed(evt);
            }
        });
<<<<<<< HEAD
        add(jTextFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 270, -1));
=======
        add(jTextFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 620, 270, -1));
>>>>>>> b10ebf3e17590649219c5c85b28d7c2f509bce7d

        jTextFieldEmpID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmpIDActionPerformed(evt);
            }
        });
<<<<<<< HEAD
        add(jTextFieldEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 270, -1));
=======
        add(jTextFieldEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 270, -1));
>>>>>>> b10ebf3e17590649219c5c85b28d7c2f509bce7d

        jLabelRole.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelRole.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelRole.setText("Role:");
<<<<<<< HEAD
        add(jLabelRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 140, -1));

        jComboBoxRole.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctor", "Nurse" }));
        add(jComboBoxRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 90, -1));
=======
        add(jLabelRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 140, -1));

        jComboBoxRole.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctor", "Nurse" }));
        add(jComboBoxRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, 90, -1));
>>>>>>> b10ebf3e17590649219c5c85b28d7c2f509bce7d

        jLabelEmpID.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelEmpID.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelEmpID.setText("Employee ID:");
<<<<<<< HEAD
        add(jLabelEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 140, -1));
=======
        add(jLabelEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 140, -1));
>>>>>>> b10ebf3e17590649219c5c85b28d7c2f509bce7d

        jButtonDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDelete.setText("DELETE");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
<<<<<<< HEAD
        add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, 110, 40));
=======
        add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 540, -1, -1));
>>>>>>> b10ebf3e17590649219c5c85b28d7c2f509bce7d

        jLabelEmpName.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelEmpName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelEmpName.setText("Employee Name:");
<<<<<<< HEAD
        add(jLabelEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 140, -1));
=======
        add(jLabelEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 140, -1));
>>>>>>> b10ebf3e17590649219c5c85b28d7c2f509bce7d

        bgdimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/Images/OperationalAccountsPage_latest.jpeg"))); // NOI18N
        add(bgdimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
            crdLyt.show(userProcessContainer,"hospitalAdminWorkAreaJPanel");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPasswordActionPerformed

    private void jTextFieldEmpIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmpIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmpIDActionPerformed

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        ArrayList<String> user_input = check_empty_field();
        UserAccountDirectory usersList = hospitalManagementEcoSystem.getUserAccountDirectory();
        if(usersList.checkIfUserIsUnique(user_input.get(0))){
            
            
            if(user_input.get(2) == "Doctor"){

                userAccount = new UserAccount(user_input.get(0), user_input.get(3), new DoctorRole());
                usersList.addUserAccount(userAccount);
                Doctor doctor = new Doctor();
                doctor.setDoctorId(user_input.get(0));
                doctor.setDoctorName(user_input.get(1));                
                doctorDirectory.addDoctor(user_input.get(0), doctor);
                hospital.setDoctorDirectory(doctorDirectory);
                userAccount.setHospital(hospital);
            }
            if(user_input.get(2) == "Nurse"){

                userAccount = new UserAccount(user_input.get(0), user_input.get(3), new NurseRole());
                usersList.addUserAccount(userAccount);
                Nurse nurse = new Nurse();
                nurse.setNurseId(user_input.get(0));
                nurse.setNurseName(user_input.get(1));                
                nurseDirectory.addNurse(user_input.get(0), nurse);
                hospital.setNurseDirectory(nurseDirectory);
                userAccount.setHospital(hospital);
            }
            
            JOptionPane.showMessageDialog(this, "New Employee Information has been added.");
            model.addRow(new Object[]{userAccount,user_input.get(1),user_input.get(2),user_input.get(3)});
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
        UserAccountDirectory = hospitalManagementEcoSystem.getUserAccountDirectory();
        ArrayList<UserAccount> userAccountList = UserAccountDirectory.getUserAccountList();
        for(UserAccount userAccount: userAccountList)
        {
            if(userAccount.getUsername().equals(select_account_details.getUsername()))
            {
                Hospital hospital = userAccount.getHospital();
                ArrayList<String> user_input = check_empty_field();
//                model.setValueAt(user_input.get(1), selected_row_ix, 0);
                model.setValueAt(user_input.get(1), selected_row_ix, 1);
//                model.setValueAt(user_input.get(2), selected_row_ix, 2);
                model.setValueAt(user_input.get(3), selected_row_ix, 3);
                UserAccountDirectory.updateAccount(set_user_input_values(userAccount, user_input));
                break;
            }
        }   
        
//        hospitalManagementEcoSystem.setRestaurantDirectory(restaurantDirectory);
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
        UserAccountDirectory = hospitalManagementEcoSystem.getUserAccountDirectory();
        UserAccountDirectory.deleteAccount(select_user_account_details);
//        ecosystem.setRestaurantDirectory(restaurantDirectory);
        model.removeRow(selected_row_ix);
        addrecordstotable();
        clearFields();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTableEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmployeeMouseClicked
        // TODO add your handling code here:
        jButtonCreate.setEnabled(false);
        jComboBoxRole.setEnabled(false);
        int selected_row_ix = jTableEmployee.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        UserAccount select_user_account_details = (UserAccount)model.getValueAt(selected_row_ix, 0);
        jTextFieldEmpID.setEditable(false);
        jTextFieldEmpID.setText(select_user_account_details.getUsername());
        
        Role role = select_user_account_details.getRole();
        System.out.println("role.toString(): "+role.toString());
        jComboBoxRole.setSelectedItem(role.toString()); 
        
        
        if(role.toString().equals("Nurse")){
            Hospital hospital = select_user_account_details.getHospital();
            nurseDirectory = hospital.getNurseDirectory();
            HashMap<String, Nurse> nurseList = nurseDirectory.getNurseList();
            Nurse nurse = nurseList.get(select_user_account_details.getUsername());
            jTextFieldEmpName.setText(nurse.getNurseName());
        }
        else if(role.toString().equals("Doctor")){
            Hospital hospital = select_user_account_details.getHospital();
            doctorDirectory = hospital.getDoctorDirectory();
            HashMap<String, Doctor> doctorList = doctorDirectory.getDoctorList();
            Doctor doctor = doctorList.get(select_user_account_details.getUsername());
            jTextFieldEmpName.setText(doctor.getDoctorName());
        }
        
        jTextFieldPassword.setText(select_user_account_details.getPassword());
        
    }//GEN-LAST:event_jTableEmployeeMouseClicked
    private UserAccount set_user_input_values(UserAccount userAccount, ArrayList<String> user_input) {
//        userAccount.getEmployee().setEmployee_id(user_input.get(0));
//        userAccount.getEmployee().setEmployee_name(user_input.get(1));
        userAccount.setPassword(user_input.get(3));
        return userAccount;
    }
    private void clearFields(){
        jTextFieldEmpID.setText("");
        jTextFieldEmpName.setText("");
        jTextFieldPassword.setText("");
        jComboBoxRole.setSelectedItem("");
    }
    
    public ArrayList<String> check_empty_field(){
        ArrayList<String> user_input = new ArrayList<>();
        String user_emp_id = jTextFieldEmpID.getText();
        String user_emp_name = jTextFieldEmpName.getText();
        String user_password = jTextFieldPassword.getText();
        String user_role = (String) jComboBoxRole.getSelectedItem();

        
        if(user_emp_id.isEmpty()){
            JOptionPane.showMessageDialog(this, "User ID can't be left empty.");
        }
        else if(user_emp_name.isEmpty()){
            JOptionPane.showMessageDialog(this, "User Name can't be left empty.");
        }
        else if(user_password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a Password.");
        }
        else if(user_role.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please select a Role.");
        }
        
        user_input.add(user_emp_id);
        user_input.add(user_emp_name);
        user_input.add(user_role);
        user_input.add(user_password);
        
        return user_input;
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgdimg;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEmpID;
    private javax.swing.JLabel jLabelEmpName;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelRole;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmployee;
    private javax.swing.JTextField jTextFieldEmpID;
    private javax.swing.JTextField jTextFieldEmpName;
    private javax.swing.JTextField jTextFieldPassword;
    // End of variables declaration//GEN-END:variables

    

    private void addRolesComboBox() {
        jComboBoxRole.removeAllItems();
        jComboBoxRole.addItem("");
        jComboBoxRole.addItem("Nurse");
        jComboBoxRole.addItem("Doctor");
    }

    private void addrecordstotable() {
        doctorDirectory = hospital.getDoctorDirectory();
        nurseDirectory = hospital.getNurseDirectory();
    
        DefaultTableModel model = (DefaultTableModel) jTableEmployee.getModel();
        model.setRowCount(0);
//        ArrayList<Accountant> accountantList = accountantDirectory.getAccountantList();
//        for(Accountant accountant: accountantList)
//        {
//            model.addRow(new Object[]{accountant.getUserAccount(),accountant.getUserAccount().getEmployee().getEmployee_name(),"Accountant",accountant.getUserAccount().getPassword()});
//        }
        UserAccountDirectory userAccountDirectory = hospitalManagementEcoSystem.getUserAccountDirectory();
        ArrayList<UserAccount> usersList = userAccountDirectory.getUserAccountList();
//        hospitalDirectory = hospitalManagementEcoSystem.getHospitalDirectory();
        
        model.setRowCount(0);
//        ArrayList<Hospital> hospitalList = hospitalDirectory.getHospitalList();
        for(UserAccount userAccount: usersList)
        {   
            if(userAccount.getRole().toString() == "Nurse" && userAccount.getHospital().equals(hospital)){
                
                nurseDirectory = hospital.getNurseDirectory();
                HashMap<String, Nurse> nurseList = nurseDirectory.getNurseList();
                Nurse nurse = nurseList.get(userAccount.getUsername());
                model.addRow(new Object[]{userAccount,nurse.getNurseName(),userAccount.getRole(),userAccount.getPassword()});
            }
            else if(userAccount.getRole().toString() == "Doctor" && userAccount.getHospital().equals(hospital)){
                
                doctorDirectory = hospital.getDoctorDirectory();
                HashMap<String, Doctor> doctorList = doctorDirectory.getDoctorList();
                Doctor doctor = doctorList.get(userAccount.getUsername());
                model.addRow(new Object[]{userAccount,doctor.getDoctorName(),userAccount.getRole(),userAccount.getPassword()});
            }
        }

        jTableEmployee.setModel(model);
    }
    
    
}
