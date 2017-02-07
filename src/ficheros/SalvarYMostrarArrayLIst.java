/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import herencia.Persona;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author javila
 */
public class SalvarYMostrarArrayLIst {
    
    private static  ArrayList<Persona> personas;
    
    private static void cargaFichero(File f) throws FileNotFoundException, IOException{//Carga los datos de 
        
        if(!f.exists()) throw new FileNotFoundException("El fichero no existe");
        
        BufferedReader br = new BufferedReader(new FileReader(f));
        
        String cad= br.readLine();
        while(cad  != null){
            String []datosPersona = cad.split(",");
            Persona p = new Persona(datosPersona[0],datosPersona[1],datosPersona[2], Integer.parseInt(datosPersona[3]));
            personas.add(p);
            cad = br.readLine();
        }
        
        br.close();
        
    }
    
    
    private static void guardarFichero(File f) throws IOException{
        if(!f.exists()) f.createNewFile();
        
        PrintWriter pw = new PrintWriter(new FileWriter(f));
        
        for(Persona p: personas){
            
            String cadena = p.getNombre()+","+p.getApellidos()+","+p.getDireccion()+","+p.getEdad();
            pw.println(cadena);
            
        }
        
        pw.close();
        
    }
    
    
    private static void muestraArrayPorPantalla(){
        for(int i=0;i<personas.size();i++){
            System.out.println(personas.get(i));
        }
    }
    
    
    public static void main(String[] args){
        
        File fichero = new File("personas.txt");
        personas = new ArrayList<Persona>();
        
        
        try {
        
            cargaFichero(fichero);
        
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        muestraArrayPorPantalla();
        
        try {
            guardarFichero(fichero);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
}
