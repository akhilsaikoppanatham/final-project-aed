/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GarageManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.AutoMechanicEnterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author akhilsaikoppanatham
 */
public class ManageTestsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount account;
    private Organization researchScientistOrganization;
    private EcoSystem business;

    /**
     * Creates new form ManageVolunteersJPanel
     *
     * @param userProcessContainer
     * @param userAccount
     * @param enterprise
     * @param business
     * @param researchScientistOrganization
     */
    public ManageTestsJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount userAccount, Organization researchScientistOrganization, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = userAccount;
        this.enterprise = enterprise;
        this.researchScientistOrganization = researchScientistOrganization;
        this.business = business;
        valueLabel.setText(enterprise.getName());
        populateTextBoxes();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void populateTextBoxes() {
        AutoMechanicEnterprise researchDepartmentEnterprise = (AutoMechanicEnterprise) enterprise;
        try {
            if (!researchDepartmentEnterprise.getFix().equals("") || researchDepartmentEnterprise.getFix() != null) {

                FixNameTextField.setEnabled(false);
                volunteerNumTextField.setEnabled(false);
                FixType.setEnabled(false);
                minThresholdTextField.setEnabled(false);
                maxThresholdTextField.setEnabled(false);
                FixNameTextField.setText(researchDepartmentEnterprise.getFix());
                volunteerNumTextField.setText(String.valueOf(researchDepartmentEnterprise.getAutomobileNumber()));
                FixType.setSelectedItem(researchDepartmentEnterprise.getFixType());
                minThresholdTextField.setText(String.valueOf(researchDepartmentEnterprise.getMinimumThreshold()));
                maxThresholdTextField.setText(String.valueOf(researchDepartmentEnterprise.getMaximumThreshold()));
                populateDosesComboBox();

            }
        } catch (Exception e) {
        }
    }

    public void removeAll() {
        int itemCount = validationsDropdown.getItemCount();

        for (int i = 0; i < itemCount; i++) {
            validationsDropdown.removeItemAt(0);
        }
    }

    public void populateDosesComboBox() {
        removeAll();
        AutoMechanicEnterprise researchDepartmentEnterprise = (AutoMechanicEnterprise) enterprise;
        for (String dose : researchDepartmentEnterprise.getTestsList()) {
            validationsDropdown.addItem(dose);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        bpTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rrTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tempTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        weightTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pulseTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        bpTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        rrTextField1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tempTextField1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        weightTextField1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        pulseTextField1 = new javax.swing.JTextField();
        yesBtn = new javax.swing.JRadioButton();
        noBtn = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        volunteerNumTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        validationName = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        minThresholdTextField = new javax.swing.JTextField();
        FixNameTextField = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        addValidationButton = new javax.swing.JButton();
        maxThresholdTextField = new javax.swing.JTextField();
        FixType = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        validationsDropdown = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();

        jLabel5.setText("Blood pressure :");

        jLabel6.setText("Respiratory rate:");

        jLabel7.setText("Body temperature");

        jLabel8.setText("Weight");

        jLabel9.setText("Pulse rate:");

        jLabel10.setText("Blood pressure :");

        jLabel11.setText("Respiratory rate:");

        jLabel12.setText("Body temperature");

        jLabel13.setText("Weight");

        jLabel14.setText("Pulse rate:");

        yesBtn.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        yesBtn.setText("Yes");
        yesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesBtnActionPerformed(evt);
            }
        });

        noBtn.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        noBtn.setText("No");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        jLabel4.setText("Interested in Organ Donation?");

        setBackground(new java.awt.Color(255, 255, 255));

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(255, 0, 51));
        valueLabel.setText("<value>");

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(255, 0, 0));
        enterpriseLabel.setText("Enterprise :");

        backJButton.setBackground(new java.awt.Color(88, 177, 159));
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/back.png"))); // NOI18N
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Repair Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Number of Places to be fixed");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Repair Testing Type");

        volunteerNumTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volunteerNumTextFieldActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Validation Name");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Threshold percentage");

        saveBtn.setBackground(new java.awt.Color(88, 177, 159));
        saveBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        addValidationButton.setBackground(new java.awt.Color(88, 177, 159));
        addValidationButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addValidationButton.setText("Add Test Application");
        addValidationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addValidationButtonActionPerformed(evt);
            }
        });

        maxThresholdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxThresholdTextFieldActionPerformed(evt);
            }
        });

        FixType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FixType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Destructive testing", "NonDestructive testing" }));

        jLabel18.setText("Min");

        jLabel19.setText("Max");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        validationsDropdown.setBackground(new java.awt.Color(88, 177, 159));
        validationsDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validationsDropdownActionPerformed(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/Volunteers-Needed.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addGap(504, 504, 504)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(FixType, 0, 1, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(FixNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(volunteerNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(saveBtn)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel18)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(minThresholdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel19)
                                        .addGap(18, 18, 18)
                                        .addComponent(maxThresholdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(validationName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addValidationButton)
                                .addGap(18, 18, 18)
                                .addComponent(validationsDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(FixNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(volunteerNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FixType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(maxThresholdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(minThresholdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveBtn)
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(validationName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addValidationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(validationsDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(124, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        AutoMechanicEnterprise researchDepartmentEnterprise = (AutoMechanicEnterprise) enterprise;
        int doselistSize = researchDepartmentEnterprise.getTestsList().size();

        if (doselistSize < 4) {
            int remaining = 4 - doselistSize;
            JOptionPane.showMessageDialog(null, "Please add atleast 4 Tests for Diagnosis of Automobile. Remaining :" + remaining);
            return;
        }
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
        Component[] comps = this.userProcessContainer.getComponents();
        for (Component comp : comps) {
            if (comp instanceof GarageManagerWorkAreaJPanel) {
                GarageManagerWorkAreaJPanel researchScientistWorkAreaJPanel = (GarageManagerWorkAreaJPanel) comp;
                researchScientistWorkAreaJPanel.populate(minThresholdTextField.getText(), maxThresholdTextField.getText(), volunteerNumTextField.getText());
            }
        }

    }//GEN-LAST:event_backJButtonActionPerformed

    private void yesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yesBtnActionPerformed

    private void volunteerNumTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volunteerNumTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_volunteerNumTextFieldActionPerformed

    private void maxThresholdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxThresholdTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxThresholdTextFieldActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed

        AutoMechanicEnterprise autoMechanicEnterprise = (AutoMechanicEnterprise) enterprise;
        try {
            if (!autoMechanicEnterprise.getFix().equals("") || autoMechanicEnterprise.getFix() != null) {

                JOptionPane.showMessageDialog(null, "Diagnosis rules are aleady defined for for this MechanicEnterprise");
                return;
            }
        } catch (Exception e) {

        }

        if (maxThresholdTextField.getText().equals("") || minThresholdTextField.getText().equals("") || FixNameTextField.getText().equals("")
                || FixType.getSelectedItem().equals("") || volunteerNumTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Fields cannot be empty.");
            return;
        }
        int minAge;
        int maxAge;
        int volNum;
        try {

            minAge = Integer.parseInt(minThresholdTextField.getText());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid min age");
            minThresholdTextField.setText("");
            return;
        }

        try {

            maxAge = Integer.parseInt(maxThresholdTextField.getText());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid max age");
            maxThresholdTextField.setText("");
            return;
        }
        try {

            volNum = Integer.parseInt(volunteerNumTextField.getText());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid volunteer number");
            volunteerNumTextField.setText("");
            return;
        }

        if (volNum == 0) {
            JOptionPane.showMessageDialog(null, "Invalid volunteer number. Required number of volunteers should be greater than zero.");
            volunteerNumTextField.setText("");
            return;
        }

        if (minAge >= maxAge) {
            JOptionPane.showMessageDialog(null, "Minimum age can't be greater than maximum age");
            maxThresholdTextField.setText("");
            minThresholdTextField.setText("");
            return;
        }

        int dialogButton = 0;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Vehicle Diagnosis Rules once saved cannot be changed."
                + "Are you sure you want to save your decision", "Warning", dialogButton);

        if (dialogResult == JOptionPane.YES_OPTION) {

            autoMechanicEnterprise.setMaximumThreshold(Integer.parseInt(maxThresholdTextField.getText()));
            autoMechanicEnterprise.setMinimumThreshold(Integer.parseInt(minThresholdTextField.getText()));
            autoMechanicEnterprise.setFix(FixNameTextField.getText());
            autoMechanicEnterprise.setFixType((String) FixType.getSelectedItem());
            autoMechanicEnterprise.setAutomobileNumber(Integer.parseInt(volunteerNumTextField.getText()));
            JOptionPane.showMessageDialog(null, "Saved successfully.");
            return;
        }

    }//GEN-LAST:event_saveBtnActionPerformed

    private void addValidationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addValidationButtonActionPerformed
        // TODO add your handling code here:
        AutoMechanicEnterprise autoMechanicEnterprise = (AutoMechanicEnterprise) enterprise;
        try {
            if (autoMechanicEnterprise.getFix().equals("") || autoMechanicEnterprise.getFix() == null) {

                JOptionPane.showMessageDialog(null, "Automobile Diagnosis rules not yet defined. Please define Fix before defining Tests");
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Automobile Diagnosis rules not yet defined. Please define Fix before defining Tests");
            return;
        }

        if (validationName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter Valid test");
            return;
        }

        for (String test : autoMechanicEnterprise.getTestsList()) {
            if (test.equals(validationName.getText())) {
                JOptionPane.showMessageDialog(null, "Test already present");
                return;
            }
        }

        try {
            autoMechanicEnterprise.createDose(validationName.getText());
        } catch (Exception e) {
            
        }
        JOptionPane.showMessageDialog(null, "Diagnosis rules saved!");
        validationName.setText("");
        populateDosesComboBox();

    }//GEN-LAST:event_addValidationButtonActionPerformed

    private void validationsDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validationsDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_validationsDropdownActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FixNameTextField;
    private javax.swing.JComboBox<String> FixType;
    private javax.swing.JButton addValidationButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField bpTextField;
    private javax.swing.JTextField bpTextField1;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField maxThresholdTextField;
    private javax.swing.JTextField minThresholdTextField;
    private javax.swing.JRadioButton noBtn;
    private javax.swing.JTextField pulseTextField;
    private javax.swing.JTextField pulseTextField1;
    private javax.swing.JTextField rrTextField;
    private javax.swing.JTextField rrTextField1;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField tempTextField;
    private javax.swing.JTextField tempTextField1;
    private javax.swing.JTextField validationName;
    private javax.swing.JComboBox<String> validationsDropdown;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTextField volunteerNumTextField;
    private javax.swing.JTextField weightTextField;
    private javax.swing.JTextField weightTextField1;
    private javax.swing.JRadioButton yesBtn;
    // End of variables declaration//GEN-END:variables
}
