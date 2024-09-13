/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;
import Model.Persona;

/**
 *
 * @author CETECOM
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p = new Persona();
        System.out.println(p);
        
        p.nombre="Wacoldo";
        System.out.println(p.nombre);
        
        Persona q=new Persona();
        q.nombre="Diogenes";
        System.out.println(q.nombre);
    }
}
