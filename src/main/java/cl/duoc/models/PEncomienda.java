package cl.duoc.models;

import cl.duoc.service.EstadoPedido;

public class PEncomienda extends Pedido {

    String peso;
    String volumen;

    public PEncomienda(int idPedido, String cliente, String direccionEntrega, int distanciaKm, String peso, String volumen, EstadoPedido estadoPedido) {
        super(idPedido, cliente, direccionEntrega, distanciaKm, estadoPedido);
        this.peso = peso;
        this.volumen = volumen;
    }

    @Override
    public void AsignarRepartidor() {
        System.out.println("Asignando repartidor con capacidad para el peso y volumen de encomienda .....");

    }

    @Override
    public void AsignarRepartidor(String nombre) {
        System.out.println("Repartidor asignado: " + nombre + ".");
    }

    @Override
    public int calcularTiempoEntrega() {
        return 20 + ((3*distanciaKm)/2);
    }

    @Override
    public String toString() {
        return "\n.....Detalle de encomienda....." +
                "\nId Pedido: " + idPedido +
                "\nPeso: " + peso +
                "\nVolumen: " + volumen +
                "\nDirección de entrega: " + direccionEntrega +
                "\nDistancia: " + distanciaKm + " kilómetros" +
                "\nTiempo de entrega estimado: " + calcularTiempoEntrega() + " minutos";
    }

    @Override
    public void despachar(boolean despachado) {
        if(despachado) {
            System.out.println("Pedido de Encomienda #" + idPedido + " despachado correctamente.");
        }
    }

    @Override
    public void cancelar(boolean cancelado) {
        if (cancelado) {
            System.out.println("Cancelando pedido de Encomienda #" + idPedido +
                    ".\n -> Pedido cancelado exitosamente.");
        }
    }

    @Override
    public void verHistorial() {
        System.out.println("- Pedido de encomienda #" + idPedido + " - " + direccionEntrega + ".");
    }
}
