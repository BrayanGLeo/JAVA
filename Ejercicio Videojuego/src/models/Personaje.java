/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author CETECOM
 */
public class Personaje {

    private String nombre;
    private int vida;
    private int ataque;
    private int defensa;
    private Arma arma;

    /* public Personaje() {
    }*/
    public Personaje(String nombre, int vida, int ataque, int defensa) throws Exception {
        this.setNombre(nombre);
        this.setVida(vida);
        this.setAtaque(ataque);
        this.setDefensa(defensa);
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) throws Exception {
        if (defensa>=1) {
            this.defensa = defensa;
        } else {
            throw new Exception("Defensa debe ser mayor o igual a 1");
        }
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

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) throws Exception {
        if (vida>=100) {
            this.vida = vida;
        } else {
            throw new Exception("La vida debe ser mayor o igual a 100");
        }
    }

    //ESTO OBTIENE EL ATAQUE DEL PERSONAJE
    public int getAtaque() {
        if (this.arma!=null) {
            return ataque + this.arma.getDaño();
        } else {
            return ataque;
        }
    }

    public void setAtaque(int ataque) throws Exception {
         if (ataque>=1) {
            this.ataque = ataque;
        } else {
            throw new Exception("Ataque debe ser mayor o igual a 1");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombre.toUpperCase());
        sb.append("\nvida:").append(vida);
        sb.append(" ataque: ").append(ataque);
        sb.append(" defensa: ").append(defensa);
        if (this.arma!=null) {
            sb.append("\n" + this.arma);
        } else {
            sb.append("\nNO TIENE ARMA!!!");
        }
        return sb.toString();
    }

    /*METODOS PERSONALIZADOS*/
    public void recibirAtaque(int damage){
        this.vida-=(damage-this.defensa);
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) throws Exception {
        if (arma!=null) {
            this.arma = arma;
        } else {
            throw new Exception("El arma no debe ser null");
        }
    }
    
    
    
    
}
