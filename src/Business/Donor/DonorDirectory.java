/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Donor;

import java.util.ArrayList;
import Business.Employee.Employee;

/**
 *
 * @author deepankkhurana
 */
public class DonorDirectory {
    private ArrayList<Donor> donorList;

    public DonorDirectory() {
        donorList = new ArrayList();
    }

    public ArrayList<Donor> getDonorList() {
        return donorList;
    }

    public Donor createDonor(String name, String emailid, String contactNumber, String address,
        String donationType, String bloodGrp, String organType, String network) {
            Donor donor = new Donor();
            donor.setName(name);
            donor.setEmailid(emailid);
            donor.setContactNumber(contactNumber);
            donor.setAddress(address);
            donor.setDonationType(donationType);
            donor.setBloodGrp(bloodGrp);
            donor.setOrganType(organType);
            donor.setNetwork(network);
            donorList.add(donor);
            return donor;
        }
    
}
