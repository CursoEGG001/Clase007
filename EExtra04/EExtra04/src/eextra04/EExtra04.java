/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eextra04;

import Monedero.Cuenta;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class EExtra04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner info = new Scanner(System.in);
       Cuenta seniorA = new Cuenta( "Don Ricardo", 1243);
              
       String donsenior = info.nextLine();
       double saldoDonsenior = info.nextDouble();
       
       Cuenta seniorB = new Cuenta( donsenior, saldoDonsenior);
       
        System.out.println("El saldo de B es: " + seniorB.getSaldo());
               for (int i=0;i<6;i++) {
                   seniorA.retirar_dinero(20);
                   seniorB.retirar_dinero(200);
               }
           System.out.println("B tiene disponible : " + seniorB.getSaldo());
           System.out.println("A dispone de " + seniorA.getSaldo());
    }
    
}