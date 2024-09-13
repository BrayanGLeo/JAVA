/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author CETECOM
 */
public class Motor {
    private String marca;
    private int cc;

    public Motor() {
    }

    public Motor(String marca, int cc) {
        this.marca = marca;
        this.cc = cc;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Motor: ");
        sb.append("\nMarca= ").append(marca);
        sb.append("\nCm Cubicos= ").append(cc);
        return sb.toString();
    }
    
    
    
}
