/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author deepankkhurana
 */
public class MedicalBankEnterprise extends Enterprise {

    public MedicalBankEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.MedicalBank);
    }

    public ArrayList<Role> getSupportedRole() {
        return null;
    }

}