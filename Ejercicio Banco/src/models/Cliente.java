/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author aleja
 */
public abstract class Cliente {

    private String rut;
    private String nombre;
    private String apellido;
    protected double sueldo;

    public Cliente() {
    }

    public Cliente(String rut, String nombre, String apellido, double sueldo) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\nrut:").append(rut);
        sb.append("\nnombre:").append(nombre);
        sb.append("\napellido:").append(apellido);
        sb.append("\nsueldo:").append(sueldo);

        return sb.toString();
    }

    public abstract String comprar(double montoCompra);
    
    public abstract String pedirCredito(double montoCredito);
}
