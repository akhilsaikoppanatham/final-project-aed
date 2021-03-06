/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GarageManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.AutoMechanicEnterprise;
import Business.Organization.Organization;
import Business.Organization.GarageManagerOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author akhilsaikoppanatham
 */
public class GarageManagerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private GarageManagerOrganization researchScientistOrganization;
    private Enterprise enterprise;
    private String minAge;
    private String maxAge;
    private String numOfVolunteers;

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     *
     * @param userProcessContainer
     * @param account
     * @param organization
     * @param business
     */
    public GarageManagerWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.researchScientistOrganization = (GarageManagerOrganization) organization;
        this.enterprise = enterprise;

    }

    void populate(String minAge, String maxAge, String numOfVolunteers) {
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.numOfVolunteers = numOfVolunteers;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        manageVaccineAttribute = new javax.swing.JButton();
        manageVolunteers = new javax.swing.JButton();
        viewResults = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageVaccineAttribute.setBackground(new java.awt.Color(88, 177, 159));
        manageVaccineAttribute.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        manageVaccineAttribute.setText("Manage Automobile Repairs");
        manageVaccineAttribute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageVaccineAttributeActionPerformed(evt);
            }
        });
        add(manageVaccineAttribute, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        manageVolunteers.setBackground(new java.awt.Color(88, 177, 159));
        manageVolunteers.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        manageVolunteers.setText("Manage Garage Warehouse");
        manageVolunteers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageVolunteersActionPerformed(evt);
            }
        });
        add(manageVolunteers, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 200, -1));

        viewResults.setBackground(new java.awt.Color(88, 177, 159));
        viewResults.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        viewResults.setText("View Garage Statistics");
        viewResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewResultsActionPerformed(evt);
            }
        });
        add(viewResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 200, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/organization.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 540, 550));
    }// </editor-fold>//GEN-END:initComponents

    private void manageVaccineAttributeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageVaccineAttributeActionPerformed
        // TODO add your handling code here:
        ManageTestsJPanel manageVaccineJPanel = new ManageTestsJPanel(userProcessContainer, enterprise, userAccount, researchScientistOrganization, business);
        userProcessContainer.add("ManageVaccineJPanel", manageVaccineJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageVaccineAttributeActionPerformed

    private void manageVolunteersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageVolunteersActionPerformed
        // TODO add your handling code here:
        AutoMechanicEnterprise researchDepartmentEnterprise = (AutoMechanicEnterprise) enterprise;
        try {
            if (researchDepartmentEnterprise.getFix().equals("") || researchDepartmentEnterprise.getFix() == null) {

                JOptionPane.showMessageDialog(null, "Vaccine is not defined yet. Please define vaccine and doses");
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vaccine is not defined yet. Please define vaccine and doses");
            return;
        }
        ManageAutomobilesJPanel manageVolunteersJPanel = new ManageAutomobilesJPanel(userProcessContainer, enterprise, userAccount, researchScientistOrganization, business, minAge, maxAge, numOfVolunteers);
        userProcessContainer.add("manageVolunteersJPanel", manageVolunteersJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageVolunteersActionPerformed

    private void viewResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewResultsActionPerformed
        // TODO add your handling code here:

        AutoMechanicEnterprise researchDepartmentEnterprise = (AutoMechanicEnterprise) enterprise;
        try {
            if (researchDepartmentEnterprise.getFix().equals("") || researchDepartmentEnterprise.getFix() == null) {

                JOptionPane.showMessageDialog(null, "Vaccine is not defined yet. Please define vaccine and doses");
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vaccine is not defined yet. Please define vaccine and doses");
            return;
        }
        ViewResultsJPanel ViewResultsJPanel = new ViewResultsJPanel(userProcessContainer, userAccount, enterprise, business);
        userProcessContainer.add("ViewResultsJPanel", ViewResultsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewResultsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton manageVaccineAttribute;
    private javax.swing.JButton manageVolunteers;
    private javax.swing.JButton viewResults;
    // End of variables declaration//GEN-END:variables
}
