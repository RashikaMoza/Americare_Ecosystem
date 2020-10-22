/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Inventory.InventoryDirectory;
import Business.Role.Role;
import Business.Role.WarehouseCollectionRole;
import java.util.ArrayList;

/**
 *
 * @author deepankkhurana
 */
public class WarehouseCollectionOrganization extends Organization{
    private InventoryDirectory inventoryDirectory;
    
    public WarehouseCollectionOrganization() {
        super(Organization.Type.WarehouseCollection.getValue());
        inventoryDirectory = new InventoryDirectory();
    }
    
    

    public InventoryDirectory getInventoryDirectory() {
        return inventoryDirectory;
    }

    public void setInventoryDirectory(InventoryDirectory inventory) {
        this.inventoryDirectory = inventory;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new WarehouseCollectionRole());
        return roles;
    }
     
}

