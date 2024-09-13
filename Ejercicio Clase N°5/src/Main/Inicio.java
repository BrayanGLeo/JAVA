/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Automovil.Automovil;

/**
 *
 * @author CETECOM
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Automovil a = new Automovil();
            a.setPatente("Chilito");
            a.setMarca("Toyota");
            a.setModelo("Wacoldomovil");
            
            //Trasladado del auto            
            a.trasladarse(50);
            
            a.cargar_gasolina(5);
            
            System.out.println(a);
                     
        } catch (Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
