/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import engine.MechanicsNotebookEngine;
import java.awt.Toolkit;
import objectmodels.FuelEntry;

/**
 *
 * @author Mark
 */
public class FuelEntryWindow extends javax.swing.JFrame {
    private MechanicsNotebookEngine mechanicsNotebookEngine;
    private boolean addFuelEntryBoolean;
    private FuelEntry originalFuelEntry;
    
    /**
     * Creates new form FuelEntryWindow, for NEW FUEL ENTRY
     */
    public FuelEntryWindow(MechanicsNotebookEngine incomingMechanicsNotebookEngine) {
        this.mechanicsNotebookEngine = incomingMechanicsNotebookEngine;
        initComponents();
        this.addOrUpdateButton.setText("Add Fuel Entry");
        this.setIcon();
        addFuelEntryBoolean = true;
    }
    
    /**
     * Creates new form FuelEntryWindow, for UPDATING
     */
    public FuelEntryWindow(MechanicsNotebookEngine incomingMechanicsNotebookEngine, FuelEntry incomingFuelEntry) {
        this.mechanicsNotebookEngine = incomingMechanicsNotebookEngine;
        this.originalFuelEntry = incomingFuelEntry;
        initComponents();
        this.addOrUpdateButton.setText("Update Fuel Entry");
        this.setIcon();
        
        this.odometerTextField.setText(incomingFuelEntry.getOdometer().toString());
        this.gallonsTextField.setText(incomingFuelEntry.getGallons().toString());
        this.costPerGallonTextField.setText(incomingFuelEntry.getCostPerGallon().toString());       
        
        addFuelEntryBoolean = false;
    }
    
    /**
     * Creates new form FuelEntryWindow
     */
    public FuelEntryWindow() {
        initComponents();
    }
    
    private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/MGFavicon.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        odometerLabel = new javax.swing.JLabel();
        gallonsLabel = new javax.swing.JLabel();
        costPerGallonLabel = new javax.swing.JLabel();
        odometerTextField = new javax.swing.JTextField();
        gallonsTextField = new javax.swing.JTextField();
        costPerGallonTextField = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        addOrUpdateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Fuel Entry");

        odometerLabel.setText("Odometer");

        gallonsLabel.setText("Gallons");

        costPerGallonLabel.setText("Cost per Gallon");

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        addOrUpdateButton.setText("Add");
        addOrUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrUpdateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(costPerGallonLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(gallonsLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(odometerLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(odometerTextField)
                                    .addComponent(gallonsTextField)
                                    .addComponent(costPerGallonTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(addOrUpdateButton)))))
                .addContainerGap(141, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancelButton)
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(odometerLabel)
                            .addComponent(odometerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(gallonsLabel))
                    .addComponent(gallonsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costPerGallonLabel)
                    .addComponent(costPerGallonTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(addOrUpdateButton))
                .addGap(54, 54, 54))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void addOrUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrUpdateButtonActionPerformed
        // TODO add your handling code here:
        if(this.odometerTextField.getText().equals("") || this.gallonsTextField.getText().equals("") || this.costPerGallonTextField.getText().equals("")){
            System.out.println("Something is null");
        }else{
            if(addFuelEntryBoolean){
            FuelEntry newFuelEntry = new FuelEntry(Integer.parseInt(this.odometerTextField.getText()), Float.parseFloat(this.gallonsTextField.getText()), Float.parseFloat(this.costPerGallonTextField.getText()));           
            this.mechanicsNotebookEngine.addFuelEntry(newFuelEntry);
            this.dispose();
            }else{
                FuelEntry newFuelEntry = new FuelEntry(Integer.parseInt(this.odometerTextField.getText()), Float.parseFloat(this.gallonsTextField.getText()), Float.parseFloat(this.costPerGallonTextField.getText()));
                        
                this.mechanicsNotebookEngine.editFuelEntry(originalFuelEntry, newFuelEntry);
                this.dispose();
            }
        }
    }//GEN-LAST:event_addOrUpdateButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FuelEntryWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuelEntryWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuelEntryWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuelEntryWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuelEntryWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOrUpdateButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel costPerGallonLabel;
    private javax.swing.JTextField costPerGallonTextField;
    private javax.swing.JLabel gallonsLabel;
    private javax.swing.JTextField gallonsTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel odometerLabel;
    private javax.swing.JTextField odometerTextField;
    // End of variables declaration//GEN-END:variables
}
