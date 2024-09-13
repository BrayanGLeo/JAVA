/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import model.Persona;

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
            Persona p = new Persona();
            p.setNombre("Wacoldo");
            p.setApellido("Soto");
            p.setEdad(15);
            p.setEsta_vivo(true);

            System.out.println(p.getNombre() + " " + p.getApellido() + " // Edad: " + p.getEdad() + " // Esta vivo: " + p.getEsta_vivo());

            Persona q = new Persona();
            q.setNombre("Diogenes");
            q.setApellido("Carrasco");
            q.setEdad(100);
            q.setEsta_vivo(true);

            System.out.println(q.getNombre() + " " + q.getApellido() + " // Edad: " + q.getEdad() + " // Esta vivo: " + q.getEsta_vivo());
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
