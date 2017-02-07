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
public class EjemploFor {
    public static void main(String[] args){
        int [] array;
        int numElementos;
        Scanner sc = new Scanner(System.in);
        
        do{
        System.out.println("Introduzca numero de elementos, mayor que 0");
        numElementos = sc.nextInt();
        
        }while(numElementos<0);
        
        /*if(numElementos<0){
            System.out.println("Error: ELementos no puede ser negativo");
            System.exit(0);//Salir del programa
        }*/
       
        //Declara array
        array = new int[numElementos];
        
        //Leer el array
        for(int i =0;i<numElementos;i++){
          
            System.out.println("Introduzca valor "+i);
            array[i]= sc.nextInt();
            
        }
        
       /* for(int numero: array){
            System.out.println("Elemento:" +numero);
        }
        */
        
        for(int i=0;i<numElementos;i++){
            System.out.println("Elemento:"+ array[i]);
        }
    }
}
