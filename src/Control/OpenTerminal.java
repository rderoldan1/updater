/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SSrdespinosa
 */
public class OpenTerminal extends Thread{
     private Object server ;
    
     public void setServer(Object server1){
         server = server1;
     }
     public void run() {
        try {
            
            System.out.println(server);
            String cmd = "mstsc /v:" + server;
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
            }
        } catch (Exception ex) {
              System.out.println(ex); 
        }
    }
}
