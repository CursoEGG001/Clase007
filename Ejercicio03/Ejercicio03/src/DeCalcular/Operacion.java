/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DeCalcular;

import java.util.Scanner;

public class Operacion {
    private double numero1;
    private double numero2;

    public Operacion() {
    }

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        this.numero1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        this.numero2 = scanner.nextDouble();
    }

    public double sumar() {
        return numero1 + numero2;
    }

    public double restar() {
        return numero1 - numero2;
    }

    public double multiplicar() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Es por cero.");
            return 0;
        } else {
            return numero1 * numero2;
        }
    }

    public double dividir() {
        if (numero2 == 0) {
            System.out.println("¡No se puede dividir por cero!");
            return 0;
        } else {
            return numero1 / numero2;
        }
    }
}
