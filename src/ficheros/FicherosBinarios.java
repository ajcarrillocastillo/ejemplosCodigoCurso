/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author javila
 */
public class FicherosBinarios {

public static void main(String args[]) throws IOException{
    
    File miFichero = new File("fichero.dat");
    
    if(!miFichero.exists()) miFichero.createNewFile();
    
    FileOutputStream foe = new FileOutputStream(miFichero); //Permite escribir bytes en un fichero
    
    DataOutputStream doe = new DataOutputStream(foe);//Permite escribir datos primitivos en un fichero
    
    doe.writeInt(23);
    doe.writeDouble(44.5);
    doe.writeUTF("ácido desoxirribonucléico o ADN");
    
    
    doe.close();
    foe.close();
    
    
    FileInputStream fie = new FileInputStream(miFichero);//Lee un flujo de bytes desde el ficher
    
    DataInputStream die = new DataInputStream(fie); //Interpreta un flujo de bytes como datos primitivos
    
   int a = die.readInt();
   double d = die.readDouble();
   String cad = die.readUTF();
   
   System.out.println("Los valores leidos son:"+a+" "+d+" "+ cad+" ");
   
   fie.close();
   die.close();
   
    
    
    
}
    
}
