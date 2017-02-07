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
public class Alumno extends  Persona{
    
    private String curso;

    
    public Alumno(String nombre,String apellidos,String direccion,int edad, String curso ){
    
         super(nombre, apellidos, direccion, edad);//lama al constructor de la superclase
         this.curso = curso;

        //setNombre(nombre);
        
    }
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public String toString(){
        return super.toString()+" Curso:"+getCurso();
    }
    
    
   @Override
    public int horasEnCentro() {
        return 30;
    }
    
    
    public static void main(String args[]){
        
        Persona p = new Alumno("Juan","gomez","Juan carlos I",23,"CFGS1");
       
        
        System.out.println(p);
    }

    

    
    
}
