/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;
import Business.Role.GarageMechanicRole;
import Business.Role.Role;
import Business.Role.InspectionMechanicRole;
import java.util.ArrayList;

/**
 *
 * @author nikki
 */
public class InspectionOrganization extends Organization {
     public InspectionOrganization() {
        super(Organization.Type.InspectionOrganization.getValue());
    }
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InspectionMechanicRole());
        return role;
    }
     
}
