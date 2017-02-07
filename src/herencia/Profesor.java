/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author javila
 */
public class Profesor extends Persona{
    private String especialidad;
    private int reduccion;

    

    public Profesor(String nombre, String apellidos, String direccion, int edad, String especialidad,int reduccion) {
        super(nombre, apellidos, direccion, edad);
        this.especialidad = especialidad;
        this.reduccion= reduccion;
    }

    public int getReduccion() {
        return reduccion;
    }

    public void setReduccion(int reduccion) {
        this.reduccion = reduccion;
    }

       
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
 
    @Override
    public String toString(){
        
       return super.toString()+" Especialidad: "+getEspecialidad();
    }
    
    @Override
    public int horasEnCentro(){
        return 25-reduccion;
    }
    
    
    public static void main(String[] args){
        Persona unaP,otraP;
        
  
        unaP = new Profesor("Antonio", "Gomez", "C/ Estrecha 12", 37, "Informatica",3);
        
        otraP = new Alumno("Susana","Alvarez","C/ Sol 15",17,"1 Bachillerato");
    
        System.out.println(unaP.horasEnCentro());
        System.out.println(otraP.horasEnCentro());
 
    }
    
}
