/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement;

import HospitalManagement.Hospital.HospitalDirectory;

//
//import HospitalManagement.Patient.PatientDirectory;
//import HospitalManagement.Technician.TechnicianDirectory;
//import HospitalManagement.Radiologist.RadiologistDirectory;
//import HospitalManagement.Pathologist.PathologistDirectory;
//import HospitalManagement.Doctor.DoctorDirectory;


import HospitalManagement.Role.Role;
import HospitalManagement.Role.SystemAdminRole;
//import HospitalManagement.UserAccount.UserAccountDirectory;
//import HospitalManagement.UserAccount.UserAccount;

import java.util.ArrayList;


public class HospitalManagementEcoSystem extends HospitalManagementEnterprise{
    
    private static HospitalManagementEcoSystem hospitalManagementEcoSystem;
    
    private HospitalDirectory hospitalDirectory;

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }
    
    
    /*private TechnicianDirectory technicianDirectory;
    private RadiologistDirectory radiologistDirectory;
    private PathologistDirectory pathologistDirectory;
    private PatientDirectory patientDirectory;
    private DoctorDirectory doctorDirectory;
    private NurseDirectory nurseDirectory;
    
    
    
    public AccountantDirectory getAccountantDirectory() {
        return accountantDirectory;
    }

    public void setAccountantDirectory(AccountantDirectory accountantDirectory) {
        this.accountantDirectory = accountantDirectory;
    }
    
    public TechnicianDirectory getTechnicianDirectory() {
        return technicianDirectory;
    }

    public void setTechnicianDirectory(TechnicianDirectory technicianDirectory) {
        this.technicianDirectory = technicianDirectory;
    }

    public RadiologistDirectory getRadiologistDirectory() {
        return radiologistDirectory;
    }

    public void setRadiologistDirectory(RadiologistDirectory radiologistDirectory) {
        this.radiologistDirectory = radiologistDirectory;
    }

    public PathologistDirectory getPathologistDirectory() {
        return pathologistDirectory;
    }

    public void setPathologistDirectory(PathologistDirectory pathologistDirectory) {
        this.pathologistDirectory = pathologistDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public NurseDirectory getNurseDirectory() {
        return nurseDirectory;
    }

    public void setNurseDirectory(NurseDirectory nurseDirectory) {
        this.nurseDirectory = nurseDirectory;
    }

    */
    
    /**
     *
     * @param patientDirectory
     * @param technicianDirectory
     * @param radiologistDirectory
     * @param pathologistDirectory
     * @param doctorDirectory
     * @param nurseDirectory
     * @param frontDeskOperatorDirectory
     */
    
//    public HospitalManagementEcoSystem(PatientDirectory patientDirectory, TechnicianDirectory technicianDirectory, RadiologistDirectory radiologistDirectory, PathologistDirectory pathologistDirectory, DoctorDirectory doctorDirectory, NurseDirectory nurseDirectory, FrontDeskOperatorDirectory frontDeskOperatorDirectory){
//        this.patientDirectory = patientDirectory;
//        this.technicianDirectory = technicianDirectory;
//        this.radiologistDirectory = radiologistDirectory;
//        this.pathologistDirectory = pathologistDirectory;
//        this.patientDirectory = patientDirectory;
//        this.doctorDirectory = doctorDirectory;
//        this.nurseDirectory = nurseDirectory;
//        this.frontDeskOperatorDirectory = frontDeskOperatorDirectory;
//    }
    
    public HospitalManagementEcoSystem(HospitalDirectory hospitalDirectory){
        this.hospitalDirectory = hospitalDirectory;
        
    }
    
    public static HospitalManagementEcoSystem getInstance(){
        if(hospitalManagementEcoSystem==null){
            hospitalManagementEcoSystem=new HospitalManagementEcoSystem();
        }
        return hospitalManagementEcoSystem;
    }
    
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private HospitalManagementEcoSystem(){
        super(null);
       // networkList=new ArrayList<Network>();
    }

    
//    public boolean checkIfUserIsUnique(String user_id){
//        UserAccountDirectory usersList = hospitalManagementEcoSystem.getUserAccountDirectory();
//        ArrayList<UserAccount> userAccounts = usersList.getUserAccountList();
//        
//        for(UserAccount userAccount : userAccounts)
//        {
//            if(userAccount.getEmployee().getEmployee_id().equals(user_id))
//                return false;
//        }
//        
//       return true;
//    }

    
}
