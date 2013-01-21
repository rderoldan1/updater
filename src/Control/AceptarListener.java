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
 class AceptarListener implements ActionListener{
     
     private VistaPrincipal m_vista ;
     private OpenTerminal m_OpenTerminal ;
     
     public AceptarListener(VistaPrincipal vista){
          m_vista = vista;
     }
     
     @Override
     public void actionPerformed(ActionEvent e){
           int servers = m_vista.getTable().getRowCount();
           System.out.println("click");
           System.out.println(servers);
           for(int i = 0; i<servers;i++){
               Object val = m_vista.getTable().getModel().getValueAt(i,0);
               String user = m_vista.getUser();
               String password = m_vista.getPassword();
               System.out.println(val);
            
               if(val != null){              
                      
                       m_vista.setRowValue(1, i, "Abriendo");
                       m_OpenTerminal = new OpenTerminal();
                       m_OpenTerminal.setValues(val, user, password);
                       m_OpenTerminal.start();                                     
               }
              
           }
        }
    }