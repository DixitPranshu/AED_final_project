package HospitalManagement;

import HospitalManagement.Employee.Employee;
import HospitalManagement.Employee.EmployeeDirectory;
import HospitalManagement.Hospital.Hospital;
import HospitalManagement.Role.HospitalAdminRole;
import HospitalManagement.Role.SystemAdminRole;
import HospitalManagement.UserAccount.UserAccount;
import HospitalManagement.UserAccount.UserAccountDirectory;

public class ConfigureASystem {
    
    public static HospitalManagementEcoSystem configure(){
        
        HospitalManagementEcoSystem hospitalManagementEcoSystem = HospitalManagementEcoSystem.getInstance();
  
        EmployeeDirectory employeeDirectory = hospitalManagementEcoSystem.getEmployeeDirectory();
//        Employee employee = new Employee("sysadmin","System Admin", new SystemAdminRole());
        UserAccountDirectory userAccountDirectory = hospitalManagementEcoSystem.getUserAccountDirectory();
        UserAccount userAccount = new UserAccount("sysadmin", "sysadmin",new SystemAdminRole());
        userAccountDirectory.addUserAccount(userAccount);
        
        
        return hospitalManagementEcoSystem;
    }
    
}
