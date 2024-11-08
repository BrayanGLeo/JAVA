/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciobanco;

import models.Basico;
import models.Premium;
import models.Registro;
import models.TipoPremium;

/**
 *
 * @author aleja
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//<editor-fold defaultstate="collapsed" desc="PRUEBAS COMENTAR O DESCOMENTAR">
//SOLO DE PRUEBA ESTO SE PUEDE COMENTAR
/*Basico bas=new Basico("123", "Wacoldo", "Soto", 4500000);
System.out.println(bas);
bas.actualizar();
System.out.println(bas.comprar(10000));
System.out.println(bas.pedirCredito(10000000));
System.out.println("**************");
Premium pre=new Premium(TipoPremium.full, 0, "456", "Diogenes", "Carrasco");
System.out.println(pre);
System.out.println(pre.comprar(10000));
//System.out.println(pre);
pre.setSueldo(2100000);
pre.actualizar();
System.out.println(pre);
//System.out.println(pre.pedirCredito(124554545));*/
//FIN PRUEBAS
//</editor-fold>
        //INICIALIZAMOS LA CLASE REGISTRO PARA ALMACENAR
        Registro db = new Registro();

        //SE CREAN OBJETOS DE CADA TIPO
        Basico bas = new Basico("123", "Wacoldo", "Soto", 450000);
        Premium pre = new Premium(TipoPremium.full, 0, "456", "Diogenes", "Carrasco");
        //Le subo el sueldo a este para que pueda upgradear
        pre.setSueldo(2500000);

        //AGREGO CADA OBJETO A LA COLECCION
        db.agregarCliente(pre);
        db.agregarCliente(bas);
        //Listar todos los clientes
        for (Object cliente : db.getClientes()) {
            System.out.println(cliente);
            System.out.println("***********");
        }

        //AGREGO DOS MAS DE CADA UNO PARA COMPROBAR
        db.agregarCliente(new Basico("123", "Lucidoro", "Flores", 300000));//este no puede upgradear
        db.agregarCliente(new Premium(TipoPremium.full, 0, "456", "Wenceslao", "Vargas"));
        //Listar solo los clientes Básicos
        System.out.println("***********BASICOS*************");
        for (Basico clienteBasico : db.clientesBasicos()) {
            System.out.println(clienteBasico);
        }


        //Listar clientes Premium
        System.out.println("***********PREMIUM*************");
        for (Premium clientePremium : db.clientesPremium()) {
            System.out.println(clientePremium);
        }
        
        System.out.println("******UPGRADEABLES*********");
        //Listar los clientes con la posibilidad de hacer upgrade o no
        for (Object upgradeable : db.upgradeables()) {
            System.out.println(upgradeable);
        }
    }

}
