/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author aleja
 */
public final class Premium extends Cliente implements IBanco{
    private TipoPremium tipo;
    private int puntos;

    public Premium() {
        sueldo=850000;
    }

    public Premium(TipoPremium tipo, int puntos, String rut, String nombre, String apellido) {
        super(rut, nombre, apellido, 850000);
        this.tipo = tipo;
        this.puntos = puntos;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public TipoPremium getTipo() {
        return tipo;
    }

    public void setTipo(TipoPremium tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Premium:");
        sb.append(super.toString());
        sb.append("\ntipo:").append(tipo);
        sb.append("\npuntos:").append(puntos);
     
        return sb.toString();
    }

    @Override
    public String comprar(double montoCompra) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        int acumulados=(int)montoCompra/1000;
        if(tipo==TipoPremium.full){
            puntos+=acumulados;
            return "Acumula " + acumulados + " puntos";
        }
        else if(tipo==TipoPremium.vip)
        {
            puntos+=acumulados*2;
            return "Acumula " + acumulados*2 + " puntos";
            
        }
        return "tipo no existe";
    }

    @Override
    public String pedirCredito(double montoCredito) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        int descuento=(int)sueldo/500000;
        if(sueldo<=3000000){
            return "Interes credito: " + (INTERES_BASE-0.5-(descuento*0.5)) + "%";
        }
        return "Interes credito: 0.5%";
    }

    @Override
    public void actualizar() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if(sueldo>2000000){
            tipo=TipoPremium.vip;
        }
    }

    @Override
    public boolean upgrade() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if(sueldo>2000000){
            return true;
        }
        return false;
    }
    
    
    
}
