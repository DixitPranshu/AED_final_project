package MainCentralisationSystem;

import HospitalManagement.Employee.Employee;
import HospitalManagement.Employee.EmployeeDirectory;
import HospitalManagement.Hospital.Hospital;
import HospitalManagement.Hospital.HospitalDirectory;
import MainCentralisationSystem.Role.HospitalAdminRole;
import MainCentralisationSystem.Role.SystemAdminRole;

public class ConfigureASystem {
    
    public static MedicalServiceCentralisationEcoSystem configure(){
        
//        MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem = MedicalServiceCentralisationEcoSystem.getInstance();
//        MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem = new MedicalServiceCentralisationEcoSystem(new HospitalDirectory());
MedicalServiceCentralisationEcoSystem medicalServiceCentralisationEcoSystem = new MedicalServiceCentralisationEcoSystem();
//        EmployeeDirectory employeeDirectory = medicalServiceCentralisationEcoSystem.getEmployeeDirectory();
//        Employee employee = new Employee("sysadmin","System Admin", new SystemAdminRole());
        UserAccountDirectory userAccountDirectory = medicalServiceCentralisationEcoSystem.getUserAccountDirectory();
        UserAccount userAccount = new UserAccount("sysadmin", "sysadmin",new SystemAdminRole());
        userAccountDirectory.addUserAccount(userAccount);
        
        
        return medicalServiceCentralisationEcoSystem;
    }
    
}
