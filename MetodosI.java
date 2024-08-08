import java.util.ArrayList;
import java.util.Scanner;

public class MetodosI {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        inprimirtablasMultiplicar(pedirNumeros());
    }

    public static ArrayList<Integer> pedirNumeros() {
        System.out.println("Ingresa los 3 numeros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(num1);
        numeros.add(num2);
        numeros.add(num3);
        System.out.println("Los 3 numeros son: " + num1 + ", " + num2 + ", " + num3);
        return numeros;
    }

    public static void inprimirtablasMultiplicar(ArrayList<Integer> numeros) {
        for (int i = 0; i < numeros.size(); i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(j + " x " + numeros.get(i) + " = " + (j * numeros.get(i)));
            }
        }
    }
}
