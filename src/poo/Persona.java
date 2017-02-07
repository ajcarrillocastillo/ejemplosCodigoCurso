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
public class Persona {
   
    //Atributos
    private String nombre;
    private int edad;
    private String direccion;
    private int codigo;
    
    private static int ultimoCodigo =0;
    
    public Persona(){//Constructor por defecto (No recibe parametros)
        
        nombre = "";
        direccion = "";
        edad =0;
       asignaCodigo();
        
    }

   
    
    public Persona(String nombre,int edad){
        
        this.nombre = nombre; //Ejemplo de uso el puntero this
        this.edad = edad;
        asignaCodigo();
    }
    
    
    private void asignaCodigo(){
        codigo = ultimoCodigo;
        ultimoCodigo++;
    }
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void cambiaNombre(String nuevoNombre){
       nombre = nuevoNombre; 
    }
    
    public String getNombre(){
        return nombre;
    }
    
    
    
   public void setEdad(int nuevaEdad){
       edad = nuevaEdad;
   }
   
  
   //Sobrecarga del metodo setEdad
   public void setEdad (String nuevaEdad){
       //edad = Integer.parseInt(nuevaEdad);//Transforma entero a cadena
  
       int e = Integer.parseInt(nuevaEdad);
       setEdad(e); //llamo a setEdad (int)
   
   }
   

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }
    
   
   
}
