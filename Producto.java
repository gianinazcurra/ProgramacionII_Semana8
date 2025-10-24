
package programacionii_semanaviii;

/**
 *
 * @author Gianina
 */
public class Producto implements Pagable {
    
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
    
    //sobrescribo el método que hereda de pagable
    @Override
    public double calcularTotal() {
        return precio;
    }
}
    

