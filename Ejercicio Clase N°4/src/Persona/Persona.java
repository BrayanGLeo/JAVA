/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

/**
 *
 * @author CETECOM
 */
//OBJECT = Dios 
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private double peso;

    //Constructor por defecto para crear objetos
    public Persona() {
        this.peso = 60;

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
    
    //Metodos personalizados o customer
    
    public void cumpleaños(){
        this.edad++;
    }
    
    public String datosPersona(){
        return "Nombre: " + this.getNombre() + " "
                          + this.getApellido()
                          + "  //  Edad: " + this.getEdad();      
    }
    
    @Override
    public String toString(){
        return this.nombre + " " +
               this.apellido + " " +
               this.edad + " " +
               "Peso: " + this.peso + " kgs";
    }
    
    public void comer(){
        this.peso+=0.5;
    }
    
    public void caminar(double kms){
        //Por cada kilometro caminado baja 0.25 grs
        this.peso-=kms*0.25;     
    }
}
