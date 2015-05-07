/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import engine.MotoGarageNotebookEngine;
import informationwindows.DialogType;
import java.awt.Toolkit;
import java.util.Date;
import objectmodels.FuelEntry;

/**
 *
 * @author Mark
 */
public class FuelEntryWindow extends javax.swing.JDialog {
    private MotoGarageNotebookEngine mechanicsNotebookEngine;
    private boolean addFuelEntryBoolean;
    private FuelEntry originalFuelEntry;
    
    /**
     * Creates new form FuelEntryWindow, for NEW FUEL ENTRY
     * @param incomingMechanicsNotebookEngine
     */
    public FuelEntryWindow(java.awt.Frame parent,boolean modal,MotoGarageNotebookEngine incomingMechanicsNotebookEngine) {
        super(parent, modal);
        this.mechanicsNotebookEngine = incomingMechanicsNotebookEngine;
        initComponents();
        this.addOrUpdateButton.setText("Add Fuel Entry");
        this.setTitle("Add Fuel Entry");
        this.setIcon();
        Date currentDate = new Date();
        this.datePicker.setDate(currentDate);
        this.odometerTextField.setText(incomingMechanicsNotebookEngine.getCurrentVehicle().getOdometer().toString());
        this.addFuelEntryBoolean = true;
    }
    
    /**
     * Creates new form FuelEntryWindow, for UPDATING
     * @param incomingMechanicsNotebookEngine
     * @param incomingFuelEntry
     */
    public FuelEntryWindow(java.awt.Frame parent,boolean modal,MotoGarageNotebookEngine incomingMechanicsNotebookEngine, FuelEntry incomingFuelEntry) {
        super(parent, modal);
        this.mechanicsNotebookEngine = incomingMechanicsNotebookEngine;
        this.originalFuelEntry = incomingFuelEntry;
        initComponents();
        this.addOrUpdateButton.setText("Edit Fuel Entry");
        this.setTitle("View / Edit Fuel Entry");
        this.setIcon();
        
        this.odometerTextField.setText(incomingFuelEntry.getOdometer().toString());
        this.datePicker.setDate(incomingFuelEntry.getDate());
        this.gallonsTextField.setText(incomingFuelEntry.getGallons().toString());
        this.costPerGallonTextField.setText(incomingFuelEntry.getCostPerGallon().toString());       
        
        this.addFuelEntryBoolean = false;
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

        odometerLabel = new javax.swing.JLabel();
        gallonsLabel = new javax.swing.JLabel();
        costPerGallonLabel = new javax.swing.JLabel();
        odometerTextField = new javax.swing.JTextField();
        gallonsTextField = new javax.swing.JTextField();
        costPerGallonTextField = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        addOrUpdateButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        datePicker = new org.jdesktop.swingx.JXDatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

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

        jLabel1.setText("Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(addOrUpdateButton)
                    .addComponent(costPerGallonLabel)
                    .addComponent(gallonsLabel)
                    .addComponent(odometerLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(cancelButton)
                        .addGap(89, 89, 89))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(odometerTextField)
                                .addComponent(gallonsTextField)
                                .addComponent(costPerGallonTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(odometerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(odometerLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gallonsLabel)
                    .addComponent(gallonsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costPerGallonLabel)
                    .addComponent(costPerGallonTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addOrUpdateButton)
                    .addComponent(cancelButton))
                .addContainerGap(23, Short.MAX_VALUE))
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
            FuelEntry newFuelEntry = new FuelEntry(Integer.parseInt(this.odometerTextField.getText()), this.datePicker.getDate(),Float.parseFloat(this.gallonsTextField.getText()), Float.parseFloat(this.costPerGallonTextField.getText()));           
            this.mechanicsNotebookEngine.addFuelEntry(newFuelEntry);
            if(this.mechanicsNotebookEngine.getCurrentVehicle().getOdometer()<(newFuelEntry.getOdometer())){
                this.mechanicsNotebookEngine.getDialogFactory().createDialogMessage(this,DialogType.INFORMATION_MESSAGE, "Vehicle Odometer updated from " 
                        + this.mechanicsNotebookEngine.getCurrentVehicle().getOdometer().toString() + " miles to " +
                newFuelEntry.getOdometer().toString() + " miles.");
                this.mechanicsNotebookEngine.updateVehicleMileage(newFuelEntry.getOdometer());
            }
            this.dispose();
            }else{
                FuelEntry newFuelEntry = new FuelEntry(Integer.parseInt(this.odometerTextField.getText()),this.datePicker.getDate(), Float.parseFloat(this.gallonsTextField.getText()), Float.parseFloat(this.costPerGallonTextField.getText()));
                        
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
    private org.jdesktop.swingx.JXDatePicker datePicker;
    private javax.swing.JLabel gallonsLabel;
    private javax.swing.JTextField gallonsTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel odometerLabel;
    private javax.swing.JTextField odometerTextField;
    // End of variables declaration//GEN-END:variables
}
