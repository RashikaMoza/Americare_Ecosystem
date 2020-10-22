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
import Business.Organization.DonorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.BloodBankRole.BloodBankRoleWorkAreaPanel;
import userInterface.DonorRole.DonorWorkAreaPanel;


/**
 *
 * @author deepankkhurana
 */


public class DonorRole extends Role{
 

    public DonorWorkAreaPanel createWorkArea(JPanel userProcessData, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, Network network) {
        return new DonorWorkAreaPanel(userProcessData, account, (DonorOrganization)organization, enterprise, system, network);
    }

}
