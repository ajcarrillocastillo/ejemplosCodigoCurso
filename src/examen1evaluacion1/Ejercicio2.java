/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1evaluacion1;

import java.util.Scanner;

/**
 *
 * @author javila
 */
public class Ejercicio2 {
    
    public static void main(String args[]){
        
        double [] valores;
        int numValores;
        Scanner sc = new Scanner(System.in);
        double media=0,max=0, min=Double.MAX_VALUE;
        
        System.out.println("Introduzca numero de valores:");
        numValores= sc.nextInt();
        
        valores = new double[numValores];
        
       for(int i=0;i<numValores;i++){
           System.out.println("Introduzca valor "+(i+1));
           double valor = sc.nextDouble();
          if(valor<0){
              System.out.println("Valor incorrecto, menor que 0");
              i--;
          }
          else{
              valores[i]= valor;
          }
              
       }
       
       
       for(int i=0;i<valores.length;i++){
           if(valores[i]> max) max = valores[i];
           if(valores[i]<min) min = valores[i];
           media += valores[i]; //media = media + valores[i]
       }
        
        System.out.println("La media es:"+ (media/numValores));
        System.out.println("el rango es:"+ (max-min));
        
    }
    
}
