/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esconsola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author javila
 */
public class EsConsola {
    public static void main(String[] args){
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
   
            
        try {
            
            System.out.println("Escribe un entero");
            String cadena = br.readLine();
            
            int a = Integer.parseInt(cadena);
            
            System.out.println("el numero es:"+ a);
            
        } catch (IOException exception) { 
            exception.printStackTrace();
            System.err.println("Error");
            
        }
        catch(NumberFormatException ex){
            
            //ex.printStackTrace();
            System.out.println("Debia poner un entero");
        }
        
}
}

