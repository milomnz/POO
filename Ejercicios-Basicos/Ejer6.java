import java.util.Scanner;
public class Ejer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dia = sc.nextLine();
        dia = dia.toLowerCase();
        switch (dia) {
            case "lunes" -> System.out.println("El dia es laborable");
            case "martes" -> System.out.println("El dia es laborable");   
            case "miercoles" -> System.out.println("El dia es laborable");
            case "jueves" -> System.out.println("El dia es laborable");
            case "viernes" -> System.out.println("El dia es laborable");
            case "sabado" -> System.out.println("El dia es laborable");
            case "domingo" -> System.out.println("Este dia no se trabaja");
        }
        sc.close();
    }
}

