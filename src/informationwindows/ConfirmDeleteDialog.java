/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package informationwindows;

import java.awt.Component;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Mark
 */
public class ConfirmDeleteDialog{
    
     /**
     * //Method to create an error dialog box!
     * 
     * @param message 
     */
    public boolean createConfirmDelete(Component incomingParent,String message){
        //JOptionPane jOptionPane = new JOptionPane(message,JOptionPane.QUESTION_MESSAGE);


        //JDialog dialog = jOptionPane.createDialog("Are you sure you wish to perform this action?");
        
        
        JOptionPane jOptionPane = new JOptionPane();
        //jOptionPane.setIcon(null);

        Object[] options = { "Confirm", "Cancel" };
        
        //Icon icon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/motoLogIcon16x16.png")));

        
        
        int choice = jOptionPane.showOptionDialog(incomingParent,message, "Warning!",
        jOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
        null, options, options[0]); 
        //jOptionPane.setIcon(icon);
        //jOptionPane.setLocation(incomingParent.getLocation());
        // 0 is delete, 1 is CANCEL
        if(choice == 0){
            return true;
        }else{
            return false;
        }
        //JDialog dialog = jOptionPane.createDialog("Are you sure you wish to perform this action?");
        //dialog.setAlwaysOnTop(true);
        //dialog.setModal(true);
        //dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        //dialog.setVisible(true);
    }
    

}
