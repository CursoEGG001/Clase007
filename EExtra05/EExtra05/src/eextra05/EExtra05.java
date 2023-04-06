/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eextra05;

import Ente.Empleado;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class EExtra05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado chico01 = new Empleado("Dario", 34, 125611);
        Empleado chico02 = new Empleado("Fulgencio", 28, 111987);

        Scanner info = new Scanner(System.in);
        int contablesMeses;
        System.out.println("Nombre : " + chico01.getNombre() + "\n"+
                "Edad:" + chico01.getEdad() + "\n" +
                "Sueldo:" + chico01.getSalario());
 System.out.println("Nombre : " + chico02.getNombre() + "\n"+
                "Edad:" + chico02.getEdad() + "\n" +
                "Sueldo:" + chico02.getSalario());
        System.out.println("Ingrese la cantidad de meses a aumentar:");
        contablesMeses = info.nextInt();
        for (int i = 0; i < contablesMeses; i++) {
            chico01.calcular_aumento();
            chico02.calcular_aumento();
        }
        System.out.println("Estos son los sueldos actuales: \n"+
               "Nombre: "+ chico01.getNombre()+"\n" +
               "Adeudado: "+ chico01.getSalario() + "\n" +
               "Nombre: "+ chico02.getNombre() + "\n" +
               "Adeudado: "+ chico02.getSalario());
    }
}
