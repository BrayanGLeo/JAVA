/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Automovil;

/**
 *
 * @author CETECOM
 */
public class Automovil {

    private String patente;
    private String marca;
    private String modelo;
    private double estanque;
    private int km_totales;

    public Automovil() {
        this.estanque = 50;
        this.km_totales = 0;
    }

    public void setPatente(String patente) throws Exception {
        if (!patente.isBlank() && !patente.isEmpty()) {
            this.patente = patente;
        } else {
            throw new Exception("La patente no puede estar vacia");
        }
    }

    public String getPatente() {
        return this.patente;
    }

    public void setMarca(String marca) throws Exception {
        if (!marca.isBlank() && !marca.isEmpty()) {
            this.marca = marca;
        } else {
            throw new Exception("La marca no puede estar vacia");
        }
    }

    public String getMarca() {
        return this.marca;
    }

    public void setModelo(String modelo) throws Exception {
        if (!modelo.isBlank() && !modelo.isEmpty()) {
            this.modelo = modelo;
        } else {
            throw new Exception("El modelo no puede estar vacio");
        }
    }

    public String getModelo() {
        return this.modelo;
    }

    public void trasladarse(double km) throws Exception {
        if (this.estanque*10 >= km) {
            this.estanque -= km * 0.1;
            this.km_totales += km;
        } else {
            throw new Exception("El estanque debe tener minimo un litro para trasladarse");
        }
    }

    public void cargar_gasolina(int litros) throws Exception {
        if (litros + this.estanque <= 50 && litros > 0) {
            this.estanque += litros;
        } else {
            throw new Exception("El estanque ya esta lleno");
        }
    }

    @Override
    public String toString() {
        return "Patente: " + this.patente
                + " // Marca: " + this.marca
                + " // Modelo: " + this.modelo
                + " // Estanque : " + this.estanque
                + " // Km Totales: " + this.km_totales;
    }
}
