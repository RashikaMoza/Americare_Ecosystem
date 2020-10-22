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
public class LabWorkRequest extends WorkRequest{
    private String requestedBy;
    private String testType;
    private String description;
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
        return requestedBy;
    }

    public void setRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return testType;
    }
    
    
    
}

