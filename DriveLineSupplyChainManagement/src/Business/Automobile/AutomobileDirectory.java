/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Automobile;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author akhilsaikoppanatham
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
