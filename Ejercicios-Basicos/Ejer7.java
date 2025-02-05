public class Ejer7 {
    public static void main(String[] args) {
        String texto = "La lluvia es una maravilla";
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            if ((texto.charAt(i) == 'a') || (texto.charAt(i) == 'e') || (texto.charAt(i) == 'i') || (texto.charAt(i) == 'o') || (texto.charAt(i) == 'u')) {
                contador++;
            }
        }
        System.out.println("El número de vocales en la frase es: " + contador);
    }
}
