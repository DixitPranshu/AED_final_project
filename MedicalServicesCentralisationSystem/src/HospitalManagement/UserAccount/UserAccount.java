/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.UserAccount;

import HospitalManagement.Employee.Employee;
import HospitalManagement.Hospital.Hospital;
import HospitalManagement.Role.Role;

/**
 *
 * @author prans
 */
public class UserAccount {
    
    private String username;
    private String password;
//    private Employee employee;
    private Hospital hospital;
    private Role role;
//    private WorkQueue workQueue;

    public UserAccount(String username, String password, Role role) {
//        workQueue = new WorkQueue();
        this.username = username;
        this.password = password;
        this.role = role;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    public Role getRole() {
        return role;
    }

//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }
//
//    
//
//    public Employee getEmployee() {
//        return employee;
//    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    
//    public WorkQueue getWorkQueue() {
//        return workQueue;
//    }
    @Override
    public String toString() {
        return username;
    }
}
