/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eextra01;

import Disco.Cancion;

/**
 *
 * @author pc
 */
public class EExtra01 {

    /**
     * @param args the command line arguments
     */

   public static void main(String[] args) {
        Cancion cancion1 = new Cancion();
        Cancion cancion2 = new Cancion("Bohemian Rhapsody", "Queen");

        cancion1.setTitulo("Stairway to Heaven");
        cancion1.setAutor("Led Zeppelin");

        System.out.println("Canción 1: " + cancion1.getTitulo() + " - " + cancion1.getAutor());
        System.out.println("Canción 2: " + cancion2.getTitulo() + " - " + cancion2.getAutor());
    }
}