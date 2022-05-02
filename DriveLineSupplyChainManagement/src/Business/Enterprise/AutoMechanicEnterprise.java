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
 * @author akhilsaikoppanatham
 */
public class AutoMechanicEnterprise extends Enterprise {

    private String fix;
    private int automobileNumber;
    private String fixType;
    private int minimumThreshold;
    private int maximumThreshold;
    private ArrayList<String> testsList;

    public AutoMechanicEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.AutoMechanicEnterprise);
        this.testsList = new ArrayList<String>();
    }

    public void createDose(String dose) {

        this.testsList.add(dose);
    }

    public String getFix() {
        return fix;
    }

    public void setFix(String fix) {
        this.fix = fix;
    }

    public int getAutomobileNumber() {
        return automobileNumber;
    }

    public void setAutomobileNumber(int automobileNumber) {
        this.automobileNumber = automobileNumber;
    }

    public String getFixType() {
        return fixType;
    }

    public void setFixType(String fixType) {
        this.fixType = fixType;
    }

    public int getMinimumThreshold() {
        return minimumThreshold;
    }

    public void setMinimumThreshold(int minimumThreshold) {
        this.minimumThreshold = minimumThreshold;
    }

    public int getMaximumThreshold() {
        return maximumThreshold;
    }

    public void setMaximumThreshold(int maximumThreshold) {
        this.maximumThreshold = maximumThreshold;
    }

    public ArrayList<String> getTestsList() {
        return testsList;
    }

    public void setTestsList(ArrayList<String> testsList) {
        this.testsList = testsList;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
