/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SalesManagerRole;
import java.util.ArrayList;

/**
 *
 * @author akhilsaikoppanatham
 */
public class SalesManagerOrganization extends Organization{

    public SalesManagerOrganization() {
       super(Organization.Type.SalesManagerOrganization.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SalesManagerRole());
        return roles;
    }
}
