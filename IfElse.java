import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // *Verifica si un numero es divisible entre 5 o 3 *//
        /*
         * System.out.print("Ingresa un numero pa ver si es divisible entre 5 y/o 3: ");
         * if (sc.hasNextInt()) {
         * int num = sc.nextInt();
         * if (num % 5 == 0 || num % 3 == 0) {
         * if (num % 5 == 0 && num % 3 == 0) {
         * System.out.println("Es divisible por 5 y 3");
         * } else if (num % 5 == 0) {
         * System.out.println("Es divisible por 5");
         * } else {
         * System.out.println("Es divisible por 3");
         * }
         * } else {
         * System.out.println("No es divisible por niguno de los 2");
         * }
         * } else {
         * System.out.println("No es un numero");
         */

        // *Verifica la nota de 0 a 100, volviendola una letra *//
        /*
         * System.out.println("Ingresa una nota entre 0 y 100: ");
         * if (sc.hasNextInt()) {
         * int num = sc.nextInt();
         * if (num >= 90 && num <= 100) {
         * System.out.println("A");
         * } else if (num >= 80 && num < 90) {
         * System.out.println("B");
         * } else if (num >= 70 && num < 80) {
         * System.out.println("C");
         * } else if (num >= 60 && num < 70) {
         * System.out.println("D");
         * } else if (num >= 0 && num < 60) {
         * System.out.println("F");
         * } else {
         * System.out.println("Nota no valida");
         * }
         * } else {
         * System.out.println("No es un numero");
         * }
         */

        // *Verifica si es positivo, negativo o 0 *//
        /*
         * System.out.print("Ingresa un numero: ");
         * if (sc.hasNextDouble()) {
         * Double num = sc.nextDouble();
         * if (num > 0) {
         * System.out.println("El numero es positivo");
         * } else if (num < 0) {
         * System.out.println("El numero es negativo");
         * } else {
         * System.out.println("El numero es 0");
         * }
         * } else {
         * System.out.println("No es un numero");
         * }
         */
        sc.close();
    }
}
