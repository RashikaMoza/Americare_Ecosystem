/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ClothNgoRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class ClothesNGOOrganization extends Organization{
    
    
    public ClothesNGOOrganization() {
        super(Organization.Type.ClothesNGO.getValue());
    }
    
  @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ClothNgoRole());
        return roles;
    }
     
}