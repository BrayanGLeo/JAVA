/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDate;

/**
 *
 * @author CETECOM
 */
public class Twitter extends RedSocial{
    private int id;
    private String noticia;
    private LocalDate fecha;

    public Twitter(int id, String noticia, LocalDate fecha, String usuario, String password) {
        super(usuario, password);
        this.id = id;
        this.noticia = noticia;
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoticia() {
        return noticia;
    }

    public void setNoticia(String noticia) {
        this.noticia = noticia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Twitter: ");
        sb.append("\nid: ").append(id);
        sb.append(super.toString());
        sb.append("\nnoticia: ").append(noticia);
        sb.append("\nfecha: ").append(fecha);
 
        return sb.toString();
    }

    @Override
    public String visualizar() {
        return "USUARIO " + super.usuario + " NOTICIA: " + this.noticia;
    }
    
    
}
