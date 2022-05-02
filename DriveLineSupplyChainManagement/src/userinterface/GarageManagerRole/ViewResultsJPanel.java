/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GarageManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Automobile.Check;
import Business.Automobile.Automobile;
import Business.WorkQueue.GarageWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Frame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author akhilsaikoppanatham
 */
public class ViewResultsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Enterprise enterprise;
    public int successCountl;

    /**
     * Creates new form ViewResultsJPanel
     *
     * @param userProcessContainer
     * @param account
     * @param enterprise
     * @param business
     */
    public ViewResultsJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.enterprise = enterprise;
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        successCountl = 0;
        populateTable();
        populateTable1();

    }

    public void populateTable1() {
        DefaultTableModel model = (DefaultTableModel) FailureTable.getModel();
        Enterprise e1 = this.enterprise;
        model.setRowCount(0);
        Object[] row = new Object[7];
        Enterprise.EnterpriseType type = Enterprise.EnterpriseType.OutletEnterprise;
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise.getEnterpriseType() == type) {
                    enterprise.getOrganizationDirectory().getOrganizationList().stream().filter((organization)
                            -> (organization.getName().equals("AutomobileOrganization"))).forEachOrdered((organization) -> {

                        for (Automobile automobile : organization.getAutomobileDirectory().getAutomobileList()) {
                            try {
                                if (automobile.getSelectedBy().equals(e1.getName())) {

                                    Check check1 = automobile.searchCheck("Check1");
                                    Check check2 = automobile.searchCheck("Check2");
                                    Check check3 = automobile.searchCheck("Check3");
                                    Check check4 = automobile.searchCheck("Check4");
                                    try {
                                        if (automobile.getGarageStatus().equals("failed")) {
                                            row[0] = automobile;
                                            row[1] = automobile.getAge();
                                            row[2] = check1.getCheckStatus();
                                            row[3] = check2.getCheckStatus();
                                            row[4] = check3.getCheckStatus();
                                            row[5] = check4.getCheckStatus();
                                            row[6] = "failed";
                                            model.addRow(row);
                                        }
                                        //model.addRow(row);
                                    } catch (Exception e) {

                                    }
                                }
                            } catch (Exception e) {

                            }
                        }
                    });
                }
            }
        }
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) ResultsJTable.getModel();
        Enterprise e1 = this.enterprise;
        model.setRowCount(0);
        Object[] row = new Object[7];
        Enterprise.EnterpriseType type = Enterprise.EnterpriseType.OutletEnterprise;
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise.getEnterpriseType() == type) {
                    enterprise.getOrganizationDirectory().getOrganizationList().stream().filter((organization)
                            -> (organization.getName().equals("AutomobileOrganization"))).forEachOrdered((organization) -> {
                        for (Automobile automobile : organization.getAutomobileDirectory().getAutomobileList()) {
                            try {
                                if (automobile.getSelectedBy().equals(e1.getName())) {
                                    Check check1 = automobile.searchCheck("Check1");
                                    Check check2 = automobile.searchCheck("Check2");
                                    Check check3 = automobile.searchCheck("Check3");
                                    Check check4 = automobile.searchCheck("Check4");
                                    try {
                                        if ((check1.getCheckStatus().equals("success") || check1.getCheckStatus().equals("failure"))
                                                && (check2.getCheckStatus().equals("success") || check2.getCheckStatus().equals("failure"))
                                                && (check3.getCheckStatus().equals("success") || check3.getCheckStatus().equals("failure"))
                                                && (check4.getCheckStatus().equals("success") || check4.getCheckStatus().equals("failure"))) {
                                            row[0] = automobile;
                                            row[1] = automobile.getAge();
                                            row[2] = check1.getCheckStatus();
                                            row[3] = check2.getCheckStatus();
                                            row[4] = check3.getCheckStatus();
                                            row[5] = check4.getCheckStatus();
                                            if ((check1.getCheckStatus().equals("success")) && (check2.getCheckStatus().equals("success")) && (check3.getCheckStatus().equals("success"))
                                                    && (check4.getCheckStatus().equals("success"))) {
                                                row[6] = "success";
                                                successCountl++;
                                            } else {
                                                if ((check1.getCheckStatus().equals("failure")) || (check2.getCheckStatus().equals("failure")) || (check3.getCheckStatus().equals("failure"))
                                                        || (check4.getCheckStatus().equals("failure"))) {
                                                    row[6] = "failure";
                                                }

                                            }

                                            model.addRow(row);
                                        }
                                    } catch (Exception e) {

                                    }
                                }
                            } catch (Exception e) {

                            }
                        }
                    });
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        processJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ResultsJTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        pieButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        FailureTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        processJButton.setBackground(new java.awt.Color(88, 177, 159));
        processJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        processJButton.setText("View LineChart");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        ResultsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Automobile Name", "Car Age", "Check1", "Check2", "Check3", "Check4", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ResultsJTable.setSelectionBackground(new java.awt.Color(88, 177, 159));
        jScrollPane1.setViewportView(ResultsJTable);

        jButton1.setBackground(new java.awt.Color(88, 177, 159));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/back.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        pieButton.setBackground(new java.awt.Color(88, 177, 159));
        pieButton.setText("View PieChart");
        pieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pieButtonActionPerformed(evt);
            }
        });

        FailureTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Automobile Name", "Car Age", "Check1", "Check2", "Check3", "Check4", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        FailureTable.setSelectionBackground(new java.awt.Color(88, 177, 159));
        jScrollPane2.setViewportView(FailureTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Automobiles Failed QA");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Automobiles Passed QA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton1)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(456, 456, 456)
                        .addComponent(processJButton)
                        .addGap(35, 35, 35)
                        .addComponent(pieButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(746, 746, 746))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processJButton)
                    .addComponent(pieButton))
                .addGap(154, 154, 154)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public int getFailedCount() {
        Enterprise.EnterpriseType type = Enterprise.EnterpriseType.OutletEnterprise;
        Enterprise e1 = this.enterprise;
        int failedCount = 0;
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise.getEnterpriseType() == type) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization.getName().equals("AutomobileOrganization")) {

                            for (Automobile automobile : organization.getAutomobileDirectory().getAutomobileList()) {
                                try {
                                    if (automobile.getGarageStatus().equals("failed") && automobile.isPotentialAutomobile() == true && automobile.getSelectedBy().equals(e1.getName())) {
                                        failedCount = failedCount + 1;
                                    }
                                } catch (Exception e) {
                                }
                            }
                        }
                    }
                }
            }

        }
        return failedCount;
    }

    public int getVolunteerCount() {
        Enterprise.EnterpriseType type = Enterprise.EnterpriseType.OutletEnterprise;
        Enterprise e1 = this.enterprise;
        int automobileCount = 0;
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise.getEnterpriseType() == type) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization.getName().equals("AutomobileOrganization")) {

                            for (Automobile automobile : organization.getAutomobileDirectory().getAutomobileList()) {
                                try {
                                    if (automobile.isPotentialAutomobile() == true && automobile.getSelectedBy().equals(e1.getName())) {
                                        automobileCount = automobileCount + 1;
                                    }
                                } catch (Exception e) {
                                }
                            }
                        }
                    }
                }
            }

        }
        return automobileCount;
    }

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = ResultsJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.");
            return;
        }

        Automobile automobile = (Automobile) ResultsJTable.getValueAt(selectedRow, 0);
        if (findRequest1() == false && findRequest2() == false && findRequest3() == false && findRequest4() == false) {
            JOptionPane.showMessageDialog(null, "All the requested Vechicle Diagnostic Reports have not been recieved yet.");
            return;
        }
        LineChart_AWT chart = new LineChart_AWT(automobile,
                "Vehicla ePerformance Indicator vs Checks",
                "Engine Performace Improvement");
        chart.pack();
        RefineryUtilities.centerFrameOnScreen(chart);
        chart.setVisible(true);
    }//GEN-LAST:event_processJButtonActionPerformed
    public boolean findRequest1() {
        int selectedRow = ResultsJTable.getSelectedRow();
        Automobile automobile = (Automobile) ResultsJTable.getValueAt(selectedRow, 0);
        Enterprise.EnterpriseType type = Enterprise.EnterpriseType.GarageEnterprise;
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise.getEnterpriseType() == type) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization.getName().equals("InspectionOrganization")) {
                            for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
                                GarageWorkRequest garageWorkRequest = (GarageWorkRequest) request;
                                String testName1 = ((GarageWorkRequest) request).getTestName();
                                if (automobile.getName().equals(garageWorkRequest.getAutomobileName())) {
                                    if (testName1.equals("Performance Test1")) {
                                        try {
                                            if (request.getStatus().equals("Completed")) {
                                                return true;
                                            }
                                        } catch (Exception e) {

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean findRequest2() {
        int selectedRow = ResultsJTable.getSelectedRow();
        Automobile automobile = (Automobile) ResultsJTable.getValueAt(selectedRow, 0);
        Enterprise.EnterpriseType type = Enterprise.EnterpriseType.GarageEnterprise;
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise.getEnterpriseType() == type) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization.getName().equals("InspectionOrganization")) {
                            for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
                                GarageWorkRequest garageWorkRequest = (GarageWorkRequest) request;
                                String testName1 = ((GarageWorkRequest) request).getTestName();
                                if (automobile.getName().equals(garageWorkRequest.getAutomobileName())) {
                                    if (testName1.equals("Performance Test2")) {
                                        try {
                                            if (request.getStatus().equals("Completed")) {
                                                return true;
                                            }
                                        } catch (Exception e) {

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean findRequest3() {
        int selectedRow = ResultsJTable.getSelectedRow();
        Automobile automobile = (Automobile) ResultsJTable.getValueAt(selectedRow, 0);
        Enterprise.EnterpriseType type = Enterprise.EnterpriseType.GarageEnterprise;
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise.getEnterpriseType() == type) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization.getName().equals("InspectionOrganization")) {
                            for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
                                GarageWorkRequest garageWorkRequest = (GarageWorkRequest) request;
                                String testName1 = ((GarageWorkRequest) request).getTestName();
                                if (automobile.getName().equals(garageWorkRequest.getAutomobileName())) {
                                    if (testName1.equals("Performance Test3")) {
                                        try {
                                            if (request.getStatus().equals("Completed")) {
                                                return true;
                                            }
                                        } catch (Exception e) {

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean findRequest4() {

        int selectedRow = ResultsJTable.getSelectedRow();
        Automobile automobile = (Automobile) ResultsJTable.getValueAt(selectedRow, 0);
        Enterprise.EnterpriseType type = Enterprise.EnterpriseType.GarageEnterprise;

        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise.getEnterpriseType() == type) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization.getName().equals("InspectionOrganization")) {
                            for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
                                GarageWorkRequest labTestWorkRequest = (GarageWorkRequest) request;
                                String testName1 = ((GarageWorkRequest) request).getTestName();
                                if (automobile.getName().equals(labTestWorkRequest.getAutomobileName())) {
                                    if (testName1.equals("Performance Test4")) {
                                        try {
                                            if (request.getStatus().equals("Completed")) {
                                                return true;
                                            }
                                        } catch (Exception e) {

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pieButtonActionPerformed
        // TODO add your handling code here:
        Frame frame = new Frame();
        int successCount = successCountl;
        int failedCount = getFailedCount();
        if (successCount == 0 && failedCount == 0) {
            JOptionPane.showMessageDialog(null, "No volunteers yet");
            return;
        }
        DefaultPieDataset pieDataSet = new DefaultPieDataset();
        pieDataSet.setValue("Volunteers Success Count", successCount);
        pieDataSet.setValue("Volunteers Failure Count", failedCount);
        JFreeChart chart = ChartFactory.createPieChart("Pie Chart", pieDataSet, true, true, true);

        ChartPanel cpp = new ChartPanel(chart);
        frame.add(cpp);

        frame.pack();
        frame.setVisible(true);
        cpp.setSize(600, 600);
        cpp.setVisible(true);
        pieButton.setEnabled(false);
    }//GEN-LAST:event_pieButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable FailureTable;
    private javax.swing.JTable ResultsJTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton pieButton;
    private javax.swing.JButton processJButton;
    // End of variables declaration//GEN-END:variables
}
