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
public class InterfazUsuario {
    
   
    
    
    public static void main(){
        
        //Inicializao el almacen
      
        
        muestraMenu();
        int opcion =1; //LA OPCION SE LEE DE UN SCANNER
        
        switch(opcion)
        {
            case 1:
                //Alta de nuevo profesor
                //Leer los datos del profesor por teclado
                String nombre=null,apellidos=null,direccion=null, especialidad = null;
                int edad=0;
                int reduccion=0;
                //Crearte el nuevo objeto profesor
                Profesor p = new Profesor(nombre, apellidos, direccion, edad, especialidad, reduccion);
                
                
                //Guardar el objeto en el almacen
                
                Almacen.devolverAlmacen().guardaProfesor(p);
        }
        
    }
    
    public static void muestraMenu(){
        System.out.println("1-Muevo profesor");
    }
    
}
