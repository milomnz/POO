import java.util.Scanner;
public class Ejer2 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el area del circulo del cual quieres calcular el area: ");
        String radio = sc.nextLine();
        Double radioDouble = java.lang.Double.valueOf(radio);
        Double area = Math.PI * Math.pow(radioDouble, 2);
        System.out.println("El area del circulo es: " + area);
        sc.close();

    }
}


















