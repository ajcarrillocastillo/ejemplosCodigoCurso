/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.ArrayList;

/**
 *
 * @author javila
 */
public class Almacen {
    
    private ArrayList<Profesor> listaDeProfesores;
    
    private static Almacen miAlmacen = null;
    
    public static Almacen devolverAlmacen(){
        
        if(miAlmacen!= null) return miAlmacen;
        else{
            miAlmacen = new Almacen();
            return miAlmacen;
        }
    }
    
    
    private Almacen(){
        listaDeProfesores = new ArrayList<Profesor>();
    }
    
    public void guardaProfesor(Profesor profe){
        listaDeProfesores.add(profe);
        
    }
    
    public Profesor obtenerProfesor(int i){
        
        return listaDeProfesores.get(i);
        
    }
    
    public Profesor[] listarProfesores(){
        Profesor p[] = new Profesor[listaDeProfesores.size()];
        
        for(int i =0 ;i<listaDeProfesores.size();i++){
            p[i]= listaDeProfesores.get(i);
        }
        
        return p;
    }
         
}
