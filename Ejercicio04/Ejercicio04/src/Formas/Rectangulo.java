/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Formas;

/**
 *
 * @author pc
 */
import java.util.Scanner;

public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void creaRectangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        this.base = scanner.nextDouble();
        System.out.print("Ingrese la altura: ");
        this.altura = scanner.nextDouble();
    }

    public double calculaSuperficie() {
        return base * altura;
    }

    public double calculaPerimetro() {
        return (base + altura) * 2;
    }

    public void dibujaRectangulo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void dibujaPerimetro() {

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == (altura-1) || j == 0 || j == (base-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");

        }

    }
}


