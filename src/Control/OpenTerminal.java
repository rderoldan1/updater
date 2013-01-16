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
public class OpenTerminal{
    public OpenTerminal(){
        
    }
 
    public void nada(){
        
    }
    public void open(String server) throws IOException, InterruptedException{
        String cmd = "dir c:\\";
        Runtime run = Runtime.getRuntime(); 
        Process pr = run.exec(cmd); 
        pr.waitFor(); 
        BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream())); 
        String line = ""; 
        while ((line=buf.readLine())!=null) { 
            System.out.println(line); 
        }
    }
}
