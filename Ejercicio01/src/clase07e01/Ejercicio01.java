/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase07e01;

import Libros.Libro;

/**
 *
 * @author pc
 */
public class Ejercicio01 {

    public static void main(String[] args) {

        Libro nuevoLibro = new Libro();

        nuevoLibro.cargarLibro();
        nuevoLibro.informarLibro();

        Libro otroLibro = new Libro("122123", "nombrelibro", "algoautor", 700);
        System.out.println("Este está cargado desde parametros\n\n");
        otroLibro.informarLibro();

    }

}
