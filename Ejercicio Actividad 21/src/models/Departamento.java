/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author CETECOM
 */
public final class Departamento extends Inmueble implements IValores{
    private int piso;

    public Departamento() {
    }

    public Departamento(int id,int piso, int dormitorios, int baños, double metros_cuadrados, int precio_arriendo, int meses) {
        super(id,dormitorios, baños, metros_cuadrados, precio_arriendo, meses);
        this.piso = piso;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Departamento:");
        sb.append(super.toString());
        sb.append("\npiso: ").append(piso);
   
        return sb.toString();
    }

    @Override
    public String datosInmueble() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return this.toString();
    }

    @Override
    public double valor_total() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return precio_arriendo + (precio_arriendo*COMISION) + (precio_arriendo*GASTOS_COMUNES_DEPARTAMENTO);

    }

    
    
}
