/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author javila
 */
public class EJemploDeTryCatch {
    
    public static void main(String [] args) {
        
        /*InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        */
      EJemploDeTryCatch ejemplo = new EJemploDeTryCatch();
      
      try{
      ejemplo.leeTeclado();
      }
      catch(IOException ex){
          ex.printStackTrace();
      }
      
        try {
            ejemplo.lanzaExcepciones();
        } catch (Exception ex) {
           //System.err.println("Error");
            JOptionPane.showMessageDialog(null, "Error");
        }
      
        
    }
    
    
    public  String leeTeclado() throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
            String s = br. readLine();
            
       
       
        return s;
    }
    
    public void lanzaExcepciones()throws IOException,Exception{
        leeTeclado();
        
        //if() si ocuerre algo
            throw new Exception("Esto es un error");
        
    }
    
    
    
}
