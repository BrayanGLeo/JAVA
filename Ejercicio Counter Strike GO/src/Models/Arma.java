/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author braya
 */
public class Arma {

    private String nombre;
    private double daño;
    private String descripcion;

    public Arma() {
    }

    public Arma(String nombre, double daño, String descripcion) throws Exception {
        this.setNombre(nombre);
        this.setDaño(daño);
        this.setDescripcion(descripcion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (!nombre.isBlank() && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            throw new Exception ("El nombre no puede estar vacio");
        }
    }

    public double getDaño() {
        return daño;
    }

    public void setDaño(double daño) throws Exception {
        if (daño >= 0) {
            this.daño = daño;
        } else {
            throw new Exception("El daño debe ser positivo");
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n*****Arma*****");
        sb.append("\nNombre= ").append(nombre);
        sb.append(" // Dano= ").append(daño);
        sb.append(" // Descripcion= ").append(descripcion);
        return sb.toString();
    }

    public void aumentoDaño (int aumento) throws Exception {
        if (aumento > 0) {
            this.daño += aumento;
        } else {
            throw new Exception("El aumento debe ser positivo");
        }
    }

}
