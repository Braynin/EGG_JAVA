import java.util.ArrayList;
import java.util.Scanner;

public class Debugger {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("La suma de los numeros es: " + sumarNumeros(crearArray()));
    }

    public static ArrayList<Integer> crearArray() {
        System.out.println("Ingresa hasta que numero se debe sumar: ");
        int num = sc.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = num; i > 0; i--) {
            array.add(i);
        }
        return array;
    }

    public static Integer sumarNumeros(ArrayList<Integer> array) {
        Integer suma = 0;
        for (int i = 0; i < array.size(); i++) {
            suma += array.get(i);
        }
        return suma;
    }
}
