/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.GarageManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author yojanitammineni
 */
public class GarageManagerOrganization {
    public GarageManagerOrganization() {
        super(Type.GarageManagerOrganization.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GarageManagerRole());
        return roles;
    }
     
    
}
