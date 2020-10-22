/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Workqueue;

/**
 *
 * @author deepankkhurana
 */
public class CollectDonationWorkRequest extends WorkRequest{
    private int donationId; // donor id
    private String donorName;
    private String donorAddress;
    private String donorContactNumber;
    private String RequestedBy;
    private String donationType;
    private String donorEmailId;
    private String network;

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getDonorEmailId() {
        return donorEmailId;
    }

    public void setDonorEmailId(String donorEmailId) {
        this.donorEmailId = donorEmailId;
    }

    public String getDonorName() {
        return donorName;
    }

    public int getDonationId() {
        return donationId;
    }

    public void setDonationId(int donationId) {
        this.donationId = donationId;
    }
    
    

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public String getDonorAddress() {
        return donorAddress;
    }

    public void setDonorAddress(String donorAddress) {
        this.donorAddress = donorAddress;
    }

    public String getDonorContactNumber() {
        return donorContactNumber;
    }

    public void setDonorContactNumber(String donorContactNumber) {
        this.donorContactNumber = donorContactNumber;
    }

    public String getRequestedBy() {
        return RequestedBy;
    }

    public void setRequestedBy(String RequestedBy) {
        this.RequestedBy = RequestedBy;
    }

    public String getDonationType() {
        return donationType;
    }

    public void setDonationType(String donationType) {
        this.donationType = donationType;
    }

    @Override
    public String toString() {
        return donorName;
    }
    
    
    
}


