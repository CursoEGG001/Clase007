/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meextras03;

import Canil.Mascota;

/**
 * Crea una clase "Mascota" con las propiedades "nombre", "edad", "raza" y
 * "tipo" (perro, gato, etc.). Crea un constructor para inicializar los valores
 * de las propiedades y un método para mostrar por pantalla la información de la
 * mascota. Crea un método "cumplirAnios" que aumente en uno la edad de la
 * mascota.
 *
 * @author pc
 */
public class MEExtras03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mascota canino = new Mascota("Pedrito",1,"Caniche","Toy");
        
        System.out.println("Vamos a ver a " + canino.toString() );
        canino.mostrarInformacion();
        canino.cumplirAnios();
        canino.mostrarInformacion();
    }

}
