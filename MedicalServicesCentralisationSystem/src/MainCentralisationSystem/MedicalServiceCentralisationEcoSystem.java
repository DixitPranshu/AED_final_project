/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainCentralisationSystem;

import CustomerSupportTeam.CustomerSupportTeamDirectory;
import HospitalManagement.Hospital.HospitalDirectory;

//
//import HospitalManagement.Patient.PatientDirectory;
//import HospitalManagement.Technician.TechnicianDirectory;
//import HospitalManagement.Radiologist.RadiologistDirectory;
//import HospitalManagement.Pathologist.PathologistDirectory;
//import HospitalManagement.Doctor.DoctorDirectory;


import MainCentralisationSystem.Role.Role;
import MainCentralisationSystem.Role.SystemAdminRole;
//import HospitalManagement.UserAccount.UserAccountDirectory;
//import HospitalManagement.UserAccount.UserAccount;

import java.util.ArrayList;


public class MedicalServiceCentralisationEcoSystem extends HospitalManagementEnterprise{
//public class MedicalServiceCentralisationEcoSystem{
    private static MedicalServiceCentralisationEcoSystem MedicalServiceCentralisationEcoSystem;
    
    private static HospitalDirectory hospitalDirectory;
    private static CustomerSupportTeamDirectory customerSupportTeamDirectory;
    
    private UserAccountDirectory userAccountDirectory;
//    private CustomerSupportTeamDirectory CustomerSupportDirectory;
    
//    public MedicalServiceCentralisationEcoSystem(HospitalDirectory hospitalDirectory){
//        this.hospitalDirectory = hospitalDirectory;
//        userAccountDirectory = new UserAccountDirectory();
//        
//    }
    public MedicalServiceCentralisationEcoSystem(){
//        this.hospitalDirectory = hospitalDirectory;
        userAccountDirectory = new UserAccountDirectory();
        
    }

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    
    

    public CustomerSupportTeamDirectory getCustomerSupportTeamDirectory() {
        return customerSupportTeamDirectory;
    }

    public void setCustomerSupportTeamDirectory(CustomerSupportTeamDirectory customerSupportTeamDirectory) {
        this.customerSupportTeamDirectory = customerSupportTeamDirectory;
    }
    
    
    
//    public static MedicalServiceCentralisationEcoSystem getInstance(){
//        if(MedicalServiceCentralisationEcoSystem==null){
//            MedicalServiceCentralisationEcoSystem=new MedicalServiceCentralisationEcoSystem();
//        }
//        return MedicalServiceCentralisationEcoSystem;
//    }
    
    
    
//    @Override
//    public ArrayList<Role> getSupportedRole() {
//        ArrayList<Role> roleList=new ArrayList<Role>();
//        roleList.add(new SystemAdminRole());
//        return roleList;
//    }
//    private MedicalServiceCentralisationEcoSystem(){
//        super(null);
//       // networkList=new ArrayList<Network>();
//    }

    
//    public boolean checkIfUserIsUnique(String user_id){
//        UserAccountDirectory usersList = MedicalServiceCentralisationEcoSystem.getUserAccountDirectory();
//        ArrayList<UserAccount> userAccounts = usersList.getUserAccountList();
//        
//        for(UserAccount userAccount : userAccounts)
//        {
//            if(userAccount.getUsername().equals(user_id))
//                return false;
//        }
//        
//       return true;
//    }

    

    
}
