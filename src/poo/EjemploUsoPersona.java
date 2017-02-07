/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import examen1evaluacion1.*;

/**
 *
 * @author javila
 */
public class EjemploUsoPersona {
  public static void main (String[] args ){
      
      Persona p,otraPersona ; // Declaro la variable
      p = new Persona();//Creo el objeto
      otraPersona = new Persona("Pepe", 45);
      
      
      Ejercicio1 eje =  new Ejercicio1();
      p.cambiaNombre("Antonio");
      p.setEdad(19);
      p.setEdad("23");
      //otraPersona.cambiaNombre("Pepillo");
      //otraPersona.setEdad(33);
      
      System.out.println("Nombre:"+p.getNombre()+" Edad:"+p.getEdad());
     
       System.out.println("Nombre:"+otraPersona.getNombre()+" Edad:"+otraPersona.getEdad());
     
      
          p.cambiaNombre("Pedro");
      p.setEdad(23);
      
      System.out.println("Nombre:"+p.getNombre()+" Edad:"+p.getEdad());
      
  }  
}
