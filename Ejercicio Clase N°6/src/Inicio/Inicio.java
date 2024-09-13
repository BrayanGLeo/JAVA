/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Inicio;

import java.util.logging.Level;
import java.util.logging.Logger;
import models.Automovil;
import models.Persona;
import models.Motor;
 

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
            // Ya no sirve porque la regla dice que tiene que tener motor si o si
            /*Automovil car=new Automovil();
            car.setPatente("AABB12");
            car.setModelo("Kinachi 2002");
            car.setMarca("Toyota");
            
            System.out.println(car)*/
            
            Motor motorcito=new Motor("VS", 5000);
            Automovil autito=new Automovil("ZZYY24", "Wolkswagen", "De locos", motorcito);
            System.out.println(autito);
            
            Persona p=new Persona("Wacoldo", "Soto");                  
            autito.setConductor(p);
            
            System.out.println(autito);
            
        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
