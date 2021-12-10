/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalManagement.PatientTest;

import java.util.HashMap;

/**
 *
 * @author prans
 */
public class TestDetails {
    
    HashMap<String, String> test_name_price = new HashMap<String, String>();

    public HashMap<String, String> getTest_name_price() {
        return test_name_price;
    }

    public void setTest_name_price(HashMap<String, String> test_name_price) {
        this.test_name_price = test_name_price;
    }
}
