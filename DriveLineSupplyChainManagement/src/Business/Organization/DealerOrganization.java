/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DealerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author akhilsaikoppanatham
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