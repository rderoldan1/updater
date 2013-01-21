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
    
    public void setValues(VistaPrincipal m_vista, Object m_server, int m_row){
        vista = m_vista;
        server = m_server;
        row = m_row;
    }
    public void run(){
       try {
        while(true){
            System.out.println(server);
            String cmd = "ping " + server;
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
                System.out.println(line); 
                vista.setRowValue(3, row, line);
            }
          } 
       }catch (Exception ex) {
              System.out.println(ex); 
                    
       }
    }
    
}
