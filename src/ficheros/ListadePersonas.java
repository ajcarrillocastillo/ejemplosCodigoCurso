/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import herencia.Persona;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author javila
 */
public class ListadePersonas {
    
    
    private ArrayList<Persona> listadePersonas;
    
    private String nombreFichero = "datos.dat";

    public ListadePersonas() {
        listadePersonas = new ArrayList<Persona>();
    }
    
    
    public void salvarArrayList() throws IOException{
       
        File f = new File(nombreFichero);
        if(!f.exists()) f.createNewFile();
        
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(f));
        
        for(Persona p: listadePersonas){
            //Orden en que escribo: nombre, apellidos,direccion,edad
            dos.writeUTF(p.getNombre());
            dos.writeUTF(p.getApellidos());
            dos.writeUTF(p.getDireccion());
            dos.writeInt(p.getEdad());
        }
        
        dos.close();
        
    }
    
    public void leeFichero() throws FileNotFoundException, IOException{
        File f = new File(nombreFichero);
        
        if(!f.exists()) throw new FileNotFoundException("Fichero no encontrado");
        
        DataInputStream dis = new DataInputStream(new FileInputStream(f));
        
        boolean salir = false;
        do{
            try{
                String nombre = dis.readUTF();
                String apellidos = dis.readUTF();
                String direccion = dis.readUTF();
                int edad = dis.readInt();
                
                Persona p = new Persona(nombre, apellidos, direccion, edad);
                anadePersona(p);
                
            }
            catch(EOFException e){
                salir = true;
            }
            
            
        }while(!salir);
        
    }
    
    public void anadePersona(Persona p){
        if(listadePersonas==null) listadePersonas = new ArrayList<Persona>();
        listadePersonas.add(p);
    }
    
     private  void muestraArrayPorPantalla(){
        for(int i=0;i<listadePersonas.size();i++){
            System.out.println(listadePersonas.get(i));
        }
    }
    
    public static void main(String args[]){
        
        ListadePersonas miLista = new ListadePersonas();
        
        //miLista.anadePersona(new Persona("Antonio Jesus","Jimenez","C/ Sol 16",24));
        try {
            //miLista.salvarArrayList();
            miLista.leeFichero();
            miLista.muestraArrayPorPantalla();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
