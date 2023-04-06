/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creador;

/**
 *
 * @author pc
 */

import java.util.Scanner;

public class Juego {
    private int numeroGanador;
    private int intentos;
    private int victoriasJugador1;
    private int victoriasJugador2;
    private Scanner scanner = new Scanner(System.in);

    public void iniciar_juego() {
        // Jugador 1 elige un número
        System.out.println("Jugador 1, elige un número: ");
        numeroGanador = scanner.nextInt();
        
        //Para que no vean el número introducido
        for (int i = 0; i < 75; i++) {
            System.out.println("");
        }
        
        //Logica inicia aqui.
        intentos = 0;
        boolean adivinado = false;
        while (intentos < 3) { // número máximo de intentos
            // Jugador 2 intenta adivinar el número
            System.out.println("Jugador 2, intenta adivinar el número: ");
            int suposicion = scanner.nextInt();
            intentos++;
            if (suposicion == numeroGanador) {
                adivinado = true;
                victoriasJugador2++;
                System.out.println("¡Correcto! Has adivinado el número.");
                break;
            } else if (suposicion < numeroGanador) {
                System.out.println("Más alto");
            } else {
                System.out.println("Más bajo");
            }
        }
        if (!adivinado) {
            victoriasJugador1++;
            System.out.println("Lo siento, te has quedado sin intentos. El número era " + numeroGanador);
        }
        System.out.println("Intentos: " + intentos);
        System.out.println("Victorias Jugador 1: " + victoriasJugador1);
        System.out.println("Victorias Jugador 2: " + victoriasJugador2);
    }

}
