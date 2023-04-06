/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase07e03;

/**
 *
 * @author pc
 */
import DeCalcular.Operacion; 

public class Ejercicio03 {
    public static void main(String[] args) {
        Operacion op = new Operacion();
        op.crearOperacion();
        double suma = op.sumar();
        System.out.println("La suma es: " + suma);
        System.out.println("Multiplica: "+ op.multiplicar());
        System.out.println("Una división: "+op.dividir());
        double resta1 = op.restar();
        System.out.println("Aquí va la resta: "+ resta1);
    }
}