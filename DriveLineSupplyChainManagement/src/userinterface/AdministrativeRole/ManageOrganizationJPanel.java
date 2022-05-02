/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.OutletEnterprise;
import Business.Enterprise.GarageEnterprise;
import Business.Enterprise.AutoMechanicEnterprise;
import Business.Enterprise.SalesEnterprise;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akhilsaikoppanatham
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    private OrganizationDirectory directory;
    private JPanel userProcessContainer;
    private Enterprise enterprise;

    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageOrganizationJPanel(JPanel userProcessContainer, OrganizationDirectory directory, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.directory = directory;
        this.enterprise = enterprise;
        populateDropDown();
        populateTable();
        populateCombo();
    }

    /*
    private void populateCombo(){
        organizationJComboBox.removeAllItems();
        for (Type type : Organization.Type.values()){
            if (!type.getValue().equals(Type.Admin.getValue()))
                organizationJComboBox.addItem(type);
        }
    }*/
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        model.setRowCount(0);
        for (Organization organization : directory.getOrganizationList()) {
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            row[1] = organization.getName();

            model.addRow(row);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        addJButton = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setBackground(new java.awt.Color(255, 255, 255));

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        organizationJTable.setSelectionBackground(new java.awt.Color(88, 177, 159));
        jScrollPane1.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        addJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addJButton.setText("Add Organization");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        organizationJComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Organization Type ");

        backJButton.setBackground(new java.awt.Color(88, 177, 159));
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/back.png"))); // NOI18N
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/screening-.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(organizationJComboBox, 0, 200, Short.MAX_VALUE)))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(614, 614, 614))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addJButton)
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void populateCombo() {
        organizationJComboBox.removeAllItems();
        for (Organization.Type type : Organization.Type.values()) {

            if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.OutletEnterprise.getValue())) {
                if (type.getValue().equals(Organization.Type.DealerOrganization.getValue()) || type.getValue().equals(Organization.Type.AutomobileOrganization.getValue())) {
                    organizationJComboBox.addItem(type);
                }
            }
            if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.GarageEnterprise.getValue())) {
                if (type.getValue().equals(Organization.Type.InspectionOrganization.getValue()) || type.getValue().equals(Organization.Type.EnvironmentComplianceCheckOrganization.getValue())) {
                    organizationJComboBox.addItem(type);
                }
            }
            if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.AutoMechanicEnterprise.getValue())) {
                if (type.getValue().equals(Organization.Type.GarageMechanicOrganization.getValue()) || type.getValue().equals(Organization.Type.GarageManagerOrganization.getValue())) {
                    organizationJComboBox.addItem(type);
                }
            }
            if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.SalesEnterprise.getValue())) {
                if (type.getValue().equals(Organization.Type.SalesManagerOrganization.getValue()) || type.getValue().equals(Organization.Type.SalesEmployeeOrganization.getValue())) {
                    organizationJComboBox.addItem(type);
                }
            }
        }
    }

    private void populateDropDown() {
        if (enterprise instanceof OutletEnterprise) {
            if (directory.getOrganizationList().size() >= 2) {
                organizationJComboBox.removeAll();
                organizationJComboBox.setEnabled(false);
            }
        } else if (enterprise instanceof GarageEnterprise) {
            if (directory.getOrganizationList().size() >= 2) {
                organizationJComboBox.removeAll();
                organizationJComboBox.setEnabled(false);
            }
        } else if (enterprise instanceof AutoMechanicEnterprise) {
            if (directory.getOrganizationList().size() >= 2) {
                organizationJComboBox.removeAll();
                organizationJComboBox.setEnabled(false);
            }
        } else if (enterprise instanceof SalesEnterprise) {
            if (directory.getOrganizationList().size() >= 2) {
                organizationJComboBox.removeAll();
                organizationJComboBox.setEnabled(false);
            }
        }

    }

    private void removeItems() {
        organizationJComboBox.removeAll();
        organizationJComboBox.setEnabled(false);
        JOptionPane.showMessageDialog(null, "You cannot add the same organization again. All organizations are created already.");
    }

    private void addItemsInDirectory() {
        Organization.Type type = (Organization.Type) organizationJComboBox.getSelectedItem();
        directory.createOrganization(type);
        populateTable();
        organizationJComboBox.removeItem(organizationJComboBox.getSelectedItem());
        JOptionPane.showMessageDialog(null, "Organization added successfully.");
    }
    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

        // Type type = (Type) organizationJComboBox.getSelectedItem();
        // directory.createOrganization(type);
        // populateTable();
        if (enterprise instanceof OutletEnterprise) {
            if (directory.getOrganizationList().size() == 2) {
                removeItems();
            } else {
                addItemsInDirectory();
            }
        }

        if (enterprise instanceof GarageEnterprise) {
            if (directory.getOrganizationList().size() == 2) {
                removeItems();
            } else {
                addItemsInDirectory();
            }
        }
        
        if (enterprise instanceof AutoMechanicEnterprise) {
            if (directory.getOrganizationList().size() == 2) {
                removeItems();
            } else {
                addItemsInDirectory();
            }
        }
        if (enterprise instanceof SalesEnterprise) {
            if (directory.getOrganizationList().size() == 2) {
                removeItems();
            } else {
                addItemsInDirectory();
            }
        }
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}