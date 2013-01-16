/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package updater;

import Control.ControlPrincipal;
import Vista.VistaPrincipal;

/**
 *
 * @author SSrdespinosa
 */
public class Updater {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             
        VistaPrincipal vista = new VistaPrincipal();
        ControlPrincipal control = new ControlPrincipal(vista);
        
        vista.setVisible(true);
    }
}
