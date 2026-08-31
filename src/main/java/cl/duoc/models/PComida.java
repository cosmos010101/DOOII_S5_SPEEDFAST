package cl.duoc.models;

public class PComida extends Pedido {

    String restaurante;
    int tiempoPreparacion;

    public PComida(int idPedido, String cliente, String direccionEntrega, int distanciaKm, String restaurante, int tiempoPreparacion) {
        super(idPedido, cliente, direccionEntrega, distanciaKm);
        this.restaurante = restaurante;
        this.tiempoPreparacion = tiempoPreparacion;
    }

    @Override
    public void AsignarRepartidor() {
        System.out.println("Asignando a repartidor con mochila térmica .....");

    }

    @Override
    public void AsignarRepartidor(String nombre) {
        System.out.println("Repartidor asignado: " + nombre + ".");
    }

    @Override
    public int calcularTiempoEntrega() {
        int tiempoEntrega = 15 + (2*distanciaKm);
        return tiempoEntrega;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("\n.....Detalle del pedido de comida.....");
        System.out.println("Id Pedido: " + idPedido);
        System.out.println("Restaurante: " + restaurante);
        System.out.println("Tiempo de preparación: " + tiempoPreparacion + " minutos.");
        System.out.println("Dirección de entrega: " + direccionEntrega);
        System.out.println("Distancia: " + distanciaKm + " kilómetros");
        System.out.println("Tiempo de entrega estimado: " + calcularTiempoEntrega() + " minutos.");
    }

    @Override
    public void despachar(boolean despachado) {
        if(despachado) {
            System.out.println("Pedido de " + restaurante + " #" + idPedido + " despachado correctamente.");
        }
    }

    @Override
    public void cancelar(boolean cancelado) {
        if (cancelado) {
            System.out.println("Cancelando pedido de " + restaurante + " #" + idPedido +
                    ".\n -> Pedido cancelado exitosamente.");
        }
    }

    @Override
    public void verHistorial() {
        System.out.println("- Pedido de " + restaurante + " #" + idPedido + " - " + direccionEntrega + ".");
    }
}
