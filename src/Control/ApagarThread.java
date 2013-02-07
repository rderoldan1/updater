/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author SSrdespinosa
 */
public class ApagarThread extends Thread{
    private Object server ;
     public void setValues(Object server1){
         server = server1;
     }
     
     public void run() {
        try{   
            Runtime run = Runtime.getRuntime(); 
            String cmd = "shutdown -m "+ server +" -t 00 -s -f " ;
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
