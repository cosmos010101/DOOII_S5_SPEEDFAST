package cl.duoc.models;

import cl.duoc.interfaces.ControladorDeEnvios;

public abstract class Pedido implements ControladorDeEnvios {

    protected int idPedido;
    protected String cliente;
    protected String direccionEntrega;
    protected int distanciaKm;

    public Pedido(int idPedido, String cliente, String direccionEntrega, int distanciaKm) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKm = distanciaKm;
    }

    public abstract void AsignarRepartidor();

    public abstract void AsignarRepartidor(String nombre);

    public abstract int calcularTiempoEntrega();

    public abstract void mostrarResumen();
}
