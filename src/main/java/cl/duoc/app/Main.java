package cl.duoc.app;

import cl.duoc.models.Pedido;
import cl.duoc.models.PComida;
import cl.duoc.models.PEncomienda;
import cl.duoc.models.PExpress;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pedido> pedidos = new ArrayList<>();

        Pedido pedido1 = new PComida(1, "Elvis Tek", "Ez. Taquearde 2035", 3, "Panda", 15);
        Pedido pedido2 = new PEncomienda(2, "Aquiles Bailo", "Grecia 4562", 5, "3kg", "20, 60, 35");
        Pedido pedido3 = new PExpress(3, "Marcia Ana", "Saturno 06", 2, "KFS");

        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);

        System.out.println(".....:::Pedidos SPEEDFAST:::.....");

        for (Pedido p: pedidos){
            p.mostrarResumen();
            p.AsignarRepartidor();
            p.AsignarRepartidor("Lucía Divina");
            p.despachar(true);
        }

        System.out.println("");
        pedido3.cancelar(true);

        System.out.println("\n.....:::Historial de pedidos SPEEDFAST:::.....");
        for (Pedido o: pedidos){
            o.verHistorial();
        }
    }
}