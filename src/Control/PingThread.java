/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Vista.VistaPrincipal;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author SSrdespinosa
 */
public class PingThread extends Thread {
    private VistaPrincipal vista;
    private Object server;
    private int row;
    private boolean bol;
    
    public void setValues(VistaPrincipal m_vista, Object m_server, int m_row, boolean m_bol){
        vista = m_vista;
        server = m_server;
        row = m_row;
        bol = m_bol;
    }
    
    public void run(){
       try {
        for(int i = 0; i <= 1000; i++){
            //System.out.println(server);
            String cmd = "ping " + server+" -n 1";
            Runtime run = Runtime.getRuntime(); 
            Process pr = run.exec(cmd); 
            try { 
                pr.waitFor();
            } catch (Exception ex) {
                System.out.println(ex); 
            }
            BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream())); 
            String line = ""; 
            while ((line=buf.readLine())!=null) { 
                
                vista.setRowValue(3, row, line);
            }
            System.out.println(i); 
          } 
       }catch (Exception ex) {
              System.out.println(ex); 
                    
       }
    }
    
}
