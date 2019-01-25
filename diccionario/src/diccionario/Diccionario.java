/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diccionario;

import ioDatos.Fichero;

/**
 *
 * @author alumno
 */
public class Diccionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fichero f=new Fichero("carta.txt");
       
        System.out.println(f.contarPalabras("leer"));
        
    }
    
}
