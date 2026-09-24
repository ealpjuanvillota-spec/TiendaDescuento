
package tiendadescuento;
import java.util.Scanner;
public class TiendaDescuento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidad;
        double total = 0;
        double descuento;

        System.out.print("Digite la cantidad de unidades: ");
        cantidad = sc.nextInt();

        for (int i = 1; i <= cantidad; i++) {
            total = total + 12000;
        }
        if (cantidad > 10) {
            descuento = total * 0.10;
            total = total - descuento;

            System.out.println("Total a pagar: " + total);
            System.out.println("Se aplicó el descuento del día.");
        } else {
            System.out.println("Total a pagar: " + total);
            System.out.println("No se aplicó el descuento del día.");
        }
        sc.close();
    }
}
