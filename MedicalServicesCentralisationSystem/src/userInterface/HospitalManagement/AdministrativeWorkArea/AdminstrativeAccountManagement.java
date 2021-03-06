/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.HospitalManagement.AdministrativeWorkArea;


import userInterface.SystemAdminWorkArea.*;
import java.awt.CardLayout;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userInterface.HospitalManagementMainJFrame;
/**
 *
 * @author Shreya
 */
public class AdminstrativeAccountManagement extends javax.swing.JPanel {

    /**
     * Creates new form MedTechnicalAccountsPage
     */
    JPanel userProcessContainer;
//    EcoSystem ecosystem;
//    CustomerDirectory customerDirectory;
//    RestaurantDirectory restaurantDirectory;
//    UserAccount userAccount;
//    Restaurant restaurant;
//    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
//    
//    public AdminstrativeAccountManagement(JPanel userProcessContainer , EcoSystem ecosystem) {
//        this.userProcessContainer = userProcessContainer;
//        this.ecosystem = ecosystem;
//        initComponents();
//        if(ecosystem.getRestaurantDirectory() == null)
//           ecosystem.setRestaurantDirectory(new RestaurantDirectory());
////        this.ecosystem = dB4OUtil.retrieveSystem();
//        addrecordstotable(2);
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jButtonHome = new javax.swing.JButton();
        jTextFieldPatientID = new javax.swing.JTextField();
        jLabelPatientID = new javax.swing.JLabel();
        jLabelPatientName = new javax.swing.JLabel();
        jTextFieldPatientName = new javax.swing.JTextField();
        jButtonDelete = new javax.swing.JButton();
        jButtonCreate = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonView = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAccounts = new javax.swing.JTable();
        jTextFieldPhoneNum = new javax.swing.JTextField();
        jLabelPhoneNum = new javax.swing.JLabel();
        jLabelInsuaranceNum = new javax.swing.JLabel();
        jTextFieldInsuranceNum = new javax.swing.JTextField();
        jTextFieldConsultationFee = new javax.swing.JTextField();
        jLabelConsultationFee = new javax.swing.JLabel();
        jLabelTestFee = new javax.swing.JLabel();
        jTextFieldTestFee = new javax.swing.JTextField();
        jTextFieldAdmissionFee = new javax.swing.JTextField();
        jLabelAdmissionFee = new javax.swing.JLabel();
        jLabelAmbulanceFee = new javax.swing.JLabel();
        jTextFieldAmbulanceFee = new javax.swing.JTextField();
        jTextFielddDiscount = new javax.swing.JTextField();
        jLabelDiscount = new javax.swing.JLabel();
        jLabelAdvancePaid = new javax.swing.JLabel();
        jTextFieldAdvancePaid = new javax.swing.JTextField();
        jTextFieldAmountDue = new javax.swing.JTextField();
        jLabelAmountDue = new javax.swing.JLabel();
        jLabelPharmacyBill = new javax.swing.JLabel();
        jTextFieldPharmacyBill = new javax.swing.JTextField();
        jTextFieldICUServices = new javax.swing.JTextField();
        jLabelICUServices = new javax.swing.JLabel();
        jLabelMedicalEquipment = new javax.swing.JLabel();
        jTextFieldMedicalEquipment = new javax.swing.JTextField();
        jTextFieldRoomRentServices = new javax.swing.JTextField();
        jLabelRoomRentServices = new javax.swing.JLabel();
        jLabelNursingCharges = new javax.swing.JLabel();
        jTextFieldNursingCharges = new javax.swing.JTextField();
        jTextFieldEmpID8 = new javax.swing.JTextField();
        jLabelTAX = new javax.swing.JLabel();
        jLabelGrandTotal = new javax.swing.JLabel();
        jTextFieldGrandTotal = new javax.swing.JTextField();
        jLabelSubTitle = new javax.swing.JLabel();
        jButtonSearch = new javax.swing.JButton();
        jButtonAddtoCart = new javax.swing.JButton();
        jButtonCheckout = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 70, 169));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1181, 1080));

        jPanel1.setBackground(new java.awt.Color(0, 70, 169));
        jPanel1.setPreferredSize(new java.awt.Dimension(1381, 100));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 89, Short.MAX_VALUE)
        );

        jLabelTitle.setBackground(new java.awt.Color(0, 70, 169));
        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("ACCOUNTS MANAGEMENT");

        jButtonHome.setBackground(new java.awt.Color(0, 70, 169));
        jButtonHome.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonHome.setForeground(new java.awt.Color(255, 255, 255));
        jButtonHome.setText("HOME");
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });

        jTextFieldPatientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPatientIDActionPerformed(evt);
            }
        });

        jLabelPatientID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPatientID.setText("Patient ID :");

        jLabelPatientName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPatientName.setText("Patient Name:");

        jButtonDelete.setText("DELETE");

        jButtonCreate.setText("CREATE");

        jButtonUpdate.setText("UPDATE");

        jButtonView.setText("VIEW");

        jTableAccounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Consulation Fee", "$60"},
                {"2", "Test Fee", "$50"},
                {"3", "Admission Fee", "$400"},
                {"4", "Ambulance Fee", "$200"},
                {"5", "Pharmacy Bill", "$80"},
                {"6", "ICU Services", "$1500"},
                {"7", "Medical Equipment", "$250"},
                {"8", "Room Rent ", "$300"},
                {"9", "Nursing Charges", "$100"},
                {"10", "Surgery Cost", "$3000"}
            },
            new String [] {
                "S.no", "Fee Particulars", "Cost"
            }
        ));
        jScrollPane1.setViewportView(jTableAccounts);

        jTextFieldPhoneNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPhoneNumActionPerformed(evt);
            }
        });

        jLabelPhoneNum.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPhoneNum.setText("Phone Number :");

        jLabelInsuaranceNum.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInsuaranceNum.setText("Insurance Number :");

        jTextFieldConsultationFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldConsultationFeeActionPerformed(evt);
            }
        });

        jLabelConsultationFee.setForeground(new java.awt.Color(255, 255, 255));
        jLabelConsultationFee.setText("Consultation Fee : ");

        jLabelTestFee.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTestFee.setText("Test Fee :");

        jTextFieldAdmissionFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAdmissionFeeActionPerformed(evt);
            }
        });

        jLabelAdmissionFee.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAdmissionFee.setText("Admission Charges :");

        jLabelAmbulanceFee.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAmbulanceFee.setText("Ambulance Fee :");

        jTextFielddDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielddDiscountActionPerformed(evt);
            }
        });

        jLabelDiscount.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDiscount.setText("Discount Applied :");

        jLabelAdvancePaid.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAdvancePaid.setText("Advance Paid :");

        jTextFieldAmountDue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAmountDueActionPerformed(evt);
            }
        });

        jLabelAmountDue.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAmountDue.setText("Amount Due :");

        jLabelPharmacyBill.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPharmacyBill.setText("Pharmacy Bill :");

        jTextFieldICUServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldICUServicesActionPerformed(evt);
            }
        });

        jLabelICUServices.setForeground(new java.awt.Color(255, 255, 255));
        jLabelICUServices.setText("ICU Services :");

        jLabelMedicalEquipment.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMedicalEquipment.setText("Medical Equipment :");

        jTextFieldRoomRentServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRoomRentServicesActionPerformed(evt);
            }
        });

        jLabelRoomRentServices.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRoomRentServices.setText("Room Rent Service :");

        jLabelNursingCharges.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNursingCharges.setText("Nursing Charges :");

        jTextFieldEmpID8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmpID8ActionPerformed(evt);
            }
        });

        jLabelTAX.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTAX.setText("TAX :");

        jLabelGrandTotal.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGrandTotal.setText("Grand Total :");

        jLabelSubTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelSubTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSubTitle.setText("FEE PARTICULARS");

        jButtonSearch.setText("SEARCH");

        jButtonAddtoCart.setText("Add to Cart");

        jButtonCheckout.setText("Checkout");
        jButtonCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCheckoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jButtonHome))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jTextFieldPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jTextFieldPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120)
                .addComponent(jButtonSearch))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabelPatientName)
                .addGap(34, 34, 34)
                .addComponent(jTextFieldPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabelInsuaranceNum)
                .addGap(15, 15, 15)
                .addComponent(jTextFieldInsuranceNum, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabelSubTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabelConsultationFee, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jTextFieldConsultationFee, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabelTestFee)
                .addGap(31, 31, 31)
                .addComponent(jTextFieldTestFee, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabelAdmissionFee, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jTextFieldAdmissionFee, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabelAmbulanceFee)
                .addGap(20, 20, 20)
                .addComponent(jTextFieldAmbulanceFee, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(630, 630, 630)
                .addComponent(jLabelAdvancePaid)
                .addGap(48, 48, 48)
                .addComponent(jTextFieldAdvancePaid, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabelPharmacyBill)
                .addGap(31, 31, 31)
                .addComponent(jTextFieldPharmacyBill, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jTextFieldICUServices, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelICUServices, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(190, 190, 190)
                .addComponent(jLabelAmountDue, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jTextFieldAmountDue, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabelMedicalEquipment)
                .addGap(15, 15, 15)
                .addComponent(jTextFieldMedicalEquipment, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190)
                .addComponent(jLabelGrandTotal)
                .addGap(57, 57, 57)
                .addComponent(jTextFieldGrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabelRoomRentServices, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jTextFieldRoomRentServices, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabelNursingCharges)
                .addGap(24, 24, 24)
                .addComponent(jTextFieldNursingCharges, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTAX, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jTextFieldEmpID8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(110, 110, 110)
                .addComponent(jButtonCreate)
                .addGap(39, 39, 39)
                .addComponent(jButtonDelete)
                .addGap(51, 51, 51)
                .addComponent(jButtonUpdate)
                .addGap(39, 39, 39)
                .addComponent(jButtonView, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabelDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jTextFielddDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jButtonAddtoCart)
                .addGap(351, 351, 351)
                .addComponent(jButtonCheckout))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabelTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButtonHome)))
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPatientID)
                    .addComponent(jTextFieldPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPatientName)
                            .addComponent(jLabelInsuaranceNum, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldInsuranceNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60)
                .addComponent(jLabelSubTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelConsultationFee)
                    .addComponent(jTextFieldConsultationFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTestFee)
                    .addComponent(jTextFieldTestFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAdmissionFee)
                    .addComponent(jTextFieldAdmissionFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAmbulanceFee)
                    .addComponent(jTextFieldAmbulanceFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAdvancePaid)
                    .addComponent(jTextFieldAdvancePaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPharmacyBill)
                    .addComponent(jTextFieldPharmacyBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldICUServices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelICUServices)))
                    .addComponent(jLabelAmountDue)
                    .addComponent(jTextFieldAmountDue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMedicalEquipment)
                    .addComponent(jTextFieldMedicalEquipment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelGrandTotal)
                    .addComponent(jTextFieldGrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelRoomRentServices)
                    .addComponent(jTextFieldRoomRentServices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNursingCharges)
                    .addComponent(jTextFieldNursingCharges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTAX)
                    .addComponent(jTextFieldEmpID8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCreate)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonView, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDiscount)
                    .addComponent(jTextFielddDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAddtoCart)
                    .addComponent(jButtonCheckout)))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
            crdLyt.show(userProcessContainer,"Sysadmin");
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jTextFieldPatientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPatientIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPatientIDActionPerformed

    private void jTextFieldPhoneNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPhoneNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPhoneNumActionPerformed

    private void jTextFieldConsultationFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldConsultationFeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldConsultationFeeActionPerformed

    private void jTextFieldAdmissionFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAdmissionFeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAdmissionFeeActionPerformed

    private void jTextFielddDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielddDiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielddDiscountActionPerformed

    private void jTextFieldAmountDueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAmountDueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAmountDueActionPerformed

    private void jTextFieldICUServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldICUServicesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldICUServicesActionPerformed

    private void jTextFieldRoomRentServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRoomRentServicesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRoomRentServicesActionPerformed

    private void jTextFieldEmpID8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmpID8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmpID8ActionPerformed

    private void jButtonCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCheckoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCheckoutActionPerformed
    /*private void clearFields(){
        restaurantID.setText("");
        restaurantName.setText("");
        restaurantPincode.setText("");
        restaurantPhone.setText("");
        restaurantPassword.setText("");
    }
    public ArrayList<String> check_empty_field(){
        ArrayList<String> user_input = new ArrayList<>();
        String user_rest_id = restaurantID.getText();
        String user_rest_name = restaurantName.getText();
        String user_pincode = restaurantPincode.getText();
        String user_contact_no = restaurantPhone.getText();
        String user_password = restaurantPassword.getText();
        
        
        if(user_rest_id.isEmpty()){
            JOptionPane.showMessageDialog(this, "Restaurant ID can't be left empty.");
        }
        else if(user_rest_name.isEmpty()){
            JOptionPane.showMessageDialog(this, "Restaurant Name can't be left empty.");
        }
        else if(user_pincode.isEmpty()){
            JOptionPane.showMessageDialog(this, "Restaurant Pincode can't be left empty.");
        }
        else if(user_contact_no.isEmpty()){
            JOptionPane.showMessageDialog(this, "Restaurant Contact No can't be left empty.");
        }
        else if(user_password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a Password.");
        }
        
        
        user_input.add(user_rest_id);
        user_input.add(user_rest_name);
        user_input.add(user_pincode);
        user_input.add(user_contact_no);
        user_input.add(user_password);
        
        return user_input;
        
    }
    private Restaurant set_user_input_values(Restaurant restaurant, ArrayList<String> user_input){
        
        restaurant.setRest_id(user_input.get(0));
        restaurant.setName(user_input.get(1));
        restaurant.setRest_pincode(user_input.get(2));
        restaurant.setContact_no(user_input.get(3));
        return restaurant;
    }
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddtoCart;
    private javax.swing.JButton jButtonCheckout;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonView;
    private javax.swing.JLabel jLabelAdmissionFee;
    private javax.swing.JLabel jLabelAdvancePaid;
    private javax.swing.JLabel jLabelAmbulanceFee;
    private javax.swing.JLabel jLabelAmountDue;
    private javax.swing.JLabel jLabelConsultationFee;
    private javax.swing.JLabel jLabelDiscount;
    private javax.swing.JLabel jLabelGrandTotal;
    private javax.swing.JLabel jLabelICUServices;
    private javax.swing.JLabel jLabelInsuaranceNum;
    private javax.swing.JLabel jLabelMedicalEquipment;
    private javax.swing.JLabel jLabelNursingCharges;
    private javax.swing.JLabel jLabelPatientID;
    private javax.swing.JLabel jLabelPatientName;
    private javax.swing.JLabel jLabelPharmacyBill;
    private javax.swing.JLabel jLabelPhoneNum;
    private javax.swing.JLabel jLabelRoomRentServices;
    private javax.swing.JLabel jLabelSubTitle;
    private javax.swing.JLabel jLabelTAX;
    private javax.swing.JLabel jLabelTestFee;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAccounts;
    private javax.swing.JTextField jTextFieldAdmissionFee;
    private javax.swing.JTextField jTextFieldAdvancePaid;
    private javax.swing.JTextField jTextFieldAmbulanceFee;
    private javax.swing.JTextField jTextFieldAmountDue;
    private javax.swing.JTextField jTextFieldConsultationFee;
    private javax.swing.JTextField jTextFieldEmpID8;
    private javax.swing.JTextField jTextFieldGrandTotal;
    private javax.swing.JTextField jTextFieldICUServices;
    private javax.swing.JTextField jTextFieldInsuranceNum;
    private javax.swing.JTextField jTextFieldMedicalEquipment;
    private javax.swing.JTextField jTextFieldNursingCharges;
    private javax.swing.JTextField jTextFieldPatientID;
    private javax.swing.JTextField jTextFieldPatientName;
    private javax.swing.JTextField jTextFieldPharmacyBill;
    private javax.swing.JTextField jTextFieldPhoneNum;
    private javax.swing.JTextField jTextFieldRoomRentServices;
    private javax.swing.JTextField jTextFieldTestFee;
    private javax.swing.JTextField jTextFielddDiscount;
    // End of variables declaration//GEN-END:variables
/*
    private void addrecordstotable(int par) {
        restaurantDirectory = ecosystem.getRestaurantDirectory();
        DefaultTableModel model = (DefaultTableModel) RestaurantsTable.getModel();
//        DefaultComboBo/xModel dc = new DefaultComboBoxModel();
        model.setRowCount(0);
        ArrayList<Restaurant> restaurants = restaurantDirectory.getRestaurantList();
        for(Restaurant r: restaurants)
        {
            model.addRow(new Object[]{r,r.getName(),r.getContact_no(),r.getRest_pincode(),r.getUserAccount().getPassword()});
        }
        RestaurantsTable.setModel(model);
        dB4OUtil.storeSystem(ecosystem);
    }
}
*/
}