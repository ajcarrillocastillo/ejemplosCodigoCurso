/*
 *.
 */
package examen1evaluacion1;

import java.util.Scanner;

/**
 *
 Ejercicio 1: Miuestra menu y calcula longitud de circunferencia y radio
 */
public class Ejercicio1 {
    
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        double radio=0, resultado=0;
        char valorMenu=0;
        
        do{
            System.out.println("a-area");
            System.out.println("l-longitud");
            valorMenu = sc.next().charAt(0);
        }while(valorMenu!='a'&& valorMenu!='l');//se sale solo si es una opcion correcta
        
        System.out.println("Introduzca el valor de radio:");
        
        if(sc.hasNextDouble())
         radio = sc.nextDouble();
            if(radio<0){
                System.out.println("Radio negativo, tomamos radio =0");
                radio=0;
            }
        else{
            System.out.println("No has escrito un double. Se toma radio =0");
            radio=0;
        }
        
        switch(valorMenu){
            case 'a':
                  resultado = Math.PI*radio*radio; //Math.pow(radio,2)
                System.out.println("El area vale:"+ resultado );
                break;
            case 'l':
                resultado = 2* Math.PI*radio;
                System.out.println("La longitud mide: "+ resultado);
                break;
            default:
                System.out.println("Opcion Incorrrecta");
            
        }
        
    }
}
