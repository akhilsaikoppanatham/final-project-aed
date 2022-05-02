/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.QARoles.QAWorkAreaJPanel;
import javax.swing.JPanel;
/**
 *
 * @author akhilsaikoppanatham
 */
public class AutomobileRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new QAWorkAreaJPanel(userProcessContainer, account, organization, business);
    }
    
}
