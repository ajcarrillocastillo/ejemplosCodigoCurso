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
public class EjemploMenu {
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //Imprimo el menú
        int operador1,operador2;
        System.out.println("ELIJA UNA OPCIÓN");
        System.out.println("S-Sumar");
        System.out.println("R-Restar");
        char opcion = sc.next().charAt(0);//Devuleve el caratcer que está en la posición 0
        
        switch(opcion){
            
            case 'S':
                //La acción de sumar
                System.out.println("Introduzca primer valor");
                operador1 = sc.nextInt();
                System.out.println("Introduzca segundo valor");
                operador2 = sc.nextInt();
                System.out.println("el resultado es"+(operador1+operador2));
                break;
            case 'R':
                //La acción de restar
                System.out.println("Introduzca primer valor");
                operador1 = sc.nextInt();
                System.out.println("Introduzca segundo valor");
                operador2 = sc.nextInt();
                System.out.println("el resultado es"+(operador1-operador2));
                break;
            default:
                System.out.println("opción incorrecta");
        }
    
    }
}
