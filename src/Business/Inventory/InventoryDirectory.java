/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

import java.util.ArrayList;

/**
 *
 * @author deepankkhurana
 */
public class InventoryDirectory {

    private ArrayList<InventoryDetails> inventory;

    public InventoryDirectory() {
        inventory = new ArrayList<>();
    }

    public ArrayList<InventoryDetails> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<InventoryDetails> inventory) {
        this.inventory = inventory;
    }

    public InventoryDetails createInventory(int donationId, String donationType, String description, int quantity) {
        InventoryDetails inventory = new InventoryDetails();
        inventory.setDonationId(donationId);
        inventory.setDonationType(donationType);
        inventory.setDescription(description);
        inventory.setQuantity(quantity);
        this.inventory.add(inventory);
        return inventory;
    }
}