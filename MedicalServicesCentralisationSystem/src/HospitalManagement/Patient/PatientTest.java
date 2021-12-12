/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.Patient;

import HospitalManagement.PatientTest.LabTest;
import java.util.HashMap;

/**
 *
 * @author prans
 */
public class PatientTest {
    
    String test_date;
    String report_avalaible;
    HashMap<String, LabTest> patient_test_list = new HashMap<>();

    public String getTest_date() {
        return test_date;
    }

    public void setTest_date(String test_date) {
        this.test_date = test_date;
    }

    public HashMap<String, LabTest> getPatient_test_list() {
        return patient_test_list;
    }

    public void setPatient_test_list(HashMap<String, LabTest> patient_test_list) {
        this.patient_test_list = patient_test_list;
    }

    public String getReport_avalaible() {
        return report_avalaible;
    }

    public void setReport_avalaible(String report_avalaible) {
        this.report_avalaible = report_avalaible;
    }
    
    
}
