/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import engine.MotoGarageNotebookEngine;
import informationwindows.DialogType;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Properties;
import objectmodels.MaintenanceAction;
import objectmodels.MaintenanceType;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

/**
 *
 * @author Mark
 */
public class NewMaintenanceActionWindow extends javax.swing.JFrame {
    private MotoGarageNotebookEngine mechanicsNotebookEngine;

    /**
     * Creates new form NewMaintenanceActionWindow
     */
    public NewMaintenanceActionWindow() {
        initComponents();
    }
    
     /**
     * Creates new form NewMaintenanceActionWindow
     */
    public NewMaintenanceActionWindow(MotoGarageNotebookEngine incomingMotoGarageMechanicEngine) {
        this.mechanicsNotebookEngine= incomingMotoGarageMechanicEngine;
        initComponents();
        this.currentVehicleTextField.setText(this.mechanicsNotebookEngine.getCurrentVehicle().toString());
        this.maintenenaceActionMileageTextField.setText(this.mechanicsNotebookEngine.getCurrentVehicle().getOdometer().toString());
        this.setIcon();
        this.setTitle("New Maintenance Action");
        
        Date currentDate = new Date();
        this.datePerformedDatePicker.setDate(currentDate);
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

        cancelButton = new javax.swing.JButton();
        addMaintenanceActionButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        currentVehicleTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mechanicTextField = new javax.swing.JTextField();
        mechanicLabel = new javax.swing.JLabel();
        maintenanceTypeJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        maintenenaceActionMileageTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        maintenanceActionNotesTextArea = new javax.swing.JTextArea();
        maintenanceActionNotesLabel = new javax.swing.JLabel();
        datePerformedDatePicker = new org.jdesktop.swingx.JXDatePicker();
        datePerformedLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        addMaintenanceActionButton.setText("Add");
        addMaintenanceActionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMaintenanceActionButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        currentVehicleTextField.setEditable(false);
        currentVehicleTextField.setFocusable(false);

        jLabel5.setText("Vehicle ");

        mechanicTextField.setText(mechanicsNotebookEngine.getCurrentMechanic().toString());
        mechanicTextField.setEditable(false);
        mechanicTextField.setFocusable(false);

        mechanicLabel.setText("Mechanic");

        maintenanceTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(mechanicsNotebookEngine.getMaintenaceTypeArray()));

        jLabel2.setText("Maintenance Type");

        jLabel3.setText("Odometer");

        maintenanceActionNotesTextArea.setColumns(20);
        maintenanceActionNotesTextArea.setRows(5);
        jScrollPane1.setViewportView(maintenanceActionNotesTextArea);

        maintenanceActionNotesLabel.setText("Notes");

        datePerformedLabel.setText("Date Performed");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maintenenaceActionMileageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(datePerformedLabel)
                                    .addComponent(maintenanceActionNotesLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                    .addComponent(datePerformedDatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mechanicLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mechanicTextField)
                                    .addComponent(maintenanceTypeJComboBox, 0, 194, Short.MAX_VALUE)
                                    .addComponent(currentVehicleTextField))))
                        .addGap(0, 0, 0)))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(currentVehicleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mechanicLabel)
                    .addComponent(mechanicTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(maintenanceTypeJComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(maintenenaceActionMileageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datePerformedDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datePerformedLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maintenanceActionNotesLabel))
                .addContainerGap())
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
                .addGap(46, 46, 46)
                .addComponent(addMaintenanceActionButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelButton)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMaintenanceActionButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void addMaintenanceActionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMaintenanceActionButtonActionPerformed
        // TODO add your handling code here:
        if(this.maintenenaceActionMileageTextField.equals("") || this.maintenanceActionNotesTextArea.equals("")){
            System.out.println("FAIL");
            return;
        }else{
            MaintenanceAction newMaintenanceAction = new MaintenanceAction(this.mechanicsNotebookEngine.getCurrentMechanic(),this.mechanicsNotebookEngine.getCurrentVehicle(),
                    (MaintenanceType)this.maintenanceTypeJComboBox.getSelectedItem(),
                    Integer.parseInt(this.maintenenaceActionMileageTextField.getText()),this.datePerformedDatePicker.getDate(),this.maintenanceActionNotesTextArea.getText());
            this.mechanicsNotebookEngine.addMaintenanceAction(newMaintenanceAction);
            if(this.mechanicsNotebookEngine.getCurrentVehicle().getOdometer()<(newMaintenanceAction.getOdometer())){
                this.mechanicsNotebookEngine.getDialogFactory().createDialogMessage(DialogType.INFORMATION_MESSAGE, "Vehicle Odometer updated from " 
                        + this.mechanicsNotebookEngine.getCurrentVehicle().getOdometer().toString() + " miles to " +
                newMaintenanceAction.getOdometer().toString() + " miles.");
                this.mechanicsNotebookEngine.updateVehicleMileage(newMaintenanceAction.getOdometer());
            }

        }
        this.dispose();
    }//GEN-LAST:event_addMaintenanceActionButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NewMaintenanceActionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewMaintenanceActionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewMaintenanceActionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewMaintenanceActionWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewMaintenanceActionWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMaintenanceActionButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField currentVehicleTextField;
    private org.jdesktop.swingx.JXDatePicker datePerformedDatePicker;
    private javax.swing.JLabel datePerformedLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel maintenanceActionNotesLabel;
    private javax.swing.JTextArea maintenanceActionNotesTextArea;
    private javax.swing.JComboBox maintenanceTypeJComboBox;
    private javax.swing.JTextField maintenenaceActionMileageTextField;
    private javax.swing.JLabel mechanicLabel;
    private javax.swing.JTextField mechanicTextField;
    // End of variables declaration//GEN-END:variables
}
