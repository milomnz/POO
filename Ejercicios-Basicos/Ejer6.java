import java.util.Scanner;

public class Ejer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un día de la semana:");
        String dia = sc.nextLine().toLowerCase();  

        switch (dia) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("El día es laborable");
                break;

            case "sabado":
            case "domingo":
                System.out.println("Este día no se trabaja");
                break;

            default:
                System.out.println("Día no válido, por favor introduce un día correcto.");
        }

        sc.close(); 
    }
}
