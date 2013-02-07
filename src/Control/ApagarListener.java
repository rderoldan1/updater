/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Vista.VistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author SSrdespinosa
 */
public class ApagarListener implements ActionListener{
    private VistaPrincipal m_vista ;
    private ApagarThread m_apagar;
    
    public ApagarListener(VistaPrincipal vista){
        m_vista = vista;        
    }
   
    public void actionPerformed(ActionEvent e){
        
        int servers = m_vista.getTable().getRowCount();
        System.out.println("click");
        System.out.println(servers);
        for(int i = 0; i<servers;i++){
            Object val = m_vista.getTable().getModel().getValueAt(i,0);
            System.out.println(val);
            
            if(val != null){    
                m_apagar = new ApagarThread();
                m_vista.setRowValue(2, i, "Reiniciando");
                m_apagar.setValues(val);
                m_apagar.start();
                
            }
        }
     }
    
}
