/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.GarageMechanicRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author akhilsaikoppanatham
 */
public class GarageMechanicOrganization extends Organization{

    public GarageMechanicOrganization() {
        super(Type.GarageMechanicOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GarageMechanicRole());
        return roles;
    }
     
}
