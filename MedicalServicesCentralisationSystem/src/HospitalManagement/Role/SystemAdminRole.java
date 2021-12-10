/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.Role;

import HospitalManagement.HospitalManagementEcoSystem;
import HospitalManagement.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author prans
 */
public class SystemAdminRole extends Role {

    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, HospitalManagementEcoSystem hospitalManagementEcoSystem) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, hospitalManagementEcoSystem);
    }
    
}
