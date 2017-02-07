/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author javila
 */
public class RecorreCarpetasRecursivo {
    public static void main(String [] args){
        
        System.out.println("Introduzca el nombre de una carpeta");
        
       Scanner sc = new Scanner(System.in);
       String  carpeta = sc.nextLine();
       File miCarpeta = new File(carpeta);
       
       if(miCarpeta.isDirectory()){
           
           recorreCarpeta(miCarpeta);
       }
       else{
           System.out.println("Error: No es una carpeta");
       }
        
    }
    
    
    public static void  recorreCarpeta(File f){
        
        if(f.isDirectory()){
            File [] listaF = f.listFiles();
            if(listaF!= null)
                for(int i=0;i<listaF.length;i++){
                    System.out.println(listaF[i]);
                    if(listaF[i].isDirectory()){
                        recorreCarpeta(listaF[i]);
                    }

                }
        }
        
    }
}
