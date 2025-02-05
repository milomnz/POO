import java.util.Scanner;
public class Ejer8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        System.out.println("Introduce una serie de palabras:");
        String texto = sc.nextLine();
        String[] palabras = texto.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            contador++;
        }
        System.out.println("El número de palabras en la frase es: " + contador);
        sc.close();
    }
}
