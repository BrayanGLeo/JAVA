/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegov1;

import java.util.logging.Level;
import java.util.logging.Logger;
import models.*;

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
            // TODO code application logic here
            
            //CREANDO UN PERSONAJE
            Personaje w=new Personaje("Wacolthor", 100, 3, 2);
            Arma ar=new Arma("Estoque", 50);
            w.setArma(ar);
            System.out.println(w);
            
            
            Personaje d=new Personaje("Diogeneitor", 100, 30, 2);
            Arma otraarma=new Arma("Sable",25);
            d.setArma(otraarma);
            System.out.println(d);
            System.out.println(w.getNombre() + " VS " + d.getNombre());
            Thread.sleep(3000);
           
            
            //TURNO DE W
            do {                
                int att = w.getAtaque();
                d.recibirAtaque(att);
                System.out.println(d.getNombre() + ":" + d.getVida() + " hp" );

                //TURNO DE D
                w.recibirAtaque(d.getAtaque());
                System.out.println(w.getNombre() + ":" + w.getVida() + " hp");
                Thread.sleep(100);
            } while (w.getVida()>=0 && d.getVida()>=0);
            
            if (w.getVida()>0) {
                System.out.println(w.getNombre() + " WINS!!!!");
            } else {
                System.out.println(d.getNombre() + " WINS!!!!");
            }
            
            
            
        } catch (Exception ex) {
            //Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR: " + ex.getMessage());
        }
    
    }
}
