/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author CETECOM
 */
public class Arma {

    private String nombre;
    private int daño;

    public Arma(String nombre, int daño) {
        this.nombre = nombre;
        this.daño = daño;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) throws Exception {
        if (daño > 0) {
            this.daño = daño;
        } else {
            throw new Exception("Daño debe ser mayor o igual a cero");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (!nombre.isBlank() && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            throw new Exception("El nombre de arma no puede estar vacio");
        }
    }

    @Override
    public String toString() {
        return "Arma:" + nombre + " daño=" + daño;
    }
}

