/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consecionario;



/**
 *
 * @author pc
 */
public class Coches {
    
    private String MarcaAuto = "Barat";
    private String ModeloAuto = "OOO";
    private double PrecioAuto = 1234;

    public Coches() {
    }
    
    public Coches(String Marca, String Modelo, double Precio){
        
     if (Marca.length()!=0 && Modelo.length()!=0 && Precio != (double) 0 ) {   
        this.MarcaAuto= Marca;
        this.ModeloAuto= Modelo;
        this.PrecioAuto= Precio;
    }
    }

    public String getMarcaAuto() {
        return MarcaAuto;
    }

    public String getModeloAuto() {
        return ModeloAuto;
    }

    public double getPrecioAuto() {
        return PrecioAuto;
    }

    public void setMarcaAuto(String MarcaAuto) {
        this.MarcaAuto = MarcaAuto;
    }

    public void setModeloAuto(String ModeloAuto) {
        this.ModeloAuto = ModeloAuto;
    }

    public void setPrecioAuto(double PrecioAuto) {
        this.PrecioAuto = PrecioAuto;
    }
    
    
    
    
}
