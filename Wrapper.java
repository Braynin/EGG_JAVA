import java.util.Scanner;

public class Wrapper {

    public static void main(String[] args) {

        /* validarNumero(args); */

        validarCadena(args);

    }

    public static void validarNumero(String[] args) {
        Boolean isValid = false;
        while (!isValid) {
            try {
                System.out.println("Ingresa un numero: ");
                Scanner sc = new Scanner(System.in);
                String num = sc.nextLine();
                Double numDouble = Double.valueOf(num);
                System.out.println("Numero valido: " + numDouble);
                isValid = true;
                sc.close();
            } catch (java.lang.NumberFormatException e) {
                System.out.println("No es un numero valido");
            }
        }

    }

    public static void validarCadena(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una una palabra: ");
        String cadena = sc.nextLine();

        boolean soloLetras = true;

        for (int i = 0; i < cadena.length(); i++) {
            if (!Character.isLetter(cadena.charAt(i))) {
                soloLetras = false;
                break;
            }
        }

        if (soloLetras) {
            System.out.println("La cadena contiene solo letras.");
        } else {
            System.out.println("La cadena no contiene solo letras.");
        }

        sc.close();
    }

}
