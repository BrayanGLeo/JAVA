package Main;

import java.util.logging.Level;
import java.util.logging.Logger;
import Models.Arma;
import Models.Jugador;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author braya
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            
            Arma a1 = new Arma ("M16", 45, "Arma de rafagas"); 
            Jugador j1= new Jugador("Fede", 80, a1);
                
            System.out.println(j1);
            
            j1.setMunicion(20);
            System.out.println("Municion: " + j1.getMunicion() + " balas");
            
            for (int i = 0; i < 18; i++) {
                System.out.println("Dano total inflingido por el jugador: " + j1.getAtaque());
            }

            System.out.println("Disparos realizados: " + j1.getDisparos());
            
            a1.aumentoDaño(5);
            
            System.out.println("Dano aumentado: " + a1.getDaño());
            
            System.out.println("Dano total inflingido por el jugador: " + j1.getAtaque());
            System.out.println("Disparos realizados: " + j1.getDisparos());
            System.out.println("Municion disponible: " + j1.municionDisponible() + " balas");
            System.out.println("Eficiencia: " + j1.Eficiencia());
            
            

                      
        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
    
}
