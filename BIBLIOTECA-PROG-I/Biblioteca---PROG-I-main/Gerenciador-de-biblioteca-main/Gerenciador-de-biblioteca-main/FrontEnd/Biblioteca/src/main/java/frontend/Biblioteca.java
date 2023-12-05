/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package frontend;

import java.util.HashSet;

/**
 *
 * @author felipe
 */
public class Biblioteca {

    public static void main(String[] args) {
        Menu frm = new Menu();
        
        try{
            javax.swing.UIManager.setLookAndFeel(
                    javax.swing.UIManager.getSystemLookAndFeelClassName());            
        }catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                javax.swing.UnsupportedLookAndFeelException ex){
            java.util.logging.Logger.getLogger(Biblioteca.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        }
        
        frm.setVisible(true);
    }
}
