/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author deepankkhurana
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"), Doctor("Doctor"), LabAssistant("Lab Assistant"),
        Donor("Donor"), ClothesNGO("Clothes NGO"), FoodNGO("Food NGO"),
        WarehouseCollection("Collection Warehouse"), WarehouseDistribution("Distribution Warehouse"),
        BloodBank("Blood Bank"),OrganBank("Organ Bank");
        
        private final String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business,
            Network network);

    @Override
    public String toString() {
        String role="";
        switch (this.getClass().getName()) {
            case "Business.Role.AdminRole":
                role = "Admin";
                break;
            case "Business.Role.BloodBankRole":
                role = "Blood Bank Employee";
                break;
            case "Business.Role.ClothNgoRole":
                role = "Clothes NGO Employee";
                break;
            case "Business.Role.DoctorRole":
                role = "Doctor";
                break;
            case "Business.Role.DonorRole":
                role = "Donor";
                break;
            case "Business.Role.FoodNGORole":
                role = "Food NGO Employee";
                break;
            case "Business.Role.LabAssistantRole":
                role = "Lab Assistant";
                break;
            case "Business.Role.OrganBankRole":
                role = "Organ Bank Employee";
                break;
            case "Business.Role.SystemAdminRole":
                role = "System Admin";
                break;
            case "Business.Role.WarehouseCollectionRole":
                role = "Collection warehouse employee";
                break;
            case "Business.Role.WarehouseDistributionRole":
                role = "Distribution warehouse employee";
                break;
        }
        return role;
    }
    
}
