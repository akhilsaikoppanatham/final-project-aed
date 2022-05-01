/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author yojanitammineni
 */
public class EnvironmentComplianceCheckOrganization {
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
