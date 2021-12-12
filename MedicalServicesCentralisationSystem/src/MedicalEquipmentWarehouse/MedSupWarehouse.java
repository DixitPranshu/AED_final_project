/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MedicalEquipmentWarehouse;

import MainCentralisationSystem.UserAccountDirectory;

import java.util.HashMap;

/**
 *
 * @author Shreya
 */
public class MedSupWarehouse {
    
    String medSupWarehouseId;
    String medSupWarehouseName;
    
    UserAccountDirectory UserAccountDirectory;
    
    
    
    public MedSupWarehouse(String medSupWarehouseId, String medSupWarehouseName){
        this.medSupWarehouseId = medSupWarehouseId;
        this.medSupWarehouseName = medSupWarehouseName;
    }
    
    public String getMedSupWarehouseName() {
        return medSupWarehouseName;
    }

    public void setMedSupWarehouseName(String medSupWarehouseName) {
        this.medSupWarehouseName = medSupWarehouseName;
    }
    
    
    
     public String getMedSupWarehouseId() {
        return medSupWarehouseId;
    }

    public void setMedSupWarehouseId(String medSupWarehouseId) {
        this.medSupWarehouseId = medSupWarehouseId;
    }
    
    
    
    
    
    @Override
    public String toString(){
        return medSupWarehouseName;
    }
    
}
