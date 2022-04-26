/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Automobile;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yojanitammineni
 */
public class AutomobileDirectory {
    
    private ArrayList<Automobile> automobilesList;

    public AutomobileDirectory() {
        automobilesList = new ArrayList();
    }

    public ArrayList<Automobile> getAutomobileList() {
        return automobilesList;
    }
     public Automobile createAutomobile(String automobileName, int automobileAge, String fuelType, String automobileClass, String contactNum, String address, String sign,
            String emailAdd, String ownerName, String ownerContact) {
        Automobile automobile = new Automobile();
        automobile.setName(automobileName);
        automobile.setAge(automobileAge);
        automobile.setFuelType(fuelType);
        automobile.setAutomobileType(automobileClass);
        automobile.setContactNum(contactNum);
        automobile.setAddress(address);
        automobile.setSign(sign);
        automobile.setEmailAdd(emailAdd);
        automobile.setOwnerName(ownerName);
        automobile.setOwnerContact(ownerContact);
        automobilesList.add(automobile);
        return automobile;
    
}
}
