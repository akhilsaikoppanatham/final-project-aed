/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author akhilsaikoppanatham
 */
public class WorkQueue {
    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
    public boolean searchRequest(String patientName, String testName) {
        for (WorkRequest request : workRequestList) {
            GarageWorkRequest result = (GarageWorkRequest) request;
            if (result.getAutomobileName().equals(patientName) && result.getTestName().equals(testName)) {
                return true;
            }
        }
        return false;
    }
    
}
