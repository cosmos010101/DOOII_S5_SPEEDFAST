package cl.duoc.interfaces;

public interface ControladorDeEnvios {

    void AsignarRepartidor();
    void AsignarRepartidor(String nombre);
    void despachar(boolean despachado);
    void cancelar(boolean cancelado);
    void verHistorial();
}
