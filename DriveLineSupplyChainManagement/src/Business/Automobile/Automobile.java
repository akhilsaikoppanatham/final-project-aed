/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Automobile;

import java.util.ArrayList;
import Business.UserAccount.UserAccount;

/**
 *
 * @author yojanitammineni
 */
public class Automobile {
    private String ownerName;
    private String ownerContact;
    private String name;
    private int age;
    private String fuelType;
    private String automobileType;
    private String contactNum;
    private String address;
    private String sign;
    private String emailAdd;
    private String date;
    private String network;
    private ArrayList<Specifications> specificationList;
    private Specifications currentSpecification;
    private ArrayList<Check> checkList;
    private boolean potentialAutomobile;
    private String selectedBy;
    private String garageStatus;
    private UserAccount assignedDealer;
    private String status;
    
    public UserAccount getAssignedDealer() {
        return assignedDealer;
    }

    public void setAssignedDealer(UserAccount assignedDealer) {
        this.assignedDealer = assignedDealer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGarageStatus() {
        return garageStatus;
    }

    public void setGarageStatus(String garageStatus) {
        this.garageStatus = garageStatus;
    }

    public Check createCheck() {
        Check check = new Check();
        checkList.add(check);
        return check;
    }

    public ArrayList<Check> getCheckList() {
        return checkList;
    }

    public void setCheckList(ArrayList<Check> checkList) {
        this.checkList = checkList;
    }

    public String getSelectedBy() {
        return selectedBy;
    }

    public void setSelectedBy(String selectedBy) {
        this.selectedBy = selectedBy;
    }

    public boolean isPotentialAutomobile() {
        return potentialAutomobile;
    }

    public void setAutomobile(boolean volunteer) {
        this.potentialAutomobile = volunteer;
    }

    public Automobile() {
        this.specificationList = new ArrayList<Specifications>();
        this.checkList = new ArrayList<Check>();
    }

    public Check searchCheck(String checkName) {
        for (Check check : checkList) {
            if (check.getCheckName().equals(checkName)) {
                return check;
            }
        }
        return null;
    }

    public ArrayList<Specifications> getSpecificationHistory() {
        return specificationList;
    }

    public void setSpecificationHistory(ArrayList<Specifications> specificationList) {
        this.specificationList = specificationList;
    }

    public Specifications getCurrentSpecification() {
        return currentSpecification;
    }

    public void setCurrentSpecification(Specifications currVital) {
        this.currentSpecification = currVital;
    }

    public Specifications newSpecification(Specifications s) {
        specificationList.add(s);
        Specifications newSpec = new Specifications();
        this.currentSpecification = newSpec;
        return newSpec;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getAutomobileType() {
        return automobileType;
    }

    public void setAutomobileType(String automobileType) {
        this.automobileType = automobileType;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getEmailAdd() {
        return emailAdd;
    }

    public void setEmailAdd(String emailAdd) {
        this.emailAdd = emailAdd;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerContact() {
        return ownerContact;
    }

    public void setOwnerContact(String ownerContact) {
        this.ownerContact = ownerContact;
    }
    
    public boolean isAutomobileInGoodCondition(double age, int r, int h, int b, float wk, float temp) {
//        if ((age >= 0.08) && (age < 1)) {
//            return (r >= 20) && (r < 30) && (h >= 80) && (h < 140) && (b >= 70) && (b < 100) && (wk >= 4) && (wk < 10) && (temp >= 97.5) && (temp < 100.4);
//
//        }
//        if ((age >= 1) && (age < 3)) {
//            return (r >= 20) && (r < 30) && (h >= 80) && (h < 130) && (b >= 80) && (b < 110) && (wk >= 10) && (wk < 14) && (temp >= 97.5) && (temp < 100.4);
//        }
//
//        if ((age >= 3) && (age <= 5)) {
//            return (r >= 20) && (r < 30) && (h >= 80) && (h < 120) && (b >= 80) && (b < 110) && (wk >= 14) && (wk < 18) && (temp >= 98.6) && (temp < 99.5);
//        }
//
//        if ((age >= 6) && (age <= 12)) {
//            return (r >= 20) && (r < 30) && (h >= 70) && (h < 110) && (b >= 80) && (b < 120) && (wk >= 20) && (wk < 42) && (temp >= 98.6) && (temp < 99.5);
//
//        }
//        if (age >= 13) {
//            return (r >= 12) && (r < 20) && (h >= 55) && (h < 105) && (b >= 110) && (b < 120) && (wk > 50) && (temp >= 97.7) && (temp < 98.5);
//
//        } else {
//            return (r >= 30) && (r < 50) && (h >= 120) && (h < 160) && (b >= 50) && (b < 70) && (wk >= 2) && (wk < 3) && (temp >= 97.7) && (temp < 98.5);
//        }
        return true;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    
}
