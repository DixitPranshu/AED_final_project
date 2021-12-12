/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.Patient;

import HospitalManagement.PatientTest.LabTest;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author prans
 */
public class Patient {
 
    
    String patient_id;
    String patient_name;
    String patient_phone_number;
    ArrayList<PatientTest> patientTestList = new ArrayList<>();
    
    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getPatient_phone_number() {
        return patient_phone_number;
    }

    public void setPatient_phone_number(String patient_phone_number) {
        this.patient_phone_number = patient_phone_number;
    }

    public ArrayList<PatientTest> getPatientTestList() {
        return patientTestList;
    }

    public void setPatientTestList(ArrayList<PatientTest> patientTestList) {
        this.patientTestList = patientTestList;
    }
    
    @Override
    public String toString(){
        return patient_id;
    }

    
}
