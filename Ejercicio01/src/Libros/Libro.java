/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libros;

import java.util.Scanner;

public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int numeroDePaginas;

    public Libro() {
    }

    public Libro(String ISBN, String titulo, String autor, int numeroDePaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public void cargarLibro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriba el ISBN: ");
        this.ISBN = scanner.nextLine();
        System.out.print("Ingrese el título: ");
        this.titulo = scanner.nextLine();
        System.out.print("Indique el autor: ");
        this.autor = scanner.nextLine();
        System.out.print("Número de páginas: ");
        this.numeroDePaginas = scanner.nextInt();
    }

    public void informarLibro() {
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Núm. de páginas: " + this.numeroDePaginas);
    }
}