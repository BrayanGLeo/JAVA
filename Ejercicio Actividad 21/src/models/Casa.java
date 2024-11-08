/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author CETECOM
 */
public final class Casa extends Inmueble implements IValores{
    private double mts_patio;

    public Casa() {
    }

    public Casa(int id,double mts_patio, int dormitorios, int baños, double metros_cuadrados, int precio_arriendo, int meses) {
        super(id,dormitorios, baños, metros_cuadrados, precio_arriendo, meses);
        this.mts_patio = mts_patio;
    }

    public double getMts_patio() {
        return mts_patio;
    }

    public void setMts_patio(double mts_patio) {
        this.mts_patio = mts_patio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Casa:");
        sb.append(super.toString());
        sb.append("\npatio:").append(mts_patio).append(" m2");
        
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
        return precio_arriendo + (precio_arriendo*COMISION) + (precio_arriendo*GASTOS_COMUNES_CASA);
    }

    
    
}
