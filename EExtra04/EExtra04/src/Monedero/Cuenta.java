/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Monedero;

/**
 *
 * @author pc
 */
public class Cuenta {
    private double saldo;
    private String titular;
    
    public Cuenta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    
    public synchronized void retirar_dinero(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("No hay suficiente saldo para retirar esa cantidad.");
        } else {
            saldo -= cantidad;
            System.out.println("Se retiraron " + cantidad + " unidades. El saldo actual es: " + saldo);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
}
