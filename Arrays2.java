import java.util.Arrays;
import java.util.Scanner;

public class Arrays2 {

    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * (100 - 1 + 1) + 1);
        }
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        /*
         * reverseArray(nums);
         * System.out.println(Arrays.toString(nums));
         */
        binarySearch(nums);
    }

    public static void reverseArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
    }

    public static void binarySearch(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el elemento que deseas buscar: ");

        int numBuscar = sc.nextInt();
        int indice = Arrays.binarySearch(array, numBuscar);
        System.out.println("El elemento se encuentra en la posicion: " + (indice + 1));

        sc.close();
    }
}
