/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eextra02;

import Coordenadas.Puntos;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class EExtra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Puntos sueltos = new Puntos();
        Scanner numeros = new Scanner(System.in);
        
        System.out.println("Ponele unos puntos:");
        sueltos.creaPuntos();
              
        System.out.println("Su x1 es: " + sueltos.getAbscisaX1() );
        System.out.println("Vamos a cambiarlos :");
        sueltos.setAbscisaX1(numeros.nextInt());
        
        System.out.println("Buscaremos la distancia...\n"
                + " Esta es su distancia :" + sueltos.getDistancia() );
        
        double x1 = 8.0;
        double y1 = 1.0;
        double x2 = 7.0;
        double y2 = 4.0;

        double dx = x2 - x1;
        double dy = y2 - y1;
        double magnitude = Math.sqrt(dx * dx + dy * dy);
        double nx = dx / magnitude;
        double ny = dy / magnitude;

        System.out.println("Punto 1: (" + x1 + ", " + y1 + ")");
        System.out.println("Punto 2: (" + x2 + ", " + y2 + ")");
        System.out.println("Vector normalizado: (" + nx + ", " + ny + ")");

        System.out.println();
        System.out.println("Representación gráfica:");
        for (int y = 0; y <= 8; y++) {
            for (int x = 0; x <= 7; x++) {
                if (x == (int) x1 && y == (int) y1) {
                    System.out.print("P1");
                } else if (x == (int) x2 && y == (int) y2) {
                    System.out.print("P2");
                } else {
                    System.out.print(" .");
                }
            }
            System.out.println();
        }
    }
}

