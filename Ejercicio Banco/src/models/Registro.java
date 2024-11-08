/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aleja
 */
public class Registro {

    private ArrayList clientes;

    public Registro() {
        clientes = new ArrayList();
    }

    //AGREGO CLIENTES A LA COLECCION
    public void agregarCliente(Object cli) {
        clientes.add(cli);
    }

    //OBTIENE LA LISTA DE CLIENTES
    public ArrayList getClientes() {
        return clientes;
    }

    public List<Basico> clientesBasicos() {
        //CREO UNA LISTA TIPADA PARA SOLO CLIENTES BASICOS
        List<Basico> lista = new ArrayList();

        for (Object cliente : clientes) {
            //SI EL TIPO CORRESPONDE LO AGREGO A LA LISTA
            if (cliente instanceof Basico) {
                lista.add((Basico) cliente);
            }
        }
        //SE RETORNA LA LISTA 
        return lista;
    }

    public List<Premium> clientesPremium() {
        //CREO UNA LISTA TIPADA PARA SOLO CLIENTES PREMIUM
        List<Premium> lista = new ArrayList();
        //SI EL TIPO CORRESPONDE LO AGREGO A LA LISTA
        for (Object cliente : clientes) {
            if (cliente instanceof Premium) {
                lista.add((Premium) cliente);
            }
        }

        return lista;
    }

    public ArrayList upgradeables() {
        //SE CREA UNA LISTA PARA TODOS LOS OBJETOS UPGRADEABLES INDEPENDIENTE DEL TIPO
        ArrayList lista = new ArrayList();

        //COMO EL METODO ESTA IMPLEMENTADO EN CADA CLASE SE NECESITA HACER ESTO EN CADA UNO
        for (Object cliente : clientes) {
            //SE DEBE COMVERTIR AL TIPO PARA ACCEDER AL METODO UPGRADE

            //FALTO UN PASO EN EL VIDEO 
            if (cliente instanceof Basico) {
                if (((Basico) cliente).upgrade()) {
                    lista.add(cliente);
                }
            }
            //IDEM ANTERIOR
            if (cliente instanceof Premium) {
                if (((Premium) cliente).upgrade()) {
                    lista.add(cliente);
                }
            }
        }

        //FINALMENTE SE RETORNA LA LISTA
        return lista;
    }

    public void CambiarCategoria(Basico cli_basico) {
        if (cli_basico.upgrade()) {
            //CREO UN CLIENTE PREMIUM PARA RECIBIR LOS DATOS DEL CLIENTE BASICO
            Premium cli_premium = new Premium();
            //TRASPASO LOS DATOS DEL BASICO A PREMIUM
            cli_premium.setTipo(TipoPremium.full);
            cli_premium.setRut(cli_basico.getRut());
            cli_premium.setNombre(cli_basico.getNombre());
            cli_premium.setApellido(cli_basico.getApellido());
            cli_premium.setSueldo(cli_basico.getSueldo());
            clientes.add(cli_premium);
            //AGREGADO EL CLIENTE PRIMIUM A LA LISTA Y AHORA ESTA DUPLICADO CON EL BASICO
        }
        //ELIMINO EL BASICO PARA QUE AHORA SOLO EXISTA EL DUPLICADO
        clientes.remove(cli_basico);

    }
}
