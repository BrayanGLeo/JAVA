/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Inicio;

import Models.Arma;
import Models.Personaje;

/**
 *
 * @author CETECOM
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {           
            //Creación de Personajes
            Personaje w = new Personaje("Wacolpool", 100, 3, 3);
            Arma ar=new Arma("Sword Celestial", 50);
            w.setArma(ar);
            System.out.println(w);

            Personaje d = new Personaje("Diosgenes", 100, 10, 2);
            Arma otraarma=new Arma("Sableye", 25);
            d.setArma(otraarma);
            System.out.println(d);
            System.out.println(w.getNombre() + " VS " + d.getNombre());
            Thread.sleep(3000);
            
            do {
                //Turno de W
                int att = w.getAtaque();
                d.recibirAtaque(att);
                System.out.println(d.getNombre() + ": " + d.getVida() + " hp");

                //Turno de D
                w.recibirAtaque(d.getAtaque());
                System.out.println(w.getNombre() + ": " + w.getVida() + " hp");
                Thread.sleep(500);
            } while (w.getVida() >= 0 && d.getVida() >= 0);

            if (w.getVida() > 0) {
                System.out.println(w.getNombre() + " WIN!!!");
            } else {
                System.out.println(d.getNombre() + " WIN!!!");

            }

        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
}
