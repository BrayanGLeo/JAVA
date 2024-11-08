/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author CETECOM
 */
public class Registro {

    ArrayList<Inmueble> inmuebles;

    public Registro() {
        inmuebles = new ArrayList();
    }

    public ArrayList<Inmueble> listado() {
        return inmuebles;
    }

    public ArrayList<Inmueble> listadomenor12() {
        ArrayList<Inmueble> menosde12 = new ArrayList<>();
        for (Inmueble inmueble : inmuebles) {
            if (inmueble.getMeses() < 12) {
                menosde12.add(inmueble);
            }
        }
        return menosde12;
    }

    public ArrayList<Inmueble> mas3dorm() {
        ArrayList<Inmueble> d3mas = new ArrayList<>();
        for (Inmueble inmueble : inmuebles) {
            if (inmueble.getDormitorios()>3) {
                d3mas.add(inmueble);
            }
        }
        return d3mas;
    }

    public boolean validarId(Inmueble inm) {
        for (Inmueble inmueble : inmuebles) {
            return inm.getId() == inmueble.getId();
        }
        return false;
    }

    public void agregarInmueble(Inmueble inm) throws Exception {
        if (this.validarId(inm)) {
            throw new Exception("El id ya existe");
        } else {
            inmuebles.add(inm);
        }
    }

}
