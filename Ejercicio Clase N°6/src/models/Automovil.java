/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author CETECOM
 */
public class Automovil {

    private String patente;
    private String marca;
    private String modelo;
    private Persona conductor;
    private Motor motor;

    public Automovil() {

    }
    
    public Automovil(String patente, String marca, String modelo, Motor motor) throws Exception {
        this.setPatente(patente);
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setMotor(motor);
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) throws Exception {
        if (!patente.isBlank() && !patente.isEmpty()) {
            this.patente = patente;
        } else {
            throw new Exception("La patente no puede estar vacia");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) throws Exception {
        if (!marca.isBlank() && !marca.isEmpty()) {
            this.marca = marca;
        } else {
            throw new Exception("La marca no puede estar vacia");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) throws Exception {
        if (!modelo.isBlank() && !modelo.isEmpty()) {
            this.modelo = modelo;
        } else {
            throw new Exception("El modelo no puede estar vacio");
        }
    }
    
    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) throws Exception {
        if(conductor!=null){
            this.conductor = conductor;
        } else {
            throw new Exception ("Debe agregar un conductor de tipo persona");
        }
        
    }

    public void setMotor(Motor motor) throws Exception{
        if (motor != null){
            this.motor = motor;
        } else {
            throw new Exception("El auto debe tener motor");
        }
    }
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Automovil: ");
        sb.append("\nMotor: ").append(this.motor);
        sb.append("\nPatente= ").append(patente);
        sb.append("\nMarca= ").append(marca);
        sb.append("\nModelo= ").append(modelo);
        if(this.conductor!=null){
            sb.append("\nConductor= ").append(conductor);        
        } else {
            sb.append("\nNo hay conductor");
        }

        return sb.toString();
    }
    
    

}
