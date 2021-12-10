/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.Hospital;

import HospitalManagement.Employee.Employee;
import MainCentralisationSystem.Role.Role;

/**
 *
 * @author prans
 */
public class HospitalUserAccount {
    
//    private String username;
    private String password;
//    private Role role;
//    private WorkQueue workQueue;
    private Hospital hospital;
    
    public HospitalUserAccount(Hospital hospital, String password) {
//        workQueue = new WorkQueue();
        this.hospital = hospital;
        this.password = password;
    }
    
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public Role getRole() {
//        return role;
//    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

//    public void setRole(Role role) {
//        this.role = role;
//    }

    public Employee getEmployee() {
        return employee;
    }

//    public WorkQueue getWorkQueue() {
//        return workQueue;
//    }
    @Override
    public String toString() {
        return employee.getEmployee_id();
    }
}
