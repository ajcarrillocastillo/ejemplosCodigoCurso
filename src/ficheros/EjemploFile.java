/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author javila
 */
public class EjemploFile {
    
    public static void main(String args[]) throws IOException{
        
      /*  
        File miFichero = new File("fichero.txt");
        
        if(!miFichero.exists()){
            miFichero.createNewFile();
        }
        */
        
        File miDirectorioDeTrabajo = new File("c://");
        
        if(miDirectorioDeTrabajo.isDirectory()){
                   File [] lista = miDirectorioDeTrabajo.listFiles();
                   
                   for(int i=0; i<lista.length;i++){
                       System.out.println(lista[i]);
                   }
 
        }
        
        
        
    }
    
    
}
