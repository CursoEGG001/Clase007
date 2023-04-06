/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eextra03;

import Creador.Juego;

/**
 *
 * @author pc
 */
public class EExtra03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego juego = new Juego();
        for (int i = 0; i < 7; i++) {
            if (i==0) System.out.println("Empecemos el juego...");
             juego.iniciar_juego();
        }
       
    }
}