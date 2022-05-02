/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GarageMechanicRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.GarageEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.GarageMechanicOrganization;
import Business.Organization.InspectionOrganization;
import Business.UserAccount.UserAccount;
import Business.Automobile.Check;
import Business.Automobile.Automobile;
import Business.Automobile.Week;
import Business.WorkQueue.GarageWorkRequest;
import Business.WorkQueue.garageMechanicWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author akhilsaikoppanatham
 */


public class Check3JPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private GarageMechanicOrganization researchAssistantOrganization;
    private Enterprise enterprise;
    
    public Check3JPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.enterprise=enterprise;
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.researchAssistantOrganization = (GarageMechanicOrganization)organization;
        populateTable();
    }

    
    
    public void populateTable(){
      DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
      model.setRowCount(0);
      for (WorkRequest request: researchAssistantOrganization.getWorkQueue().getWorkRequestList()) {
          garageMechanicWorkRequest researchAssistantWorkRequest=(garageMechanicWorkRequest)request;
       Object[] row = new Object[12];
       Enterprise.EnterpriseType type = Enterprise.EnterpriseType.OutletEnterprise;
       if (request.getReceiver().equals(userAccount)) {

        for (Network network: business.getNetworkList()) {
         for (Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()) {
          if (enterprise.getEnterpriseType() == type) {
           enterprise.getOrganizationDirectory().getOrganizationList().stream().filter((organization) 
                   -> (organization.getName().equals("AutomobileOrganization"))).forEachOrdered((organization) -> {
             for (Automobile v: organization.getAutomobileDirectory().getAutomobileList()) {
                  if(v.getName().equals(researchAssistantWorkRequest.getAutomobileName())){
                 Check phase1 = v.searchCheck("Phase1");
                 Check phase2 = v.searchCheck("Phase2");
              Check phase = v.searchCheck("Phase3");
            try{  if ((phase1.getCheckStatus().equals("success")||phase1.getCheckStatus().equals("failure"))&&(phase2.getCheckStatus().equals("success")||phase2.getCheckStatus().equals("failure"))&&(phase.getCheckStatus().equals("initialized") || phase.getCheckStatus().equals("processing"))) {
               Week week1 = phase.searchWeek("week1");
               Week week2 = phase.searchWeek("week2");
               Week week3 = phase.searchWeek("week3");
               Week week4 = phase.searchWeek("week4");
               row[0] = v;
               row[1] = request;
               row[2]= request.getSender().getEmployee().getName();
               row[3]= request.getReceiver();
               row[4]= request.getStatus();
               row[5]= phase1.getCheckStatus();
               row[6]= phase2.getCheckStatus();
               row[7]= phase.getCheckStatus();
               row[8] = week1.getWeekStatus();
               row[9] = week2.getWeekStatus();
               row[10] = week3.getWeekStatus();
               row[11]= week4.getWeekStatus();
               model.addRow(row);
              }}
            catch(Exception e){
                
            }
             }}
           });
          }}
          }
         }
        }
       }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        processJButton.setBackground(new java.awt.Color(88, 177, 159));
        processJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/Actions-view-refresh-icon.png"))); // NOI18N
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Automobile Name", "Message", "Sender", "Receiver", "Status", "Check1", "Check2", "Check3", "Week1", "Week2", "Week3", "Week4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable.setSelectionBackground(new java.awt.Color(88, 177, 159));
        jScrollPane1.setViewportView(workRequestJTable);

        jButton1.setBackground(new java.awt.Color(88, 177, 159));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/back.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/phase3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton2.setBackground(new java.awt.Color(88, 177, 159));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Request Antibodies Count");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/Phase completion.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(refreshJButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(processJButton)
                        .addGap(58, 58, 58)
                        .addComponent(jButton2)))
                .addGap(337, 337, 337))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(577, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(336, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(refreshJButton)
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processJButton)
                    .addComponent(jButton2))
                .addGap(40, 40, 40)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(809, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1306, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

      int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
                  JOptionPane.showMessageDialog(null, "Please select a row.");
            return;
        }

        garageMechanicWorkRequest request = (garageMechanicWorkRequest)workRequestJTable.getValueAt(selectedRow, 1);
        Automobile visitor = (Automobile)workRequestJTable.getValueAt(selectedRow, 0);
        
        if (visitor.getGarageStatus().equals("failed")){
                  JOptionPane.showMessageDialog(null, "This patient has already developed side effects. So can't proceed with further doses.");
            return;
        }
       // request.setStatus("Processing");
       Check phase = visitor.searchCheck("Phase3");
        phase.setCheckStatus("processing");

        ProcessChecksJPanel processPhaseJPanel = new ProcessChecksJPanel(userProcessContainer, request, visitor,phase);
        userProcessContainer.add("processPhaseJPanel", processPhaseJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                   int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
                  JOptionPane.showMessageDialog(null, "Please select a row.");
            return;
        }

        Automobile visitor = (Automobile)workRequestJTable.getValueAt(selectedRow, 0);
        
          if (visitor.getGarageStatus().equals("failed")){
            JOptionPane.showMessageDialog(null, "This patient has already developed side effects. So can't proceed further to check antibodies.");
            return;
        }
    
        Check phase = visitor.searchCheck("Phase3");
               Week week4 = phase.searchWeek("week4");
               try{
               if(!(week4.getWeekStatus().equals("success"))){
                   JOptionPane.showMessageDialog(null, "This patient has not reached 4th week yet. So you can't check antibodies count.");
             return; 
               }}
               catch(Exception e){
                
               }
        
         Organization o= null;
         String name = String.valueOf(visitor.getName());
       for(Network n: business.getNetworkList()){
           
            for(Enterprise e:n.getEnterpriseDirectory().getEnterpriseList()){
                if(e instanceof GarageEnterprise){
                   for(Organization org:  e.getOrganizationDirectory().getOrganizationList()){
                       if(org instanceof InspectionOrganization){
                           o=org;
                           
                       }
                   }
                }
            }
        }
       if(o!=null){
           
          if(o.getWorkQueue().searchRequest(name, "Diagnostic3")) {
                  JOptionPane.showMessageDialog(null,"Diagnostic report has already been requested for this Automobile");
            return;
          }
           GarageWorkRequest request = new GarageWorkRequest();
            request.setMessage("Screening Dept - please look into this issue");
            request.setSender(userAccount);
            request.setStatus("Sent");
            request.setAutomobileName(name);
            request.setTestName("Diagnostic3");
            o.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
               Week week1 = phase.searchWeek("week1");
               Week week2 = phase.searchWeek("week2");
               Week week3 = phase.searchWeek("week3");
              // Week week4 = phase.searchWeek("week4");
            if((week1.getWeekStatus().equals("success")||(week1.getWeekStatus().equals("failure"))) 
                    && (week2.getWeekStatus().equals("success")||(week2.getWeekStatus().equals("failure")))
                    && (week3.getWeekStatus().equals("success")||(week3.getWeekStatus().equals("failure")))
                    && (week4.getWeekStatus().equals("success")||(week4.getWeekStatus().equals("failure")))
                    ){
                if((week1.getWeekStatus().equals("success"))&&(week2.getWeekStatus().equals("success"))&&(week3.getWeekStatus().equals("success"))&&(week3.getWeekStatus().equals("success"))
                        ){
                    phase.setCheckStatus("success");
                    
               JOptionPane.showMessageDialog(null,"Request sent to lab successfully"); 
                }
                else if ((week1.getWeekStatus().equals("failure"))||(week2.getWeekStatus().equals("failure"))||(week3.getWeekStatus().equals("failure"))||(week3.getWeekStatus().equals("failure"))){
                    phase.setCheckStatus("failure");
                    
                JOptionPane.showMessageDialog(null,"Request sent to lab successfully"); 
                }
                   
                //JOptionPane.showMessageDialog(null,"Request sent to lab successfully");      
            }
          
       }
       else{
            JOptionPane.showMessageDialog(null,"InspectionOrganization doesn't exist");
            return;
       }
          
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
