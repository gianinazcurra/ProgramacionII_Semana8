
package programacionii_semanaviii;

/**
 *
 * @author Gianina
 */
public class PayPal implements Pago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con PayPal procesado por $" + monto);
    }
}
    
