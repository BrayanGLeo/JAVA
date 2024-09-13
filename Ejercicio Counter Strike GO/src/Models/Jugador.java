/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author braya
 */
public class Jugador {

    private String nombre;
    private double precision;
    private Arma arma;
    private int municion;
    private int disparos;

    public Jugador() {
    }

    public Jugador(String nombre, double precision, Arma arma) throws Exception {
        this.setNombre(nombre);
        this.setPrecision(precision);
        this.setArma(arma);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (!nombre.isBlank() && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            throw new Exception("El nombre no puede estar vacio");
        }
    }

    public double getPrecision() {
        return precision;
    }

    public void setPrecision(double precision) throws Exception {
        if (precision <= 100 && precision >= 0) {
            this.precision = precision;
        } else {
            throw new Exception("La precicion tiene que ser entre 0 y 100");
        }
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) throws Exception {
        if (arma != null) {
            this.arma = arma;
        } else {
            throw new Exception("El arma no puede ser null");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("*****Jugador*****");
        sb.append("\nNombre= ").append(nombre);
        sb.append(" // Precision= ").append(precision);
        if (arma != null) {
            sb.append(arma);
        } else {
            sb.append("El jugador no tiene arma");
        }

        return sb.toString();
    }

    public int getMunicion() {
        return municion;
    }

    public void setMunicion(int municion) throws Exception {
        if (municion >= 0) {
            this.municion = municion;
        } else {
            throw new Exception("Sin municion");
        }
    }

    public int getDisparos() throws Exception {
        if (disparos <= municion) {
            return disparos;
        } else {
            throw new Exception("Sin municion");
        }
    }

    public double getAtaque() throws Exception {
        if (arma != null) {
            if (disparos < municion) {
                disparos += 1;
                return arma.getDaño() * (precision / 100);
            } else { 
                throw new Exception("El jugador no tiene municion");
            }
        } else {
            throw new Exception("El jugador debe tener un arma");
        }
    }
    
    public int municionDisponible(){
        return municion - disparos;
    }
    
    public double Eficiencia(){
        return disparos * (precision/100);
    }

}
