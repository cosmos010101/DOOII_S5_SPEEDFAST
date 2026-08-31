package cl.duoc.models;

public class PExpress extends Pedido {

    String tienda;

    public PExpress(int idPedido, String cliente, String direccionEntrega, int distanciaKm, String tienda) {
        super(idPedido, cliente, direccionEntrega, distanciaKm);
        this.tienda = tienda;
    }

    @Override
    public void AsignarRepartidor() {
        System.out.println("Asignando repartidor más cercano con disponibilidad inmediata .....");

    }

    @Override
    public void AsignarRepartidor(String nombre) {
        System.out.println("Repartidor asignado: " + nombre + ".");
    }

    @Override
    public int calcularTiempoEntrega() {
        int tiempoBase = 10;
        if (distanciaKm > 5) {
            tiempoBase = tiempoBase + 5;
        }
        return tiempoBase;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("\n.....Detalle de Pedido Express.....");
        System.out.println("Id Pedido: " + idPedido);
        System.out.println("Tienda: " + tienda);
        System.out.println("Dirección de entrega: " + direccionEntrega);
        System.out.println("Distancia: " + distanciaKm + " kilómetros");
        System.out.println("Tiempo de entrega estimado: " + calcularTiempoEntrega() + " minutos");
    }

    @Override
    public void despachar(boolean despachado) {
        if(despachado) {
            System.out.println("Pedido de " + tienda + " #" + idPedido + " despachado correctamente.");
        }
    }

    @Override
    public void cancelar(boolean cancelado) {
        if (cancelado) {
            System.out.println("Cancelando pedido de " + tienda + " #" + idPedido +
                    ".\n -> Pedido cancelado exitosamente.");
        }
    }

    @Override
    public void verHistorial() {
        System.out.println("- Pedido de " + tienda + " #" + idPedido + " - " + direccionEntrega + ".");
    }
}
