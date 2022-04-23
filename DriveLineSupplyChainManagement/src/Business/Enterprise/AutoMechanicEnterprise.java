/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author nikki
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

    
