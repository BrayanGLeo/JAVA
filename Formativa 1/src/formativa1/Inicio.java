/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formativa1;

import java.util.logging.Level;
import java.util.logging.Logger;
import models.Cliente;
import models.Pedido;

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
            Cliente c=new Cliente();
            c.setNombre("Wacoldo");
            c.setApellido("Soto");
            c.setRut("12345678-9");
            
            System.out.println(c);
            
            Cliente c2=new Cliente("98765432-1", "Diogenes", "Carrasco");
            
            Pedido p=new Pedido(111, "Completo con papa", true, 1000, "Por ahi 123", 3, c2);
            System.out.println(p);
            
        } catch (Exception ex) {
            //Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }
    
}
