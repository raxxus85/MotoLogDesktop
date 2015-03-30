/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import engine.MotoGarageNotebookEngine;
import informationwindows.DialogType;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import objectmodels.MaintenanceType;

/**
 *
 * @author Mark
 */
public class MaintenanceTypesMainWindow extends javax.swing.JFrame {
    MotoGarageNotebookEngine mechanicsNotebookEngine;
    
    /**
     * Creates new form MaintenanceTypesMainWindow
     */
    public MaintenanceTypesMainWindow() {
        initComponents();
    }
    
     /**
     * Creates new form MaintenanceTypesMainWindow
     */
    public MaintenanceTypesMainWindow(MotoGarageNotebookEngine incomingMechanicsNotebookEngine) {
        this.mechanicsNotebookEngine = incomingMechanicsNotebookEngine;
        initComponents();
        this.setIcon();
        this.setTitle("Maintenance Types");
        this.refreshMaintenanceTypeTable();
    }
    
    
    /**
     * Method used to refresh the Maintenance Type Table
     */
    public void refreshMaintenanceTypeTable(){
        
        DefaultTableModel model = (DefaultTableModel) maintenanceTypesTable.getModel();

        int rowCount = model.getRowCount();
        //Integer currentRowSelected = maintenanceTypesTable.getSelectedRow();
        // remove all mechanics
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        
        if(this.mechanicsNotebookEngine.getMaintenaceTypeArray().length>0){
            MaintenanceType[] maintenanceTypes = this.mechanicsNotebookEngine.getMaintenaceTypeArray();
            int newRowCount = maintenanceTypes.length;
            for (int i = 0  ; i <newRowCount ; i++) {
                Object[]maintenanceTypeObject = maintenanceTypes[i].getMaintenanceTypeObject();
                model.addRow(maintenanceTypeObject);       
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

        closeButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        maintenanceTypeToolBar = new javax.swing.JToolBar();
        ImageIcon maintenanceTypeAdd = new ImageIcon(getClass().getResource("/maintenanceType32x32ADD.png"));
        Action actionMaintenanceTypeAdd = new AbstractAction("New", maintenanceTypeAdd) {
            public void actionPerformed(ActionEvent e) {
                System.out.println("MaintenanceTypes Edid!");
            }
        };
        addMaintenanceTypeButton = maintenanceTypeToolBar.add(actionMaintenanceTypeAdd);
        ImageIcon maintenanceTypeEdit = new ImageIcon(getClass().getResource("/maintenanceType32x32EDIT.png"));
        Action actionMaintenanceTypeEdit = new AbstractAction("New", maintenanceTypeEdit) {
            public void actionPerformed(ActionEvent e) {
                System.out.println("MaintenanceTypes EDIT!");
            }
        };
        editMaintenanceTypeButton = maintenanceTypeToolBar.add(actionMaintenanceTypeEdit);
        ImageIcon maintenanceTypeDelete = new ImageIcon(getClass().getResource("/maintenanceType32x32DELETE.png"));
        Action actionMaintenanceTypeDelete = new AbstractAction("New", maintenanceTypeDelete) {
            public void actionPerformed(ActionEvent e) {
                System.out.println("MaintenanceTypes DELETE!");
            }
        };
        deleteMaintenanceTypeButton = maintenanceTypeToolBar.add(actionMaintenanceTypeDelete);
        jScrollPane1 = new javax.swing.JScrollPane();
        maintenanceTypesTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        maintenanceTypeToolBar.setOrientation(javax.swing.SwingConstants.VERTICAL);
        maintenanceTypeToolBar.setRollover(true);
        maintenanceTypeToolBar.setFloatable(false);

        addMaintenanceTypeButton.setToolTipText("Add Maintenance Type");
        addMaintenanceTypeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maintenanceType32x32ADD.png"))); // NOI18N
        addMaintenanceTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMaintenanceTypeButtonActionPerformed(evt);
            }
        });
        maintenanceTypeToolBar.add(addMaintenanceTypeButton);

        editMaintenanceTypeButton.setToolTipText("View / Edit Selected Maintenance Type");
        editMaintenanceTypeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maintenanceType32x32EDIT.png"))); // NOI18N
        editMaintenanceTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMaintenanceTypeButtonActionPerformed(evt);
            }
        });
        maintenanceTypeToolBar.add(editMaintenanceTypeButton);

        deleteMaintenanceTypeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maintenanceAction32x32DELETE.png"))); // NOI18N
        deleteMaintenanceTypeButton.setToolTipText("Delete Selected Maintenance Type");
        deleteMaintenanceTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMaintenanceTypeButtonActionPerformed(evt);
            }
        });
        maintenanceTypeToolBar.add(deleteMaintenanceTypeButton);

        maintenanceTypesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Name", "Interval", "Description"
            }
        ));
        maintenanceTypesTable.setOpaque(true);
        maintenanceTypesTable.setFillsViewportHeight(true);
        maintenanceTypesTable.setBackground(Color.WHITE);
        maintenanceTypesTable.getColumnModel().getColumn(1).setMaxWidth(60);
        jScrollPane1.setViewportView(maintenanceTypesTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(maintenanceTypeToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(maintenanceTypeToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(closeButton)
                .addContainerGap(229, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(closeButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void addMaintenanceTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMaintenanceTypeButtonActionPerformed
        // TODO add your handling code here:
        this.mechanicsNotebookEngine.startNewMaintenanceTypeWindow(this);
    }//GEN-LAST:event_addMaintenanceTypeButtonActionPerformed

    private void editMaintenanceTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMaintenanceTypeButtonActionPerformed
        // TODO add your handling code here:
        int rowSelected = this.maintenanceTypesTable.getSelectedRow();
        if(rowSelected>-1){
            MaintenanceType[] maintenanceTypes = this.mechanicsNotebookEngine.getMaintenaceTypeArray();
            MaintenanceType selectedMaintenanceType = maintenanceTypes[rowSelected];
            this.mechanicsNotebookEngine.startUpdateMaintenanceTypeWindow(this,selectedMaintenanceType);
        }else{
            this.mechanicsNotebookEngine.getDialogFactory().createDialogMessage(DialogType.INFORMATION_MESSAGE, "You need to select a Maintenance Type to edit.");
        }

    }//GEN-LAST:event_editMaintenanceTypeButtonActionPerformed

    private void deleteMaintenanceTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMaintenanceTypeButtonActionPerformed
        // TODO add your handling code here:
        int rowSelected = this.maintenanceTypesTable.getSelectedRow();
        
        if(rowSelected==-1){
            this.mechanicsNotebookEngine.getDialogFactory().createDialogMessage(DialogType.INFORMATION_MESSAGE, "You need to select a Maintenance Type to delete.");
            return;
        }
        boolean sureToDelete = this.mechanicsNotebookEngine.getDialogFactory().createConfirmMessage("Are you sure you wish to delete the Maintenance Type? This is permanent!");
        if(sureToDelete){
            MaintenanceType[] maintenanceTypes = this.mechanicsNotebookEngine.getMaintenaceTypeArray();
            MaintenanceType selectedMaintenanceType = maintenanceTypes[rowSelected];
            if(this.mechanicsNotebookEngine.deleteMaintenanceType(selectedMaintenanceType)){
                this.mechanicsNotebookEngine.getDialogFactory().createDialogMessage(DialogType.INFORMATION_MESSAGE, "Maintenance Type deleted successfully!");
                this.refreshMaintenanceTypeTable();
            }else{
                this.mechanicsNotebookEngine.getDialogFactory().createDialogMessage(DialogType.ERROR_MESSAGE, "Error attempting to delete Maintenace Type! Please report!");
            }
            
        }
    }//GEN-LAST:event_deleteMaintenanceTypeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MaintenanceTypesMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaintenanceTypesMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaintenanceTypesMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaintenanceTypesMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MaintenanceTypesMainWindow().setVisible(true);
             }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMaintenanceTypeButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton deleteMaintenanceTypeButton;
    private javax.swing.JButton editMaintenanceTypeButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar maintenanceTypeToolBar;
    private javax.swing.JTable maintenanceTypesTable;
    // End of variables declaration//GEN-END:variables
}

