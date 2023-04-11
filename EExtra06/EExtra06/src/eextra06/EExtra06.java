/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eextra06;

import Figuras.Rectangulo;

/**
 *
 * @author pc
 */
public class EExtra06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Rectangulo rectangulo1 = new Rectangulo(4, 6);
         
         System.out.println("El rectangulo tiene " + rectangulo1.getLado1() +
                 " en un lado y " + rectangulo1.getLado2() + " en el otro.");
         
        System.out.println("El área del rectángulo es: " + rectangulo1.calcular_area());
        
        Rectangulo unrectangulito01 = new Rectangulo(11,27);
        
        System.out.println("Un lado de este rectangulo es " + unrectangulito01.getLado1());
        
        unrectangulito01.setLado1(4);
        
        System.out.println("El rectangulo "+ unrectangulito01.toString() + " es ahora de " + unrectangulito01.getLado1() + " por " + unrectangulito01.getLado2());

    }
}