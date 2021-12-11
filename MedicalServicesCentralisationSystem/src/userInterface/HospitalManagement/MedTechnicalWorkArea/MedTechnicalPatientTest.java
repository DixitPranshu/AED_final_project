/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.HospitalManagement.MedTechnicalWorkArea;


import HospitalManagement.Hospital.Hospital;
import HospitalManagement.PatientTest.LabTest;
import HospitalManagement.PatientTest.LabTestDirectory;
import HospitalManagement.Requests.Request;
import HospitalManagement.Requests.RequestDirectory;
import MainCentralisationSystem.MedicalServiceCentralisationEcoSystem;
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
public class MedTechnicalPatientTest extends javax.swing.JPanel {

    /**
     * Creates new form OperationalAccountsPage
     */
    JPanel userProcessContainer;
    MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem;
    Hospital hospital;
    public MedTechnicalPatientTest(JPanel userProcessContainer , MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem, Hospital hospital) {
        this.userProcessContainer = userProcessContainer;
        this.medicalServiceCentralisationEcoSystem = medicalServiceCentralisationEcoSystem;
        this.hospital = hospital;
        initComponents();
        populateNewRequestsTable();
        populateTestNameComboBox();
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
        jLabelTitle1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableNewTests = new javax.swing.JTable();
        jButtonCreate = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonView = new javax.swing.JButton();
        jTextFieldTestID = new javax.swing.JTextField();
        jLabelTestName = new javax.swing.JLabel();
        jLabelTestID = new javax.swing.JLabel();
        jButtonDelete = new javax.swing.JButton();
        jLabelPatientID = new javax.swing.JLabel();
        jTextFieldPatientId = new javax.swing.JTextField();
        jLabelPatientName = new javax.swing.JLabel();
        jTextFieldTestDate = new javax.swing.JTextField();
        jComboBoxTestName = new javax.swing.JComboBox<>();
        jButtonSearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAllTests = new javax.swing.JTable();
        jLabelTitle3 = new javax.swing.JLabel();
        jTextFieldPatientName = new javax.swing.JTextField();
        jLabelReportAvailability = new javax.swing.JLabel();
        jLabelTestDate1 = new javax.swing.JLabel();
        jRadioButtonYes = new javax.swing.JRadioButton();
        jRadioButtonNo = new javax.swing.JRadioButton();
        jLabelReportAvailability1 = new javax.swing.JLabel();
        jTextFieldAvailbility = new javax.swing.JTextField();
        jButtonDownloadReport = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 70, 169));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Patient Test");
        add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 43, 706, -1));

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

        jLabelTitle1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelTitle1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle1.setText("All tests");
        add(jLabelTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 530, 706, -1));

        jTableNewTests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Patient PhoneNo", "Test Date", "Case ID", "Case Description"
            }
        ));
        jTableNewTests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableNewTestsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableNewTests);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 610, 460, 160));

        jButtonCreate.setText("CREATE");
        add(jButtonCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, -1, -1));

        jButtonUpdate.setText("UPDATE");
        add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, -1, -1));

        jButtonView.setText("VIEW");
        jButtonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewActionPerformed(evt);
            }
        });
        add(jButtonView, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 260, -1, -1));

        jTextFieldTestID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTestIDActionPerformed(evt);
            }
        });
        add(jTextFieldTestID, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 260, -1));

        jLabelTestName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTestName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelTestName.setText("Test Name :");
        add(jLabelTestName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 80, 20));

        jLabelTestID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTestID.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelTestID.setText("Test ID:");
        add(jLabelTestID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 104, -1));

        jButtonDelete.setText("DELETE");
        add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, -1, -1));

        jLabelPatientID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPatientID.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelPatientID.setText("Patient ID:");
        add(jLabelPatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 104, -1));

        jTextFieldPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPatientIdActionPerformed(evt);
            }
        });
        add(jTextFieldPatientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 270, -1));

        jLabelPatientName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPatientName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelPatientName.setText("Patient Name :");
        add(jLabelPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 100, -1));
        add(jTextFieldTestDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 270, -1));

        jComboBoxTestName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blood Test", "Cholestrol", "CBP", "Urine test", "X-Ray", "C.T Scan", "M.R.I ", "Dental Scan", "Ultrasound", "ECG", "EEG", " " }));
        jComboBoxTestName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTestNameActionPerformed(evt);
            }
        });
        add(jComboBoxTestName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 110, -1));

        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });
        add(jButtonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 340, 80, 30));

        jTableAllTests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Patient Name", "Test ID", "Test Name", "Doctor Reffered", "Test Date", "Technician"
            }
        ));
        jScrollPane2.setViewportView(jTableAllTests);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 600, 500, 160));

        jLabelTitle3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelTitle3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle3.setText("New test requests");
        add(jLabelTitle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 530, 706, -1));

        jTextFieldPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPatientNameActionPerformed(evt);
            }
        });
        add(jTextFieldPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 270, -1));

        jLabelReportAvailability.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReportAvailability.setText("Available at:");
        add(jLabelReportAvailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 104, -1));

        jLabelTestDate1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTestDate1.setText("Test Date:");
        add(jLabelTestDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 104, -1));

        jRadioButtonYes.setText("Yes");
        jRadioButtonYes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        add(jRadioButtonYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 50, 30));

        jRadioButtonNo.setText("No");
        jRadioButtonNo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        add(jRadioButtonNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 50, 30));

        jLabelReportAvailability1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReportAvailability1.setText("Report Availabilty :");
        add(jLabelReportAvailability1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 104, -1));
        add(jTextFieldAvailbility, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 260, -1));

        jButtonDownloadReport.setText("Download Report");
        jButtonDownloadReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDownloadReportActionPerformed(evt);
            }
        });
        add(jButtonDownloadReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 460, 220, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        // TODO add your handling code here:
//        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
//            crdLyt.show(userProcessContainer,"Sysadmin");
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jButtonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonViewActionPerformed

    private void jTextFieldTestIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTestIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTestIDActionPerformed

    private void jTextFieldPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPatientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPatientIdActionPerformed

    private void jComboBoxTestNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTestNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTestNameActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jTextFieldPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPatientNameActionPerformed

    private void jButtonDownloadReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDownloadReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDownloadReportActionPerformed

    private void jTableNewTestsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNewTestsMouseClicked
        // TODO add your handling code here:
        
        int selected_row_ix = jTableNewTests.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTableNewTests.getModel();
        jTextFieldPatientId.setText(model.getValueAt(selected_row_ix, 1).toString());
        jTextFieldPatientName.setText(model.getValueAt(selected_row_ix, 0).toString());
        jTextFieldTestDate.setText(model.getValueAt(selected_row_ix, 2).toString());
    }//GEN-LAST:event_jTableNewTestsMouseClicked
//    private Customer set_user_input_values(Customer customer, ArrayList<String> user_input){
//        
//        customer.getUserAccount().setPassword(user_input.get(1));
//        customer.setCustomerPhone(user_input.get(2));
//        return customer;
//    }
        /*private void clearFields(){
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
    private javax.swing.JButton jButtonDownloadReport;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonView;
    private javax.swing.JComboBox<String> jComboBoxTestName;
    private javax.swing.JLabel jLabelPatientID;
    private javax.swing.JLabel jLabelPatientName;
    private javax.swing.JLabel jLabelReportAvailability;
    private javax.swing.JLabel jLabelReportAvailability1;
    private javax.swing.JLabel jLabelTestDate1;
    private javax.swing.JLabel jLabelTestID;
    private javax.swing.JLabel jLabelTestName;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTitle1;
    private javax.swing.JLabel jLabelTitle3;
    private javax.swing.JRadioButton jRadioButtonNo;
    private javax.swing.JRadioButton jRadioButtonYes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAllTests;
    private javax.swing.JTable jTableNewTests;
    private javax.swing.JTextField jTextFieldAvailbility;
    private javax.swing.JTextField jTextFieldPatientId;
    private javax.swing.JTextField jTextFieldPatientName;
    private javax.swing.JTextField jTextFieldTestDate;
    private javax.swing.JTextField jTextFieldTestID;
    // End of variables declaration//GEN-END:variables

    private void populateNewRequestsTable() {
        
        DefaultTableModel model = (DefaultTableModel) jTableNewTests.getModel();
        model.setRowCount(0);
        RequestDirectory requestDirectory = medicalServiceCentralisationEcoSystem.getRequestDirectory();
        ArrayList<Request> requestList = requestDirectory.getRequestList();
        for(Request request: requestList){
            if(request.getRequest_status().equals("new") && request.getCustomer_pincode().equals(hospital.getHospitalpincode())){
                model.addRow(new Object []{request.getCustomer_name(),request.getCustomer_phone(),request.getRequest_date(),request.getCase_id(),request.getRequest_description()});
            }
        }
        jTableNewTests.setModel(model);
    }

    private void populateTestNameComboBox() {
        LabTestDirectory labTestDirectory = hospital.getLabTestDirectory();
        ArrayList<LabTest> labTestList = new ArrayList<>();
        jComboBoxTestName.removeAllItems();
        for(LabTest labTest: labTestList){
            jComboBoxTestName.addItem(labTest.getTest_name());
        }
    }
}
