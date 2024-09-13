/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Random;

/**
 *
 * @author CETECOM
 */
public class Pedidos {
    private int num_pedido;
    private String detalle_pedido;
    private boolean estado_pago;
    private int valor_pedido;
    private String direccion_entrega;
    private int comuna_entrega;

    public Pedidos() {
    }

    public Pedidos(int num_pedido, String detalle_pedido, boolean estado_pago, int valor_pedido, String direccion_entrega, int comuna_entrega) {
        this.num_pedido = num_pedido;
        this.detalle_pedido = detalle_pedido;
        this.estado_pago = estado_pago;
        this.valor_pedido = valor_pedido;
        this.direccion_entrega = direccion_entrega;
        this.comuna_entrega = comuna_entrega;
    }

    public int getNum_pedido() {
        return num_pedido;
    }

    public void setNum_pedido(int num_pedido) {
        this.num_pedido = num_pedido;
    }

    public String getDetalle_pedido() {
        return detalle_pedido;
    }

    public void setDetalle_pedido(String detalle_pedido) throws Exception {
        if (!detalle_pedido.isBlank() && !detalle_pedido.isEmpty()) {
            this.detalle_pedido = detalle_pedido;
        } else {
            throw new Exception ("El detalle del pedido no puede estar en blanco");
        }
    }

    public boolean isEstado_pago() {
        return estado_pago;
    }

    public void setEstado_pago(boolean estado_pago) {
        this.estado_pago = estado_pago;
    }

    public int getValor_pedido() {
        return valor_pedido;
    }

    public void setValor_pedido(int valor_pedido) throws Exception {
        if (valor_pedido>0) {
            this.valor_pedido = valor_pedido;
        } else {
            throw new Exception ("El valor debe ser mayor a 0");
        }
    }

    public String getDireccion_entrega() {
        return direccion_entrega;
    }

    public void setDireccion_entrega(String direccion_entrega) throws Exception {
        if (!direccion_entrega.isBlank() && !direccion_entrega.isEmpty()) {
            this.direccion_entrega = direccion_entrega;
        } else {
            throw new Exception ("La direccion de entrega del pedido no puede estar en blanco");
        }
    }

    public int getComuna_entrega() {
        return comuna_entrega;
    }

    public void setComuna_entrega(int comuna_entrega) throws Exception {
        if (comuna_entrega == 1 && comuna_entrega == 2 && comuna_entrega == 3){
            this.comuna_entrega = comuna_entrega;
        } else {
            throw new Exception ("La comuna de entrega del pedido no puede estar en blanco");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedidos{");
        sb.append("num_pedido=").append(num_pedido);
        sb.append(", detalle_pedido=").append(detalle_pedido);
        sb.append(", estado_pago=").append(estado_pago);
        sb.append(", valor_pedido=").append(valor_pedido);
        sb.append(", direccion_entrega=").append(direccion_entrega);
        sb.append(", comuna_entrega=").append(comuna_entrega);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
