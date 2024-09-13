/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Persona.Persona;

/**
 *
 * @author CETECOM
 */
public class Inicio {
    
    public static void main(String[] args) {
        try {
            Persona p = new Persona();
            p.setNombre("Wacoldo");
            p.setApellido("Soto");
            p.setEdad(15);

            Persona q = new Persona();
            q.setNombre("Diogenes");
            q.setApellido("Carrasco");
            q.setEdad(100);
            
            System.out.println(p.datosPersona()); 
            System.out.println(q.datosPersona());
            
            System.out.println("***Cumpleanos de Wacoldo***");
            
            p.cumpleaños();
            System.out.println(p.datosPersona());             
          
            System.out.println("***Cumpleanos de Diogenes***");
                       
            q.cumpleaños();
            q.cumpleaños();
            q.cumpleaños();
            q.cumpleaños();
            System.out.println(q.datosPersona());
            
            //Imprimir el ojeto en pantalla
            System.out.println("**Imprimir el obeto en pantalla**");
            System.out.println(p);
            System.out.println(q);
            
            //Dando comida a Wacoldo
            p.comer();
            p.comer(); 
            System.out.println(p);
            
            //Wacolodo con bajon
            for (int i = 0; i < 40; i++){
                p.comer();
            }
            
            System.out.println(p);            
            p.caminar(5);
            System.out.println(p);
            p.caminar(8);
            System.out.println(p);
                
            
    } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
