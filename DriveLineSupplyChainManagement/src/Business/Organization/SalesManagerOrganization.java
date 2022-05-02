/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;
import Business.Role.Role;
import Business.Role.SalesManagerRole;
import java.util.ArrayList;

/**
 *
 * @author nikki
 */
public class SalesManagerOrganization extends Organization {
    
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
