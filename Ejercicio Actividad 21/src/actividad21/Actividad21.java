/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad21;

import java.util.logging.Level;
import java.util.logging.Logger;
import models.Casa;
import models.Departamento;
import models.Inmueble;
import models.Registro;

/**
 *
 * @author CETECOM
 */
public class Actividad21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            /*
            
            • Agregar una casa y un departamento a la clase que almacenará los datos
            • Listar todos los inmuebles
            • Mostrar el detalle del arriendo del inmueble considerando 
            el pago mensual que se calcula en base al método de la interfaz
            • Obtener la cantidad de inmuebles cuya cantidad de meses de arriendo menor a 12
            • Obtener los inmuebles con más de 3 dormitorios
             */
            Registro db = new Registro();
            Casa c = new Casa(1, 15, 4, 3, 90, 1500000, 15);
            Departamento d = new Departamento(2, 150, 2, 2, 20, 100000, 6);
            db.agregarInmueble(d);
            db.agregarInmueble(c);
            Casa casita = new Casa(3, 500, 10, 40, 100, 1500, 2);
            db.agregarInmueble(casita);
            System.out.println("****LISTADO******");
            for (Inmueble inmueble : db.listado()) {
                System.out.println(inmueble);
            }
            System.out.println("******DETALLLES******");
            for (Inmueble inmueble : db.listado()) {
                System.out.println(inmueble.datosInmueble() + "\nVALOR:$" + inmueble.valor_total());
            }
            System.out.println("****MENORES A 12****");
            for (Inmueble inmueble : db.listadomenor12()) {
                if (inmueble instanceof Casa) {
                    System.out.println("CASA ID:" + inmueble.getId());
                }
                else
                {
                    System.out.println("DEPARTAMENTO ID:" + inmueble.getId());
                }
            }

            System.out.println("***MAS DE 3 DORMITORIOS****");
            for (Inmueble inmueble : db.mas3dorm()) {
                 if (inmueble instanceof Casa) {
                    System.out.println("CASA ID:" + inmueble.getId());
                }
                else
                {
                    System.out.println("DEPARTAMENTO ID:" + inmueble.getId());
                }
            }

        } catch (Exception ex) {
            //Logger.getLogger(Actividad21.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }

    }

}
