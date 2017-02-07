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
public class EstructuraSwitch {
    public static void main(String args[]){
       int a;
       Scanner scan = new Scanner(System.in);
        System.out.println("Escriba un entero");
       a = scan.nextInt();
       
       switch(a){
           case 1:
               System.out.println("Vale 1");
               //break;
            
           case 2:
               System.out.println("Vale 2");
               break;
           default:
               System.out.println("Vale otra cosa");
       }
       
    }
    
}
