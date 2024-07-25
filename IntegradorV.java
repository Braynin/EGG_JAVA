
import java.util.ArrayList;
import java.util.Scanner;

public class IntegradorV {
    private static String oracion = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    gestionarOracion(sc);
                    break;
                case 2:
                    mostrarCantidadCaracteres();
                    break;
                case 3:
                    mostrarCantidadPalabras();
                    break;
                case 4:
                    mostrarPalabrasOrdenadas();
                    break;
                case 5:
                    mostrarPalabraPorNumero(sc);
                    break;
                case 6:
                    buscarPalabra(sc);
                    break;
                case 7:
                    modificarPalabra(sc);
                    break;
                case 8:
                    agregarContenido(sc);
                    break;
                case 9:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 9);

        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("\nMenú de Opciones:");
        if (oracion.isEmpty()) {
            System.out.println("1. Crear oración");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
        } else {
            System.out.println("1. Borrar oración");
            System.out.println("2. Mostrar cantidad de caracteres de la oración");
            System.out.println("3. Mostrar cantidad de palabras de la oración");
            System.out.println("4. Mostrar palabras ordenadas alfabéticamente");
            System.out.println("5. Ingresar un número y devolver la palabra correspondiente");
            System.out.println("6. Buscar palabra dentro de la oración");
            System.out.println("7. Modificar palabra dentro de la oración");
            System.out.println("8. Agregar contenido a la oración");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
        }

    }

    private static void gestionarOracion(Scanner sc) {
        if (oracion.isEmpty()) {
            System.out.print("Ingrese una nueva oración: ");
            oracion = sc.nextLine();
        } else {
            System.out.print("¿Está seguro que desea borrar la oración? (s/n): ");
            String confirmacion = sc.nextLine();
            if (confirmacion.equalsIgnoreCase("s")) {
                oracion = "";
                System.out.println("Oración borrada.");
            }
        }
    }

    private static void mostrarCantidadCaracteres() {
        if (oracion.isEmpty()) {
            System.out.println("La oración está vacía.");
            return;
        }
        System.out.println("La cantidad de caracteres en la oración es: " + oracion.length());
    }

    private static void mostrarCantidadPalabras() {
        if (oracion.isEmpty()) {
            System.out.println("La oración está vacía.");
            return;
        }
        String[] palabras = oracion.split("\\s+");
        System.out.println("La cantidad de palabras en la oración es: " + palabras.length);
    }

    private static void mostrarPalabrasOrdenadas() {
        if (oracion.isEmpty()) {
            System.out.println("La oración está vacía.");
            return;
        }
        String[] palabras = oracion.split("\\s+");
        String[] palabrasOrdenadas = ordenarPalabras(palabras);
        System.out.println("Palabras ordenadas alfabéticamente:");
        for (String palabra : palabrasOrdenadas) {
            System.out.println(palabra);
        }
    }

    private static String[] ordenarPalabras(String[] palabras) {
        for (int i = 0; i < palabras.length - 1; i++) {
            for (int j = i + 1; j < palabras.length; j++) {
                if (palabras[i].compareTo(palabras[j]) > 0) {
                    String temp = palabras[i];
                    palabras[i] = palabras[j];
                    palabras[j] = temp;
                }
            }
        }
        return palabras;
    }

    private static void mostrarPalabraPorNumero(Scanner sc) {
        if (oracion.isEmpty()) {
            System.out.println("La oración está vacía.");
            return;
        }
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea

        String[] palabras = oracion.split("\\s+");
        if (numero < 1 || numero > palabras.length) {
            System.out.println("Número inválido. Intente nuevamente.");
        } else {
            System.out.println("La palabra en la posición " + numero + " es: " + palabras[numero - 1]);
        }
    }

    private static void buscarPalabra(Scanner sc) {
        if (oracion.isEmpty()) {
            System.out.println("La oración está vacía.");
            return;
        }
        System.out.print("Ingrese la palabra a buscar: ");
        String palabra = sc.nextLine();

        String[] palabras = oracion.split("\\s+");
        boolean encontrada = false;
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equals(palabra)) {
                System.out.println("La palabra \"" + palabra + "\" se encuentra en la posición " + (i + 1));
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("La palabra \"" + palabra + "\" no se encuentra en la oración.");
        }
    }

    private static void modificarPalabra(Scanner sc) {
        if (oracion.isEmpty()) {
            System.out.println("La oración está vacía.");
            return;
        }
        System.out.print("Ingrese la palabra a modificar: ");
        String palabra = sc.nextLine();

        String[] palabras = oracion.split("\\s+");
        boolean encontrada = false;
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equals(palabra)) {
                System.out.print("Ingrese la nueva palabra o frase: ");
                String nuevaPalabra = sc.nextLine();
                palabras[i] = nuevaPalabra;
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("La palabra \"" + palabra + "\" no se encuentra en la oración.");
        } else {
            oracion = String.join(" ", palabras);
            System.out.println("Oración modificada: " + oracion);
        }
    }

    private static void agregarContenido(Scanner sc) {
        if (oracion.isEmpty()) {
            System.out.println("La oración está vacía.");
            return;
        }
        System.out.print("Ingrese el contenido a agregar: ");
        String contenido = sc.nextLine();
        oracion += " " + contenido;
        System.out.println("Nueva oración: " + oracion);
    }
}
