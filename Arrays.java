import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        int suma = 0;
        for (int i = 0; i < nums.length; i++) {
            suma += nums[i];
        }

        int promedio = suma / nums.length;

        int maximo = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maximo) {
                maximo = nums[i];
            }
        }

        System.out.println("Solicite numero a buscar: ");
        int numBuscar = sc.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == numBuscar) {
                System.out.println("El numero se encuentra en la posicion: " + (i + 1));
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El numero no se encuentra en el arreglo");
        }

        System.out.println("Ingresa el primer numero adicional: ");
        int num1 = sc.nextInt();

        System.out.println("Ingresa el segundo numero adicional: ");
        int num2 = sc.nextInt();

        int[] numsAdicionales = { num1, num2 };
        int[] newNums = new int[nums.length + numsAdicionales.length];

        System.arraycopy(nums, 0, newNums, 0, nums.length);
        System.arraycopy(numsAdicionales, 0, newNums, nums.length, numsAdicionales.length);

        for (int i = 0; i < newNums.length; i++) {
            System.out.print(newNums[i] + ", ");
        }
        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);
        System.out.println("El maximo numero es: " + maximo);
        sc.close();
    }

}
