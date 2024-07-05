import java.util.Scanner;

public class ClaseStrng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println(nombre.length());
        System.out.println("Ingresa tu apellido: ");
        String apellido = sc.nextLine();
        System.out.println(nombre.concat(" " + apellido));
        System.out.println("Ingresa una frase:");
        String frase = sc.nextLine();
        System.out.println("Ingresa el indice inicial: ");
        int indiceInicial = sc.nextInt();
        System.out.println("Ingresa el indice final: ");
        int indiceFinal = sc.nextInt();
        System.out.println(frase.substring(indiceInicial, indiceFinal));
        System.out.println("Ingresa un caracter: ");
        char caracter = sc.next().charAt(0);
        if (frase.indexOf(caracter) > -1) {
            System.out.println("El caracter se encuentra en la frase");
        } else {
            System.out.println("El caracter no se encuentra en la frase");
        }
        System.out.println("Convirtamos la frase a mayusculas: " + frase.toUpperCase());
        System.out.println("Convirtamos la frase a minusculas: " + frase.toLowerCase());
        System.out.println("Ingresa el caracter que reemplazaremos: ");
        char caracterReemplazado = sc.next().charAt(0);
        System.out.println("Ingresa el nuevo caracter: ");
        char nuevoCaracter = sc.next().charAt(0);
        System.out.println(frase.replace(caracterReemplazado, nuevoCaracter));
        sc.close();
    }
}
