/*
 * Ejemplos de estructuras condicionales
 */
package estructuras;

import java.util.Scanner;

/**
 *
 * @author javila
 */
public class EstructurasCondicionales {
    
    public static void main(String args[]){
        
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un entero");
        a = sc.nextInt();
        
        //Ejemplo de IF simple
        if(a>=0) 
        {
            System.out.println("A es positivo");
            if(a>10){
                System.out.println("A tiene dos cifras");
            }
            else System.out.println("A tiene una cifra");
        }
        else{
            System.out.println("A es negativo");
        } 
        //
    
    }
}
