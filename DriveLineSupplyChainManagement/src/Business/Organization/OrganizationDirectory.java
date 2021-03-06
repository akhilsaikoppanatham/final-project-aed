/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author akhilsaikoppanatham
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.DealerOrganization.getValue())){
            organization = new DealerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.AutomobileOrganization.getValue())){
            organization = new AutomobileOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.InspectionOrganization.getValue())){
            organization = new InspectionOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.EnvironmentComplianceCheckOrganization.getValue())){
            organization = new EnvironmentComplianceCheckOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.GarageManagerOrganization.getValue())){
            organization = new GarageManagerOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.GarageMechanicOrganization.getValue())){
            organization = new GarageMechanicOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.SalesManagerOrganization.getValue())){
            organization = new SalesManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.SalesEmployeeOrganization.getValue())){
            organization = new SalesEmployeeOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}