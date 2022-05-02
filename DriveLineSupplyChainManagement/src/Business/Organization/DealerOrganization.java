/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.DealerRole;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author yojanitammineni
 */
public class DealerOrganization extends Organization{

    public DealerOrganization() {
        super(Organization.Type.DealerOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DealerRole());
        return roles;
    }
     
}