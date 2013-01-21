/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Vista.VistaPrincipal;
import Control.AceptarListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author SSrdespinosa
 */
public class ControlPrincipal {
    public VistaPrincipal m_vista;
       
    public ControlPrincipal(VistaPrincipal vista){
        m_vista = vista;
        m_vista.addAceptarListener(new AceptarListener(vista));
        m_vista.addFilaListener(new FilaListener());
        m_vista.addPingListener(new PingListener(vista));
        m_vista.addReiniciarListener(new ReiniciarListener(vista));
    }
    
    
    
   
    
    class FilaListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
           System.out.println("click");
           m_vista.addRow();
        }
    }
    
    
    
}
