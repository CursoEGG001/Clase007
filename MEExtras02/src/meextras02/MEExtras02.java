/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meextras02;

import Establecimiento.Estudiante;
import static Establecimiento.Estudiante.calcularMedia;
import static Establecimiento.Estudiante.mostrarSuperiores;
import java.util.Scanner;

/**
 * 2) Crea una clase "Estudiante" con las propiedades "nombre", "edad" y "nota
 * media". Crea un método para calcular la nota media de un grupo de estudiantes
 * y otro para mostrar por pantalla los estudiantes que tienen una nota media
 * superior.
 */
public class MEExtras02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner colector = new Scanner(System.in).useDelimiter("\n") ;
        System.out.println("Ingrese la cantidad de Alumnos");
        
        int cantAlumn;
        String Cadena = "";
        int Cuantos = 0;
        double LaNota = 0;
             
        
        cantAlumn = colector.nextInt();
        if (cantAlumn < 4) {
            System.out.println("Se usará el mínimo de 4");
            cantAlumn = 4;
        }

        Estudiante[] estudiantes = new Estudiante[cantAlumn];

        estudiantes[0] = new Estudiante("Juan", 20, 7.5);
        estudiantes[1] = new Estudiante("Ana", 22, 8.2);
        estudiantes[2] = new Estudiante("Pedro", 19, 6.8);
        
        System.out.println("Ingrese nombre, edad y nota de los restantes " + (estudiantes.length - 3) + ":");
        for (int i = 3; i < estudiantes.length; i++) {
            
            Cadena = colector.next();
            colector.nextLine();
            Cuantos = colector.nextInt();
            colector.nextLine();
            LaNota = colector.nextDouble();
            colector.nextLine();
            
            estudiantes[i] = new Estudiante();
            estudiantes[i].setNombre(Cadena);
            estudiantes[i].setEdad(Cuantos);
            estudiantes[i].setNotaMedia(LaNota);
            System.out.println("Siguiente...");
        }
        
        double media = calcularMedia(estudiantes);
        System.out.println("La nota media del grupo es: " + media);

        mostrarSuperiores(estudiantes, media);
    }

}
