/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author CETECOM
 */
public class Cliente {
    private String rut;
    private String nombre;
    private String apellido;
    

    public Cliente() {
    }

    public Cliente(String rut, String nombre, String apellido) throws Exception {
        this.setRut(rut);
        this.setNombre(nombre);
        this.setApellido(apellido);
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) throws Exception {
        if (!rut.isBlank() && !rut.isEmpty() && rut.length()>=9 && rut.length()<=10) {
            this.rut = rut;
        } else {
            throw new Exception("El rut debe tener mas de 7 digitos");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (!nombre.isBlank() && nombre.length() >= 2) {
            this.nombre = nombre;
        } else {
            throw new Exception ("El nombre tiene que tener mas de 2 digitos");
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) throws Exception {
        if (!apellido.isBlank() && apellido.length() >= 2) {
            this.apellido = apellido;
        } else {
            throw new Exception ("El apellido no puede esta vacio");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("rut=").append(rut);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append('}');
        return sb.toString();
    }
}


