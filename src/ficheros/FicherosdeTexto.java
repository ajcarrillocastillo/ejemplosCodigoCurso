/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author javila
 */
public class FicherosdeTexto {
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        
        
        //ESCRIBIR EN FICHERO
         File f = new File("miFichero.txt");
         if(f.exists()==false) f.createNewFile();
         FileWriter fw = new FileWriter(f,false);
         
         PrintWriter pr = new PrintWriter(fw);
         
         pr.println("Una tercera cosa");
         
         pr.close();
         fw.close();
         
        
        
        
        
        
        
        //LECTURA
       
        if(!f.exists()){
            System.out.println("Error:el fichero no existe");
            System.exit(1);
        }
        
        FileReader fr = new FileReader(f);
        
        BufferedReader br = new BufferedReader(fr);
        
        String cad = br.readLine();
        
        while(cad != null){
            System.out.println(cad);
            cad = br.readLine();
        }
        
        br.close();
        fr.close();
        
    }
    
}
