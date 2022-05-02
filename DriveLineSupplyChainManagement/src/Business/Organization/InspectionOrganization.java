/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.GarageMechanicRole;
import Business.Role.Role;
import Business.Role.InspectionMechanicRole;
import java.util.ArrayList;

/**
 *
 * @author akhilsaikoppanatham
 */
public class InspectionOrganization extends Organization{

    public InspectionOrganization() {
        super(Organization.Type.InspectionOrganization.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InspectionMechanicRole());
        return roles;
    }
     
   
    
    
}
