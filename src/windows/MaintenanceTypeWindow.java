/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import engine.MotoGarageNotebookEngine;
import informationwindows.DialogType;
import java.awt.Toolkit;
import objectmodels.MaintenanceType;
import objectmodels.VehicleMaintenanceType;
import objectmodels.VehicleModel;

/**
 *
 * @author Mark
 */
public class MaintenanceTypeWindow extends javax.swing.JDialog {
    private MotoGarageNotebookEngine mechanicsNotebookEngine;
    private MaintenanceTypesMainWindow maintenanceTypesMainWindow;
    private VehicleMaintenanceTypesMainWindow vehicleMaintenanceTypesMainWindow;
    boolean updatingMaintenanceType = false;
    MaintenanceType originalMaintenanceType = null;
    VehicleMaintenanceType originalVehicleMaintenanceType = null;
    private VehicleModel vehicleModel = null;
    private boolean vehicleSpecific = false;

    /**
     * Creates new form MaintenanceTypeWindow
     */
    public MaintenanceTypeWindow() {
        initComponents();
    }
    
    /**
     * Creates new form MaintenanceTypeWindow, for creating Maintenance Type
     * @param parent
     * @param modal
     * @param incomingMaintenanceTypesMainWindow
     * @param incomingMechanicsNotebookEngine
     */
    public MaintenanceTypeWindow(java.awt.Frame parent,boolean modal,
            MaintenanceTypesMainWindow incomingMaintenanceTypesMainWindow,MotoGarageNotebookEngine incomingMechanicsNotebookEngine) {
        super(parent, modal);
        this.mechanicsNotebookEngine= incomingMechanicsNotebookEngine;
        this.maintenanceTypesMainWindow = incomingMaintenanceTypesMainWindow;
        initComponents();
        this.setIcon();
        this.setTitle("Create Maintenance Type");
    }
    
    /**
     * Creates new form MaintenanceTypeWindow, for creating Maintenance Type
     * <li> Vehicle Model Specific!
     * @param parent
     * @param modal
     * @param incomingVehicleMaintenanceTypesMainWindow
     * @param incomingVehicleModel
     * @param incomingMechanicsNotebookEngine
     */
    public MaintenanceTypeWindow(java.awt.Frame parent,boolean modal,
            VehicleMaintenanceTypesMainWindow incomingVehicleMaintenanceTypesMainWindow,VehicleModel incomingVehicleModel, MotoGarageNotebookEngine incomingMechanicsNotebookEngine) {
        super(parent, modal);
        this.mechanicsNotebookEngine= incomingMechanicsNotebookEngine;
        //this.maintenanceTypesMainWindow = incomingMaintenanceTypesMainWindow;
        this.vehicleMaintenanceTypesMainWindow = incomingVehicleMaintenanceTypesMainWindow;
        initComponents();
        this.setIcon();
        this.setTitle("Create Vehicle Model SpecificMaintenance Type");
        this.vehicleModel =  incomingVehicleModel;
        //this.vehicleSpecific = true;
    }
    
    /**
     * Creates new form MaintenanceTypeWindow for Updating Maintenance Type
     */
    public MaintenanceTypeWindow(java.awt.Frame parent,boolean modal,MaintenanceTypesMainWindow incomingMaintenanceTypesMainWindow,MotoGarageNotebookEngine incomingMechanicsNotebookEngine, MaintenanceType incomingMaintenanceType) {
        super(parent, modal);
        this.mechanicsNotebookEngine= incomingMechanicsNotebookEngine;
        this.maintenanceTypesMainWindow = incomingMaintenanceTypesMainWindow;
        initComponents();
        this.setIcon();
        this.setTitle("Update Maintenance Type");
        this.createOrUpdateMaintenanceTypeButton.setText("Update Maintenance Type");
        
        this.updatingMaintenanceType = true;
        this.originalMaintenanceType = incomingMaintenanceType;
        
        this.maintenanceTypeNameTextField.setText(incomingMaintenanceType.getMaintenanceTypeName());
        this.maintenanceTypeIntervalTextField.setText(incomingMaintenanceType.getMileageInterval().toString());
        this.maintenanceTypeDescriptionTextArea.setText(incomingMaintenanceType.getDescription());

    }
    
    /**
     * Creates new form MaintenanceTypeWindow for Updating Maintenance Type
     * <li> for Vehicle Specific Maintenance Types!
     * @param parent
     * @param modal
     * @param incomingVehicleMaintenanceType
     * @param incomingMechanicsNotebookEngine
     */
    public MaintenanceTypeWindow(java.awt.Frame parent,boolean modal,VehicleMaintenanceTypesMainWindow incomingVehicleMaintenanceTypesMainWindow,MotoGarageNotebookEngine incomingMechanicsNotebookEngine, VehicleMaintenanceType incomingVehicleMaintenanceType, VehicleModel incomingVehicleModel) {
        super(parent, modal);
        this.mechanicsNotebookEngine= incomingMechanicsNotebookEngine;
        this.vehicleMaintenanceTypesMainWindow = incomingVehicleMaintenanceTypesMainWindow;
        initComponents();
        this.setIcon();
        this.setTitle("Update Maintenance Type");
        this.createOrUpdateMaintenanceTypeButton.setText("Update Maintenance Type");
        this.vehicleModel =  incomingVehicleModel;
        
        this.updatingMaintenanceType = true;
        this.originalVehicleMaintenanceType = incomingVehicleMaintenanceType;
        
        this.maintenanceTypeNameTextField.setText(incomingVehicleMaintenanceType.getMaintenanceTypeName());
        this.maintenanceTypeIntervalTextField.setText(incomingVehicleMaintenanceType.getMileageInterval().toString());
        this.maintenanceTypeDescriptionTextArea.setText(incomingVehicleMaintenanceType.getDescription());

    }
    
    private void setIcon(){
        //setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/mechanicIcon.png")));
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

        createOrUpdateMaintenanceTypeButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        maintenanceTypeNameTextField = new javax.swing.JTextField();
        maintenanceTypeNameLabel = new javax.swing.JLabel();
        maintenanceTypeIntervalTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        maintenanceTypeDescriptionTextArea = new javax.swing.JTextArea();
        maintenanceTypeIntervalLabel = new javax.swing.JLabel();
        maintenanceTypeDescriptionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        createOrUpdateMaintenanceTypeButton.setText("Create Maintenance Type");
        createOrUpdateMaintenanceTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createOrUpdateMaintenanceTypeButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        maintenanceTypeNameLabel.setText("Type Name");

        maintenanceTypeDescriptionTextArea.setColumns(20);
        maintenanceTypeDescriptionTextArea.setRows(5);
        maintenanceTypeDescriptionTextArea.setLineWrap(true);
        jScrollPane1.setViewportView(maintenanceTypeDescriptionTextArea);

        maintenanceTypeIntervalLabel.setText("Recommended Interval");

        maintenanceTypeDescriptionLabel.setText("Description");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(maintenanceTypeIntervalLabel)
                    .addComponent(maintenanceTypeDescriptionLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(maintenanceTypeNameLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(maintenanceTypeNameTextField)
                    .addComponent(maintenanceTypeIntervalTextField)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maintenanceTypeNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maintenanceTypeNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maintenanceTypeIntervalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maintenanceTypeIntervalLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(maintenanceTypeDescriptionLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(createOrUpdateMaintenanceTypeButton)
                .addGap(60, 60, 60)
                .addComponent(cancelButton)
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createOrUpdateMaintenanceTypeButton)
                    .addComponent(cancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void createOrUpdateMaintenanceTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createOrUpdateMaintenanceTypeButtonActionPerformed
        // Basic Checks
        if(this.maintenanceTypeNameTextField.getText().equals("")|| this.maintenanceTypeIntervalTextField.equals("") || this.maintenanceTypeDescriptionTextArea.equals("")){
            this.mechanicsNotebookEngine.getDialogFactory().createDialogMessage(this,DialogType.WARNING_MESSAGE, "A Maintenance Type requires a Name, Recommended Interval, and Description.");
            return;
        }      
        String newName = this.maintenanceTypeNameTextField.getText();
        Integer newInterval = Integer.parseInt(this.maintenanceTypeIntervalTextField.getText());
        String newDescription = this.maintenanceTypeDescriptionTextArea.getText();
        
        
        // onto create / update
        if(this.vehicleModel==null){
            MaintenanceType newMaintenanceType = new MaintenanceType(newName,newInterval,newDescription);
            if(this.updatingMaintenanceType){
                boolean updatedMaintenanceType = this.mechanicsNotebookEngine.updateMaintenanceType(originalMaintenanceType, newMaintenanceType);
                if(updatedMaintenanceType){
                    this.mechanicsNotebookEngine.getDialogFactory().createDialogMessage(this,DialogType.INFORMATION_MESSAGE, "Maintenance Type has been updated!");
                    this.maintenanceTypesMainWindow.refreshMaintenanceTypeTable();
                }else{
                    this.mechanicsNotebookEngine.getDialogFactory().createDialogMessage(this,DialogType.ERROR_MESSAGE, "An error occured attempting to update the Maintenance Type!");
                }
                this.dispose();
            }else{
                this.mechanicsNotebookEngine.createNewMaintenanceType(newMaintenanceType);
                this.mechanicsNotebookEngine.getDialogFactory().createDialogMessage(this,DialogType.INFORMATION_MESSAGE, "New Maintenance Type," + newMaintenanceType.toString() + ", has been created!");
                // REFRESH
                this.maintenanceTypesMainWindow.refreshMaintenanceTypeTable();
                this.dispose();
            }
        }else{
            VehicleMaintenanceType newVehicleMaintenanceType = new VehicleMaintenanceType(this.vehicleModel,newName,newInterval,newDescription);
            if(this.updatingMaintenanceType){
                boolean updatedVehicleMaintenanceType = this.mechanicsNotebookEngine.updateVehicleMaintenanceType(originalVehicleMaintenanceType, newVehicleMaintenanceType, this.vehicleModel);
                if(updatedVehicleMaintenanceType){
                    this.mechanicsNotebookEngine.getDialogFactory().createDialogMessage(this,DialogType.INFORMATION_MESSAGE, "Vehicle Model Specific Maintenance Type has been updated!");
                    this.vehicleMaintenanceTypesMainWindow.refreshVehicleMaintenanceTypesTable();
                }else{
                    this.mechanicsNotebookEngine.getDialogFactory().createDialogMessage(this,DialogType.ERROR_MESSAGE, "An error occured attempting to update the Vehicle Specific Maintenance Type!!");
                }
                this.dispose();
            }else{
                this.mechanicsNotebookEngine.createNewVehicleMaintenanceType(newVehicleMaintenanceType,this.vehicleModel);
                this.mechanicsNotebookEngine.getDialogFactory().createDialogMessage(this,DialogType.INFORMATION_MESSAGE, "New Vehicle Specific Maintenance Type," + newVehicleMaintenanceType.toString() + ", has been created!");
                // REFRESH
                this.vehicleMaintenanceTypesMainWindow.refreshVehicleMaintenanceTypesTable();
                this.dispose();
            }
        }
    }//GEN-LAST:event_createOrUpdateMaintenanceTypeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MaintenanceTypeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaintenanceTypeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaintenanceTypeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaintenanceTypeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MaintenanceTypeWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton createOrUpdateMaintenanceTypeButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel maintenanceTypeDescriptionLabel;
    private javax.swing.JTextArea maintenanceTypeDescriptionTextArea;
    private javax.swing.JLabel maintenanceTypeIntervalLabel;
    private javax.swing.JTextField maintenanceTypeIntervalTextField;
    private javax.swing.JLabel maintenanceTypeNameLabel;
    private javax.swing.JTextField maintenanceTypeNameTextField;
    // End of variables declaration//GEN-END:variables
}
