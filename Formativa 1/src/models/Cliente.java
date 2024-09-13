/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author CETECOM
 */
public class Cliente {

    private String rut;
    private String nombre;
    private String apellido;

    public Cliente() {
    }

    public Cliente(String rut, String nombre, String apellido) throws Exception {
        this.setRut(rut);
        this.setNombre(nombre);
        this.setApellido(apellido);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) throws Exception {
        if (!apellido.isBlank() && !apellido.isEmpty()) {
            this.apellido = apellido;
        } else {
            throw new Exception("Sin apellido");
        }
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) throws Exception {
        if (!rut.isBlank() && !rut.isEmpty() && rut.length()>=9 && rut.length()<=10) {
            this.rut = rut;
        } else {
            throw new Exception("Sin rut");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (!nombre.isBlank() && !nombre.isEmpty() && nombre.length()>2) {
            this.nombre = nombre;
        } else {
            throw new Exception("Sin nombre");
        }
    }

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }

}
