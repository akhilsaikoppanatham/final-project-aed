/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SalesManagerRole;
import Business.Role.SalesEmployeeRole;
import java.util.ArrayList;

/**
 *
 * @author akhilsaikoppanatham
 */
public class SalesEmployeeOrganization extends Organization{

    public SalesEmployeeOrganization() {
       super(Organization.Type.SalesEmployeeOrganization.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SalesEmployeeRole());
        return roles;
    }
    
}
