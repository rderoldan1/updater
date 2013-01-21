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
     private String user;
     private String password;
    
     public void setValues(Object server1, String user1, String pass1){
         server = server1;
         user = user1;
         password = pass1;
     }
     public void run() {
        try {
            
            System.out.println(server);
            
            
            Runtime run = Runtime.getRuntime(); 
            run.exec("cmdkey /generic:"+server+" /user:"+user+" /password:"+password);
            String cmd = "mstsc /v:" + server;
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
             run.exec("cmdkey /delete:"+server);
        } catch (Exception ex) {
              System.out.println(ex); 
        }
       
    }
}
