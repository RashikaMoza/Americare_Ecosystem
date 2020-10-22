/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Workqueue;

import java.util.ArrayList;

/**
 *
 * @author deepankkhurana
 */
public class WorkQueue {
    private  ArrayList<WorkRequest> workRequestList;
    private  ArrayList<AcceptDonationWorkRequest> donationWorkRequestList;
    private  ArrayList<CollectDonationWorkRequest> collectionWorkRequestList;
    private  ArrayList<DoctorWorkRequest> doctorWorkRequestList;
    private  ArrayList<LabWorkRequest> labWorkRequestList;
    private ArrayList<DistributeDonationWorkRequest> distributionWorkRequestList;


    public WorkQueue() {
        workRequestList = new ArrayList();
        donationWorkRequestList = new ArrayList();
        collectionWorkRequestList = new ArrayList();
        doctorWorkRequestList = new ArrayList();
        labWorkRequestList = new ArrayList();
        distributionWorkRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
    public ArrayList<AcceptDonationWorkRequest> getDonationWorkRequestList() {
        return donationWorkRequestList;
    }

    public ArrayList<CollectDonationWorkRequest> getCollectionWorkRequestList() {
        return collectionWorkRequestList;
    }

    public ArrayList<DoctorWorkRequest> getDoctorWorkRequestList() {
        return doctorWorkRequestList;
    }

    public ArrayList<LabWorkRequest> getLabWorkRequestList() {
        return labWorkRequestList;
    }

    public ArrayList<DistributeDonationWorkRequest> getDistributionWorkRequestList() {
        return distributionWorkRequestList;
    }

    public void setDistributionWorkRequestList(ArrayList<DistributeDonationWorkRequest> distributionRequestList) {
        this.distributionWorkRequestList = distributionRequestList;
    }
}