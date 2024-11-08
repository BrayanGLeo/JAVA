/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author CETECOM
 */
public class Instagram extends RedSocial{
    private int id;
    private String historia;
    private boolean estado;


    public Instagram(int id, String historia, boolean estado, String usuario, String password) {
        super(usuario, password);
        this.id = id;
        this.historia = historia;
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Instagram:");
        sb.append("\nid: ").append(id);
        sb.append(super.toString());
        sb.append("\nhistoria: ").append(historia);
        sb.append("\nestado: ").append(estado);
        
        return sb.toString();
    }

    @Override
    public String visualizar() {
        return "USUARIO" + super.getUsuario() + " HISTORIA:" + this.historia;
    }
    
    
    
    
    
    
    
         
}
