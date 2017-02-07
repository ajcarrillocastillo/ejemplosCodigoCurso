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
public class EjemploWhile {
    public static void main(String[] args) {
        int a=1,b=0;
        
        Scanner scan = new Scanner(System.in);
        
        /*while(a==b){
            System.out.println("Escriba primer valor");
            a = scan.nextInt();
            System.out.println("Escriba segundo valor");
            b = scan.nextInt();
        }
        */
        
        do{
           System.out.println("Escriba primer valor");
            a = scan.nextInt();
            System.out.println("Escriba segundo valor");
            b = scan.nextInt(); 
            
        } while(a==b);
    }
    
}
