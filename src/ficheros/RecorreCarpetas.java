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
public class RecorreCarpetas {
    public static void main(String [] args){
        
        System.out.println("Introduzca el nombre de una carpeta");
        
       Scanner sc = new Scanner(System.in);
       String  carpeta = sc.nextLine();
       File miCarpeta = new File(carpeta);
       
       if(miCarpeta.isDirectory()){
           //Muestro el directorio
           File [] listaCarpeta = miCarpeta.listFiles();
           for(int i=0;i<listaCarpeta.length;i++){
               System.out.println(listaCarpeta[i]);
               
               if(listaCarpeta[i].isDirectory()&&listaCarpeta[i].canRead()){
                   //Lo vuelvo a listar
                   File[] listaSubCarpeta = listaCarpeta[i].listFiles();
                   
                   if(listaSubCarpeta!= null)
                           for(int j=0;j<listaSubCarpeta.length;j++){
                       System.out.println(listaSubCarpeta[j]);
                   }
               
           }
         
       }
           
       }
       else{
           System.out.println("Error: No es una carpeta");
       }
        
    }
}
