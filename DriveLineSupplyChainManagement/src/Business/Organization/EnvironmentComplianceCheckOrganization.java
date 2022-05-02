/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.EnvironmentCompilanceCheckMechanicRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author akhilsaikoppanatham
 */
public class EnvironmentComplianceCheckOrganization extends Organization{

    public EnvironmentComplianceCheckOrganization() {
        super(Type.EnvironmentComplianceCheckOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new EnvironmentCompilanceCheckMechanicRole());
        return roles;
    }
     
}
