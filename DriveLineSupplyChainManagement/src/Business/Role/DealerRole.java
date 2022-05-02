/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DealerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.DealerRole.ManageAutomobilesJPanel;
import javax.swing.JPanel;
import userinterface.DealerRole.DealerWorkAreaJPanel;

/**
 *
 * @author akhilsaikoppanatham
 */
public class DealerRole extends Role{

    @Override
    /*public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DoctorWorkAreaJPanel(userProcessContainer, account, (DoctorOrganization)organization, enterprise);
    }*/
    public JPanel createWorkArea(JPanel rightPanel, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DealerWorkAreaJPanel(rightPanel, enterprise,account, business);
    }
    
}
