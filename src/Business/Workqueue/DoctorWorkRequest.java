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
public class DoctorWorkRequest extends WorkRequest{
    private String donationType;
    private String description;
    private String RequestedBy;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public String toString(){
       return  donationType ;
    }
    
}
    

