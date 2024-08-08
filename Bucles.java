import java.util.Scanner;
/* import java.util.Random; */

public class Bucles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una frase: ");
        String frase = sc.nextLine();
        String[] fraseSeparada = frase.split("");

        for (String string : fraseSeparada) {
            System.out.println(string);
        }

        System.out.println("Que letra buscaras?: ");
        String letraBuscar = sc.nextLine();
        int contador = 0;
        for (String letra : fraseSeparada) {
            if (letra.equalsIgnoreCase(letraBuscar)) {
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("No se encontro la letra");
        } else {
            System.out.println("La letra se repite " + contador + " veces");
        }

        /*
         * Random random = new Random();
         * System.out.print("Cuantos palabras son?: ");
         * int cantidad = sc.nextInt();
         * String[] nums = new String[cantidad];
         */

        /*
         * for (int i = 0; i < nums.length; i++) {
         * System.out.println("Ingresa la palabra #" + (i + 1) + ":");
         * nums[i] = sc.next();
         * }
         * String frase = String.join(" ", nums);
         * 
         * System.out.println(frase);
         */

        /*
         * imprimeArray(nums);
         * /*
         * hallarMinimo(nums);
         * invertirArray(nums);
         * sumaAcumulada(nums);
         * buscaPares(nums);
         * 
         * promedio(nums);
         */
        sc.close();
    }

    public static void imprimeArray(float[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void hallarMinimo(float[] array) {
        float minimo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimo) {
                minimo = array[i];
            }
        }
        System.out.println("El minimo es: " + minimo);
    }

    public static void invertirArray(float[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            float temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("Los numeros al reves son: ");
        imprimeArray(array);
    }

    public static void sumaAcumulada(float[] array) {
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + array[i];
        }
        System.out.println("Los nuevos valores acumulados son: ");
        imprimeArray(array);
    }

    public static void buscaPares(float[] array) {
        int contador = 0;
        for (float num : array) {
            if (num % 2 == 0) {
                contador++;
            }
        }
        System.out.println("La cantidad de pares es: " + contador);
    }

    public static void promedio(float[] array) {
        float suma = 0;
        for (float num : array) {
            suma += num;
        }
        float promedio = suma / array.length;
        System.out.println("El promedio es: " + promedio);
    }

}