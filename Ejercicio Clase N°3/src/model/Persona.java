/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author CETECOM
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private boolean esta_vivo;

    //Constructor por defecto para crear objetos
    public Persona() {

    }

    //Accesadores y Mutadores - Getters and Setters
    public void setNombre(String nombre) throws Exception {
        if (!nombre.isBlank() && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            throw new Exception("El nombre no puede estar vacio");
        }
    }

    public String getNombre() {
        return this.nombre;
    }
    
    public void setApellido(String apellido) throws Exception {
        if (!apellido.isBlank() && !apellido.isEmpty()) {
            this.apellido = apellido;
        } else {
            throw new Exception("El apellido no puede estar vacio");
        }
    }

    public String getApellido() {
        return this.apellido;
    }
    
    public void setEdad(int edad) throws Exception {
        if (edad >= 0 && edad <=150) {
            this.edad = edad;
        } else {
            throw new Exception("La edad debe ser igual o mayor a 0 y debe ser menor o igual a 150");
        }
    }

    public int getEdad() {
        return this.edad;
    }
    
    public void setEsta_vivo(boolean esta_vivo) {
        this.esta_vivo = esta_vivo;
    }

    public boolean getEsta_vivo() {
        return this.esta_vivo;
    }
    
}
