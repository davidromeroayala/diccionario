/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioDatos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class Fichero {
    private String nombre;
    private String ruta;
    File fichero;
    
    public Fichero(String nombre, String ruta) {
        this.nombre = nombre;
        this.ruta = ruta;
        fichero =new File(ruta,nombre);
        if(!fichero.exists()){
            try {
                fichero.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public Fichero(String nombre) {
        this.nombre = nombre;
        this.ruta = "datos";
        fichero =new File(ruta,nombre);
        if(!fichero.exists()){
            try {
                fichero.createNewFile();
            } catch (IOException ex) {
                System.out.println("Erorr al crear el fichero");;
            }
        }
    
    }
    public int contarPalabras(String palabra){
    int contador=0;
    Scanner leer=null;
        try {
            leer = new Scanner(fichero);
        } catch (FileNotFoundException ex) {
            System.out.println("No se encontro el fichero");
        }
        if(leer!=null)
        while (leer.hasNext()){
            String linea=leer.nextLine();
            if(linea.contains(palabra)){
            contador++;
            }
        }
        
            return contador;
       
    }
}
