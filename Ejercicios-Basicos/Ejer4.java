import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double IVA = 0.21;
        System.out.println("Introduzca el precio del producto");
        double precio = sc.nextDouble();
        double precioConIva = precio * IVA;
        double precioFinal = precio + precioConIva;
        System.out.println("El precio del producto con IVA es: " + precioFinal); 
    }
}
