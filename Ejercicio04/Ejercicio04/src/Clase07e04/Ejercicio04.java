/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase07e04;
import Formas.Rectangulo;

/**
 *
 * @author pc
 */
public class Ejercicio04 {
  
    public static void main(String[] args) {
        
        Rectangulo rect = new Rectangulo();
        rect.creaRectangulo();
        double superficie = rect.calculaSuperficie();
        System.out.println("La superficie es: " + superficie);
        
        rect.dibujaRectangulo();
        
        Rectangulo irreg = new Rectangulo();
        irreg.creaRectangulo();
        double area = irreg.calculaPerimetro();
        System.out.println("Perimetrin: " + area);
        
        irreg.dibujaPerimetro();
    }
}