/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Donor.DonorDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Network.Network;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.Workqueue.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author deepankkhurana
 */
public abstract class Organization {
   private String name;
    private WorkQueue workQueue;
    private DonorDirectory donorDir;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;

    
 public enum Type{
        Admin("Admin Organization"), Doctor("Doctor Organization"), Lab("Lab Organization"),
        Donor("Donor Organization"), FoodNGO("Food NGO Organization"), ClothesNGO("Clothes NGO Organization"),
        BloodBank("Blood Bank"), OrganBank("Organ Bank"), 
        WarehouseCollection("Warehouse Collection Organization"), WarehouseDistribution("Warehouse Distribution Organization") ;
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        donorDir = new DonorDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public DonorDirectory getDonorDir() {
        return donorDir;
    }

    public void setDonorDir(DonorDirectory donorDir) {
        this.donorDir = donorDir;
    }
    

    @Override
    public String toString() {
        return name;
    }
    
}
