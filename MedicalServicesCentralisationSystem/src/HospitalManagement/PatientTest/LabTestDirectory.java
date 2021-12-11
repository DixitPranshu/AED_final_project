/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.PatientTest;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author prans
 */
public class LabTestDirectory {
    
    ArrayList<LabTest> labTestList = new ArrayList<>();

    public ArrayList<LabTest> getLabTestList() {
        return labTestList;
    }

    public void setLabTestList(ArrayList<LabTest> labTestList) {
        this.labTestList = labTestList;
    }
    
    public void addTest(LabTest labTest){
        labTestList.add(labTest);
    }
}
