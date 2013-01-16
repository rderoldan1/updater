/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Vista.VistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author SSrdespinosa
 */
public class ControlPrincipal {
    private VistaPrincipal m_vista;
    private OpenTerminal m_OpenTerminal;
   
    public ControlPrincipal(VistaPrincipal vista){
        m_vista = vista;
        m_vista.addAceptarListener(new AceptarListener());
        m_vista.addFilaListener(new FilaListener());
    }
    
    
    
    class AceptarListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
           String servers[] = new String [m_vista.getTable().getRowCount()];
           System.out.println("click");
           System.out.println(servers.length);
           for(int i = 0; i<servers.length;i++){
               Object val = m_vista.getTable().getModel().getValueAt(i,0);
             try {
               if(val != null){
                 
                       System.out.println(val);
                       m_vista.setRowValue(1, i, "Abriendo");
                       m_OpenTerminal.open(val.toString());                                     
               }
               } catch (Exception ex) {
                       Logger.getLogger(ControlPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                   }
           }
        }
    }
    
    class FilaListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
           System.out.println("click");
           m_vista.addRow();
        }
    }
    
    
    
}
