/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Coordenadas;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Puntos {

    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public Puntos() {
    }

    public Puntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getAbscisaX1() {
        return x1;
    }

    public double getAbscisaX2() {
        return x2;
    }

    public double getOrdenadasY1() {
        return y1;
    }

    public double getOrdenadasY2() {
        return y2;
    }

    public void setAbscisaX1(double x1) {
        this.x1 = x1;
    }

    public void setAbscisaX2(double x2) {
        this.x2 = x2;
    }

    public void setOrdenadasY1(double y1) {
        this.y1 = y2;
    }

    public void setOrdenadasY2(double y2) {
        this.y2 = y2;
    }

    public double getDistancia() {
        double Distancia;
        Distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return Distancia;
    }

    public void creaPuntos() {
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese el punto 1 en x");
        x1 = datos.nextInt();
        System.out.println("Ingrese el punto 1 en y");
        y1 = datos.nextInt();
        System.out.println("Ingrese el punto 2 en x");
        x2 = datos.nextInt();
        System.out.println("Ingrese el punto 2 en y");
        y2 = datos.nextInt();
    }

    public void presentaPuntos() {

        // Obtiene la distancia entre los puntos
        double distancia = getDistancia();

        // Calcula el vector normalizado
        double dx = (x2 - x1) / distancia;
        double dy = (y2 - y1) / distancia;

        // Factor de escalado para una de 10 por 10
        double Escalado = Math.min(10.0 / Math.abs(dx), 10.0 / Math.abs(dy));

        // Calculo de cooredenadas escaladas
        double sx1 = x1 / distancia * Escalado;
        double sy1 = y1 / distancia * Escalado;
        double sx2 = x2 / distancia * Escalado;
        double sy2 = y2 / distancia * Escalado;

        int maxX = (int) Math.max(sx1, sx2); // Maximo en x
        int maxY = (int) Math.max(sy1, sy2); // Maximo en y 

        // Arreglo de representación
        int p1x = (int) Math.round(sx1);
        int p2x = (int) Math.round(sx2);
        int p1y = (int) Math.round(sy1);
        int p2y = (int) Math.round(sy2);

        // muestra puntos
        System.out.println("Puntos:");
        for (int i = maxY+1; i >= 0; i--) {
            for (int j = 0; j <= maxX+1; j++) {
                if (j == p1x && i == p1y) {
                    System.out.print("A");
                } else if (j == p2x && i == p2y) {
                    System.out.print("B");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
        System.out.println("Máximo X: " + maxX + " Máximo en Y: " + maxY);

    }
}
