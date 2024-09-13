/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author CETECOM
 */
public class Pedido {

    private int n_pedido;
    private String detalle;
    private boolean pagado;
    private double valor;
    private String direccion;
    private int comuna;
    private Cliente cliente;
    private double envio;

    public Pedido() {
    }

    public Pedido(int n_pedido, String detalle, boolean pagado, double valor,
            String direccion, int comuna, Cliente cliente) throws Exception {
        this.setN_pedido(n_pedido);
        this.setDetalle(detalle);
        this.setPagado(pagado);
        this.setValor(valor);
        this.setDireccion(direccion);
        this.setComuna(comuna);
        this.setCliente(cliente);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) throws Exception {
        if (cliente != null) {
            this.cliente = cliente;
        } else {
            throw new Exception("Sin cliente");
        }
    }

    public int getN_pedido() {
        return n_pedido;
    }

    public void setN_pedido(int n_pedido) throws Exception {
        if (n_pedido >= 0) {
            this.n_pedido = n_pedido;
        } else {
            throw new Exception("Numero pedido no válido");
        }
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) throws Exception {
        if (!detalle.isBlank() && !detalle.isEmpty()) {
            this.detalle = detalle;
        } else {
            throw new Exception("Sin detalle");
        }
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) throws Exception {
        if (valor >= 0) {
            this.valor = valor;
        } else {
            throw new Exception("Valor debe ser >0");
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) throws Exception {
        if (!direccion.isBlank() && !direccion.isEmpty()) {
            this.direccion = direccion;
        } else {
            throw new Exception("Sin direccion");
        }
    }

    public int getComuna() {
        return comuna;
    }

    public void setComuna(int comuna) throws Exception {
        if (comuna == 1 || comuna == 2 || comuna == 3) {
            this.comuna = comuna;
        } else {
            throw new Exception("Comuna no válida");
        }
    }

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido:").append(n_pedido);
        sb.append("\ndetalle:").append(detalle);
        if (pagado == true) {
            sb.append("\npagado:").append("PAGADO");
        } else {
            sb.append("\npagado:").append("PENDIENTE");
        }
        sb.append("\nvalor:$").append(valor);
        sb.append("\ndireccion:").append(direccion);
        sb.append("\ncomuna:").append(this.getNombreComuna());
        sb.append("\ncliente=").append(cliente);
        sb.append("\nEnvio: ").append(envio);
        sb.append("\npropina:").append((this.getValor() + envio) * 0.1);
        sb.append("\nTOTAL: $").append((this.getValor() + envio) * 1.1);
        return sb.toString();
    }


    private String getNombreComuna(){
      
        switch (this.getComuna()) {
            case 1:
                this.envio = 1000;
                return "Concepcion";

            case 2:
                this.envio = 1500;
                return "Hualpen";

            case 3:

                this.envio = 2000;
                return "Talcahuano";

        }
        return "";
    }
}
