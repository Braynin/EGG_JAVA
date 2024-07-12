import java.util.Scanner;
import java.util.Random;

public class Bucles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos numeros quieres?: ");
        int cantidad = sc.nextInt();
        int[] nums = new int[cantidad];

        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(100);
        }

        imprimeArray(nums);
        hallarMinimo(nums);
        invertirArray(nums);
        sumaAcumulada(nums);
        buscaPares(nums);
        sc.close();
    }

    public static void imprimeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void hallarMinimo(int[] array) {
        int minimo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimo) {
                minimo = array[i];
            }
        }
        System.out.println("El minimo es: " + minimo);
    }

    public static void invertirArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("Los numeros al reves son: ");
        imprimeArray(array);
    }

    public static void sumaAcumulada(int[] array) {
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + array[i];
        }
        System.out.println("Los nuevos valores acumulados son: ");
        imprimeArray(array);
    }

    public static void buscaPares(int[] array) {
        int contador = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                contador++;
            }
        }
        System.out.println("La cantidad de pares es: " + contador);
    }
}
