package programacionii_semanaviii;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gianina
 */
public class Pedido implements Pagable {

    private List<Producto> productos;
    private String estado;
    private Notificable cliente;

    public Pedido(Notificable cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.estado = "Pendiente";
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        notificarCambioEstado();
    }

    private void notificarCambioEstado() {
        if (cliente != null) {
            cliente.notificar("El pedido cambió de estado a: " + estado);
        }
    }
}


