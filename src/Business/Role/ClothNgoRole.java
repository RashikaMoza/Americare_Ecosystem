/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.BloodBankOrganization;
import Business.Organization.ClothesNGOOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.BloodBankRole.BloodBankRoleWorkAreaPanel;
import userInterface.ClothNgoRole.ClothesNGORoleWorkAreaPanel;

/**
 *
 * @author deepankkhurana
 */
public class ClothNgoRole extends Role {
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, Network network) {
        return new ClothesNGORoleWorkAreaPanel(userProcessContainer, account, (ClothesNGOOrganization)organization, enterprise, system, network);
    }
}
