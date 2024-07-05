import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer numero: ");
        try {
            int num1 = sc.nextInt();
            System.out.println("Ingresa el segundo numero: ");
            try {
                int num2 = sc.nextInt();
                System.out.println("El resultado de la division es: " + (num1 / num2));
            } catch (ArithmeticException e) {
                System.out.println("Error: no se puede dividir por 0, no sas un pendejo");
            } catch (InputMismatchException e) {
                System.out.println("Error: no se puede dividir por una cadena de texto, no sas un pendejo");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: no se puede dividir texto, no sas un pendejo");
        }

        sc.close();
    }
}