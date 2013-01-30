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
public class PingListener implements ActionListener{
    private VistaPrincipal m_vista ;
    private PingThread m_ping;
    private PingThread [] pings;
    public boolean bol = true;
    public PingListener(VistaPrincipal vista){
        m_vista = vista;
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        int servers = m_vista.getTable().getRowCount();
        System.out.println("click");
        pings = new PingThread[servers];
        System.out.println(servers);
        for(int i = 0; i<servers;i++){
            Object val = m_vista.getTable().getModel().getValueAt(i,0);
            System.out.println(val);
            
            if(val != null){             
                pings[i] = new PingThread();
                m_ping = pings[i];
                m_ping.setValues(m_vista, val, i, bol);
                m_ping.start();
            }
        }
    }
    
   
    
    private void stop_ping(){
        
    }
}
