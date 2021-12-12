/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MedicalEquipmentWarehouse.Orders;

import MedicalEquipmentWarehouse.MedSupEquip.MedSupEquip;
import MedicalEquipmentWarehouse.MedSupWarehouse;
import java.util.HashMap;

/**
 *
 * @author Shreya
 */
public class Order {
    
    HashMap<MedSupEquip, String> MedSupEquipItemsWithQuantity = new HashMap<>();
    MedSupWarehouse medSupWarehouse;
    String status;
    
    public HashMap<MedSupEquip, String> getMedSupEquipItemsWithQuantity() {
        return MedSupEquipItemsWithQuantity;
    }

    public void setMedSupEquipItemsWithQuantity(HashMap<MedSupEquip, String> MedSupEquipItemsWithQuantity) {
        this.MedSupEquipItemsWithQuantity = MedSupEquipItemsWithQuantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public MedSupWarehouse getMedSupWarehouse() {
        return medSupWarehouse;
    }

    public void setMedSupWarehouse(MedSupWarehouse medSupWarehouse) {
        this.medSupWarehouse = medSupWarehouse;
    }
     public void addItemToOrder(MedSupEquip medSupEquip, String quantity){
         MedSupEquipItemsWithQuantity.put(medSupEquip, quantity);
     }
    
}
