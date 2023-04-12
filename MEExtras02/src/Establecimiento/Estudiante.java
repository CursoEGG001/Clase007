/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Establecimiento;

/**
 *
 * @author pc
 */
public class Estudiante {

    private String Nombre;
    private int Edad;
    private double NotaMedia;

    public Estudiante() {
    }

    public Estudiante(String Nombre, int Edad, double NotaMedia) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.NotaMedia = NotaMedia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getNotaMedia() {
        return NotaMedia;
    }

    public void setNotaMedia(double NotaMedia) {
        this.NotaMedia = NotaMedia;
    }

    // Método para calcular la nota media de un grupo de estudiantes
    public static double calcularMedia(Estudiante[] estudiantes) {
        double suma = 0;
        for (int i = 0; i < estudiantes.length; i++) {
            suma += estudiantes[i].getNotaMedia();
        }
        return suma / estudiantes.length;
    }

    // Método para mostrar por pantalla los estudiantes con nota media superior
    public static void mostrarSuperiores(Estudiante[] estudiantes, double media) {
        System.out.println("Estudiantes con nota media superior a " + media + ":");
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getNotaMedia() > media) {
                System.out.println(estudiantes[i].getNombre() + " - " + estudiantes[i].getNotaMedia());
            }
        }
    }

    
}