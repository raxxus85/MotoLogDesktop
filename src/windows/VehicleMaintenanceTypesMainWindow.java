/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import engine.MotoGarageNotebookEngine;
import informationwindows.DialogType;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;
import objectmodels.VehicleMaintenanceType;
import objectmodels.VehicleModel;

/**
 *
 * @author Mark
 */
public class VehicleMaintenanceTypesMainWindow extends javax.swing.JDialog {
    private MotoGarageNotebookEngine motoGarageNotebookEngine;
    
        /**
     * Creates new form VehicleMaintenanceTypesMainWindow
     */
    public VehicleMaintenanceTypesMainWindow(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    /**
     * Creates new form VehicleMaintenanceTypesMainWindow
     */
    public VehicleMaintenanceTypesMainWindow(java.awt.Frame parent, boolean modal,MotoGarageNotebookEngine incomingMotoGarageNotebookEngine) {
        super(parent, modal);
        this.motoGarageNotebookEngine = incomingMotoGarageNotebookEngine;
        initComponents();
        this.setTitle("Vehicle Specific Maintenance Types");
        this.setIcon();
        this.refreshVehicleMaintenanceTypesTable();
    }
    
            /**
     * Method used to refresh the Vehicle Maintenance Types Type Table
     */
    public void refreshVehicleMaintenanceTypesTable(){
        
        DefaultTableModel model = (DefaultTableModel) vehicleMaintenanceTypesTable.getModel();

        int rowCount = model.getRowCount();

        // remove all mechanics
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        VehicleModel currentVehicleModel = (VehicleModel)this.vehicleModelComboBox.getSelectedItem();
        if(this.motoGarageNotebookEngine.getVehicleMaintenanceTypesArray(currentVehicleModel).length>0){
            VehicleMaintenanceType[] vehicleMaintenanceTypes = this.motoGarageNotebookEngine.getVehicleMaintenanceTypesArray(currentVehicleModel);
            int newRowCount = vehicleMaintenanceTypes.length;
            for (int i = 0  ; i <newRowCount ; i++) {
                Object[]vehicleMaintenanceTypeObject = vehicleMaintenanceTypes[i].getMaintenanceTypeObject();
                model.addRow(vehicleMaintenanceTypeObject);       
            }
        }
        
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

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        vehicleMaintenanceTypeAddButton = new javax.swing.JButton();
        updateVehicleMaintenanceTypeButton = new javax.swing.JButton();
        deleteVehicleMaintenanceTypeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        vehicleMaintenanceTypesTable = new javax.swing.JTable();
        vehicleModelComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jToolBar1.setFloatable(false);
        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);

        vehicleMaintenanceTypeAddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehicleMaintenanceType32x32ADD.png"))); // NOI18N
        vehicleMaintenanceTypeAddButton.setFocusable(false);
        vehicleMaintenanceTypeAddButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        vehicleMaintenanceTypeAddButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        vehicleMaintenanceTypeAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleMaintenanceTypeAddButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(vehicleMaintenanceTypeAddButton);

        updateVehicleMaintenanceTypeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehicleMaintenanceType32x32EDIT.png"))); // NOI18N
        updateVehicleMaintenanceTypeButton.setFocusable(false);
        updateVehicleMaintenanceTypeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        updateVehicleMaintenanceTypeButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        updateVehicleMaintenanceTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateVehicleMaintenanceTypeButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(updateVehicleMaintenanceTypeButton);

        deleteVehicleMaintenanceTypeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vehicleMaintenanceType32x32DELETE.png"))); // NOI18N
        deleteVehicleMaintenanceTypeButton.setFocusable(false);
        deleteVehicleMaintenanceTypeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteVehicleMaintenanceTypeButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        deleteVehicleMaintenanceTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteVehicleMaintenanceTypeButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(deleteVehicleMaintenanceTypeButton);

        vehicleMaintenanceTypesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Name", "Interval", "Description"
            }
        ));
        vehicleMaintenanceTypesTable.setOpaque(true);
        vehicleMaintenanceTypesTable.setFillsViewportHeight(true);
        vehicleMaintenanceTypesTable.setBackground(Color.WHITE);
        vehicleMaintenanceTypesTable.getColumnModel().getColumn(1).setMaxWidth(60);
        jScrollPane1.setViewportView(vehicleMaintenanceTypesTable);

        vehicleModelComboBox.setModel(new javax.swing.DefaultComboBoxModel(this.motoGarageNotebookEngine.getVehicleModelArray()));
        vehicleModelComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleModelComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Vehicle Model");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(vehicleModelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vehicleModelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:\
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void vehicleMaintenanceTypeAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleMaintenanceTypeAddButtonActionPerformed
        // TODO add your handling code here:
        VehicleModel currentVehicleModel = (VehicleModel)this.vehicleModelComboBox.getSelectedItem();
        this.motoGarageNotebookEngine.startNewVehicleMaintenanceTypeWindow(this,currentVehicleModel);
    }//GEN-LAST:event_vehicleMaintenanceTypeAddButtonActionPerformed

    private void updateVehicleMaintenanceTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateVehicleMaintenanceTypeButtonActionPerformed
        // TODO add your handling code here:
        //VehicleModel currentVehicleModel = (VehicleModel)this.vehicleModelComboBox.getSelectedItem();
        //this.motoGarageNotebookEngine.startUpdateVehicleMaintenanceTypeWindow(this,currentVehicleModel);
        VehicleModel currentVehicleModel = (VehicleModel)this.vehicleModelComboBox.getSelectedItem();
        int rowSelected = this.vehicleMaintenanceTypesTable.getSelectedRow();
        if(rowSelected>-1){            
            VehicleMaintenanceType[] vehicleMaintenanceTypes = this.motoGarageNotebookEngine.getVehicleMaintenanceTypesArray(currentVehicleModel);
            VehicleMaintenanceType selectedVehicleMaintenanceType = vehicleMaintenanceTypes[rowSelected];
            this.motoGarageNotebookEngine.startUpdateVehicleMaintenanceTypeWindow(this,selectedVehicleMaintenanceType,currentVehicleModel);
        }else{
            this.motoGarageNotebookEngine.getDialogFactory().createDialogMessage(this,DialogType.INFORMATION_MESSAGE, "You need to select a Vehicle Specific Maintenance Type to edit.");
        }
        
    }//GEN-LAST:event_updateVehicleMaintenanceTypeButtonActionPerformed

    private void deleteVehicleMaintenanceTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteVehicleMaintenanceTypeButtonActionPerformed
        // TODO add your handling code here:
        VehicleModel currentVehicleModel = (VehicleModel)this.vehicleModelComboBox.getSelectedItem();
        int rowSelected = this.vehicleMaintenanceTypesTable.getSelectedRow();
        if(rowSelected==-1){
            this.motoGarageNotebookEngine.getDialogFactory().createDialogMessage(this,DialogType.INFORMATION_MESSAGE, "You need to select a Vehicle Specific Maintenance Type to delete.");
            return;
        }
        boolean sureToDelete = this.motoGarageNotebookEngine.getDialogFactory().createConfirmMessage(this,"Are you sure you wish to delete the Vehicle Specific Maintenance Type? This is permanent!");
        if(sureToDelete){
            if(rowSelected>-1){            
                VehicleMaintenanceType[] vehicleMaintenanceTypes = this.motoGarageNotebookEngine.getVehicleMaintenanceTypesArray(currentVehicleModel);
                VehicleMaintenanceType selectedVehicleMaintenanceType = vehicleMaintenanceTypes[rowSelected];
                this.motoGarageNotebookEngine.deleteVehicleMaintenanceType(selectedVehicleMaintenanceType, currentVehicleModel);
                this.refreshVehicleMaintenanceTypesTable();
                //this.motoGarageNotebookEngine.startUpdateVehicleMaintenanceTypeWindow(this,selectedVehicleMaintenanceType,currentVehicleModel);
            }else{
                this.motoGarageNotebookEngine.getDialogFactory().createDialogMessage(this,DialogType.INFORMATION_MESSAGE, "You need to select a Vehicle Specific Maintenance Type to delete.");
            }
        }
    }//GEN-LAST:event_deleteVehicleMaintenanceTypeButtonActionPerformed

    private void vehicleModelComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleModelComboBoxActionPerformed
        // TODO add your handling code here:
        this.refreshVehicleMaintenanceTypesTable();
    }//GEN-LAST:event_vehicleModelComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(VehicleMaintenanceTypesMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VehicleMaintenanceTypesMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VehicleMaintenanceTypesMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VehicleMaintenanceTypesMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VehicleMaintenanceTypesMainWindow dialog = new VehicleMaintenanceTypesMainWindow(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteVehicleMaintenanceTypeButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton updateVehicleMaintenanceTypeButton;
    private javax.swing.JButton vehicleMaintenanceTypeAddButton;
    private javax.swing.JTable vehicleMaintenanceTypesTable;
    private javax.swing.JComboBox vehicleModelComboBox;
    // End of variables declaration//GEN-END:variables
}
