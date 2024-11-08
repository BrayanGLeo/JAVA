/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author CETECOM
 */
public abstract class Inmueble implements IValores{
    private int id;
    private int dormitorios;
    private int baños;
    private double metros_cuadrados;
    protected int precio_arriendo;
    private int meses;

    public Inmueble() {
    }

    public Inmueble(int id, int dormitorios, int baños, double metros_cuadrados, int precio_arriendo, int meses) {
        this.id = id;
        this.dormitorios = dormitorios;
        this.baños = baños;
        this.metros_cuadrados = metros_cuadrados;
        this.precio_arriendo = precio_arriendo;
        this.meses = meses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public int getDormitorios() {
        return dormitorios;
    }

    public void setDormitorios(int dormitorios) {
        this.dormitorios = dormitorios;
    }

    public int getBaños() {
        return baños;
    }

    public void setBaños(int baños) {
        this.baños = baños;
    }

    public double getMetros_cuadrados() {
        return metros_cuadrados;
    }

    public void setMetros_cuadrados(double metros_cuadrados) {
        this.metros_cuadrados = metros_cuadrados;
    }

    public int getPrecio_arriendo() {
        return precio_arriendo;
    }

    public void setPrecio_arriendo(int precio_arriendo) {
        this.precio_arriendo = precio_arriendo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nID:").append(id);
        sb.append("\ndormitorios:").append(dormitorios);
        sb.append("\nbaños:").append(baños);
        sb.append("\nmetros cuadrados:").append(metros_cuadrados);
        sb.append("\nprecio arriendo:").append(precio_arriendo);
        sb.append("\nmeses:").append(meses);
        
        return sb.toString();
    }

    public abstract String datosInmueble();

    @Override
    public abstract double valor_total();
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    
}
