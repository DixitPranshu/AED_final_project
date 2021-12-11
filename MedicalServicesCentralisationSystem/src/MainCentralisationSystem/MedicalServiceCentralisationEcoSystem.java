/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainCentralisationSystem;

import CustomerSupportTeam.CustomerSupportTeamDirectory;
import HospitalManagement.Hospital.HospitalDirectory;
import HospitalManagement.Requests.RequestDirectory;

import MainCentralisationSystem.Role.Role;
import MainCentralisationSystem.Role.SystemAdminRole;

import java.util.ArrayList;


public class MedicalServiceCentralisationEcoSystem extends HospitalManagementEnterprise{
    
    private static HospitalDirectory hospitalDirectory;
    private static CustomerSupportTeamDirectory customerSupportTeamDirectory;
    
    private UserAccountDirectory userAccountDirectory;
    private RequestDirectory requestDirectory;

    public MedicalServiceCentralisationEcoSystem(){
        userAccountDirectory = new UserAccountDirectory();
        requestDirectory = new RequestDirectory();
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

    public RequestDirectory getRequestDirectory() {
        return requestDirectory;
    }

    public void setRequestDirectory(RequestDirectory requestDirectory) {
        this.requestDirectory = requestDirectory;
    }
    
    

    public CustomerSupportTeamDirectory getCustomerSupportTeamDirectory() {
        return customerSupportTeamDirectory;
    }

    public void setCustomerSupportTeamDirectory(CustomerSupportTeamDirectory customerSupportTeamDirectory) {
        this.customerSupportTeamDirectory = customerSupportTeamDirectory;
    }
    
    
    



    

    
}
