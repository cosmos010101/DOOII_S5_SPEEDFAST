package cl.duoc.models;

import cl.duoc.interfaces.Cancelable;
import cl.duoc.interfaces.Despachable;
import cl.duoc.interfaces.Rastreable;
import cl.duoc.service.EstadoPedido;

public abstract class Pedido implements Despachable, Cancelable, Rastreable {

    protected int idPedido;
    protected String cliente;
    protected String direccionEntrega;
    protected int distanciaKm;
    protected EstadoPedido estadoPedido;

    public Pedido(int idPedido, String cliente, String direccionEntrega, int distanciaKm, EstadoPedido estadoPedido) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKm = distanciaKm;
        this.estadoPedido = estadoPedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public int getDistanciaKm() {
        return distanciaKm;
    }

    public EstadoPedido getEstadoPedido() {
        return estadoPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public void setDistanciaKm(int distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public void setEstado(EstadoPedido nuevoEstado) {
        this.estadoPedido = nuevoEstado;
    }

    public abstract void AsignarRepartidor();

    public abstract void AsignarRepartidor(String nombre);

    public abstract int calcularTiempoEntrega();
}
