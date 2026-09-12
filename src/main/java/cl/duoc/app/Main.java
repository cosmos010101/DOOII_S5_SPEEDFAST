package cl.duoc.app;

import cl.duoc.models.*;
import cl.duoc.service.EstadoPedido;
import cl.duoc.service.ZonaDeCarga;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        List<Pedido> pedidos = new ArrayList<>();
        ZonaDeCarga zonaDeCarga = new ZonaDeCarga();

        Pedido pedido1 = new PComida(1, "Elvis Tek", "Ez. Taquearde 2035", 3, "Panda", 15, EstadoPedido.PENDIENTE);
        Pedido pedido2 = new PEncomienda(2, "Aquiles Bailo", "Grecia 4562", 5, "3kg", "20, 60, 35", EstadoPedido.PENDIENTE);
        Pedido pedido3 = new PExpress(3, "Marcia Ana", "Saturno 06", 2, "KFS", EstadoPedido.PENDIENTE);
        Pedido pedido4 = new PEncomienda(4, "Elsa Pato", "El Sastre 20", 8, "Zapateria", "30, 20, 30", EstadoPedido.PENDIENTE);
        Pedido pedido5 = new PExpress(5, "Elba Zurita", "El Vertedero 666", 9, "MCDonalds", EstadoPedido.PENDIENTE);

        Repartidor repartidor1 = new Repartidor("Luz Celeste", zonaDeCarga);
        Repartidor repartidor2 = new Repartidor("Deborah Cabezas", zonaDeCarga);
        Repartidor repartidor3 = new Repartidor("Armando Mocha", zonaDeCarga);

        Thread t1 = new Thread(repartidor1);
        Thread t2 = new Thread(repartidor2);
        Thread t3 = new Thread(repartidor3);

        System.out.println("\n.....:::Pedidos SPEEDFAST:::.....");

        zonaDeCarga.agregarPedido(pedido1);
        zonaDeCarga.agregarPedido(pedido2);
        zonaDeCarga.agregarPedido(pedido3);
        zonaDeCarga.agregarPedido(pedido4);
        zonaDeCarga.agregarPedido(pedido5);

        System.out.println("\nPedidos han llegado a la zona de carga.");

        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);
        pedidos.add(pedido4);
        pedidos.add(pedido5);

        ExecutorService ejecutor = Executors.newFixedThreadPool(3);
        ejecutor.execute(repartidor1);
        ejecutor.execute(repartidor2);
        ejecutor.execute(repartidor3);

        ejecutor.shutdown();
    }
}