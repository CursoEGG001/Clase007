/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase07e02;

import Figuras.Circunferencia;


/**
 *
 * @author pc
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        
        Circunferencia mia = new Circunferencia(2);
        System.out.println("Comienza con: "+ mia.getRadio());
                
        mia.setRadio(22);
        
        System.out.println("Le pongo mas grande...\n Sería : "+ mia.getRadio());
        System.out.println(mia.area() + " Sería el área");
        
        mia.crearCircunferencia();
        
        double dameElRadio = mia.getRadio();
        System.out.println("Este sería el radio: " + dameElRadio);
        System.out.println("Podría imprimir el perímetro y sería: "+mia.perimetro());
    }
}
