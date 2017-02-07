/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.util.Scanner;

/**
 *
 * @author javila
 */
public class EstructuraSwitchConDoWhile {
    public static void main(String args[]){
       int a;
       Scanner scan = new Scanner(System.in);
        
       
       boolean correcto= true;
       do{
           System.out.println("Escriba un entero, 1 0 2");
           a = scan.nextInt();
            switch(a){
                case 1:
                    System.out.println("Vale 1");
                    correcto=true;
                    break;

                case 2:
                    System.out.println("Vale 2");
                     correcto=true;
                    break;
                default:
                    System.out.println("Vale otra cosa");
                     correcto=false;
            }
       }while(!correcto);//correcto ==false
            
       
    }
    
}
