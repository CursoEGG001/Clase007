/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author pc
 */
public class Persona {

    public String nombre;

    public Persona() {

    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    public String sacaNombre() {
        return nombre;
    }

    public void ponNombre(String nombre){
        this.nombre= nombre;
    }
}
