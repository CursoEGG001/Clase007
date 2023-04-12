/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meextras01;

import Consecionario.Coches;

/**
 * 1) Crea una clase "Coche" con las propiedades "marca", "modelo" y "precio".
 * Crea tres objetos de la clase "Coche" y muéstralos por pantalla.
 */
public class MEExtras01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Coches Primer = new Coches();
        Coches Segundo = new Coches();
        Coches Tercer = new Coches( "Muon","Quartz", 4321);
        
        Segundo.setMarcaAuto("Taran");
        Segundo.setModeloAuto("Curva");
        Segundo.setPrecioAuto(6666);
        
        System.out.println("Estos son los coches elegidos\n" +
                "Primero: " + Primer.getMarcaAuto() +
                "\n Modelo - " + Primer.getModeloAuto() + "\ta $" + Primer.getPrecioAuto() +
                "\nSegundo: " + Segundo.getMarcaAuto() +
                "\n Modelo - " + Segundo.getModeloAuto() + "\ta $" + Segundo.getPrecioAuto() +
        "\nTercero: " + Tercer.getMarcaAuto() +
                "\n Modelo - " + Tercer.getModeloAuto() + "\ta $" + Tercer.getPrecioAuto() );
    }

}
