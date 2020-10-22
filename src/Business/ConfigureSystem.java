/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author deepankkhurana
 */
public class ConfigureSystem {
   public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
       Employee employee = system.getEmployeeDirectory().createEmployee("GSS");

        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole() {});
return system;
   }
}
