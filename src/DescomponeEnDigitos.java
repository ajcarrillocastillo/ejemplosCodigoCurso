
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javila
 */
public class DescomponeEnDigitos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();
        int digito=0;
        int numeroDigitos=0;
        int mayor=Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        //Comprobar que el nuemro es positivo
        
        while(numero>0){
             digito = numero %10;
             //System.out.print(digito+"  ");
             numero = (numero - digito)/10;
             numeroDigitos++;
             if(digito>mayor){
                 mayor = digito;
             } 
             
             if(digito<menor) menor = digito;
        }
        
        System.out.println("numero de digitos:"+numeroDigitos);
        System.out.println("Digito mayor:"+ mayor);
        System.out.println("Digito menos:"+ menor);
        
    }
}
