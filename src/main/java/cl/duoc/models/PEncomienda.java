package cl.duoc.models;

public class PEncomienda extends Pedido {

    String peso;
    String volumen;

    public PEncomienda(int idPedido, String cliente, String direccionEntrega, int distanciaKm, String peso, String volumen) {
        super(idPedido, cliente, direccionEntrega, distanciaKm);
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
    public void mostrarResumen() {
        System.out.println("\n.....Detalle de encomienda.....");
        System.out.println("Id Pedido: " + idPedido);
        System.out.println("Peso: " + peso);
        System.out.println("Volumen: " + volumen);
        System.out.println("Dirección de entrega: " + direccionEntrega);
        System.out.println("Distancia: " + distanciaKm + " kilómetros");
        System.out.println("Tiempo de entrega estimado: " + calcularTiempoEntrega() + " minutos");
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
        System.out.println("- Pedido de Encomienda #" + idPedido + " - " + direccionEntrega + ".");
    }
}
