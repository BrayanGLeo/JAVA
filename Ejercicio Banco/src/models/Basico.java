/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author aleja
 */
public final class Basico extends Cliente implements IBanco{
    private double descuento;

    public Basico() {
    }

    public Basico(String rut, String nombre, String apellido, double sueldo) {
        super(rut, nombre, apellido, sueldo);
        this.descuento = 0.05;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Basico: ");
        sb.append(super.toString());
        sb.append("\ndescuento:").append(descuento);

        return sb.toString();
    }

    @Override
    public String comprar(double montoCompra) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   
        return "Compra total $" + montoCompra + " descuento $" + montoCompra*descuento;
           
    }

    @Override
    public String pedirCredito(double montoCredito) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if(sueldo>=450000){
            return "Interes del credito " + (INTERES_BASE-1) + "%";
        }
        
        return "Interes del credito " + (INTERES_BASE) + "%";
    }

    @Override
    public void actualizar() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if(sueldo>=450000){
            descuento=0.1;
        }
    }

    @Override
    public boolean upgrade() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if(sueldo>450000){
            return true;
        }
        
        return false;
    }
   
    
    
}
