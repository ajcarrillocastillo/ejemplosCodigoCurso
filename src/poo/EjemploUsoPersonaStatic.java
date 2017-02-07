/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author javila
 */
public class EjemploUsoPersonaStatic {
    
    public static void main(String [] args){
        Persona p = new Persona();
        Persona otraP = new Persona("ANtonio",25);
        
        System.out.println("Codigo P:"+p.getCodigo());
        System.out.println("Codigo otraP:"+otraP.getCodigo());
        
        p= new Persona();
        System.out.println("Codigo P:"+p.getCodigo());
        
        otraP = p;
         System.out.println("Codigo otraP:"+otraP.getCodigo());
        
    }
    
}
