
import java.util.Scanner;


public class Ejer5 {
    public static void main(String[] args) {
        String contrasena = "1234";
       
        int contador = 0;

        while (contador < 3) {
            System.out.println("Introduzca la contraseña");
            Scanner sc = new Scanner(System.in);
            String contrasenaIntroducida = sc.nextLine();
            if (contrasenaIntroducida.equals(contrasena)) {
                System.out.println("Contraseña correcta");
                break;
            } else {
                System.out.println("Contraseña incorrecta");
                contador++;
            }
        }
    }
}
